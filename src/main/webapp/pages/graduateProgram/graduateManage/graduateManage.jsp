<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>毕设基本信息管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/graduateManage/graduateManage.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="${baseurl}/welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a>
          <cite>毕设基本信息管理</cite>
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
            <input type="text" name="graduateDesignName" placeholder="毕设名称" autocomplete="off" class="layui-input">
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select name="yearNum" id="y_yearNum">
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="majorid" id="y_major">
                </select>
            </div>
            <input type="hidden" name="currentPage">
            <input type="hidden" name="pageSize">
            <button class="layui-btn" type="button" onclick="y_formSearch()"><i class="layui-icon">&#xe615;</i></button>
            <button type="reset" class="layui-btn layui-btn-primary" title="重置"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('填写课题申请表', './graduateManage-add.jsp')">添加毕设基本信息 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>学年</th>
            <th>学期</th>
            <th>毕设名称</th>
            <th>专业</th>
            <th>毕设简介</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="y_page"></div>
    <!--end 分页-->
</div>
</body>
</html>