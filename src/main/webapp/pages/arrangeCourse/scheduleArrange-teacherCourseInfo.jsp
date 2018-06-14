<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
        <form id="searchTeacherCourseForm" class="layui-form layui-col-md12 x-so">
            <%--隐藏当前页和当前页显示条数--%>
            <input type="hidden" name="pageSize"/>
            <input type="hidden" name="currentPage"/>
            <%--隐藏学院ID--%>
            <input type="hidden" name="academicId" value="${param.academicId}"/>
            <%--学年学期--%>
            <input type="hidden" name="academicYear" value="${param.academicYear}"/>
            <input type="hidden" name="term" value="${param.term}"/>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	<tr>
                <th lay-data="{field:'', width:80}" rowspan="2">序号</th>
                <th lay-data="{field:'', width:120}" rowspan="2">教师名称</th>
                <th lay-data="{field:'', width:80}" rowspan="2">教师编号</th>
                <th lay-data="{field:'', width:80}" rowspan="2">教师专业</th>
                <th lay-data="{field:'', width:80}" rowspan="2">学年</th>
                <th lay-data="{field:'', width:80}" rowspan="2">学期</th>
                <th lay-data="{field:'', width:80}" rowspan="2">课程名称</th>
                <th lay-data="{field:'', width:80}" rowspan="2">课程代码</th>
                <th lay-data="{field:'', width:80}" rowspan="2">课程专业</th>
		    </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="teacherCoursePage"></div>
    <!--end 分页-->
</div>

<script>
    layui.use([],function(){
        //第一次执行
        findTeacherCourseInfo();
    });
    //查询教师课程信息
    function findTeacherCourseInfo(){
        $.ajax({
            url : contextPath+'/arrangeCourse/findCollegeTeacherArrangeCourseInfoList.action',
            data :$("#searchTeacherCourseForm").serialize(),
            type : 'POST',
            dataType : 'json',
            success : showTeacherCourseInfo
        });
    }
    function showTeacherCourseInfo(pageInfo){
        //console.log(response)
        var total = pageInfo.total;//页总数
        var pageNum = pageInfo.pageNum;//页号
        var pageSize = pageInfo.pageSize;//页大小
        var detailInfoList = pageInfo.list;
        $("tbody").html("");//清空表格中数据并重新填充数据
        for(var i=0,length_l = detailInfoList.length;i<length_l;i++){
            var index = (pageNum - 1) * pageSize + i + 1;
            var tr ="<tr><td>"+index+"</td><td>"
                +detailInfoList[i].teacherName+"</td><td>"
                +detailInfoList[i].teacherNum+"</td><td>"
                +detailInfoList[i].teacherMajorName+"</td><td>"
                +checkNull(detailInfoList[i].academicYear)+"</td><td>"
                +termStatusReplace(checkNull(detailInfoList[i].term))+"</td><td>"
                +checkNull(detailInfoList[i].courseName)+"</td><td>"
                +checkNull(detailInfoList[i].courseCode)+"</td><td>"
                +checkNull(detailInfoList[i].majorName)+"</td></tr>";
            $("tbody").append(tr);
        }
        //开启分页组件
        detailInfoListPage(total,pageNum,pageSize);
    }
    //分页函数
    function detailInfoListPage(total,pageNum,pageSize){
        /*分页js*/
        layui.use(['laypage', 'layer'], function(){
            var laypage = layui.laypage,layer = layui.layer;
            //完整功能
            laypage.render({
                elem: 'teacherCoursePage', //注意，这里的 test1 是 ID，不用加 # 号
                count: total, //数据总数，从服务端得到
                limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
                curr:pageNum,//当前页号
                limits:[6,10,15,20],
                layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
                jump: function(obj, first){//点击页号的时候执行的函数
                    $("[name='currentPage']").val(obj.curr);//向隐藏域设置当前页的值
                    $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                    if(!first){//首次不执行(点击的时候才执行)
                        findTeacherCourseInfo();//执行查询分页函数(这个函数必须写在这里)
                    }
                }
            });
        });
    }

</script>
</body>

</html>