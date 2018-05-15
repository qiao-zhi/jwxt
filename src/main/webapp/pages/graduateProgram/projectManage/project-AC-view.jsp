<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <!--通过审核状态的不同，显示相关内容-->
    <table class="table table-bordered">
        <caption><h1>毕设课题详细信息</h1></caption>
        <tbody>
        <tr>
            <td>课题名称</td>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td>课题类型</td>
            <td></td>
            <td>题目类别</td>
            <td></td>
            <td>课题来源</td>
            <td></td>
        </tr>
        <tr>
            <td>题目类别</td>
            <td></td>
            <td>成果形式</td>
            <td></td>
            <td>设计时间</td>
            <td></td>
        </tr>
        <tr>
            <td>指导教师</td>
            <td></td>
            <td>职称</td>
            <td></td>
            <td>学位</td>
            <td></td>
        </tr>
        <tr>
            <td>学生专业</td>
            <td></td>
            <td>学生人数</td>
            <td></td>
            <td>申请时间</td>
            <td></td>
        </tr>
        <tr>
            <td>教研室审核</td>
            <td></td>
            <td>教研室审核意见</td>
            <td colspan="3"></td>
        </tr>
        <tr>
            <td>院长审核</td>
            <td></td>
            <td>院长审核意见</td>
            <td colspan="3"></td>
        </tr>
        <tr>
            <td>目标要求</td>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td>研究内容</td>
            <td colspan="5"></td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>