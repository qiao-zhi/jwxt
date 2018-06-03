<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加毕设基本信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/graduateManage/graduateManage-add.js"></script>
</head>

<body>
<div class="x-body">
    <form class="layui-form" id="y_formAdd">

        <div class="layui-form-item">
            <label class="layui-form-label">
                毕设名称
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="graduatedesignname" lay-verify="required">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                专业
            </label>
            <div class="layui-input-inline">
                <select name="majorid" id="y_major" lay-verify="required">
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                毕设简介
            </label>
            <div class="layui-input-inline">
                <textarea placeholder="请填写毕设简介" name="graduatedesc" class="layui-textarea" lay-verify="required"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add" type="button" onclick="y_submit()">添加</button>
        </div>
    </form>
</div>

</body>

</html>