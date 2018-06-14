<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教师详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>

    <%--ll nameAndId的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/commonNameAndId.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="table table-bordered">
        <tbody>

        </tbody>
    </table>

    <!--分页-->
    <div id="detailPage"></div>
    <!--end 分页-->

</div>


<script>
    layui.use([],function(){
        //第一次执行
        findTeacherInfo();
    });
    //查询学生基本信息
    function findTeacherInfo(){
        $.ajax({
            url : contextPath+'/teacherInfo/getTeacherInfo.action',
            data : {"teacherId":'${param.tId}'},
            type : 'POST',
            dataType : 'json',
            success : showTeacherInfo
        });
    }
    function showTeacherInfo(pageInfo){
        var teacherInfoList = pageInfo;
        console.log(pageInfo);
        $("tbody").html("");//清空表格中数据并重新填充数据
        var tr ="<tr><td>教师编号</td><td>"
            +teacherInfoList.teachernum+"</td><td>教师姓名</td><td>"
            +teacherInfoList.teachername+"</td></tr><tr>"
            +"<tr><td>学院</td><td>"
            +teacherInfoList.collegename+"</td><td>教研室</td><td>"
            +teacherInfoList.majorname+"</td></tr><tr>"
            +"<tr><td>职称</td><td>"
            +teacherInfoList.positionaltitle+"</td><td>职务</td><td>"
            +teacherInfoList.teacherposition+"</td></tr><tr>"
            +"<tr><td>毕业学校</td><td>"
            +teacherInfoList.graduateschool+"</td><td>毕业专业</td><td>"
            +teacherInfoList.graduatemajor+"</td></tr><tr>"
            +"<tr><td>性别</td><td>"
            +teacherInfoList.teachersex+"</td><td>教师电话</td><td>"
            +teacherInfoList.teachertel+"</td></tr><tr>"
            +"<tr><td>入校时间</td><td>"
            +teacherInfoList.joinschooltime+"</td><td>学历</td><td>"
            +teacherInfoList.education+"</td><td>学位</td><td>"
            +teacherInfoList.degree+"</td></tr>";
        $("tbody").append(tr);


    }


    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }

</script>

</body>

</html>
