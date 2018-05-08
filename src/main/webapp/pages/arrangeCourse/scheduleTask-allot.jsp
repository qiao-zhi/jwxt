<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
</head>

<body>

<!--主体-->
<div class="x-body">


        <!--查询-->
        <div class="layui-row">
            <form id="searchCourseForm" class="layui-form layui-col-md12 x-so">
                <input type="text" name="courseName" placeholder="课程名称" autocomplete="off" class="layui-input">
                <input type="text" name="majorName" placeholder="专业" autocomplete="off" class="layui-input">
                <div class="layui-input-inline">
                    <select name="campusCode">
                        <option value="">选择校区</option>
                        <option value="1">主校区</option>
                        <option value="2">华科学院</option>
                        <option value="3">晋城校区</option>
                    </select>
                </div>
                <%--隐藏排课任务ID和通知书ID--%>
                <input type="hidden" name="arrangeTaskId" value="${param.arrangeTaskId}"/>
                <input type="hidden" name="noticeBookId" value="${param.noticeBookId}"/>
                <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
            </form>
        </div>
        <!--end查询-->
    <xblock>
        <button class="layui-btn" onclick="arrangeCourse()">分配 </button>
    </xblock>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th lay-data="{field:'', width:30}">
                    <input type="checkbox" id="el_checkQuanxuan"  lay-skin="primary">
                    <%--<div class="layui-unselect header layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon">&#xe605;</i>
                    </div>--%>
                </th>
                <th lay-data="{field:'', width:80}">序号</th>
                <th lay-data="{field:'', width:80}">课程代码</th>
                <th lay-data="{field:'', width:120}">课程名称</th>
                <th lay-data="{field:'', width:80}">校区</th>
                <th lay-data="{field:'', width:120}">专业</th>
                <th lay-data="{field:'', width:80}">班级</th>
                <th lay-data="{field:'', width:80}">专业总人数</th>
                <th lay-data="{field:'', width:80}">总学时</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->
    <form id="saveArrangeCourseForm">
        <%--隐藏排课任务Id--%>
        <input type="hidden" name="arrangeTaskId" value="${param.arrangeTaskId}"/>
    </form>
    <!--分页-->
    <%--<div id="demo7"></div>--%>
    <!--end 分页-->
</div>

