<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>文件管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/fileManage/fileManage.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a><cite>文件管理</cite></a>
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
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="y_form">
            <input type="text" name="studentNum" placeholder="学号" autocomplete="off" class="layui-input">
            <input type="text" name="studentName" placeholder="学生名称" autocomplete="off" class="layui-input">
            <input type="text" name="teacherName" placeholder="指导教师" autocomplete="off" class="layui-input">
            <input type="text" name="gdTitle" placeholder="毕设题目" autocomplete="off" class="layui-input">
            <div class="layui-input-inline"><%--默认显示审核不通过的内容--%>
                <select name="auditResult">
                    <option value="-1">未审核</option>
                    <option value="0">审核不通过</option>
                    <option value="1">审核通过</option>
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="sreach" title="查询"><i class="layui-icon">&#xe615;</i></button>
            <button type="reset" class="layui-btn layui-btn-primary" title="重置"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <!--审核通过，标注，已提交。否则，返回报送，到学生界面-->
        <button class="layui-btn" onclick="x_admin_show('审核','./file-check.jsp')">审核 </button>
        <button class="layui-btn" onclick="x_admin_show('上传模板','./file-upload.jsp')">上传模板 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>选择</th>
            <th>学生</th>
            <th>学号</th>
            <th>班级</th>
            <th>毕设题目</th>
            <th>指导教师</th>
            <th>审核结果</th>
            <th>审核意见</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="y_page"></div>
    <!--end 分页-->
</div>

</body>

</html>