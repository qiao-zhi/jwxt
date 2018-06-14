<!--权限管理页面-->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ include file="/tag.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>权限管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../lib/zTree/demo.css" type="text/css">
    <link rel="stylesheet" href="../../lib/zTree/zTreeStyle/zTreeStyle.css" type="text/css">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--S  QLQ--%>
    <!--树-->
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.exedit.js"></script>
    <script type="text/javascript" src="${baseurl}/js/system/authority.js"></script>

    <style>
        .el_leftTree{
            width:15%;
            float:left;
        }
        .el_treeTitle{
            display: block;
            font-size:15px;
            padding:20px;
            padding-bottom:0;
        }
        ul.ztree {
            width: 100%;
            background-color: white;
            height: auto;
            border:0;
            padding-bottom:30px;
            overflow-y: auto;
            text-align:center;
        }

        /*树对应的相关按钮*/
        .ztree li span.button.add {
            margin-left:2px; margin-right: -1px;
            background-position:-144px 0; vertical-align:top; *vertical-align:middle
        }
    </style>
    <%--E  QLQ--%>

</head>
<body>

<div class="x-nav" style="...">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">系统管理</a>
        <a>
          <cite>权限管理</cite></a>
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
<!--树-->
<div style="width:16%;float:left;">
    <br/>
    <span>&nbsp;&nbsp;权限管理&nbsp;&nbsp;&nbsp;</span>
    &nbsp;&nbsp;
    <hr>
    <ul id="treeDemo" class="ztree"></ul>
</div>

<div class="x-body" style="width:80%;float:right">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="queryPermissionForm">
            <!--隐藏一些信息-->
            <input type="hidden" name="pageSize">
            <input type="hidden" name="pageNum">
            <input type="hidden" name="parentid" id="parentid">

            <div class="layui-input-inline">
                <input type="text" name="permissionname"  placeholder="权限名称" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-input-inline">
                <select name="permissionstatus">
                    <option value="">--字典状态--</option>
                    <option value="0">禁用</option>
                    <option value="1">启用</option>
                </select>
            </div>
            <button class="layui-btn" type="button" onclick='queryPermissionFY()' title="点击查询"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击清空查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>

    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>权限名称</th>
            <th>权限描述</th>
            <th>权限状态</th>
            <th>操作</th>
        </thead>
        <tbody id="permissionTbody">
            <%--动态填充数据--%>
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