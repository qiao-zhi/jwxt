<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生-毕设管理--详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}/js/y_public.js"></script>

    <script src="${baseurl}/js/graduateProgram/studentGPM/studentGPM-view.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="table table-bordered">
        <caption><h3>毕设课题详细信息</h3></caption>
        <tbody>
        <tr>
            <td>课题名称</td>
            <td colspan="5">${teachergredesigntitle.titlename}</td>
        </tr>
        <tr>
            <td>课题类型</td>
            <td>${teachergredesigntitle.projecttype}</td>
            <td>课题来源</td>
            <td></td>
            <td>课题类别</td>
            <td>${teachergredesigntitle.titletype}</td>
        </tr>
        <tr>
            <td>成果形式</td>
            <td>${teachergredesigntitle.resulttype}</td>
            <td>需要人数</td>
            <td>${teachergredesigntitle.reqirestudentnum}</td>
            <td>设计时间</td>
            <td>${teachergredesigntitle.gdTime}</td>
        </tr>
        <tr>
            <td>目标要求</td>
            <td colspan="5">${teachergredesigntitle.targetrequire}</td>
        </tr>
        <tr>
            <td>研究内容</td>
            <td colspan="5">${teachergredesigntitle.researchcontent}</td>
        </tr>
        </tbody>
    </table>

</div>

</body>

</html>