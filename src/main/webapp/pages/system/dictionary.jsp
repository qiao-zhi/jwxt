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
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.exedit.js"></script>

    <%--S QLQ引入的--%>

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
        <form class="layui-form layui-col-md12 x-so">
            <input type="text" name="username"  placeholder="字典名称" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <select name="contrller">
                    <option>字典类型</option>
                    <option>学院级别</option>
                    <option>毕设类型</option>
                </select>
            </div>
            <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('添加字典','./dictionary-add.html')">添加字典</button>
        <button class="layui-btn layui-btn-danger" onclick="delAll()">批量删除</button>
    </xblock>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>字典名称</th>
            <th>字典类型</th>
            <th>描述</th>
            <th>状态</th>
            <th>操作</th>
        </thead>
        <tbody>
        <tr>
            <td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>一级</td>
            <td>学院级别</td>
            <td>学院级别</td>
            <td class="td-status">
                <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
            <td class="td-manage">
                <a onclick="member_stop(this,'10001')" href="javascript:;"  title="启用">
                    <i class="layui-icon">&#xe601;</i>
                </a>
                <a title="修改字典"  onclick="x_admin_show('修改字典','dictionary-modify.html')" href="javascript:;">
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

</div>
<script>
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
    /*批量删除*/
    function delAll (argument) {
        var data = tableCheck.getData();
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }
</script>
<script>
    layui.use('laydate', function(){
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

    /*用户-停用*/
    function member_stop(obj,id){
        layer.confirm('确认要停用吗？',function(index){

            if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

            }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
            }

        });
    }

    function delAll (argument) {

        var data = tableCheck.getData();

        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }

    /*树*/
    var setting = {
        view: {
            addHoverDom: addHoverDom,
            removeHoverDom: removeHoverDom,
            selectedMulti: false,  //不能按【ctrl键】多选
            showIcon:false          //隐藏图标
        },
        edit: {
            enable: true,
            editNameSelectAll: true,
            showRemoveBtn: true,
            showRenameBtn: true
        },
        data: {
            simpleData: {
                enable: true  //树显示格式
            }
        },
        callback: {
            beforeDrag: beforeDrag,
            beforeEditName: beforeEditName,
            beforeRemove: beforeRemove,
            beforeRename: beforeRename,
            onRemove: onRemove,
            onRename: onRename
        }
    };

    var zNodes =[
        { id:1, pId:0, name:"父节点 1", open:true},
        { id:11, pId:1, name:"叶子节点 1-1"},
        { id:12, pId:1, name:"叶子节点 1-2"},
        { id:13, pId:1, name:"叶子节点 1-3"},
        { id:2, pId:0, name:"父节点 2", open:true},
        { id:21, pId:2, name:"叶子节点 2-1"},
        { id:22, pId:2, name:"叶子节点 2-2"},
        { id:23, pId:2, name:"叶子节点 2-3"},
        { id:3, pId:0, name:"父节点 3", open:true},
        { id:31, pId:3, name:"叶子节点 3-1"},
        { id:32, pId:3, name:"叶子节点 3-2"},
        { id:33, pId:3, name:"叶子节点 3-3"}
    ];
    var log, className = "dark";
    function beforeDrag(treeId, treeNodes) {
        return false;
    }
    //点击编辑之前调用
    function beforeEditName(treeId, treeNode) {
        className = (className === "dark" ? "":"dark");
        showLog("[ "+getTime()+" beforeEditName ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);//往日志框中写内容
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.selectNode(treeNode);
        setTimeout(function() {
            if (confirm("进入节点 -- " + treeNode.name + " 的编辑状态吗？")) {
                setTimeout(function() {
                    zTree.editName(treeNode);
                }, 0);
            }
        }, 0);
        return false;
    }
    //点击删除之前调用
    function beforeRemove(treeId, treeNode) {
        className = (className === "dark" ? "":"dark");
        showLog("[ "+getTime()+" beforeRemove ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.selectNode(treeNode);
        return confirm("确认删除 节点 -- " + treeNode.name + " 吗？");
    }
    //点击修改之前调用
    function beforeRename(treeId, treeNode, newName, isCancel) {
        className = (className === "dark" ? "":"dark");
        showLog((isCancel ? "<span style='color:red'>":"") + "[ "+getTime()+" beforeRename ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name + (isCancel ? "</span>":""));
        if (newName.length == 0) {
            setTimeout(function() {
                var zTree = $.fn.zTree.getZTreeObj("treeDemo");
                zTree.cancelEditName();
                alert("节点名称不能为空.");
            }, 0);
            return false;
        }
        return true;
    }

    //回调函数
    function onRemove(e, treeId, treeNode) {
        showLog("[ "+getTime()+" onRemove ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
    }
    function onRename(e, treeId, treeNode, isCancel) {
        alert();
        showLog((isCancel ? "<span style='color:red'>":"") + "[ "+getTime()+" onRename ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name + (isCancel ? "</span>":""));
    }

    /*
    //在setting中可以这样控制showRenameBtn: showRenameBtn，哪些标签显示对应的按钮
    //删除按钮
   function showRemoveBtn(treeId, treeNode) {
        return !treeNode.isFirstNode;
    }
    //编辑按钮
    function showRenameBtn(treeId, treeNode) {
        return !treeNode.isLastNode;
    }*/

    //往日志框中写内容
    function showLog(str) {
        if (!log) log = $("#log");
        log.append("<li class='"+className+"'>"+str+"</li>");
        if(log.children("li").length > 8) {
            log.get(0).removeChild(log.children("li")[0]);
        }
    }
    //获取当前时间
    function getTime() {
        var now= new Date(),
            h=now.getHours(),
            m=now.getMinutes(),
            s=now.getSeconds(),
            ms=now.getMilliseconds();
        return (h+":"+m+":"+s+ " " +ms);
    }

    //移动到标签上，显示【添加】按钮
    var newCount = 1;
    function addHoverDom(treeId, treeNode) {
        var sObj = $("#" + treeNode.tId + "_span");
        if (treeNode.editNameFlag || $("#addBtn_"+treeNode.tId).length>0) return;
        var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
            + "' title='add node' onfocus='this.blur();'></span>";
        sObj.after(addStr);
        var btn = $("#addBtn_"+treeNode.tId);
        if (btn) btn.bind("click", function(){
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            zTree.addNodes(treeNode, {id:(100 + newCount), pId:treeNode.id, name:"new node" + (newCount++)});
            return false;
        });
    }
    //移动到标签上，隐藏【添加】按钮
    function removeHoverDom(treeId, treeNode) {
        $("#addBtn_"+treeNode.tId).unbind().remove();
    }

    //第一步
    $(document).ready(function(){
        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        //编辑名称时全选
        zTree.setting.edit.editNameSelectAll =  true;
    });





</script>
</body>

</html>