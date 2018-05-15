<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>上传课设报告</title>
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

    <script type="text/javascript" src="../../js/courseDesign/courseDesignReport.js"></script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程设计</a>
        <a>
          <cite>上传课设报告</cite></a>
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
        <button class="layui-btn" onclick="uoloadCourseDesignFile()">上传 </button>
        <button class="layui-btn" onclick="checkResult()">查看审核结果</button>
    </xblock>

    <script>
    </script>
    <!--end 操作区域-->

    <!--表格内容-->
    <form>
        <table class="layui-table">
            <thead>
            <tr>
                <th>选择
                    <!--<div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>-->
                </th>
                <th>序号</th>
                <th>课程名称</th>
                <th>课程编号</th>
                <!--
                <th>课程设计简介</th>
                -->
                <th>教师名称</th>
                <th>教师编号</th>
                <th>上传状态</th>
                <th>审核结果</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="tbodyInfo">

            </tbody>
        </table>
        <input type="hidden" name="pageNum">
        <input type="hidden" name="pageSize">
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>

<script>
</script>


</body>

</html>