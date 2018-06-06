<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>文件审核</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/xadmin.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>

    <script src="${baseurl}/js/graduateProgram/fileManage/file-check.js"></script>
</head>

<body>
<!--主体-->
<div class="x-body">
    <form action="" class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="auditResult" value="1" lay-skin="primary" title="审核通过" checked>
                <input type="radio" name="auditResult" value="0" lay-skin="primary" title="审核不通过">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
                <textarea placeholder="请输入内容" name="auditContent" id="auditContent" class="layui-textarea"
                          lay-verify="required"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="L_pass" name="auditTime" lay-verify="required">
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