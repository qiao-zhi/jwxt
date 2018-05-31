<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>信息通知</title>
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

    <script src="${baseurl}/js/graduateProgram/studentGPM/infoNotice.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 30px auto; width:90%;">
    <%--
        通知内容：

             6、上传论文的通知

                   若毕业答辩时间
             7、提交文件到指定的地方的通知，如果提交资料不全，审核不通过，发不通知，资料不全。
    --%>
    <!--表格内容-->
    <table class="layui-table" lay-skin="line">
        <thead>
            <tr>
                <th>消息</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->
</div>

</body>

</html>