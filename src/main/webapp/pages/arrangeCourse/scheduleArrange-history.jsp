<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
        //学年
        var academicYear_all = '${param.academicYear}';
        //学期
        var term_all = '${param.term}';
    </script>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
    <%--根据历史记录排课的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/scheduleArrange-history.js"></script>
</head>

<body>

<!--主体-->
<div class="x-body">

    <!--操作区域-->
    <xblock>
    	<button class="layui-btn" onclick="arrangeCourse()">使用</button>
    </xblock>

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	<tr>
                <th>
                    <input type="checkbox" id="el_checkQuanxuan"  lay-skin="primary">
                </th>
                <th lay-data="{field:'', width:80}">序号</th>
                <th lay-data="{field:'', width:80}">课程代码</th>
                <th lay-data="{field:'', width:120}">课程名称</th>
                <th lay-data="{field:'', width:80}">校区</th>
                <th lay-data="{field:'', width:120}">专业</th>
                <th lay-data="{field:'', width:80}">班级</th>
                <th lay-data="{field:'', width:80}">专业总人数</th>
                <th lay-data="{field:'', width:80}">总学时</th>
                <th lay-data="{field:'', width:80}">教师编号</th>
                <th lay-data="{field:'', width:80}">教师姓名</th>
		    </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->
    <%--用于向后台提交信息的表单--%>
    <form id="saveArrangeCourseForm">
    </form>

</div>

</body>

</html>