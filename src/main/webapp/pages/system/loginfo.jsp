<%--日志管理界面--%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ include file="/tag.jsp"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
	<title>日志信息</title>
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" content="yes">
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <%--S  qlq--%>
    <%--日志JS--%>
    <script type="text/javascript" src="${baseurl}/js/system/loginfo.js"></script>
    <script type="text/javascript" src="${baseurl}/js/public/dateUtil.js"></script>
    <%--E  qlq--%>

</head>
<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">系统管理</a>
        <a>
          <cite>日志管理</cite></a>
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
        <form class="layui-form layui-col-md12 x-so" id="queryLogForm">
            <input type="hidden" name="pageSize">
            <input type="hidden" name="pageNum">
            <input type="text" name="operateDate" id="L_pass" placeholder="操作日期" autocomplete="off" class="layui-input">
            <input type="text" name="operatorName" placeholder="操作人姓名" autocomplete="off" class="layui-input">
            <input type="text" name="operateDescription"  placeholder="操作内容" autocomplete="off" class="layui-input">
            <input type="text" name="operatorId"  placeholder="操作人编号" autocomplete="off" class="layui-input">
            <input type="text" name="operatorUnitName" placeholder="操作人机构" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <select name="operatorType">
                    <option value="">操作人类型</option>
                    <option value="教师">教师</option>
                    <option value="学生">学生</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="operateResult">
                    <option value="">操作结果</option>
                    <option value="正常">正常</option>
                    <option value="异常">异常</option>
                </select>
            </div>
            <button class="layui-btn" type="button" onclick="queryLogFY()"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击重置查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th>序号</th>
                <th>操作人</th>
                <th>操作时间</th>
                <th>操作内容</th>
                <th>操作结果</th>
                <th>访问IP</th>
                <th>操作人类型</th>
                <th>操作人编号</th>
                <th>操作人单位</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody id="logTbody">
            <%--动态往这里写数据--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="logPageDiv"></div>
    <!--end 分页-->
</div>
<script>
    //日期
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });
</script>
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


<!--隐藏的模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_log_detail_index">
<div class="x-body" style="display: none" id="detailModal">
    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作人姓名
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operatorName"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作时间
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operateDate"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作内容
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operateDescription"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作结果
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operateResult"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            访问IP
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operateIP"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作人类型
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operatorType"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作人编号
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operatorId"  disabled  class="layui-input" value="">
        </div>
    </div>


    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作人单位
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operatorUnitName"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作的类名
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operateClass"  disabled  class="layui-input" value="">
        </div>
    </div>

    <div class="layui-form-item">
        <label  class="layui-form-label">
            操作方法名
        </label>
        <div class="layui-input-inline">
            <input type="text" id="operateMethod"  disabled  class="layui-input" value="">
        </div>
    </div>
</div>

