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
    	.layui-form-item .layui-input-inline {
		    width: 200px !important;
		}
    </style>
    <script>
        //定义全局变量
        var arrangeCourseId_all = '${param.arrangeCourseId}'
    </script>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
    <%--安排课程添加的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/scheduleArranage-add.js"></script>

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
    <form class="layui-form ">

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                任课教师
            </label>
            <div class="layui-input-inline">
                <input type="text" id="teacherName"  lay-verify="required" readonly  autocomplete="off" class="layui-input">
            </div>
            <label class="layui-form-label">
                教师编号
            </label>
            <div class="layui-input-inline">
                <input type="text"  id="teacherNumber" readonly lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
              历史任课教师
            </label>
            <div class="layui-input-inline">
                <select name="historyTeacherInfo"  lay-search lay-filter="selectTeacher" >
				</select>
            </div>
            <label for="" class="layui-form-label">
                在职教师查询
            </label>
            <div class="layui-input-inline">
                <select name="allTeacherInfo"  lay-search="" lay-filter="selectTeacher">
                </select>
            </div>

        </div>
        <!--3-->
        <div class="layui-form-item">
            <label class="layui-form-label">所任班级</label>
            <div class="layui-input-block" id="classNames">
            </div>
            <div class="layui-input-inline">
                <button class="layui-btn" lay-filter="addTeacher" lay-submit=""  style="margin-left: 44px;" >
                  <i class="layui-icon">&#xe608;</i> 添加至表格
                </button>

			</div>
        </div>
    </form>
    <xblock>
        <button class="layui-btn" lay-filter="add" lay-submit="">
            确认排课
        </button>
    </xblock>

    <table class="layui-table">
        <thead>
		    <tr>
		      <th>教师名称</th>
		      <th>教师编号</th>
		      <th>所任班级</th>
		      <th>操作</th>
		    </tr> 
        </thead>
        <tbody id="addTeacherAndClass">
        </tbody>
    </table>

    <form id="saveTeacherCourseClassForm">
        <%--隐藏任务安排课程ID--%>
        <input type="hidden" name="arrangeCourseId" value="${param.arrangeCourseId}"/>
    </form>

</div>

</body>

</html>