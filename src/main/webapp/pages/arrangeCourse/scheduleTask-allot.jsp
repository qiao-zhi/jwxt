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

    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="arrangeCourse()">分配 </button>
    </xblock>
    <!--end 操作区域-->
    <script>
    	var chooseCourse=0;//判断是否选中课程
    	function panduan(){
    		$(".layui-form-checkbox").each(function() { 
				if ($(this).hasClass("layui-form-checked")) {
					chooseCourse++;
				}
			})
    	}
    	function arrangeCourse(){
    		panduan();//调用判断方法
    		if (chooseCourse>0) {
							layer.confirm("您确认要为当前的教学任务分配选中的课程吗？",function(){
								var index = parent.layer.getFrameIndex(window.name);
					                //关闭当前frame
				             	parent.layer.close(index);
							});
						}
    		else{
    			layer.alert('请先选择需要分配的课程');
    		}
    		chooseCourse=0;//清空值
    	}
    	
    </script>

    <table id="test" lay-filter="test"></table>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th lay-data="{field:'', width:30}">
                    <input type="checkbox" name="courseCheckbox" lay-skin="primary">
                    <%--<div class="layui-unselect header layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon">&#xe605;</i>
                    </div>--%>
                </th>
                <th lay-data="{field:'', width:80}">序号</th>
                <th lay-data="{field:'', width:80}">课程代码</th>
                <th lay-data="{field:'', width:120}">课程名称</th>
                <th lay-data="{field:'', width:80}">校区</th>
                <th lay-data="{field:'', width:120}">专业</th>
                <th lay-data="{field:'', width:80}">年级</th>
                <th lay-data="{field:'', width:80}">专业总人数</th>
                <th lay-data="{field:'', width:80}">总学时</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    <input type="checkbox" name="courseCheckbox" lay-skin="primary">
                    <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'>
                        <i class="layui-icon">&#xe605;</i>
                    </div>--%>
                </td>
                <td>Y0201012</td>
                <td>201</td>
                <td>老王</td>
                <td>男</td>
                <td>1854-10-2</td>
                <td>软12004</td>
                <td>学生</td>
                <td>1854-10-2</td>
            </tr>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <%--<div id="demo7"></div>--%>
    <!--end 分页-->
</div>

<script>
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;

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