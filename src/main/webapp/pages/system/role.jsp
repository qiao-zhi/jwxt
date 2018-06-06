<%--角色管理界面--%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ include file="/tag.jsp"%>
<html>

<head>
    <meta charset="UTF-8">
    <title>角色管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <!--树-->
    <link rel="stylesheet" href="../../lib/zTree/demo.css" type="text/css">
    <link rel="stylesheet" href="../../lib/zTree/zTreeStyle/zTreeStyle.css" type="text/css">


    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--S   QLQ--%>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.exedit.js"></script>
    <script type="text/javascript" src="${baseurl}/js/system/authority.js"></script>
    <!--权限JS-->
    <script src="${baseurl}/js/system/role.js"></script>

    <style>
        .el_leftTree{
            /*width:15%;*/
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
    <%--E   QLQ--%>


</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">系统管理</a>
        <a>
          <cite>角色管理</cite></a>
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
        <form class="layui-form layui-col-md12 x-so" id="queryRoleForm">
            <%--隐藏一些条件--%>
            <input type="hidden" name="pageSize"><input type="hidden" name="pageNum">
            <input type="text" name="rolename"  placeholder="角色名" autocomplete="off" class="layui-input">

            <div class="layui-input-inline">
                <select name="rolestatus">
                    <option value="">角色状态</option>
                    <option value="1">启用</option>
                    <option value="0">禁用</option>
                </select>
            </div>

            <%--两个按钮--%>
            <button class="layui-btn" type="button" onclick="queryRoleFY()"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击重置查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn" onclick="openAddModal()">添加角色</button>
        <button class="layui-btn layui-btn-danger" onclick="deleteRoleBatch()">批量删除</button>
    </xblock>
    <table class="layui-table">
        <thead>
            <tr>
                <th>
                    <input type="checkbox" onclick="selectAllRole(this)">
                </th>
                <th>序号</th>
                <th>角色名称</th>
                <th>角色状态</th>
                <th>权限</th>
                <th>描述</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody id="roleTbody">
        <%--动态填充数据--%>
        </tbody>
    </table>

    <!--分页-->
    <div id="pageDiv_role"></div>
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


<%--1. 添加角色模态框 --%>
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_add_index">
<div class="x-body" style="display: none" id="addRoleModal">
    <form class="layui-form" id="addRoleForm">
        <%--1.角色名称--%>
        <div class="layui-form-item">
            <label for="add_rolename" class="layui-form-label">
                角色名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_rolename" name="rolename" class="layui-input add_clear" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <!--2.角色状态-->
        <div class="layui-form-item">
            <label class="layui-form-label">
                角色状态
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="rolestatus" value="1" title="启用" checked>
                <input type="radio" name="rolestatus" value="0" title="禁用" >
            </div>
        </div>
        <!--3 角色描述-->
        <div class="layui-form-item layui-form-text">
            <label for="add_description" class="layui-form-label">
                角色描述
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="description" lay-verify="required" id="add_description"
                       autocomplete="off" class="layui-input add_clear">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="addRole" type="button">添加</button>
        </div>
    </form>
</div>


<%--2.根据角色编号查看具体的权限信息--%>
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_rolePermission_index">
<div class="x-body" style="display: none" id="rolePermissionModal">
    <table class="layui-table">
        <thead>
            <tr>
                <th>序号</th>
                <th>权限名称</th>
                <th>权限状态</th>
            </tr>
        </thead>
        <tbody id="rolePermissionTbody">
        <%--动态填充数据--%>
        </tbody>
    </table>
</div>


<%--3. 修改角色模态框 --%>
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_updateRole_index">
<div class="x-body" style="display: none" id="updateRoleModal">
    <form class="layui-form" id="updateRoleForm">
        <%--0.隐藏角色编号--%>
        <input type="hidden" name="roleid" id="update_roleid">
        <%--1.角色名称--%>
        <div class="layui-form-item">
            <label for="add_rolename" class="layui-form-label">
                角色名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_rolename" name="rolename" class="layui-input add_clear" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <!--2.角色状态-->
        <div class="layui-form-item">
            <label class="layui-form-label">
                角色状态
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="rolestatus" value="1" title="启用" checked class="update_rolestatus">
                <input type="radio" name="rolestatus" value="0" title="禁用"  class="update_rolestatus">
            </div>
        </div>
        <!--3 角色描述-->
        <div class="layui-form-item layui-form-text">
            <label for="add_description" class="layui-form-label">
                角色描述
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="description" lay-verify="required" id="update_description"
                       autocomplete="off" class="layui-input add_clear">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="updateRole" type="button">修改</button>
        </div>
    </form>
</div>



<%--4.  配置权限模态框--%>
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_setPermission_index">
<div class="x-body" style="display: none;text-align: center" id="setPermissionModal">
    <!--隐藏一个角色ID用于最后添加角色权限-->
    <input type="hidden" id="hidden_role_id_4_permission">
    <!--树-->
    <ul id="treeDemo" class="ztree"></ul>
    <hr/>
    <button class="layui-btn" type="button" style="float: right;" onclick="addRolePermissionBatch()">确认</button>
    <br/>
    <br/>
</div>






