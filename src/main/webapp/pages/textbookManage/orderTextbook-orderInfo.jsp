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

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--查看排课详细信息的js--%>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookOrder.js"></script>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/orderBooksCommonFunction.js" charset="utf-8"></script>

    <script>
        //页面初始化执行函数
        $(function () {
            findOrderDetailInfo('<%= request.getParameter("orderDetailId")%>');
        })
    </script>
    <style>
        /*给奇数列加背景颜色*/
        td:nth-child(odd){
            background-color:#F2F2F2;
        }
    </style>

</head>

<body>
<div class="x-body">
    <%--S 隐藏一些信息--%>
    <input type="hidden" name="orderDetailId" id="orderDetailId" value='<%= request.getParameter("orderDetailId")%>'/>

        <!--操作区域-->
    <xblock>

        <button class="layui-btn" type="button" onclick="openOrderLayer()">订购教材 </button>
        <button class="layui-btn" type="button" style="float: right;" onclick="commit()">提交 </button>
        <%--<button class="layui-btn" style="float: right;" onclick="save()">保存 </button>--%>
    </xblock>
    <!--end 操作区域-->

    <table class="layui-table">
        <tr>
            <td>课程名称</td>
            <td name="courseName"></td>
            <td>课程编号</td>
            <td name="courseCode"></td>
        </tr>
        <tr>
            <td>教师名称</td>
            <td name="teacherName"></td>
            <td>教师编号</td>
            <td name="teacherCode"></td>
        </tr>
        <tr>
            <td>所任班级</td>
            <td name="className"></td>
            <td>所任人数</td>
            <td name="personNum"></td>
        </tr>
        <tr>
            <td>是否订购</td>
            <td name="isOrder"></td>
            <td>是否确认</td>
            <td name="isConfirm"></td>
        </tr>
        <tr>
            <td>订购教材</td>
            <td name="textbookNameCN">-</td>
            <td>订购数量</td>
            <td name="total">-</td>
        </tr>
        <tr>
            <td>出版社</td>
            <td name="publishingHouse">-</td>
            <td>作者</td>
            <td name="author">-</td>
        </tr>
        <tr>
            <td>ISBN</td>
            <td name="isbn">-</td>
            <td>单价</td>
            <td name="price">-</td>
        </tr>
    </table>
</div>


<script>

    <%--function orderTextBook() {--%>
        <%--x_admin_show('订购教材', 'orderTextBook-order.jsp')--%>
    <%--}--%>

    <%--//保存按钮事件--%>
    <%--function save(){--%>
        <%--layer.alert('保存成功');--%>
    <%--}--%>
    // 提交按钮事件
    function commit(){
        $.post(
            contextPath+'/TextbookOrder/findOrderDetailInfo.do',
            {"orderDetailId":$("#orderDetailId").val()},
            function (response) {
                if(response[0].remark=="1"){
                    layui.layer.msg("您已提交，请勿重复提交")
                }
                else {
                    if(response[0].isOrder=="1") {
                        layer.confirm('您确认要提交此次教材订购信息吗？', function () {
                            $.post(
                                contextPath + '/TextbookOrder/commit.do',
                                {"orderDetailId": $("#orderDetailId").val()},
                                function (response) {
                                    layer.close(layer.index)
                                    layui.layer.msg("提交成功",{time:0.8*1000})
                                },
                                'text'
                            )
                        });
                    }
                    else
                    {
                        layui.layer.msg("您还未订购，请先订购再提交")
                    }
                }
            },
            'json'
            )
    }
</script>
<%--<script>--%>
    <%--$(document).ready(function(){--%>
        <%--calOrderNum()--%>

    <%--});--%>
    <%--function calOrderNum(){--%>
        <%--var before=$(".renshu").text();--%>
        <%--var beforeNum=parseInt(before);--%>
        <%--var orderNum=beforeNum+2;--%>
        <%--$("#textBookNum").val(orderNum);--%>
    <%--}--%>
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
        <%--form.on('select(chooseHistoryBook)', function (data) {--%>
            <%--var ISBN={--%>
                <%--num1:"001"--%>

            <%--};--%>
            <%--var press={--%>
                <%--num1:"出版社1"--%>

            <%--};--%>
            <%--var price={--%>
                <%--pri1:"100"--%>
            <%--};--%>
            <%--textBookName = data.elem[data.elem.selectedIndex].text;--%>
            <%--form.render('select');--%>
            <%--$("#textBookName").val(textBookName);--%>
            <%--$("#textBookISBN").val(ISBN.num1);--%>
            <%--$("#textBookpress").val(press.num1);--%>
            <%--$("#textBookPrice").val(price.pri1);--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>

</body>

</html>