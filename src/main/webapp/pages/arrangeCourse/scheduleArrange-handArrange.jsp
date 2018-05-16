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
    <script>
        //定义全局变量
        //排课任务ID
        var arrangeTaskId_all = '${param.arrangeTaskId}';
    </script>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
    <%--手动排课的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/scheduleArrange-handArrange.js"></script>
</head>

<body>

<!--主体-->
<div class="x-body">

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="arrangeCourse()">排课 </button>
    </xblock>
    <!--end 操作区域-->
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	<tr>
    			<th lay-data="{field:'', width:80}" rowspan="2">选择
    			</th>
                <th lay-data="{field:'', width:80}">序号</th>
                <th lay-data="{field:'', width:80}">课程代码</th>
                <th lay-data="{field:'', width:120}">课程名称</th>
                <th lay-data="{field:'', width:80}">校区</th>
                <th lay-data="{field:'', width:120}">专业</th>
                <th lay-data="{field:'', width:80}">班级</th>
                <th lay-data="{field:'', width:80}">专业总人数</th>
                <th lay-data="{field:'', width:80}">总学时</th>
                <th lay-data="{field:'', width:80}">教师姓名</th>
		        <th lay-data="{field:'', width:80}" rowspan="2">操作</th>
		    </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="coursePage"></div>
    <!--end 分页-->
</div>

</body>

</html>