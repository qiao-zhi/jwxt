<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>中期检查审核管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
</head>
<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.jsp">首页</a>
        <a href="javascript:void(0)">毕业设计管理</a>
        <a href="javascript:void(0)">中期答辩管理</a>
        <a>
          <cite>中期检查结果填写</cite>
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

    <div class="demoTable" style="text-align: center;">
        <div class="layui-inline">
            <input type="text" name="searchStudentname" id="searchStudentname" placeholder="学生姓名" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-inline">
            <input type="text" name="searchClassname" id="searchClassname" placeholder="班级名称" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-inline">
            <input type="text" name="searchGradesigntitle" id="searchGradesigntitle" placeholder="毕设题目" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-inline">
            <select class="layui-input" name="">
                <option value="2">答辩状态</option>
                <option value="0">已答辩</option>
                <option value="1">未答辩</option>
            </select>
        </div>
        <div class="layui-inline">
            <select class="layui-input" name="">
                <option value="2">毕设类型</option>
                <option value="0">校外毕设</option>
                <option value="1">校内毕设</option>
            </select>
        </div>
        <div class="layui-inline">
            <select class="layui-input" name="">
                <option>检查表填写情况</option>
                <option>已填写</option>
                <option>未填写</option>
            </select>
        </div>
        <button class="layui-btn" data-type="searchCheckgrouppersonInfo"><i class="layui-icon">&#xe615;</i></button>
    </div>

    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <div class="demoTable">
            <button class="layui-btn" data-type="fillInCenterCheckTable">填写中期检查表 </button>
            <button class="layui-btn layui-btn-normal" onclick="">导出数据 </button>
        </div>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table" id="studentInfo" lay-filter="studentInfo"></table>
    <!--end 表格内容-->

    <!--操作数据的图标-->
    <script type="text/html" id="operColumn">
        <a lay-event="detail">
            <i class="layui-icon">&#xe63c;</i>
        </a>
    </script>
</div>
<script>
    /*分页js*/
    layui.use(['table'], function(){
        var table = layui.table
            ,$ = layui.$;

        //渲染小组详细信息表格，初始化数据
        var studentInfo = table.render({
            elem: '#studentInfo'
            ,url: ''
            ,width: 1140
            ,height: 470
            ,cols:[[
                {checkbox:true, fixed: true}
                ,{field:'', width:70, fixed: true, title: '学生'}
                ,{field:'', width:120, fixed: true, title: '班级'}
                ,{field:'', width:250, title: '毕设题目'}
                ,{field:'', width:80, title: '指导老师'}
                ,{field:'', width:120, title: '中期检查教师'}
                ,{field:'', width:120, title: '是否进行答辩'}
                ,{field:'', width:120, title: '检查表填写情况'}
                ,{field:'', width:100, title: '毕设类型'}
                ,{fixed: '', width:70, align:'center', toolbar: '#operColumn', title: '操作'}
            ]]
            ,id:'studentInfo'
            ,page: true
        })

        active = {
            fillInCenterCheckTable:function(){
                layer.open({
                    type:2,
                    title:'详细信息',
                    area:[$(window).width()*0.90,($(window).height()-50)],
                    shade: 0.4,
                    fix: false, //不固定
                    shadeClose: true,
                    maxmin: true,
                    content:'./middleReportManage-addResult.html'
                })
            },
            searchCheckgrouppersonInfo:function () {
                layer.msg("开始搜索");
            }
        }

        //监听工具条,上面表格中的数据操作
        table.on('tool(checkgrouppersonInfo)', function(obj){
            var data = obj.data;
            //查看详情
            if(obj.event === 'detail'){
                layer.open({
                    type:2,
                    title:'详细信息',
                    area:[$(window).width()*0.90,($(window).height()-50)],
                    shade: 0.4,
                    fix: false, //不固定
                    shadeClose: true,
                    maxmin: true,
                    content:''
                })
            }
        });

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
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
