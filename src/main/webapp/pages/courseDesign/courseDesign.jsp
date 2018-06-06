<%@page pageEncoding="utf-8"%>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript" src="../../js/courseDesign/courseDesign.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程设计</a>
        <a>
          <cite>课设管理</cite></a>
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
                <select name="" lay-verify="" id="yearSelect">
                    <option value="">请选择年级</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="" lay-verify="" id="majorSelect">
                    <option value="">请选择专业</option>
                </select>
            </div>

            <!--<div class="layui-input-inline">-->
            <!--<select name="" lay-verify="">-->
            <!--<option value="">请选择学年</option>-->
            <!--<option value="010">通识教育</option>-->
            <!--</select>-->
            <!--</div>-->

            <div class="layui-input-inline">
                <select name="" lay-verify="" id="selectSemester">
                    <option value="">请选择学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                    <option value="3">第三学期</option>
                    <option value="4">第四学期</option>
                    <option value="5">第五学期</option>
                    <option value="6">第六学期</option>
                    <option value="7">第七学期</option>
                    <option value="8">第八学期</option>
                </select>
            </div>
            <button class="layui-btn" type="button" lay-filter="sreach" onclick="findNeedArrangeCD();"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->
    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="courseDesignArrange()">分配 </button>
        <button class="layui-btn" onclick="courseDesignImport()">导出 </button>
        <button class="layui-btn" style="float: right;" onclick="commit()">提交 </button>
        <button class="layui-btn" style="float: right;" onclick="save()">保存 </button>
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
                <th>课设编号</th>
                <th>课设名称</th>
                <!--<th>开始时间</th>
                <th>结束时间</th>-->
                <!--<th>上传人</th>
                <th>课程设计安排</th>-->
                <th>课程设计简介</th>
                <th>安排状态</th>
                <th>指导教师</th>
                <th>最后安排时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="tbodyNeedArrange">


            <%--<tr>--%>
                <%--<td><div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div></td>--%>
                <%--<td>20</td>--%>
                <%--<td>201700917</td>--%>
                <%--<td>老王</td>--%>
                <%--<td>学生</td>--%>
                <%--<td>已分配</td>--%>
                <%--<td></td>--%>
                <%--<td></td>--%>

                <%--<td class="td-manage">--%>
                    <%--<a title="点击查看订单详细信息" onclick="x_admin_show('详细信息','courseDesign-ArrangeInfoDetail.html')" href="javascript:;">--%>
                        <%--<i class="layui-icon">&#xe63c;</i>--%>
                    <%--</a>--%>
                    <%--<a title="编辑"  onclick="x_admin_show('编辑','courseDesign-Arrange.html')" href="javascript:;">--%>
                        <%--<i class="layui-icon">&#xe642;</i>--%>
                    <%--</a>--%>
                <%--</td>--%>
            <%--</tr>--%>

            </tbody>
        </table>
        <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <span class="layui-laypage-count" id="dataCount"></span>
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>

<script>

</script>
<script>

</script>

</body>

</html>