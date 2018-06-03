<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>教研室选择课题-详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>

    <script src="${baseurl}/js/graduateProgram/projectManage/projectManage-view.js"></script>
</head>

<body>

<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <!--通过是否确认，。确认则显示，选择的学生信息。显示相关内容-->
    <table class="table table-bordered">
        <caption><h3>选择毕设学生信息</h3></caption>
        <tbody>
        </tbody>
    </table>
</div>

</body>
</html>