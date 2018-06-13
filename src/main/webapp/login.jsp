<%--登录界面--%>
<%@page contentType="text/html; chateset=urf-8" language="java" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>太原科技大学-教研室管理系统后台登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
	<link rel="stylesheet" href="./css/xadmin.css">

    <script src="${baseurl}/js/jquery.min.js"></script>

    <script src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>

    <%--S  qlq引入的--%>
    <script src="${baseurl}/js/system/login.js" type="text/javascript"></script>
    <%--S  qlq引入的--%>
    <style>
        .login{
            position:fixed;
            top:70px;
            left:500px;
            opacity: 0.9;
            width: 449px;
            height: 449px;
        }
        img{
            width: 100%;
            height: 100%;
        }

    </style>

</head>
<body class="login-bg">

        <!--背景轮播-->
        <div class="layui-carousel" id="background">
            <div carousel-item>
                <div class="image"><img src="images/bg1.jpg"/></div>
                <div class="image">
                    <img src="images/bg2.jpg" />
                </div>
                <div class="image"><img src="images/bg3.jpg"/></div>
                <div class="image"><img src="images/bg4.jpg" /></div>
                <div class="image"><img src="images/bg1.jpg"/></div>
            </div>
        </div>
        <!---->

    <div class="login" style="margin-top: 60px;">
        <div class="message">太原科技大学---教研室管理系统</div>
        <div id="darkbannerwrap"></div>
        
        <form method="POST" class="layui-form" id="loginForm" action="login.do">
            <input name="usercode" placeholder="请输入用户名"  type="text" lay-verify="required" class="layui-input" />
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="请输入密码"  type="password" class="layui-input"/>
            <hr class="hr15">
            <select name="usersort" lay-verify="required">
                <option value="教师">教师</option>
                <option value="管理员">管理员</option>
                <option value="学生">学生</option>
			</select>
			<hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" type="button" style="width:100%;"/>
            <hr class="hr20" >
        </form>
    </div>
<script>
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        var nowHeight = $(".login-bg").innerHeight()
        //建造实例
        carousel.render({
            elem: '#background'
            ,width: '100%' //设置容器宽度
            ,height:nowHeight //宽度设置为父窗口宽度
            ,arrow: 'hover' //箭头显示方式
            ,indicator:'none'
        });
    });
</script>
</body>
</html>