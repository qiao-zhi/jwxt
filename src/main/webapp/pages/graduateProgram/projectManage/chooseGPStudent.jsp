<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>选择毕设学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a href="javascript:void(0)">课题管理</a>
        <a>
          <cite>选择毕设学生</cite>
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
        <form class="layui-form layui-col-md12 x-so">
            <input type="text" name="username" placeholder="课题名称" autocomplete="off" class="layui-input">
            <input type="text" name="" class="layui-input" id="L_pass" placeholder="学年" autocomplete="off">
            <div class="layui-input-inline">
                <select name="contrller">
                    <option>是否确认完成</option><!--通过判断是否有审核结果-->
                    <option>是</option>
                    <option>否</option>
                </select>
            </div>
            <div class="layui-input-inline"><!--未完成 是判断是否填写了一部门-->
                <select name="contrller">
                    <option>是否填写任务书</option>
                    <option>未填写</option>
                    <option>未完成</option>
                    <option>已完成</option>
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <!--若申请人数小于 需要人数，则自动确认，不需要确认学生。 提交后不可修改-->
        <button class="layui-btn layui-btn-normal" onclick="x_admin_show('确认学生','./chooseGPStudent-confirm.jsp')">确认学生 </button>
        <button class="layui-btn" onclick="x_admin_show('填写任务书','./chooseGPStudent-addAssignment.jsp')">填写任务书 </button>
        <button class="layui-btn">上传考勤表 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i>
                </div>
            </th>
            <th>学年</th>
            <th>课题名称</th>
            <th>教师</th>
            <th>专业</th>
            <th>所需人数</th>
            <th>申请人数</th>
            <th>确认人数</th>
            <th>是否确认完成</th>
            <th>是否填写任务书</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>2014</td>
            <td>阿萨德发</td>
            <td>王丽</td>
            <td>软件工程</td>
            <td>3</td>
            <td>3</td>
            <td>3</td>
            <td>是</td>
            <td>未填写</td>
            <td class="td-manage">
                <a title="详细信息" onclick="x_admin_show('详细信息','chooseGPStudent-view.jsp')">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
                <a title="修改任务书" onclick="x_admin_show('修改任务书','./chooseGPStudent-modifyAssignment.jsp')" href="javascript:;">
                    <i class="layui-icon">&#xe642;</i>
                </a>
            </td>
        </tr>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->
</div>
<script>
    /*学年*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
            ,type: 'year'
        });
    })

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

</script>
</body>

</html>