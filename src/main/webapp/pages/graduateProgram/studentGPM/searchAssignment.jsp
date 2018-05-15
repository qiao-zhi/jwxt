<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加任务书</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <button class="btn-primary btn">提交</button>
    <table class="table table-bordered">
        <caption><h1>太远科技大学毕业设计（论文）任务书</h1>
            <span>学院：计算机科学与技术学院</span>
        </caption>
        <tbody>
        <tr>
            <td>学生姓名</td>
            <td></td>
            <td>学号</td>
            <td></td>
        </tr>
        <tr>
            <td>专业班级</td>
            <td></td>
            <td>同组人</td>
            <td></td>
        </tr>
        <tr>
            <td>任务下发时间</td>
            <td></td>
            <td>任务完成时间</td>
            <td></td>
        </tr>
        <tr>
            <td style="width:110px">设计（论文）题目</td>
            <td></td>
            <td>毕设题目</td>
            <td></td>
        </tr>
        <tr>
            <td>设计目的要求</td>
            <td colspan="3"></td>
        </tr>
        <tr>
            <td>设计主要内容</td>
            <td colspan="3"></td>
        </tr>
        <tr>
            <td>设计提交资料</td>
            <td colspan="3"></td>
        </tr>
        <tr>
            <td>学生签名</td>
            <td><input type="text" class="layui-input" autofocus></td>
            <td>指导教师签名</td>
            <td><img class="layui-upload-img" width="100" id="demo1"></td>
        </tr>
        <tr>
            <td>系主任签名</td>
            <td><img class="layui-upload-img" width="100" id="demo13"></td>
            <td>主管院长签名</td>
            <td><img class="layui-upload-img" width="100" id="demo14"></td>
        </tr>
        </tbody>
    </table>
    <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>

</div>
</body>

</html>