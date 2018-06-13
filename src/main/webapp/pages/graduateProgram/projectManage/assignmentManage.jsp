<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>任务书管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>
    <%@ include file="/cssJs.jsp"%>

    <script src="${baseurl}/js/graduateProgram/projectManage/assignmentManage.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="${baseurl}/welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a href="javascript:void(0)">课题管理</a>
        <a>
          <cite>任务书管理</cite>
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
        <form class="layui-form layui-col-md12 x-so" id="y_form">
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select name="yearNum" id="y_yearNum">
                </select>
            </div>
            <input type="text" name="studentName" placeholder="学生名称" autocomplete="off" class="layui-input">
            <input type="text" name="teacherName" placeholder="指导教师名称" autocomplete="off" class="layui-input">
            <input type="text" name="titlename" placeholder="课题名称" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <!--未完成 是判断是否填写了任务书     毕设课题任务书,判断学生选题结果ID-->
                <select name="fillStatus">
                    <option value="">任务书状态</option>
                    <option value="-1">未填写</option>
                    <option value="0">未完成</option>
                    <option value="1">已完成</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <!--未完成 是判断是否填写了任务书     毕设课题任务书,判断学生选题结果ID-->
                <select name="majorName">
                    <option value="">专业</option>
                    <option value="软件工程">软件工程</option>
                    <option value="网络工程">网络工程</option>
                    <option value="物联网">物联网</option>
                    <option value="计算机">计算机</option>
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
        <button class="layui-btn" onclick="fillAssignment()">添加任务书 </button>
        <button class="layui-btn" onclick="modifyAssignment()">修改任务书 </button>
        <button class="layui-btn" onclick="modifyAssignment()">查看学生计划进程表 </button>
        <button class="layui-btn">上传考勤表 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i>
                </div>
            </th>
            <th>学年</th>
            <th>学期</th>
            <th>学生</th>
            <th>专业</th>
            <th>指导教师</th>
            <th>课题名称</th>
            <th>填写状态</th>
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