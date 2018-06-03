<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生-毕设管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/studentGPM/studentGPM.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="${baseurl}/welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a>
          <cite>学生-毕设管理</cite>
        </a>
      </span>
    <a class="layui-btn layui-btn-small" style="margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="iconfont" style="line-height:30px">&#xe6aa;</i>
    </a>
    <a class="layui-btn layui-btn-warm layui-btn-small" style="margin-top:3px;float:right;margin-right:3px;"
       onclick="closeOther()" title="关闭其他">
        <i class="iconfont" style="line-height:30px">&#xe6b7;</i>
    </a>
</div>
<!--主体-->
<div class="x-body">

    <!--操作区域-->
    <xblock>
        <!--任务书签字后，可以查看。查看的话，没有提交按钮-->
        <button class="layui-btn" id="y_programTable" onclick="x_admin_show('填写计划进程表','fillProgramTable.jsp')">填写计划进程表 </button>
        <button class="layui-btn" id="y_assignment" onclick="x_admin_show('任务书签字','./searchAssignment.jsp')">任务书签字 </button>
        <button class="layui-btn" onclick="x_admin_show('相关文件管理','./uploadFile.jsp')">相关文件管理 </button>
        <button class="layui-btn" onclick="x_admin_show('通知','./infoNotice.jsp')">通知<span class="layui-badge-dot"></span> </button>
    </xblock>
    <!--end 操作区域-->

    <!--毕设信息-->
    <table class="layui-table" id="y_table">
    </table>
    <!--end 表格内容-->

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