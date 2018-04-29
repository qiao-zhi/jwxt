<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>上传教学资料</title>
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
    <%--S    上传文件相关操作--%>
    <%
        String courseId=request.getParameter("courseId");
    %>
    <% if (courseId != null) { %>
    <script type="text/javascript" charset="utf-8">
        courseId = "<%= courseId %>";//将传过来的课程编号赋给JS的全局变量
    </script>
    <% }%>
    <%--E    上传文件相关操作--%>

</head>




<body>
<div class="x-body">
    <form class="layui-form">
        <%--0.隐藏一个课程编号--%>
        <input type="hidden" name="courseid" value="<%= courseId %>"/>
        <%--隐藏一个index用于关闭这个index--%>
        <input type="hidden" id="hidden_index" >


        <!--1-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                教学资料类别
            </label>
            <div class="layui-input-inline">
                <select name="filetype" lay-verify="required">
				  <option value="课程进度表" >课程进度表</option>
				  <option value="课程教学大纲">课程教学大纲</option>
				  <option value="课程实验大纲">课程实验大纲</option>
				</select>     
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须选择
            </div>
        </div>
<%--        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                教学资料名称
            </label>
            <div class="layui-input-inline">
                <input type="text" name="remark1" id="remark1" required="" lay-verify="required"
                        class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>--%>
        <!--1-1-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
               教学资料附件
            </label>
            <div class="layui-input-inline">
                <input type="" id="uploadCourseMaterial" name="" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须选择
            </div>
        </div>




        <!--2-->
        <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
            <button type="button" class="layui-btn" id="uploadTeachingFile">开始上传</button>
        </div>
        <!---->
    </form>
</div>



<%--qlq写的加载页面执行一些函数--%>

<%--引入公共的标签--%>
<%@ include file="/tag.jsp" %>
<!--qlq引入的课程管理的JS-->
<script type="text/javascript" src="../../js/trainScheme/courseLibrary.js" charset="utf-8"></script>


<script>
    /*页面加载完成执行一些函数*/
    $(function () {
        initUploadTeachingProgram();//初始化layui文件上传
    })
</script>



</body>

</html>