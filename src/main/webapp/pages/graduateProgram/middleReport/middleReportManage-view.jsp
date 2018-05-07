<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>中期检查详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
</head>

<body>
<div class="x-body">

    <!--学生信息-->
    <table class="layui-table">
        <caption>学生信息表</caption>
        <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>班级</th>
            <th>毕设类型</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
        </tr>
        </tbody>
    </table>

    <!--毕设信息-->
    <table class="layui-table">
        <caption>毕设信息表</caption>
        <thead>
        <tr>
            <th>课题名称</th>
            <th>课题类型</th>
            <th>课题来源</th>
            <th>成果形式</th>
            <th>题目类别</th>
            <th>同组人数</th>
            <th>目标要求</th>
            <th>研究内容</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
            <td>暗室逢灯</td>
        </tr>
        </tbody>
    </table>

    <table class="table table-bordered">
        <caption><h3>太原科技大学毕业设计（论文）中期检查表</h3>
        </caption>
        <tbody>
        <tr>
            <td>学院（直属系）</td>
            <td></td>
            <td>教研室</td>
            <td></td>
        </tr>
        <tr>
            <td>指导教师</td>
            <td></td>
            <td>检查人</td>
            <td></td>
        </tr>
        <tr>
            <td>学生姓名</td>
            <td></td>
            <td>学  号</td>
            <td></td>
        </tr>
        <tr>
            <td colspan="4">
                <textarea class="layui-textarea" name="" cols="100" rows="8">工作进度情况（对照学生的计划进程表和任务书）：</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <textarea class="layui-textarea" name="" cols="100" rows="8">工作态度情况（学生对毕业设计、毕业论文的认真程度、纪律及出勤情况；指导教师具体指导情况）：</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <textarea class="layui-textarea" name="" cols="100" rows="8">质量评价（学生前期已完成工作的质量情况）：</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <textarea class="layui-textarea" name="" cols="100" rows="8">存在的问题与建议：</textarea>
            </td>
        </tr>
        </tbody>
    </table>

</div>
<script>
    //出生年月
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });
</script>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

        //自定义验证规则
        form.verify({
            nikename: function (value) {
                if (value.length < 5) {
                    return '昵称至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , repass: function (value) {
                if ($('#L_pass').val() != $('#L_repass').val()) {
                    return '两次密码不一致';
                }
            }
        });

        //监听提交
        form.on('submit(add)', function (data) {
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6}, function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
        });


    });
</script>
</body>
</html>
