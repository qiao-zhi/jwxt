<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教研室-课题选择管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!--主体-->
<div class="x-body">
    <!--操作区域-->
    <xblock>
        <button class="layui-btn layui-btn-normal" onclick="">导出</button>
        <button class="layui-btn" onclick="">发布</button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>教师</th>
            <th>课题名称</th>
            <th>专业</th>
            <th>申请人数</th>
            <th>学生名单</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td>王丽</td>
            <td>as234</td>
            <td>软件工程</td>
            <td>3</td>
            <td>阿萨德，撒地方， ，撒地方</td>
        </tr>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->
</div>
<script>

    /*分页js*/
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage
            , layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'demo7'
            , count: 100
            , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            , jump: function (obj) {
                console.log(obj)
            }
        });
    });

</script>
</body>

</html>