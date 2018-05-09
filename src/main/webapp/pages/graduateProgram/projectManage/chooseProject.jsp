<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>选择课题</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/projectManage/chooseProject.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a href="javascript:void(0)">课题管理</a>
        <a>
          <cite>选择课题</cite>
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
    <!--根据课题学生专业和登录学生学生专业进行比较，显示相关信息-->
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="y_form">
            <input type="text" name="username" placeholder="教师名称" autocomplete="off" class="layui-input">
            <input type="text" name="username" placeholder="课题名称" autocomplete="off" class="layui-input">
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>选择课题</th>
            <th>教师名称</th>
            <th>课题名称</th>
            <th>课题类型</th>
            <th>课题来源</th>
            <th>人数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <button class="layui-btn layui-btn-warm layui-btn-sm">选择</button>
            </td>
            <td>老王</td>
            <td>课题名称</td>
            <td>课题类型</td>
            <td>课题类型</td>
            <td>4</td>
            <td class="td-manage">
                <a title="详细信息" onclick="x_admin_show('详细信息','chooseProject-view.jsp')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
            </td>
        </tr>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="y_page"></div>
    <!--end 分页-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn">保存 </button>
        <button class="layui-btn">提交 </button>
        &nbsp;<span class="layui-badge-dot"></span><span> 请选择两项，作为毕设题目。</span>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>选择</th>
            <th>教师名称</th>
            <th>课题名称</th>
            <th>课题类型</th>
            <th>课题来源</th>
            <th>人数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>第一志愿</td>
            <td>老王</td>
            <td>课题名称</td>
            <td>课题类型</td>
            <td>成果形式</td>
            <td>004</td>
            <td class="td-manage">
                <a title="详细信息" onclick="x_admin_show('详细信息','chooseProject-view.jsp')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
                <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                    <i class="layui-icon">&#xe640;</i>
                </a>
            </td>
        </tr>
        <tr>
            <td>第二志愿</td>
            <td>老王</td>
            <td>课题名称</td>
            <td>课题类型</td>
            <td>004</td>
            <td>成果形式</td>
            <td class="td-manage">
                <a title="详细信息" onclick="x_admin_show('详细信息','chooseProject-view.jsp')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
                <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                    <i class="layui-icon">&#xe640;</i>
                </a>
            </td>
        </tr>
        </tbody>
    </table>
    <!--end 表格内容-->
</div>

</body>

</html>