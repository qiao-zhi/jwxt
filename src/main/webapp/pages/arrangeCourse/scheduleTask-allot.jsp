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
        var arrangeTaskId_all = '${param.arrangeTaskId}'
    </script>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
    <%--分配课程的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/scheduleTask-allot.js"></script>
</head>

<body>

<!--主体-->
<div class="x-body">


        <!--查询-->
        <div class="layui-row">
            <form id="searchCourseForm" class="layui-form layui-col-md12 x-so">
                <input type="text" name="courseName" placeholder="课程名称" autocomplete="off" class="layui-input">
                <input type="text" name="majorName" placeholder="专业" autocomplete="off" class="layui-input">
                <div class="layui-input-inline">
                    <select name="campusCode">
                        <option value="">选择校区</option>
                        <option value="1">主校区</option>
                        <option value="2">华科学院</option>
                        <option value="3">晋城校区</option>
                    </select>
                </div>
                <%--隐藏排课任务ID和通知书ID--%>
                <input type="hidden" name="arrangeTaskId" value="${param.arrangeTaskId}"/>
                <input type="hidden" name="noticeBookId" value="${param.noticeBookId}"/>
                <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
                <button class="layui-btn layui-btn-normal" type="button" onclick="clearQueryCondition()"  lay-filter="clean" ><i class="layui-icon">&#xe639;</i></button>
            </form>
        </div>
        <!--end查询-->
    <xblock>
        <button class="layui-btn" onclick="arrangeCourse()">分配 </button>
    </xblock>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th lay-data="{field:'', width:30}">
                    <input type="checkbox" id="el_checkQuanxuan"  lay-skin="primary">
                    <%--<div class="layui-unselect header layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon">&#xe605;</i>
                    </div>--%>
                </th>
                <th lay-data="{field:'', width:80}">序号</th>
                <th lay-data="{field:'', width:80}">课程代码</th>
                <th lay-data="{field:'', width:120}">课程名称</th>
                <th lay-data="{field:'', width:80}">校区</th>
                <th lay-data="{field:'', width:120}">专业</th>
                <th lay-data="{field:'', width:80}">班级</th>
                <th lay-data="{field:'', width:80}">专业总人数</th>
                <th lay-data="{field:'', width:80}">总学时</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->
    <form id="saveArrangeCourseForm">
        <%--隐藏排课任务Id--%>
        <input type="hidden" name="arrangeTaskId" value="${param.arrangeTaskId}"/>
    </form>
    <!--分页-->
    <%--<div id="demo7"></div>--%>
    <!--end 分页-->
</div>

</body>

</html>