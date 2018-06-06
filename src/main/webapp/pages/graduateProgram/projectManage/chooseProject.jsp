<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>选择课题</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/projectManage/chooseProject.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="${baseurl}/welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a href="javascript:void(0)">课题管理</a>
        <a>
          <cite>选择课题</cite>
        </a>
      </span>
    <a class="layui-btn layui-btn-small" style="margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="iconfont" style="line-height:30px">&#xe6aa;</i>
    </a>
    <a class="layui-btn layui-btn-warm layui-btn-small" style="margin-top:3px;float:right;margin-right:3px;"
       onclick="closeOther()" title="关闭其他">
        <i class="iconfont" style="line-height:30px">&#xe6b7;</i>
    </a>
</div>
<!--主体-->
<div class="x-body">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="y_form">
            <input type="text" name="teacherName" placeholder="教师名称" autocomplete="off" class="layui-input">
            <input type="text" name="titlename" placeholder="课题名称" autocomplete="off" class="layui-input">
            <input type="hidden" name="currentPage">
            <input type="hidden" name="pageSize">
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
            <button type="reset" class="layui-btn layui-btn-primary" title="重置"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>选择课题</th>
            <th>教师名称</th>
            <th>课题名称</th>
            <th>课题类型</th>
            <th>课题来源</th>
            <th>人数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="y_tbody">
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="y_page"></div>
    <!--end 分页-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" id="saveButton" onclick="chooseProject_save()">保存 </button>
        <button class="layui-btn" id="submitButton" onclick="chooseProject_submit()">提交 </button>
        <span id="y_tip">&nbsp;<span class="layui-badge-dot"></span><span> 请选择两项，作为毕设题目。</span></span>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>选择</th>
            <th>教师名称</th>
            <th>课题名称</th>
            <th>课题类型</th>
            <th>课题来源</th>
            <th>人数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="choose_tbody">
        </tbody>
    </table>
    <!--end 表格内容-->
</div>

</body>

</html>