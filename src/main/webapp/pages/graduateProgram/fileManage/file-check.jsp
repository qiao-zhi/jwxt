<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>文件审核</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!--主体-->
<div class="x-body">
    <form action="" class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="auditCesult" value="1" lay-skin="primary" title="审核通过" checked>
                <input type="radio" name="auditCesult" value="0" lay-skin="primary" title="审核不通过">
            </div>
        </div>

        <!--2-->
        <div class="layui-form-item">
            <label class="layui-form-label" for="checkDesc">
                审核意见
            </label>
            <div class="layui-input-inline">
                <textarea placeholder="请输入内容" name="auditContent" id="checkDesc" class="layui-textarea"></textarea>
            </div>
        </div>

        <%--结果id from studentTitleResult--%>
        <input type="hidden" name="StudentTitleresultID" value="">

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">提交</button>
        </div>
    </form>
</div>

</body>
</html>