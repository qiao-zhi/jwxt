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
            <input type="text" name="studentName" placeholder="学生名称" autocomplete="off" class="layui-input">
            <input type="text" name="teacherName" placeholder="指导教师名称" autocomplete="off" class="layui-input">
            <input type="text" name="titlename" placeholder="课题名称" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <!--通过判断是否被老师确认  判断学生选题最终结果表中的信息是否有该学生的id信息-->
                <select name="checkStatus">
                    <option value="">审核状态</option>
                    <option value="0">待系主任审核</option>
                    <option value="1">待主管院长审核</option>
                    <option value="2">审核通过</option>
                    <option value="3">审核不通过</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <!--通过判断是否被老师确认  判断学生选题最终结果表中的信息是否有该学生的id信息-->
                <select name="isOut">
                    <option value="">毕设类型</option>
                    <option value="0">校内</option>
                    <option value="1">校外</option>
                </select>
            </div>
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
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
            <button type="reset" class="layui-btn layui-btn-primary" title="重置"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="fillAssignment()">添加任务书 </button>
        <button class="layui-btn" onclick="modifyAssignment()">修改任务书 </button>
        <button class="layui-btn" onclick="auditFirst()">系主任任务书审核 </button>
        <button class="layui-btn" onclick="auditSecond()">主管院长任务书审核 </button>
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
            <th>学生</th>
            <th>专业</th>
            <th>指导教师</th>
            <th>课题名称</th>
            <th>任务书填写状态</th>
            <th>审核状态</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id=\'2\'><i class="layui-icon">&#xe605;</i></div>
                </td>
                <td>学生</td>
                <td>专业</td>
                <td>指导教师</td>
                <td>课题名称</td>
                <td class="fillStatus" value="-1">未完成</td>
                <td>待审核</td>
                <td>
                    <a title="任务书" onclick="x_admin_show('任务书','chooseGPStudent-view.jsp?teacherTitleID')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i></a>
                </td>
            </tr>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="y_page"></div>
    <!--end 分页-->
</div>

</body>

</html>