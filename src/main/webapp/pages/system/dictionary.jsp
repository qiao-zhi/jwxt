<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>字典管理</title>
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
    <%--引入非模块化的JS--%>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.exedit.js"></script>

    <%--S QLQ引入的--%>
    <%@include file="/tag.jsp"%>
    <script type="text/javascript" src="../../js/system/dictionary.js"></script>
    <script>
        //页面加载完成后执行一些函数
        $(function(){
            getDictionaryTree();//查询字典树
            getDictionaryFY();//分页查询字典信息
        });
    </script>
    <%--E QLQ引入的--%>


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
<div class="x-nav" style="...">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">字典管理</a>
        <a>
          <cite>字典管理</cite></a>
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
    <ul id="treeDemo" class="ztree"></ul>
</div>






<div class="x-body" style="width:80%;float:right">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="dictionaryQueryForm">
            <%--input隐藏一些查询条件--%>
            <%--隐藏页大小--%>
            <input type="hidden" name="pageSize">
            <%--隐藏当前页--%>
            <input type="hidden" name="pageNum">
            <%--隐藏上级字典编号--%>
            <input type="hidden" name="updictionaryid">

            <div class="layui-input-inline">
                <input type="text" name="dictionaryname"  placeholder="字典名称" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-input-inline">
                <select name="isuse">
                    <option value="">--字典状态--</option>
                    <option value="0">禁用</option>
                    <option value="1">启用</option>
                </select>
            </div>
            <button class="layui-btn" type="button" onclick='queryDictionaryBtn()' title="点击查询"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击清空查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <div>
        <button class="layui-btn" type="button" onclick="openAddModal()" id="openAddModalBtn" style="display: none;">添加字典</button>
        <button class="layui-btn layui-btn-danger" type="button" id="deleteDictBtn" onclick="deleteDictBatch()" style="display: none;">批量删除</button>
    </div>
    <table class="layui-table">
        <thead>
            <tr>
                <th>
                    <input type="checkbox" onclick="selectAllAndDisselect(this)" title="点击全选和全不选"/>
                </th>
                <th>序号</th>
                <th>字典名称</th>
                <th>上级字典</th>
                <th>字典描述</th>
                <th>字典状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <!--字典表格，异步填充数据-->
        <tbody id="dictionaryTbody">
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

<!--模态框-->
<!--1.添加模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_add_index">
<div class="x-body" style="display: none" id="addModal">
    <form class="layui-form" id="addDictionaryForm">
        <!--0.隐藏上级字典编号-->
        <div class="layui-form-item">
            <label for="dictionaryname" class="layui-form-label">
                上级字典
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_updictionaryname"  disabled  class="layui-input" value="">
                <input type="hidden" name="updictionaryid">
            </div>
        </div>

        <!--1.字典名称-->
        <div class="layui-form-item">
            <label for="dictionaryname" class="layui-form-label">
                字典名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="dictionaryname" name="dictionaryname" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2 字典描述-->
        <div class="layui-form-item layui-form-text">
            <label for="dictionaryname" class="layui-form-label">
                字典描述
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="description" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <%--3.字典启用状态--%>
        <div class="layui-form-item layui-form-text">
            <label for="dictionaryname" class="layui-form-label">
                字典状态
            </label>
            <div class="layui-input-inline">
                <input type="radio"  name="isuse" class="layui-input" value="1" title="启用" checked>
                <input type="radio"  name="isuse" class="layui-input" value="0" title="禁用" >
            </div>
        </div>
        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="addDictionary" type="button">保存</button>
        </div>
    </form>
</div>




<!--2.修改字典模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_update_index">
<div class="x-body" style="display: none" id="updateModal">
    <form class="layui-form" id="updateDictionaryForm">
        <!--0.隐藏上级字典编号-->
        <div class="layui-form-item">
            <label for="dictionaryname" class="layui-form-label">
                上级字典
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_updictionaryname"  disabled  class="layui-input" value="">
                <%--隐藏需要修改的字典编号--%>
                <input type="hidden" name="dictionaryid" id="update_dictionaryid">
            </div>
        </div>

        <!--1.字典名称-->
        <div class="layui-form-item">
            <label for="dictionaryname" class="layui-form-label">
                字典名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_dictionaryname" name="dictionaryname" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2 字典描述-->
        <div class="layui-form-item layui-form-text">
            <label for="dictionaryname" class="layui-form-label">
                字典描述
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="description" lay-verify="required" id="update_description"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <%--3.字典启用状态--%>
        <div class="">
            <label for="dictionaryname" class="layui-form-label">
                字典状态
            </label>
            <div class="">
                <input type="radio"  name="isuse" class="update_isuse"  value="1" title="启用">
                <input type="radio"  name="isuse" class="update_isuse" value="0" title="禁用" >
            </div>
        </div>
        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="updateDictionary" type="button">修改</button>
        </div>
    </form>
</div>




