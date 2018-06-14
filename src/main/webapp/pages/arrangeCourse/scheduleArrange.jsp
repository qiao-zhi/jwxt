<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
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
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
    <%--安排课程界面的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/scheduleArrange.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">排课管理</a>
        <a>
          <cite>安排课程</cite></a>
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
        <form class="layui-form layui-col-md12 x-so">
        	
            <div class="layui-input-inline">
                <select name="majorId" lay-filter="major" lay-search="">
                </select>
            </div>
            <div class="layui-input-inline">
                <input id="s_year" name="academicYear" class="layui-input" placeholder="学年"  lay-key="1"/>
            </div>
            <div class="layui-input-inline">
                <select name="term">
                    <option value="">请输入学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>
            <%--隐藏当前页和当前页显示条数--%>
            <input type="hidden" name="pageSize"/>
            <input type="hidden" name="currentPage"/>
            <%--需要查询的排课状态--%>
            <input type="hidden" name="taskStatus[0]" value="4"/>
            <input type="hidden" name="taskStatus[1]" value="5"/>
            <input type="hidden" name="taskStatus[2]" value="6"/>
            <input type="hidden" name="taskStatus[3]" value="7"/>
            <%--隐藏用户编号--%>
            <input type="hidden" name="userId" value="${userinfo.usercode}">
            <div class="layui-input-inline">
                 <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
            </div>
           
        </form>
    </div>
    <!--end查询-->

    
    <xblock>
        <button class="layui-btn" onclick="allotCourse_history()" >根据历史排课记录安排</button>
        <button class="layui-btn" onclick="arrangeCourse()" >手动排课</button>
        <button class="layui-btn" onclick="commitToCheck()" >提交审核</button>
        <button class="layui-btn layui-btn-normal" style="float: right;" onclick="arrangeCourseExport()"><i class="layui-icon">&#xe601;</i>导出排课信息</button>
	</xblock>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	<tr>
    			 <th>
                   <%-- <div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i></div>--%>
                 </th>
                <th>序号</th>
                <th>任务通知书名称</th>
                <th>专业</th>
                <th>学年</th>
                <th>学期</th>
                <th>创建时间</th>
                <th>接收人</th>
                <th>接收时间</th>
                <th>状态</th>
                <th>操作</th>
		    </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="arrangePage"></div>
    <!--end 分页-->
</div>

</body>

</html>