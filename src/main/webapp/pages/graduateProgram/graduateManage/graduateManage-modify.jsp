<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>填写课题申请表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/graduateManage/graduateManage-modify.js"></script>
</head>

<body>

<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <form class="layui-form" id="y_form">

        <div class="layui-form-item">
            <label class="layui-form-label">
                学年
            </label>
            <div class="layui-input-inline">
                <select lay-verify="required" lay-search="" name="yearNum" id="y_yearNum">
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                学期
            </label>
            <div class="layui-input-inline">
                <select name="semesternum" id="semesternum" lay-verify="required">
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                毕设名称
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="graduatedesignname" name="graduatedesignname" lay-verify="required">
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
                <textarea id="graduatedesc" name="graduatedesc" class="layui-textarea" lay-verify="required"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">修改</button>
        </div>
    </form>
</div>

</body>

</html>