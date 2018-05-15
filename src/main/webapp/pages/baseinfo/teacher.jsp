<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/5
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教师信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>

    <%--ll 通知书管理的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/teacher.js"></script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">基础信息管理</a>
        <a>
          <cite>教师信息</cite></a>
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
        <form class="layui-form layui-col-md12 x-so"  id="selectTeacherInfoForm">
            <input type="text" name="teachername" placeholder="姓名" autocomplete="off" class="layui-input">
            <input type="text" name="teachernum" placeholder="教师编号" autocomplete="off" class="layui-input">

            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-search="" name="majorid" id="majorName">
                    <option value="">专业名称</option>
                    <option value="1">软件工程</option>
                    <option value="2">网络工程</option>
                    <option value="3">物联网</option>
                    <option value="4">计算机</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="collegeid">
                    <option value="">学院名称</option>
                    <option value="1">计算机科学与技术</option>
                    <option value="2">机械</option>
                </select>
            </div>
            <%--隐藏当前页和当前页显示条数--%>
            <input type="hidden" name="pagesize"/>
            <input type="hidden" name="currentpage"/>

            <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>


        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('添加教师','./teacher-add.jsp')">添加教师 </button>
        <button class="layui-btn" onclick="x_admin_show('统计','./teacher-statistic.jsp')">统计 </button>
        <button class="layui-btn layui-btn-normal" onclick="">导入数据 </button>
        <button class="layui-btn layui-btn-normal" onclick="">导出数据 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>教师编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>职称</th>
            <th>职务</th>
            <th>入校时间</th>
            <th>联系方式</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="teacherBaseInfoList">

        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
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
