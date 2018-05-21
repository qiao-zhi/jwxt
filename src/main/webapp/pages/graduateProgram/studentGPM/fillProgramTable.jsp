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
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
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
    <button class="btn-primary btn">保存</button>
    <button class="btn-primary btn">提交</button>
    <table class="table table-bordered">
        <caption><h1>太原科技大学毕业设计（论文）计划进程表</h1>
            <span style="position:relative;top:15px;left:10px;">学院（直属系）：***</span><!--根据登录教师所在学院显示-->
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
        <tr>
            <td>学生姓名</td>
            <td></td>
            <td>指导教师</td>
            <td></td>
        </tr>
        <tr>
            <td>专业班级</td>
            <td></td>
            <td>学号</td>
            <td></td>
        </tr>
        <tr><!--从任务书中，提取-->
            <td style="width:150px">设计（论文）题目</td>
            <td></td>
            <td>毕设题目</td>
            <td></td>
        </tr>
        <tr>
            <td>时间（阶段安排）
            </td>
            <td colspan="3">应完成的工作内容</td>
        </tr>
        <tr>
            <td>
                <textarea name="" class="layui-textarea" cols="20" rows="25"></textarea>
            </td>
            <td colspan="3">
                <textarea name="" class="layui-textarea" cols="75" rows="25"></textarea>
            </td>
        </tr>
        </tbody>
    </table>
    <span>说明：此表一式两份，学生填写，学生一份，学院（直属系）一份。</span>

</div>
<script>
    /*时间*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            ,format: 'yyyy年MM月dd日'
        });
    })
    var myDate = new Date;
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth()+1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;

    $("#L_pass").val(year + "年" + month + "月" + date + "日");
</script>
</body>

</html>