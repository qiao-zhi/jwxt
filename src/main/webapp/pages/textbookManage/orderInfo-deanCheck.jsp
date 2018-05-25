<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
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
        displayOrderInfo(<%= request.getParameter("orderId")%>);
        //确认审核按钮监听
       checkButton();
    </script>


</head>

<body>
<div class="x-body">
	<h4 style="font-size: 18px;">订单基本信息</h4>
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
    <form class="layui-form" id="checkForm">
        <!--1-->
        <%--隐藏一些信息--%>
        <input type="hidden" name="orderid" id="orderid"/>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
               <select name="checkProposal" id="checkProposal">
                   <option value="1">同意</option>
				   <option value="0">不同意</option>
				</select>  
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>默认意见为同意
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                意见描述
            </label>
            <div class="layui-input-inline">
                <textarea name="proposalNote" id="proposalNote" placeholder="请输入详细审核意见" class="layui-textarea"></textarea>
            </div>
           
        </div>
       
       
        <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" type="button" lay-filter="check" lay-submit="">
                  确认审核
              </button>
        </div>
        <!---->
    </form>
</div>
<%--<script>--%>
	<%--$(document).ready(function(){--%>
		 <%--var before=$(".renshu").text();--%>
		 <%--var beforeNum=parseInt(before);--%>
		 <%--var orderNum=beforeNum+2;--%>
         <%--$("#textBookNum").val(orderNum);	--%>

<%--});--%>
<%--</script>--%>
<%--<script>--%>
    <%--//出生年月--%>
    <%--layui.use('laydate', function () {--%>
        <%--var laydate = layui.laydate;--%>

        <%--laydate.render({--%>
            <%--elem: '#L_pass' //指定元素--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>
<%--<script>--%>
    <%--layui.use(['form', 'layer'], function () {--%>
        <%--$ = layui.jquery;--%>
        <%--var form = layui.form--%>
            <%--, layer = layui.layer;--%>

        <%--//自定义验证规则--%>
        <%--form.verify({--%>
            <%--nikename: function (value) {--%>
                <%--if (value.length < 5) {--%>
                    <%--return '昵称至少得5个字符啊';--%>
                <%--}--%>
            <%--}--%>
            <%--, pass: [/(.+){6,12}$/, '密码必须6到12位']--%>
            <%--, repass: function (value) {--%>
                <%--if ($('#L_pass').val() != $('#L_repass').val()) {--%>
                    <%--return '两次密码不一致';--%>
                <%--}--%>
            <%--}--%>
        <%--});--%>

        <%--//监听提交--%>
        <%--form.on('submit(add)', function (data) {--%>
            <%--console.log(data);--%>
            <%--//发异步，把数据提交给--%>
            <%--layer.alert("增加成功", {icon: 6}, function () {--%>
                <%--// 获得frame索引--%>
                <%--var index = parent.layer.getFrameIndex(window.name);--%>
                <%--//关闭当前frame--%>
                <%--parent.layer.close(index);--%>
            <%--});--%>
            <%--return false;--%>
        <%--});--%>
        <%--//监听选择教材事件--%>
		<%--form.on('select(chooseHistoryBook)', function (data) {  --%>
		    <%--textBookName = data.elem[data.elem.selectedIndex].text;  --%>
		    <%--form.render('select');--%>
		    <%--$("#textBookName").val(textBookName);--%>
			<%--});  --%>
    <%--});--%>
<%--</script>--%>

</body>

</html>