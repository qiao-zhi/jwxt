<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
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
    <style>
    	.layui-table-wang-info tr td:nth-child(2n){
	 	 	width: 200px;
	 	 	}
    </style>
	<%--公共标签--%>
	<%@include file="/tag.jsp"%>
</head>
<body>
<div class="x-body">
	<table class="layui-table-wang-info">
		<tr>
			<td>课程名称</td>
			<td>Java高级程序语言设计</td>
			<td>课程编号</td>
			<td>Y12476417</td>
		</tr>
		<tr>
			<td>校区</td>
			<td>主校区</td>
			<td>学时</td>
			<td>48</td>
		</tr>
		<tr>
			<td>专业名称</td>
			<td>软件工程</td>
			<td>专业人数</td>
			<td>110</td>
		</tr>
	</table>
    
    <table class="layui-table">
        	<thead>
		    <tr>
		      <th>教师名称</th>
		      <th>教师编号</th>
		      <th>所任班级</th>
		    </tr> 
		  </thead>
		  <tbody id="filterTeacher">
		    <tr>
		      <td>王五</td>
		      <td>2016-11-29</td>
		      <td>人生就像是一场修行</td>
		     
		    </tr>
		    
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
            success : function(response){
                console.log(response)
            }
        });
    }
</script>

</body>

</html>