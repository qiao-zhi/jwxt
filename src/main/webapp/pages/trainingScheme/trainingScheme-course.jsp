<!--培养方案课程类别和培养方案课程管理界面-->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@include file="/tag.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>培养方案-课程管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <!--树-->
    <link rel="stylesheet" href="../../lib/zTree/demo.css" type="text/css">
    <link rel="stylesheet" href="../../lib/zTree/zTreeStyle/zTreeStyle.css" type="text/css">

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.exedit.js"></script>

    <!--S  qlq引入的 -->
    <script type="text/javascript" src="${baseurl}/js/trainScheme/trainSchemeCourseManage.js"></script>
    <% String trainSchemeId = request.getParameter("trainSchemeId"); %>

    <!--E  qlq引入的 -->

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
</head>

<body>
<!--隐藏培养方案编号到这里-->
<input type="hidden" name="trainSchemeId" id="trainSchemeId" value="<%= trainSchemeId %>">

<!--树-->
<div style="width:16%;float:left;">
    <br/>
    <span>&nbsp;&nbsp;课程类别&nbsp;&nbsp;&nbsp; <i class="layui-icon" title="点击刷新树" onclick="javascript:getTypeTree()">&#x1002;</i></span>
    <hr>
    <ul id="treeDiv" class="ztree"></ul>
</div>

<!--主体-->
<div class="x-body" style="width:80%;float:right">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            <input type="text" name="username" placeholder="课程名称" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <select name="contrller">
                    <option>课程性质</option>
                    <option>男</option>
                    <option>女</option>
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-sm" title="点击刷新页面" type="button" onclick="javascript:window.location.reload()" style="float: right"><i class="layui-icon" style="font-size: 15px;">&#x1002;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <!--<xblock>
        <button class="layui-btn" onclick="if(clickRes == 1){x_admin_show('添加学生','./student-add.html')}else{alert('请选择班级！')}">添加学生 </button>
    </xblock>-->
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i></div>
            </th>
            <th>课程名称</th>
            <th>学分</th>
            <th>学时</th>
            <th>学时分配方式及时长</th>
            <th>每周学时分配</th>
            <th>计分方式</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>201700917</td>
            <td>老王</td>
            <td>男</td>
            <td>1854-10-2</td>
            <td>软12004</td>
            <td>学生</td>
            <td>校外</td>
            <td class="td-manage">
                <a title="查看" onclick="x_admin_show('详细信息','student-view.html')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
                <a title="修改学生信息"  onclick="x_admin_show('修改学生信息','student-modify.html')" href="javascript:;">
                    <i class="layui-icon">&#xe642;</i>
                </a>
                <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                    <i class="layui-icon">&#xe640;</i>
                </a>
            </td>
        </tr>
        </tbody>
    </table>
    <!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->

    <ul class="info">
        <li class="title">
                <ul id="log" class="log"></ul></p>
                </li>
            </ul>
        </li>
    </ul>
</div>

<SCRIPT type="text/javascript">
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'demo7'
            ,count: 100
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj){
                console.log(obj)
            }
        });
    });

    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }

</SCRIPT>

</body>

</html>


<!--一些模态框-->

<%--1.S       添加课程类别模态框--%>

<input type="hidden" id="hidden_addType_index">
<div class="x-body" style="display: none" id="addTypeModal">
    <form class="layui-form" id="addCourseTypeForm">
        <!--隐藏一些信息-->
        <%--上级类别编号--%>
        <input type="hidden" name="uptypenum" id="addType_uptypenum" class="clear-input">
        <%--培养方案编号--%>
        <input type="hidden" name="trainingschemeid" id="add_trainingschemeid" class="clear-input">

        <!--0.上级课程类别名称-->
        <div class="layui-form-item">
            <label for="addType_upTypeName" class="layui-form-label">
                上级类别
            </label>
            <div class="layui-input-inline">
                <input type="text" id="addType_upTypeName" name="upTypeName" disabled  class="layui-input clear-input" value="">
            </div>
        </div>

        <!--1.字典名称-->
        <div class="layui-form-item">
            <label for="typename" class="layui-form-label">
                类别名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="typename" name="typename" lay-verify="required"
                       autocomplete="off" class="layui-input clear-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2 类别描述-->
        <div class="layui-form-item layui-form-text">
            <label for="addType_remark" class="layui-form-label">
                类别描述
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="remark" lay-verify="required" id="addType_remark"
                       autocomplete="off" class="layui-input clear-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="addCourseType" type="button">保存</button>
        </div>
    </form>
</div>

<%--E添加课程类别模态框--%>












