<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/tag.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>太原科技大学教研室管理系统</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"  content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="shortcut icon" href="./favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="./css/font.css">
     <link rel="stylesheet" href="./css/xadmin.css">

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>

</head>
<body>
<%-- qlq引入的公共的JSP --%>

<!-- 顶部开始 -->
<div class="container">
    <div class="logo"><a href="./index.jsp">教研室管理系统</a></div>
    <div class="left_open">
        <i title="展开左侧栏" class="iconfont">&#xe699;</i>
    </div>
    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">${userinfo.username}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
<%--                <dd><a onclick="x_admin_show('个人信息','http://www.baidu.com')">个人信息</a></dd>
                <dd><a onclick="x_admin_show('切换帐号','http://www.baidu.com')">切换帐号</a></dd>--%>
                <dd><a onclick="javascript:alert('就不帮助你')">帮助</a></dd>
                <dd><a href="javascript:void(0)" onclick="logoutSystem()">退出</a></dd>
            </dl>
        </li>
        <%--<li class="layui-nav-item to-index"><a href="index.jsp">首页</a></li>--%>
    </ul>
</div>
<!-- 顶部结束 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <!--遍历一级菜单-->
            <c:forEach var="menu1" items="${userinfo.menuPermissions}">
                <c:if test="${menu1.permissiontype=='menu1' }">
                    <li>
                        <a href=javascript:void(0)>
                            <cite>${menu1.permissionname}</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <!--遍历二级菜单-->
                            <c:forEach var="menu2" items="${userinfo.menuPermissions}">
                                <c:if test="${menu2.permissiontype=='menu2' and menu2.parentid == menu1.permissionid}">
                                    <!--如果url不为空就是二级菜单-->
                                    <c:if test="${menu2.url != '' && menu2.url != null}">
                                        <li>
                                            <a _href="${menu2.url}">
                                                <cite>${menu2.permissionname}</cite>
                                            </a>
                                        </li>
                                    </c:if>
                                    <!--如果url为空就是三级菜单-->
                                    <c:if test="${menu2.url == null || menu2.url == ''}">
                                        <li>
                                            <a href="javascript:;">
                                                <cite>${menu2.permissionname}</cite>
                                                <i class="iconfont nav_right">&#xe697;</i>
                                            </a>
                                            <ul class="sub-menu">
                                                <%--遍历获取三级菜单--%>
                                                <c:forEach var="menu3" items="${userinfo.menuPermissions}">
                                                    <c:if test="${menu3.permissiontype=='menu3' and menu3.parentid == menu2.permissionid}">
                                                        <li>
                                                            <a _href="${menu3.url}">
                                                                <cite>${menu3.permissionname}</cite>
                                                            </a>
                                                        </li>
                                                    </c:if>
                                                </c:forEach>
                                            </ul>
                                        </li>
                                    </c:if>
                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                </c:if>
            </c:forEach>
        </ul>
    </div>
</div>


<!-- 左侧菜单结束 -->

<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li>我的桌面</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
</div>
<div class="page-content-bg"></div>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->

<!-- 底部开始 -->
<div class="footer">
    <div class="copyright" style="text-align: center"><span>2018 &copy;</span>太原科技大学--软件教研室,版权所有</div>
</div>
<!-- 底部结束 -->

</body>
</html>
<script>
    /**
     * 退出系统相关操作
     */
    function logoutSystem(){
        layui.use(['layer'],function () {
            var layer = layui.layer;
            layer.confirm("确认退出系统?",{icon:3,shade: [0.8, '#393D49']},function () {
                window.location.href=contextPath+"/logout.do";
            })
        })
    }
</script>

