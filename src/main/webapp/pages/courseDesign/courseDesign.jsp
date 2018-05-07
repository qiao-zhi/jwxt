<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设管理</title>
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

    <script type="text/javascript">
//        加载页面时自动加载
        $(function () {
            $.ajax({
                url:"/jwxt/findcourseDesign/yearAndMajot.do",
                type:"post",
                data:{},
                dataType:"json",
                success:function (resultMap) {
                   var yearList = resultMap.yearList;
                   var majorList = resultMap.majorList;
                    for(var i=0;i<majorList.length;i++){
                        $("#majorSelect").append("<option value='"+majorList[i]+"'>"+ majorList[i]+" </option>")
                    }
                    for (var i=0;i<yearList.length;i++){
                        $("#yearSelect").append("<option value="+yearList[i]+">"+yearList[i]+"</option>")
                    }
                    layui.use(['form'],function () {
                        var form = layui.form;
                        form.render('select'); //刷新select选择框渲染
                    });
                },
                error:function () {
                    alert("获取年，专业失败！");
                }
            });
            // 调用查询功能
            findNeedArrangeCD();
        });
    var majorID =null;
    var courseName=null;
    var trainCourseID=null;
    var year = null;
    var semester = null;
    var major = null;
    function findNeedArrangeCD(curr,pageSize) {
            year = $("#yearSelect").find("option:selected").val();
            major = $("#majorSelect").find("option:selected").val();
            semester = $("#selectSemester").find("option:selected").val();
//       alert(year+","+major+","+semester);

        $.ajax({
            url:"/jwxt/findcourseDesign/toFindNeedArrangeCourseDesign.do",
            type:"post",
            data:{"grade":year,"majorName":major,"semester":semester,"pageNum":curr},
            dataType:"json",
            success:function (pageInfo) {
             //   alert(JSON.stringify(pageInfo));
               var total = pageInfo.total;
               var pageNum = pageInfo.pageNum;
               var pageSize = pageInfo.pageSize;

               var courseDesignList = pageInfo.list;
                $("#tbodyNeedArrange").html("");//清空表格数据重新填写
                for(var i=0;i<courseDesignList.length;i++){
                    var index =(pageNum - 1)*pageSize + i +1; //编号
                   // alert("ss")
                    // 获取状态
                    var displayVal = "";
                    displayVal = courseDesignList[i].display;
                    if(parseInt(displayVal)==-1){
                        status = "未保存";
                    }else if(parseInt(displayVal)==0){
                        status = "已保存，未提交";
                    }else if(parseInt(displayVal)==1){
                        status = "已提交";
                    }else{
                        status = "----";
                    }
                  $("#tbodyNeedArrange").append(
                    "<tr>"+
                      "<td><div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2' onclick='changeClass(this);'><i class='layui-icon'>&#xe605;</i></div></td>"+
              //        "<td><input type='radio' class='onlySelect'  name='radio1' style='width: 40px;height: 20px;'/></td>"+
                      "<td style='display:none;'>"+courseDesignList[i].majorID+"</td>"+
                      "<td style='display:none;'>"+courseDesignList[i].grade+"</td>"+
                      "<td style='display:none;'>"+courseDesignList[i].trainCourseID+"</td>"+
                      "<td>"+index+"</td>" +
                      "<td>"+courseDesignList[i].courseNum+"</td>"+
                      "<td>"+courseDesignList[i].courseNameCN+"</td>"+
                      "<td>"+courseDesignList[i].credit+"学分,"+courseDesignList[i].experimentHour+"学时</td>"+
                 //     "<td><c:if test='"+courseDesignList[i].display+"=null'>未分配</c:if> </td>" +
                      "<td>"+status+"</td>" +
                      "<td>"+courseDesignList[i].teacherName+"</td>"+
                      "<td>"+courseDesignList[i].CourseArrangeTime+"</td>"+
                      "<td style='display:none;'>"+courseDesignList[i].yearNum+"</td>"+
                      "<td class='td-manage'>"+
                            "<a title='查看' onclick='showArrangeInfo(this);' >" +
                                "<i class='layui-icon'>&#xe63c;</i>"+
                            "</a>"+
                            "<a title='删除' onclick='deleteArrangeInfo(this);'>" +
                                "<i class='layui-icon'>&#xe640;</i>" +
                            "</a>" +
                      "</td>" +
                      "</tr>"
                )
                }
                //开启分页组件
                needArrangeCourseDesign(total,pageNum,pageSize);
            },
            error:function () {
                alert("查询信息失败！");
            }
        });

    }

        function needArrangeCourseDesign(total,pageNum,pageSize) {
            // 使用layui的分页插件
            layui.use(['laypage','layer'],function () {
                var laypage = layui.laypage,layer = layui.layer;
                // 执行一个laypage实例
                laypage.render({
                    elem:'pageDiv', // 此处时id，但不用加#
                    count:total,    // 数据总数（服务端获取）
                    limit:pageSize, // 每页显示条数
                    curr:pageNum,   //当前页号
                    limits:[8],
                    layout:['limit','prev','page','next','skip','count'],//显示哪些分页组件
                    jump:function (obj,first) { // 点击页号时执行的函数
                        // obj包含了当前分页的所有参数，例如：
                        //     console.log(obj.curr);  //得到当前页，以便向服务器请求对应的数据
                        //    console.log(obj.limit);   //得到每页显示的条数
                        $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                        $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                        if(!first){ //首次不执行（点击的时候才执行）
//                            pageSize = $(".layui-laypage-limits").children('select').find("option:selected").val();
                            findNeedArrangeCD(obj.curr,pageSize); //执行查询分页函数（这个函数必须写在这）
                        }
                    }
                });
            });
        }

        function showArrangeInfo(obj) {
            // 获取参数
            var majorID = $(obj).parent("td").parent("tr").find("td").eq(1).text();
            var grade = $(obj).parent("td").parent("tr").find("td").eq(2).text();
            var trainCourseID = $(obj).parent("td").parent("tr").find("td").eq(3).text();
            var yearNum =  $(obj).parent("td").parent("tr").find("td").eq(11).text();
            var courseNum =  $(obj).parent("td").parent("tr").find("td").eq(5).text();
            // 使用git请求
            x_admin_show("详细信息","./courseDesign-ArrangeInfoDetail.jsp?majorID="+majorID+"&trainCourseID="+trainCourseID+"&yearNum="+yearNum+"&courseNum="+courseNum+"&grade="+grade+"")
        }

        function deleteArrangeInfo(obj) {
             var checkStr = $(obj).parent("td").parent("tr").find("td").eq(8).text();
           //  alert(checkStr);
             if (checkStr=="----"){
                layer.alert("没有可以删除的信息！");
                return;
             }
             var majorID = $(obj).parent("td").parent("tr").find("td").eq(1).text();
             var grade = $(obj).parent("td").parent("tr").find("td").eq(2).text();
             var trainCourseID = $(obj).parent("td").parent("tr").find("td").eq(3).text();
             var yearNum =  $(obj).parent("td").parent("tr").find("td").eq(11).text();
            // alert(trainCourseID);
            $.ajax({
                url:"/jwxt/findcourseDesign/deleteCourseDesignArrangeInfo.do",
                type:"post",
                data:{"trainCourseID":trainCourseID,"yearNum":yearNum,"majorID":majorID,"grade":grade},
                async:false,
                dataType:"json",
                success:function () {
                    layer.alert("删除成功！")
                },
                error:function () {
                    layer.alert("删除安排信息失败！");
                }
            });
            findNeedArrangeCD();
        }

        function changeClass(obj) {
             if ($(obj).hasClass("layui-form-checked")) {
                $(obj).removeClass("layui-form-checked");
                //$(obj).attr("name","selected");
            } else {
                  $(obj).addClass("layui-form-checked");
                 //$(obj).attr("name","none");
                 }
            }


        var chooseCourse=0;//判断是否选中课程
        function checkNum(){
         $(".layui-form-checkbox").each(function() {
             if ($(this).hasClass("layui-form-checked")) {
                  chooseCourse++;
             }
         })
        }

        var isArrange = function isArrange() {

            return true;
        }
        function courseDesignArrange(){
            // 检查是否选择年级，学期，专业
            if(year==""||semester==""||major==""){
                layer.alert("请先选择具体的年级/专业/学期再进行分配！");
                return;
            }

            checkNum();//调用判断方法
         if (chooseCourse==1) {
             // 检查所选课设是否安排
             var checkStr = $(".layui-form-checked").parent().parent().find("td").eq(8).text();
             if (checkStr!="----"){
                 layer.alert("所选课设已经安排！");
                 chooseCourse=0;//清空值
                 return;
             }
            majorID = $(".layui-form-checked").parent("td").parent("tr").find("td").eq(1).text();
            courseName = $(".layui-form-checked").parent().parent().find("td").eq(6).text();
            trainCourseID = $(".layui-form-checked").parent().parent().find("td").eq(3).text();
            var courseNum = $(".layui-form-checked").parent().parent().find("td").eq(5).text();
             //alert(majorID+","+courseName+","+trainCourseID);
             // alert(semester+","+year);
            var courseName=encodeURI(encodeURI(courseName));
            x_admin_show('课设分配','./courseDesign-Arrange.jsp?majorID='+majorID+'&courseName='+courseName+'&trainCourseID='+trainCourseID+' &year='+year+'&semester='+semester+'&courseNum='+courseNum+'')

         }else if(chooseCourse<=0){
            layer.alert('请先选择需要分配的课设');
        } else {
            layer.alert("请选择一门课程设计进行分配")
     }
        chooseCourse=0;//清空值
    }

    function courseDesignImport(){
        panduan();//调用判断方法
        if (chooseCourse>0) {
           layer.alert('导出成功');
        }
         else{
          layer.alert('请先选择需要导出的课设信息');
        }
     chooseCourse=0;//清空值
    }


