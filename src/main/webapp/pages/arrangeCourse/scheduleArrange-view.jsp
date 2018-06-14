<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
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
    <style>
    	.layui-table-wang-info tr td:nth-child(2n){
	 	 	width: 200px;
	 	 	}
    </style>
	<%--公共标签--%>
	<%@include file="/tag.jsp"%>
	<%--排课公共方法--%>
	<script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>

</head>
<body>
<div class="x-body">
	<table class="layui-table-wang-info">
		<tr>
			<td>课程名称</td>
			<td id="v_courseName"></td>
			<td>课程编号</td>
			<td id="v_courseCode"></td>
		</tr>
		<tr>
			<td>学年</td>
			<td id="v_academicYear"></td>
			<td>学期</td>
			<td id="v_term"></td>
		</tr>
		<tr>
			<td>校区</td>
			<td id="v_campus"></td>
			<td>学时</td>
			<td id="v_totalPeriod"></td>
		</tr>
		<tr>
			<td>专业名称</td>
			<td id="v_majorName"></td>
			<td>专业人数</td>
			<td id="v_majorStudentsNumber"></td>
		</tr>
	</table>
    
    <table class="layui-table">
        	<thead>
		    <tr>
			  <th>序号</th>
		      <th>教师编号</th>
		      <th>教师名称</th>
		      <th>所任班级</th>
		    </tr> 
		  </thead>
		  <tbody id="teacherClassInfoList">
		  </tbody>
        </table>
        
</div>
<script>
	//layui
    layui.use([], function () {
        $ = layui.jquery;
        getTaskArrangeCourseAndTeacherClassInfo();
    });

    //查询任务课程信息
    function getTaskArrangeCourseAndTeacherClassInfo(){
        $.ajax({
            url : contextPath+'/arrangeCourse/getTaskArrangeCourseAndTeacherClassInfo.action',
            data : {"arrangeCourseId":'${param.arrangeCourseId}'},
            type : 'POST',
            dataType : 'json',
            success : showTaskArrangeCourseAndTeacherInfo
        });
    }
    function showTaskArrangeCourseAndTeacherInfo(response){
        var courseAndTeacherInfo = response;
        var teacherClassInfoList = response.teachers;
		$("#v_courseName").text(courseAndTeacherInfo.courseName);
        $("#v_courseCode").text(courseAndTeacherInfo.courseCode);
        $("#v_academicYear").text(teacherClassInfoList[0].academicYear);
        $("#v_term").text(teacherClassInfoList[0].term);
        $("#v_campus").text(replaceStatus(courseAndTeacherInfo.campusCode));
        $("#v_totalPeriod").text(courseAndTeacherInfo.totalPeriod);
        $("#v_majorName").text(courseAndTeacherInfo.majorName);
        $("#v_majorStudentsNumber").text(courseAndTeacherInfo.majorStudentsNumber);

        $("#teacherClassInfoList").html("");//清空表格中数据并重新填充数据
        for(var i=0,length_l = teacherClassInfoList.length; i<length_l; i++){
            var index = i + 1;
            var tr ="<tr><td>"
                +index+"</td><td>"
                +teacherClassInfoList[i].teacherNumber+"</td><td>"
                +teacherClassInfoList[i].teacherName+"</td><td>"
                +teacherClassInfoList[i].classNames+"</td></tr>";
            $("#teacherClassInfoList").append(tr);
		}
    }
</script>

</body>

</html>