<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
    <!--引入的教材库管理的JS-->
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookOrderManage.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/orderBooksCommonFunction.js" charset="utf-8"></script>

    <script>
        //页面加载执行函数
        <%--//alert(<%= request.getParameter("orderId")%>)--%>
        displayCheckInfo(<%= request.getParameter("orderId")%>)
    </script>

</head>

<body>
<div class="x-body">
	<h4 style="font-size: 18px;">审核信息</h4>
	<table class="layui-table-wang-info">
        <tr>
            <td>学年</td>
            <td id="year"></td>
            <td>学期</td>
            <td id="term"></td>
        </tr>
        <tr>
            <td>所属教研室</td>
            <td id="roomName"></td>
            <td>创建人</td>
            <td id="createPerson"></td>
        </tr>
	</table>
    <form class="layui-form">
        <!--1-->
        
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
              <input type="text" name="checkProposal" id="checkProposal"  class="layui-input" disabled="">
            </div>
            
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                意见描述
            </label>
            <div class="layui-input-inline">
                <textarea name="proposalNote" id="proposalNote" class="layui-textarea" disabled=""></textarea>
            </div>
           
        </div>
    </form>
</div>

<%--<script>--%>
    <%--layui.use(['form', 'layer'], function () {--%>
        <%--$ = layui.jquery;--%>
        <%--var form = layui.form--%>
            <%--, layer = layui.layer;--%>

      <%----%>
    <%--});--%>
<%--</script>--%>

</body>

</html>