<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>确认学生</title>
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

    <script src="${baseurl}/js/graduateProgram/projectManage/chooseGPStudent-confirm.js"></script>
</head>

<body>

<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="layui-table">
        <caption>基本信息</caption>
        <thead>
        <tr>
            <th>课题名称</th>
            <th>课题来源</th>
            <th>课题类别</th>
            <th>专业</th>
            <th>需要人数</th>
        </tr>
        </thead>
        <tbody id="y_titleBody">
        </tbody>
    </table>

    <table class="layui-table">
        <caption>学生选择列表</caption>
        <thead>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>班级</th>
            <th>志愿</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="y_studentBody">
        </tbody>
    </table>
    <br>
    <button class="btn-primary btn" onclick="y_submit()">提交</button>
</div>

</body>

</html>