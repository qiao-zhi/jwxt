<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>毕设课题-教研室审核</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/projectManage/project-AC-checkFirst.js"></script>
</head>

<body>

<div class="x-body">
    <form class="layui-form">

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="checkResult" value="同意" lay-skin="primary" title="同意" checked>
                <input type="radio" name="checkResult" value="不同意" lay-skin="primary" title="不同意">
            </div>
        </div>

        <!--2-->
        <div class="layui-form-item">
            <label class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
                <textarea id="checkDesc" placeholder="请填写审核意见" name="checkDesc" class="layui-textarea" lay-verify="required"></textarea>
            </div>
        </div>

        <!--2-->
        <div class="layui-form-item">
            <label class="layui-form-label" for="checkDesc">
                审核时间
            </label>
            <div class="layui-input-inline">
                <input type="text"class="layui-input" id="L_pass" name="checkTime" lay-verify="required">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">提交</button>
        </div>
    </form>
</div>

</body>

</html>