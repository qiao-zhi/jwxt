<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教研室-课题选择管理-分配学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/css/xadmin.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>

    <script src="${baseurl}/js/graduateProgram/projectManage/projectManage-assign.js"></script>
</head>

<body>
<!--根据课设专业，筛选同专业的同学。 判断学生数量是否达到，达到。再选择，提示，人数已经符合需要人数，无法添加-->
<!--主体-->
<div class="x-body">
    <div class="layui-row  layui-col-space10">
        <div class="layui-col-xs5">
            <!--表格内容-->
            <table class="layui-table">
                <thead>
                <tr>
                    <th>指导教师</th>
                    <th>课题名称</th>
                    <th>所需人数</th>
                    <th>确认人数</th>
                    <th>调整学生</th>
                </tr>
                </thead>
                <tbody id="titleTable">
                </tbody>
            </table>
            <!--end 表格内容-->
            <button class="btn-primary btn">提交</button>
        </div>

        <div class="layui-col-xs7">
            <!--表格内容-->
            <table class="layui-table">
                <thead>
                <tr>
                    <th>选择</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>班级</th>
                    <th>第一志愿</th>
                    <th>第二志愿</th>
                </tr>
                </thead>
                <tbody id="studentTable">
                </tbody>
            </table>
            <!--end 表格内容-->

            <!--分页-->
            <div id="y_page"></div>
            <!--end 分页-->
        </div>
    </div>


</div>

</body>

</html>