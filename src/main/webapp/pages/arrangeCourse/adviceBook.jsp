<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>通知书管理</title>
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
    <%--ll 通知书管理的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/adviceBook.js"></script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">排课管理</a>
        <a>
          <cite>通知书管理</cite></a>
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
        <form class="layui-form layui-col-md12 x-so" id="selectNoticeInfoForm">
        	
            <div class="layui-input-inline">
                <select name="academicId">
                    <option value="">请输入学院</option>
                    <option value="1">计算机科学与技术学院</option>
                    <option value="2">机械学院</option>
                    <option value="3">法学院</option>
                    <option value="4">经济管理学院</option>
                </select>
            </div>

            <input id="s_year" name="academicYear" class="layui-input" placeholder="学年"  lay-key="1"/>

            <div class="layui-input-inline">
                <select name="term">
                	<option value="">请输入学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>
        	
            <div class="layui-input-inline">
                 <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
            </div>
            <%--隐藏当前页和当前页显示条数--%>
            <input type="hidden" name="pageSize"/>
            <input type="hidden" name="currentPage"/>

        </form>
    </div>
    <!--end查询-->

    
    <xblock>
	<button class="layui-btn" onclick="addTask()" ><i class="layui-icon">&#xe608;</i>新增通知书</button>
	<button class="layui-btn layui-btn-warm" onclick="importNoticeBook()" style="float: right;" ><i class="layui-icon">&#xe681;</i>导入任务通知书</button>
	</xblock>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	
        	<tr>
                <th>
                    <%--<div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i>
                    </div>--%>
                </th>
                <th>序号</th>
                <th>学院名称</th>
                <th>学年</th>
                <th>学期</th>
                <th>创建人</th>
                <th>创建时间</th>
                <th>状态</th>
                <th>操作</th>
		    </tr>
        </thead>
        <tbody id="noticeBaseInfoList">
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="noticePage"></div>
    <!--end 分页-->
</div>

</body>

</html>