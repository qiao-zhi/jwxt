<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选择毕设学生-详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
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
        <caption><h3>选择毕设学生信息</h3></caption>
        <tbody>
        <tr>
            <td>课题名称</td>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td>课题类型</td>
            <td colspan="2"></td>
            <td>题目类别</td>
            <td></td>
        </tr>
        <tr>
            <td>课题来源</td>
            <td colspan="2"></td>
            <td>指导教师</td>
            <td></td>
        </tr>
        <tr>
            <td>专业</td>
            <td colspan="2"></td>
            <td>申请人数</td>
            <td></td>
        </tr>
        <tr style="background-color: #f2f2f2;">
            <td>选择学生</td>
            <td>班级</td>
            <td>性别</td>
            <td>志愿</td>
            <td>操作</td>
        </tr>
        <tr>
            <td>网名</td>
            <td>3</td>
            <td>男</td>
            <td>第一志愿</td>
            <td><a href="">任务书</a></td>
        </tr>
        </tbody>
    </table>

    <table class="table table-bordered">
        <caption>太原科技大学毕业设计（论文）任务书</caption>
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
            <td>
                <img class="layui-upload-img" width="100">
            </td>
            <td>指导教师签名</td>
            <td>
                <img class="layui-upload-img" width="100">
            </td>
        </tr>
        <tr>
            <td>系主任签名</td>
            <td>
                <img class="layui-upload-img" width="100">
            </td>
            <td>主管院长签名</td>
            <td>
                <img class="layui-upload-img" width="100">
            </td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>