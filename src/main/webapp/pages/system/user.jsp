<%--用户管理界面--%>
<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/tag.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--S  QLQ--%>
    <script type="text/javascript" src="${baseurl}/js/system/user.js"></script>
    <%--E  QLQ--%>

</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">系统管理</a>
        <a>
          <cite>用户管理</cite></a>
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
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            <input type="text" name="username"  placeholder="登录名" autocomplete="off" class="layui-input">
            <input type="text" name="username"  placeholder="真实姓名" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <select name="contrller">
                    <option>角色</option>
                    <option>班长</option>
                    <option>学生</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="contrller">
                    <option>状态</option>
                    <option>启用</option>
                    <option>禁用</option>
                </select>
            </div>
            <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn">添加用户</button>
        <button class="layui-btn layui-btn-danger">批量删除</button>
    </xblock>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <input type="checkbox">
            </th>
            <th>序号</th>
            <th>用户姓名</th>
            <th>用户类型</th>
            <th>用户账户</th>
            <th>所属机构</th>
            <th>机构代码</th>
            <th>账户状态</th>
            <th>操作</th>
        </thead>
        <tbody id="userTbody">
            <%--动态往这里填数据--%>
        </tbody>
    </table>

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->

</div>
<script>

    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }

</script>
</body>
</html>