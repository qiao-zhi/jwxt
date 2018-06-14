<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>


	<%--引入公共的标签--%>
	<%@ include file="/tag.jsp" %>
	<!--qlq引入的课程管理的JS-->
	<script type="text/javascript" src="../../js/trainScheme/courseLibrary.js" charset="utf-8"></script>

	<script>
		//页面加载完成执行一些函数
		$(function(){
            queryCourseBaseInfoByCourseId();//查询课程基本信息
            queryCourseFileInfo();//查询课程教学资料信息
		});
	</script>

	<%--S    上传文件相关操作--%>
	<%
		String courseId=request.getParameter("courseId");
	%>




</head>
<body>
<div class="x-body">
	<%--0.隐藏一个课程编号--%>
	<input type="hidden" name="courseid" value="<%= courseId %>"/>

	<h3>课程基本信息</h3>
	<table class="layui-table-wang-info">
		<tr>
			<td class="layui-bg-gray">课程编号</td>
			<td id="coursenum"></td>
			<td class="layui-bg-gray">课程平台</td>
			<td id="courseplatform"></td>
		</tr>
		<tr>
			<td class="layui-bg-gray">中文名称</td>
			<td id="coursenamecn"></td>
			<td class="layui-bg-gray">英文名称</td>
			<td id="coursenameen"></td>
		</tr>
		<tr>
			<td class="layui-bg-gray">课程性质</td>
			<td id="coursenature"></td>
			<td class="layui-bg-gray">学分/学时</td>
			<td id="credit"></td>
		</tr>
		<tr>
			<td class="layui-bg-gray">讲课时长</td>
			<td id="teachhour"></td>
			<td class="layui-bg-gray">实验时长</td>
			<td id="experimenthour"></td>
		</tr>
		<tr>
			<td class="layui-bg-gray">上机时长</td>
			<td id="computerhour"></td>
			<td class="layui-bg-gray">实践时长</td>
			<td id="practicehour"></td>
		</tr>
		<tr>
			<td class="layui-bg-gray">周学时分配</td>
			<td id="weeklyhour"></td>
			<td class="layui-bg-gray">计分方式</td>
			<td id="scoringway"></td>
		</tr>
	</table>

	<br>
	<hr>
	<h3>教学资料信息</h3>
	<%--开始的时候表格不显示，只有当表格有数据才显示表格--%>
	<center id="promptLabel" style="display: none;">
		<h1>您还没有课程资料，请先上传培训资料</h1>
	</center>
	<table class="layui-table" style="display: none" id="courseFileTable">
		<thead>
			<tr>
				<th>资料类型</th>
				<th>资料名称</th>
			</tr>
		</thead>
		<tbody id="courseFileTbody">
			<%--异步往这里填充数据--%>
		</tbody>
	</table>

</div>
</body>
</html>