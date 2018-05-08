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
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
</head>

<body>

<!--主体-->
<div class="x-body">
<%--<table class="layui-table-wang-info">
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
	
</table>--%>
   
   
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	
        	<tr>
    			<!--<th lay-data="{field:'', width:80}" rowspan="2">
    				<div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i>
    				</div>
    			</th>-->
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

    <%--<!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->--%>
</div>

<script>
    layui.use([],function(){
        //第一次执行
        findTaskArrangeCourseInfo();
    });
    //查询任务通知书基本信息
    function findTaskArrangeCourseInfo(){
        $.ajax({
            url : contextPath+'/arrangeCourse/findTaskArrangeCourseInfoList.action',
            data : {"arrangeTaskId":'${param.arrangeTaskId}'},
            type : 'POST',
            dataType : 'json',
            success : showTaskArrangeCourseInfo
        });
    }
    function showTaskArrangeCourseInfo(response){
        var taskArrangeCourseList = response;
        $("tbody").html("");//清空表格中数据并重新填充数据
        for(var i=0,length_l = taskArrangeCourseList.length;i<length_l;i++){
            var index = i + 1;
            var tr ="<tr><td>"
                +index+"</td><td>"
                +taskArrangeCourseList[i].courseCode+"</td><td>"
                +taskArrangeCourseList[i].courseName+"</td><td>"
                +replaceStatus(taskArrangeCourseList[i].campusCode)+"</td><td>"
                +taskArrangeCourseList[i].majorName+"</td><td>"
                +taskArrangeCourseList[i].className+"</td><td>"
                +taskArrangeCourseList[i].majorStudentsNumber+"</td><td>"
                +taskArrangeCourseList[i].totalPeriod+"</td></tr>";
            $("tbody").append(tr);
        }
    }


</script>

</body>

</html>