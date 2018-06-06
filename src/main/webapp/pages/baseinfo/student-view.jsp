<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生详细信息</title>
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
        <caption><h1>学生详细信息</h1></caption>
        <tbody>
        <tr>
            <td>学生姓名</td>
            <td>
            </td>
            <td>学号</td>
            <td>
            </td>
            <td colspan="4" rowspan="3"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
            </td>
            <td>出生年月</td>
            <td>
            </td>
        </tr>
        <tr>
            <td>职务</td>
            <td>
            </td>
            <td>身份证号</td>
            <td>
            </td>
        </tr>
        <tr>
            <td>学院</td>
            <td>
            </td>
            <td>入学时间</td>
            <td>
            </td>
            <td>专业班级</td>
            <td>
            </td>
            <td>是否毕业</td>
            <td>
            </td>
        </tr>
        </tbody>
    </table>

</div>

</body>

</html>
