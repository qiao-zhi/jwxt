<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>校外毕设审核管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>

    <%--S     bzy    --%>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/countOGDinf.js"></script>
    <%--E     bzy    --%>
    <style>
        .y_files{
            color:#01AAED;
            cursor: pointer
        }
    </style>

    <script>
        var userID = 1;
    </script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.html">首页</a>
          <a href="">毕业设计管理</a>
        <a href="">校外毕设管理</a>
        <a>
          <cite>校外毕设统计</cite>
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
        <form class="layui-form layui-col-md12 x-so">
            <%--隐藏分页组建--%>
                <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">



            <input type="datetime" name="" class="layui-input" id="start_year" placeholder="起始学年">
            <label >至</label>
            <input type="datetime" name="" class="layui-input" id="end_year" placeholder="结束学年" >
            <%--<div class="layui-input-inline">
                <select lay-verify="required" lay-search="" name="contrller" id="clazzName">
                    <option value="">专业</option>
                    <option value="1">layer</option>
                    <option value="2">form</option>
                    <option value="3">layim</option>
                    <option value="4">element</option>
                    <option value="5">laytpl</option>
                    <option value="6">upload</option>
                    <option value="7">laydate</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select lay-verify="required" lay-search="" name="contrller" >
                    <option value="">班级名称</option>
                    <option value="1">layer</option>
                    <option value="2">form</option>
                    <option value="3">layim</option>
                    <option value="4">element</option>
                    <option value="5">laytpl</option>
                    <option value="6">upload</option>
                    <option value="7">laydate</option>
                </select>
            </div>--%>
            <button onclick="selectCount()" type="button" class="layui-btn" lay-submit="" lay-filter="sreach">
                <i class="layui-icon">&#xe615;</i>
            </button>
        </form>
    </div>
    <!--end查询-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>学年</th>
            <th>专业</th>
            <th>专业班级</th>
            <th>总人数</th>
            <th>校外人数</th>
        </tr>
        </thead>
        <tbody id="thead_tbody">
        <%--<tr>
            <td>2017-2018学年</td>
            <td>软件工程</td>
            <td>软件142001</td>
            <th>38</th>
            <td class="y_files" title="点击查看校外毕设人员详细信息" onclick="x_admin_show_big('校外毕设人员详细信息','./outGraduateStaNum.jsp')">23</td>
        </tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->
</div>
<script>
    /*学年*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#start_year' //指定元素
            ,type: 'year'
            ,done:function(date){
            	date = parseInt(date)
            	$("#end_year").val(date+1)
            }
        });
    })
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