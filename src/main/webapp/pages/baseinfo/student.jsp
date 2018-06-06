<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/5
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生信息</title>
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
    <script type="text/javascript" src="${baseurl}/js/baseInfo/student.js"></script>
</head>

<body>

<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">基础信息管理</a>
        <a>
          <cite>学生信息</cite></a>
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
        <form class="layui-form layui-col-md12 x-so "id="selectStudentInfoForm">
            <input type="text" name="studentnum" placeholder="学生学号" autocomplete="off" class="layui-input">
            <input type="text" name="studentname" placeholder="学生姓名" autocomplete="off" class="layui-input">
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select  lay-search="" name="majorid" id="majorName">

                </select>
            </div>
            <div class="layui-input-inline">
                <select name="collegeid">

                </select>
            </div>

            <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('添加学生','./student-add.jsp')">添加学生 </button>
        <button class="layui-btn" onclick="x_admin_show('统计','./student-statistic.jsp')">统计 </button>
        <button class="layui-btn layui-btn-normal" onclick="importStudent()">导入数据 </button>
        <button class="layui-btn layui-btn-normal" onclick="studentExport()">导出数据 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <%--<th>--%>
                <%--<div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">--%>
                    <%--&#xe605;</i></div>--%>
            <%--</th>--%>
                <th> </th>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>班级</th>
            <th>专业</th>
            <th>学院</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="studentBaseInfoList">
        </tbody>
    </table>
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
    var zNodes =[
        { id:1, pId:0, name:"计科院", open:true},
        { id:11, pId:1, name:"软件工程"},
        { id:111, pId:11, name:"15级"},
        { id:1111, pId:111, name:"152001班"},
        { id:1111, pId:111, name:"152002班"},
        { id:112, pId:11, name:"14级"},
        { id:1121, pId:112, name:"142001班"},
        { id:1121, pId:112, name:"142002班"},
        { id:12, pId:1, name:"网络工程"},
        { id:113, pId:12, name:"15级"},
        { id:1111, pId:113, name:"152001班"},
        { id:1111, pId:113, name:"152002班"},
        { id:114, pId:12, name:"14级"},
        { id:1121, pId:114, name:"142001班"},
        { id:1121, pId:114, name:"142002班"}
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

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }
</script>
<script>
    //???
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });
</script>
</body>

</html>
