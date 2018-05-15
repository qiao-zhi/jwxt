<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/5
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>班级信息</title>
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
    </style>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>

    <%--ll 通知书管理的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/class.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">基础信息管理</a>
        <a>
          <cite>班级信息</cite></a>
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
<div style="width:16%;float:left;">
    <ul id="treeDemo" class="ztree"></ul>
</div>
<!--主体-->
<div class="x-body" style="width:80%;float:right">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so"  id="selectClassInfoForm">
            <input type="text" name="classnum" placeholder="班级编号" autocomplete="off" class="layui-input">
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-search="" name="grade" id="grade">
                    <option value="">年级</option>
                    <option value="2014">2014</option>
                    <option value="2015">2015</option>
                    <option value="2016">2016</option>
                    <option value="2017">2017</option>
                </select>
            </div>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select  lay-search="" name="majorid" id="majorName">
                    <option value="">专业名称</option>
                    <option value="1">软件工程</option>
                    <option value="2">网络工程</option>
                    <option value="3">物联网</option>
                    <option value="4">计算机</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="collegeid">
                    <option value="">学院名称</option>
                    <option value="1">计算机科学与技术</option>
                    <option value="2">机械</option>
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="if(clickRes == 1){x_admin_show('添加班级','./clazz-add.jsp')}else{alert('请选择年级！')}">添加班级</button>
        <button class="layui-btn layui-btn-danger" onclick="delAll()">批量删除</button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>班级编号</th>
            <th>班级名称</th>
            <th>专业名称</th>
            <th>班级人数</th>
            <th>年级</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody  id="classInfoList">

        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->
</div>

<script>
    /*
     左侧的树
     */
    var setting = {
        view: {
            showIcon: showIconForTree
        },
        data: {
            simpleData: {
                enable: true
            }
        },
        callback: {
            beforeClick: beforeClick
        }
    };

    //需要修改
    var zNodes =[
        { id:1, pId:0, name:"计科院", open:true},
        { id:11, pId:1, name:"14级"},
        { id:111, pId:11, name:"软件工程"},
        { id:1111, pId:111, name:"软件工程142001班"},
        { id:112, pId:11, name:"网络工程"},
        { id:113, pId:11, name:"物联网"},
        { id:111, pId:11, name:"计算机"},
        { id:12, pId:1, name:"15级"},
        { id:111, pId:11, name:"软件工程"},
        { id:112, pId:11, name:"网络工程"},
        { id:113, pId:11, name:"物联网"},
        { id:111, pId:11, name:"计算机"},

    ];

    function showIconForTree(treeId, treeNode) {
        return !treeNode.isParent;
    }

    var clickRes = 0;
    var getName;
    var className;
    function beforeClick(treeId, treeNode, clickFlag) {
        clickRes = 1;
        className = (className === "dark" ? "":"dark");
        getName = treeNode.name;
        showLog2(treeNode.name );
        return (treeNode.click != false);
    }

    //获取节点名
    function showLog2(str) {
        console.log(str)
    }

    $(document).ready(function() {
        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    });
    /*end 树*/



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
