<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
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

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
</head>

<body>

<!--主体-->
<div class="x-body">
<table class="layui-table-wang-info">
	<tr>
		<td>专业</td>
		<td></td>
		<td>接收人</td>
		<td></td>
	</tr>
	<tr>
		<td>学年</td>
		<td></td>
		<td>学期</td>
		<td></td>
	</tr>
	
</table>
   
   
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	
        	<tr>
    			<!--<th lay-data="{field:'', width:80}" rowspan="2">
    				<div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i>
    				</div>
    			</th>-->
		      <th lay-data="{field:'', width:80}" rowspan="2">课程编号</th>
		      <th lay-data="{field:'', width:120}" rowspan="2">课程名称</th>
		       <th lay-data="{field:'', width:80}" rowspan="2">学分</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">学时</th>
		      <th lay-data="{align:''}" colspan="4">实验分配</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">课内周学时</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">记分方式</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">上课班级</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">上课人数</th>
		       <th lay-data="{field:'', width:80}" rowspan="2">操作</th>
		    </tr>
		    <tr>
		      <th lay-data="{field:'', }">讲课</th>
		      <th lay-data="{field:'', }">实验</th>
		      <th lay-data="{field:'', }">上机</th>
		      <th lay-data="{field:'',}">实践</th>
		    </tr>
        </thead>
        <tbody>
        <tr>
            <!--<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>-->
            <td>Y0201012</td>
            <td>201</td>
            <td>老王</td>
            <td>男</td>
            <td>1854-10-2</td>
            <td>软12004</td>
            <td>学生</td>
            <td>1854-10-2</td>
            <td>软12004</td>
            <td>学生</td>
             <td>软件工程142001，软件工程142002，软件工程142003</td>
             <td>123</td>
            <td class="td-manage">
                <!--<a title="点击查看排课详细信息" onclick="x_admin_show('详细信息','scheduleManage-view.html')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
                <a title="修改"  onclick="x_admin_show('修改','scheduleManage-edit.html')" href="javascript:;">
                    <i class="layui-icon">&#xe642;</i>
                </a>-->
                <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                    <i class="layui-icon">&#xe640;</i>
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

</body>

</html>