//处理保存按钮
function save(){
    $.ajax({
        url:"/jwxt/arrangeCourseDesign/saveCourseDesignInfo.do",
        type:"post",
        data:{},
        async:false,
        dataType:"json",
        success:function (result) {
                layer.alert("保存成功！");
        },
        error:function () {
            layer.alert("保存信息失败！");
        }
    });
//    layer.alert('保存成功');
    findNeedArrangeCD();
}
// 处理提交按钮
function commit(){
    $.ajax({
        url:"/jwxt/arrangeCourseDesign/submitCourseDesignInfo.do",
        type:"post",
        data:{},
        async:false,
        dataType:"json",
        success:function (result) {
                layer.alert("提交成功！");
        },
        error:function () {
            layer.alert("提交信息失败！");
        }
    });
    //layer.confirm('您确认要提交此次课设分配信息吗？');
    findNeedArrangeCD();
}


    </script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程设计</a>
        <a>
          <cite>课设管理</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="iconfont" style="line-height:30px">&#xe6aa;</i>
    </a>
    <a class="layui-btn layui-btn-warm layui-btn-small" style="margin-top:3px;float:right;margin-right:3px;"
       onclick="closeOther()" title="关闭其他">
        <i class="iconfont" style="line-height:30px">&#xe6b7;</i>
    </a>
