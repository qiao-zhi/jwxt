<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>校外毕设审核管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>

    <%--s       BZY      --%>
    <%@include file="/tag.jsp" %>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/selectApply.js"></script>
    <%--3       Bzy      --%>
    <style>
        .y_files{
            color:#01AAED;
            cursor: pointer
        }
    </style>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.html">首页</a>
          <a href="">毕业设计管理</a>
        <a href="">校外毕设管理</a>
        <a>
          <cite>校外毕设审核管理</cite>
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
            <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">
            <input type="text"  class="layui-input" id="y_year" placeholder="学年" autocomplete="off">
            <input type="text" id="major" placeholder="专业" autocomplete="off" class="layui-input">
            <input type="text" id="studentNum" placeholder="学号" autocomplete="off" class="layui-input">

            <div class="layui-input-inline">
                <select name="contrller" id="checkStatus" >
                    <option value="">全部</option>
                    <option value="未审核">未审核</option>
                    <option value="已审核">已审核</option>
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="sreach" type="button" onclick="serachStudentInfoByValue()"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>学号</th>
            <th>学生姓名</th>
            <th>专业班级</th>
            <th>指导教师</th>
            <th>接收单位</th>
            <th>校外导师</th>
            <th>申请时间</th>
            <th>审核状态</th>
            <th>审核文件</th>
        </tr>
        </thead>
        <tbody id="thead-tbody">
        <%--<tr>
            <td>201700917</td>
            <td>老王</td>
            <td>软12004</td>
            <td>老王</td>
            <td>阿萨德发</td>
            <td>老王</td>
            <td>1854-10-2</td>
            <td>通过</td>
            <td class="y_files" title="点击查看审核内容" onclick="x_admin_show_big('相关申请表','./outGraduateManage-table.html')">相关申请表</td>
        </tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pagediv" style="margin-left: 200px"></div>
    <!--end 分页-->
</div>
<script>
    /*学年*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#y_year' //指定元素
            ,type: 'year'
        });
    })

    //发布时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });



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