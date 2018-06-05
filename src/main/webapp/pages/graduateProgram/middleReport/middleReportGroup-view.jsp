<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>中期答辩小组-详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
</head>
<body>
<div class="x-body">
    <table class="layui-table">
        <tr>
            <td>小组名称</td>
            <td colspan="5">${tTeacherInfoVo.groupname}</td>
        </tr>
        <tr>
            <td>小组组长</td>
            <td>${groupLeader}</td>
            <td>答辩地点</td>
            <td>${tTeacherInfoVo.replyaddress}</td>
            <td>检查时间</td>
            <td>${tTeacherInfoVo.arrangetime}</td>
        </tr>
        <tr style="background-color: #f2f2f2;">
            <td>序号</td>
            <td>学生姓名</td>
            <td>班级</td>
            <td>毕设题目</td>
            <td>指导教师</td>
            <td>检查教师</td>
        </tr>
        <tr>
            <td>1</td>
            <td>学生1</td>
            <td>软件工程1</td>
            <td>8888</td>
            <td>教师1</td>
            <td>教师2</td>
        </tr>
    </table>
</div>
</body>

</html>