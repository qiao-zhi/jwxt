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
        <thead>
        <tr>
            <th lay-data="{field:'', width:80}">教师姓名</th>
            <th lay-data="{field:'', width:80}">教师编号</th>
            <th lay-data="{field:'', width:120}">性别</th>
            <th lay-data="{field:'', width:80}">出生年月</th>
            <th lay-data="{field:'', width:120}">职务</th>
            <th lay-data="{field:'', width:80}">专业</th>
            <th lay-data="{field:'', width:80}">入职时间</th>
            <th lay-data="{field:'', width:80}">学位</th>
            <th lay-data="{field:'', width:80}">学历</th>
            <th lay-data="{field:'', width:80}">职称</th>
            <th lay-data="{field:'', width:80}">联系电话</th>
            <th lay-data="{field:'', width:80}">是否在职</th>
        </tr>
        </thead>
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
        findTeacherDetailInfo();
    });
    //查询任务通知书基本信息
    function findTeacherDetailInfo(currentPage,pageSize){
        $.ajax({
            url : contextPath+'/teacher/getTeacherInfo.action',
            data : {"teacherId":'${param.teacherid}'},//teacherId是形参
            type : 'POST',
            dataType : 'json',
            success : showTeacherDetailInfo
        });
    }
    function showTeacherDetailInfo(teacherinfo){
        //console.log(response)

        var detailInfoList = teacherinfo.list;
        $("tbody").html("");//清空表格中数据并重新填充数据

            var tr ="<tr><td>"+index+"</td><td>"
                +detailInfoList[i].teachername+"</td><td>"
                +detailInfoList[i].teacherid+"</td><td>"
                +detailInfoList[i].teachersex+"</td><td>"
                +detailInfoList[i].teacherbirth+"</td><td>"
                +detailInfoList[i].teacherposition+"</td><td>"
                +detailInfoList[i].majorid+"</td><td>"
                +detailInfoList[i].joinschooltime+"</td><td>"
                +detailInfoList[i].degree+"</td><td>"
                +detailInfoList[i].education+"</td><td>"
                +detailInfoList[i].positionaltitle+"</td><td>"
                +detailInfoList[i].teachertel+"</td><td>"
                +detailInfoList[i].inposition+"</td></tr>";
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
