<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课题管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/projectManage/projectManage.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="${baseurl}/welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a href="javascript:void(0)">课题管理</a>
        <a>
          <cite>课题管理</cite>
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
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="y_formm">
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select name="yearNum" id="y_yearNum">
                </select>
            </div>
            <input type="text" name="teacherName" placeholder="教师名称" autocomplete="off" class="layui-input">
            <input type="text" name="titlename" placeholder="课题名称" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <select name="isAllocation">
                    <option>是否需要分配学生</option>
                    <option>是</option>
                    <option>否</option>
                </select>
            </div>
            <input type="hidden" name="currentPage">
            <input type="hidden" name="pageSize">
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
            <button type="reset" class="layui-btn layui-btn-primary" title="重置"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <!--这里不判断教师人数是否够-->
        <button class="layui-btn" onclick="allocateStudent()">分配学生</button>
        <!--若申请人数小于 需要人数，则自动确认，不需要确认学生。 提交后不可修改-->
        <button class="layui-btn layui-btn-normal" onclick="confirmChooose()">确认学生 </button>
        <%--<button class="layui-btn" onclick="x_admin_show('调剂学生','./projectManage-assign.jsp')">调剂学生</button>--%>
        <button class="layui-btn layui-btn-normal" onclick="x_admin_show('导出/发布','./projectManage-output.jsp')">导出/发布</button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>选择</th>
            <th>学年</th>
            <th>学期</th>
            <th>课题名称</th>
            <th>教师</th>
            <th>专业</th>
            <th>所需人数</th>
            <th>确认人数</th>
            <th>操作</th>
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