<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
        //查询未分配的课程信息
        findUnDistributeCourse();

        // 全选和全不选操作
        $("#el_checkQuanxuan").change(function() {
            if ($(this).prop("checked") == true) {
                $(".el_checks").prop("checked", true);
            } else {
                $(".el_checks").prop("checked", false);
                //form.render("checkbox");
            }
        })
        //查询按钮事件过滤器
        form.on('submit(search)', function(data){
            //调用查询方法
            findUnDistributeCourse();
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });
    })
    //查询未分配的课程信息
    function findUnDistributeCourse(){
        $.ajax({
            url:contextPath+"/arrangeCourse/findUnArrangeCourseInfo.action",
            type:"post",
            dataType:"json",
            //data:{"arrangeTaskId":'${param.arrangeTaskId}',"noticeBookId":"${param.noticeBookId}"},
            data:$("#searchCourseForm").serialize(),
            success:showUnDistributeCourse
        })
    }
    function showUnDistributeCourse(response){
        var unDistributeCourseList = response;
        $("tbody").html("");//清空表格中数据并重新填充数据
        for(var i=0,length_l = unDistributeCourseList.length;i<length_l;i++){
            var index = i + 1;
            var tr ="<tr><td><input type='checkbox' class='el_checks' name='courseCheckbox' value='"+unDistributeCourseList[i].courseName+"' >"
                +"<input type='hidden' name='sel_majorName' value='"+unDistributeCourseList[i].majorName+"'>"+"</td><td>"
                +index+"</td><td>"
                +unDistributeCourseList[i].courseCode+"</td><td>"
                +unDistributeCourseList[i].courseName+"</td><td>"
                +replaceStatus(unDistributeCourseList[i].campusCode)+"</td><td>"
                +unDistributeCourseList[i].majorName+"</td><td>"
                +unDistributeCourseList[i].classNames+"</td><td>"
                +unDistributeCourseList[i].majorStudentsNumber+"</td><td>"
                +unDistributeCourseList[i].totalPeriod+"</td></tr>";
            $("tbody").append(tr);
        }
        //检查是否有选中的值,回显设置
        checkInHasChecked();
    }
    //查询当前排课任务已经分配的课程
    function findNowDistributeCourseInfo(){
        var nowDistributeCourse;
        $.ajax({
            url:contextPath+"/arrangeCourse/findTaskArrangeCourseInfoList.action",
            type:"post",
            dataType:"json",
            async:false,
            data:{"arrangeTaskId":'${param.arrangeTaskId}'},
            success:function(response){
                nowDistributeCourse = response;
            }
        })
        return nowDistributeCourse;
    }

    //检查是否有选中的值,回显设置
    function checkInHasChecked(){
        var $el_checks = $(".el_checks");
        $el_checks.each(function(i){
            var courseName = $(this).val();
            var majorName = $(this).next("input[name='sel_majorName']").val();
            var nowDistributeCourse = findNowDistributeCourseInfo();
            for(var j=0,length_l = nowDistributeCourse.length; j<length_l; j++){
                var bool = (courseName == nowDistributeCourse[j].courseName) &&(majorName == nowDistributeCourse[j].majorName)
                if(bool){
                    $(this).prop("checked",true);
                    break;
                }
            }
        })
    }

    //判断是否有选中的值
    function checkHasSelect(){
        if($("input[name='courseCheckbox']:checked").length>0){
            return true;
        }else{
            return false;
        }
    }
    //分配课程
    function arrangeCourse(){
        var status = checkHasSelect();//调用判断方法
        if (status) {
            layer.confirm("您确认要为当前的教学任务分配选中的课程吗？",function(){
                getAllCheckedCourse();
                saveTaskArrangeCourseInfo();
            });
        }
        else{
            layer.alert('请先选择需要分配的课程');
        }
    }

    //获取选中的复选框并将值设置到隐藏的form表单中
    function getAllCheckedCourse(){
        var $courseList = $("[name='courseCheckbox']:checked");
        var $tds;
        var arrangeCourse = '';
        //遍历选中的集合
        $courseList.each(function(i){
            //console.log($(this).val())
            //获取选中的行的所有td
            $tds = $(this).parents("tr").children("td");
            arrangeCourse = "<input name='taskArrangeCourses["+ i + "].courseName' type='hidden' value='" + $tds.eq(3).html()+ "'/>"
                + "<input name='taskArrangeCourses[" + i+ "].courseCode' type='hidden' value='" + $tds.eq(2).html() + "'/>"
                + "<input name='taskArrangeCourses[" + i+ "].majorName' type='hidden' value='" + $tds.eq(5).html() + "'/>"
                + "<input name='taskArrangeCourses[" + i+ "].className' type='hidden' value='" + $tds.eq(6).html() + "'/>"
                + "<input name='taskArrangeCourses[" + i+ "].majorStudentsNumber' type='hidden' value='" + $tds.eq(7).html() + "'/>"
                + "<input name='taskArrangeCourses[" + i+ "].totalPeriod' type='hidden' value='" + $tds.eq(8).html() + "'/>"
                + "<input name='taskArrangeCourses[" + i+ "].campusCode' type='hidden' value='" + changeStatus($tds.eq(4).html()) + "'/>";
            $("form").append(arrangeCourse);
        })
    }

    //将需要分配的课程信息提交到后台
    function saveTaskArrangeCourseInfo(){
        var success = false;
        $.ajax({
            url:contextPath+"/arrangeCourse/updateTaskArrangeCourseInfoList.action",
            data:$("#saveArrangeCourseForm").serialize(),
            type:"POST",
            async:false,
            datatype:"text",
            success:function(response){
                layer.alert(response, function(index){
                    //实现父页面的刷新
                    window.parent.location.reload();
                    //x_admin_close()
                    //layer.close(index);
                });
            }
        })
        return success;
    }

</script>

</body>

</html>