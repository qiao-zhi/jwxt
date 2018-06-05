<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>确认学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
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
    <table class="layui-table">
        <caption>基本信息</caption>
        <thead>
        <tr>
            <th>学年</th>
            <th>课题名称</th>
            <th>课题来源</th>
            <th>课题类别</th>
            <th>教师</th>
            <th>专业</th>
            <th>需要人数</th>
            <th>申请人数</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        </tbody>
    </table>

    <form class="layui-form">
        <table class="layui-table">
            <caption>学生选择列表</caption>
            <thead>
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>班级</th>
                <th>志愿</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <input type="radio" name="isConfirm" value="确认" title="确认" checked>
                    <input type="radio" name="isConfirm" value="取消" title="取消">
                </td>
            </tr>
            </tbody>
        </table>
    </form>
    <br>
    <button class="btn-primary btn">保存</button>
    <button class="btn-primary btn">提交</button>
</div>
<script>
    /*时间*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            , format: 'yyyy年MM月dd日'
        });
    })
    var myDate = new Date;
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth() + 1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;

    $("#L_pass").val(year + "年" + month + "月" + date + "日");
</script>
</body>

</html>