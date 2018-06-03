<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>任务书审核</title>
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

    <script src="${baseurl}/js/graduateProgram/projectManage/assignmentManage-check.js"></script>
</head>

<body>

<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <c:if test="${userinfo.usersort}== '院长'">
        <table class="layui-table" style="width:850px;margin-left:45px;" width="">
            <thead>
            <tr>
                <th>教研室审核结果</th>
                <th>教研室审核意见</th>
                <th>教研室审核时间</th>
                <th>教研室审核人</th>
            </tr>
            </thead>
            <tbody id="firstCheckInfo">
            </tbody>
        </table>
    </c:if>
    <form class="layui-form">

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="checkResult" lay-skin="primary" value="同意" title="同意" checked>
                <input type="radio" name="checkResult" lay-skin="primary" value="不同意" title="不同意">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
                <textarea id="checkDesc" placeholder="请填写审核意见" name="checkDesc" class="layui-textarea"
                          lay-verify="required"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label" for="checkDesc">
                审核时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="L_pass" name="checkTime" lay-verify="required">
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