</div>
<!--主体-->
<div class="x-body">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            <div class="layui-input-inline">
                <select name="" lay-verify="" id="yearSelect">
                    <option value="">请选择年级</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="" lay-verify="" id="majorSelect">
                    <option value="">请选择专业</option>
                </select>
            </div>

            <!--<div class="layui-input-inline">-->
            <!--<select name="" lay-verify="">-->
            <!--<option value="">请选择学年</option>-->
            <!--<option value="010">通识教育</option>-->
            <!--</select>-->
            <!--</div>-->

            <div class="layui-input-inline">
                <select name="" lay-verify="" id="selectSemester">
                    <option value="">请选择学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                    <option value="3">第三学期</option>
                    <option value="4">第四学期</option>
                    <option value="5">第五学期</option>
                    <option value="6">第六学期</option>
                    <option value="7">第七学期</option>
                    <option value="8">第八学期</option>
                </select>
            </div>
            <button class="layui-btn" type="button" lay-filter="sreach" onclick="findNeedArrangeCD();"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->
    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="courseDesignArrange()">分配 </button>
        <button class="layui-btn" onclick="courseDesignImport()">导出 </button>
        <button class="layui-btn" style="float: right;" onclick="commit()">提交 </button>
        <button class="layui-btn" style="float: right;" onclick="save()">保存 </button>
    </xblock>

    <script>

    </script>
    <!--end 操作区域-->

    <!--表格内容-->
    <form>
        <table class="layui-table">
            <thead>
            <tr>
                <th>选择
                    <!--<div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>-->
                </th>
                <th>序号</th>
                <th>课设编号</th>
                <th>课设名称</th>
                <!--<th>开始时间</th>
                <th>结束时间</th>-->
                <!--<th>上传人</th>
                <th>课程设计安排</th>-->
                <th>课程设计简介</th>
                <th>安排状态</th>
                <th>指导教师</th>
                <th>最后安排时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="tbodyNeedArrange">


            <tr>
                <td><div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div></td>
                <td>20</td>
                <td>201700917</td>
                <td>老王</td>
                <td>学生</td>
                <td>已分配</td>
                <td></td>
                <td></td>

                <td class="td-manage">
                    <a title="点击查看订单详细信息" onclick="x_admin_show('详细信息','courseDesign-ArrangeInfoDetail.html')" href="javascript:;">
                        <i class="layui-icon">&#xe63c;</i>
                    </a>
                    <a title="编辑"  onclick="x_admin_show('编辑','courseDesign-Arrange.html')" href="javascript:;">
                        <i class="layui-icon">&#xe642;</i>
                    </a>
                </td>
            </tr>



            </tbody>
        </table>
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <span class="layui-laypage-count" id="dataCount"></span>
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>

<script>
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'demo7'
            ,count: 100
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj){
                console.log(obj)
            }
        });
    });

    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }
</script>
<script>
    //???
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

</script>

</body>

</html>