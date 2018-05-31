<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生-毕设管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}/js/y_public.js"></script>

    <script src="${baseurl}/js/graduateProgram/studentGPM/fillProgramTable.js"></script>
</head>

<body>

<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <button class="btn-primary btn" onclick="y_save()">保存</button>
    <button class="btn-primary btn" onclick="y_submit()">提交</button>
    <table class="table table-bordered">
        <caption><h1>太原科技大学毕业设计（论文）计划进程表</h1>
            <span style="position:relative;top:15px;left:10px;">学院（直属系）：<span id="collegeName"></span></span><!--根据登录教师所在学院显示-->
            <div style="float: right">
                <label for="L_pass" class="layui-form-label">
                    时间：
                </label>
                <div class="layui-input-inline" style="width: 135px">
                    <input type="text" class="layui-input" id="L_pass">
                </div>
            </div>
        </caption>
        <tbody>
        </tbody>
    </table>
    <span>说明：此表一式两份，学生填写，学生一份，学院（直属系）一份。</span>

</div>
</body>

</html>