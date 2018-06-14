<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>校外毕设审核管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
    <style>
        .y_files{
            color:#01AAED;
            cursor: pointer
        }
    </style>
    <%--S        bzy      --%>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/oGDClassStudentInfo.js"></script>
    <%--E        bzy      --%>
</head>

<body>

<div class="x-body">
    <%--隐藏分页组建--%>
    <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">

    <!--表格内容-->
    <form action="${baseurl}/ext/extOGDStudentInClass.do" method="post">
        <input type="hidden" id="classID" name="classID"/>
        <button class="layui-btn" type="submit">导出</button>
    </form>

    <table class="layui-table">
        <thead>
        <tr>
            <th>学号</th>
            <th>学生姓名</th>
            <th>专业班级</th>
            <th>指导教师</th>
            <th>毕设题目</th>
            <th>接收单位</th>
            <th>校外导师</th>
            <th>申请时间</th>
            <th>审核文件</th>
        </tr>
        </thead>
        <tbody id="thead-tbody">
        <%--<tr>
            <td>201700917</td>
            <td>老王</td>
            <td>软12004</td>
            <td>老王</td>
            <td>阿萨德发</td>
            <td>老王</td>
            <td>1854-10-2</td>
            <td>通过</td>
            <td class="y_files" title="点击查看审核内容" onclick="x_admin_show_big('相关申请表','./outGraduateManage-table1.jsp')">相关申请表</td>
        </tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7" style="margin-left: 200px;"></div>
    <!--end 分页-->
</div>
<script>

    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }
</script>
</body>

</html>