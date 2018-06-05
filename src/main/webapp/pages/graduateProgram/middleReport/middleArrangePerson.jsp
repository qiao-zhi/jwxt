<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>中期检查小组成员互审</title>
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
    <style>
        .floatleft{
            width: 40%;
            float: left;
            margin-left: 60px;
        }
    </style>
</head>
<body>
    <xblock>
        <div class="layui-btn-group demoTable">
            <button class="layui-btn" data-type="arrangeteacher">分配</button>
            <button class="layui-btn" data-type="downloadArrangeResult">导出互审结果表</button>
        </div>
    </xblock>

<%
    String groupid1=request.getParameter("groupid1");
    String groupid2=request.getParameter("groupid2");
%>
    <input type="hidden" id="groupid1" value="<%=groupid1%>"/>
    <input type="hidden" id="groupid2" value="<%=groupid2%>"/>
    <%--左边表格--%>
    <div class="floatleft">
        <table class="layui-table" id="leftTeacherInfo" lay-filter="leftTeacherInfo"></table>
    </div>

    <%--右边表格--%>
    <div class="floatleft">
        <table class="layui-table" id="rightTeacherInfo" lay-filter="rightTeacherInfo"></table>
    </div>

    <%--下面表格--%>
    <table class="layui-table" id="arrangeResult" lay-filter="arrangeResult">
        <caption style="font-size: 18px">互审安排表</caption>
    </table>

    <%--操作部分--%>
    <script type="text/html" id="barDemo">
        <a lay-event="del">
            <i class="layui-icon">&#xe640;</i>
        </a>
    </script>
<script>
    layui.use('table', function(){
        var table = layui.table
            ,$ = layui.$;

        var groupid1 = $("#groupid1").val();
        var groupid2 = $("#groupid2").val();


        //渲染左面小组成员表格，初始化数据
        var leftTeacherInfo = table.render({
            elem: '#leftTeacherInfo'
            ,width: 413
            ,url: '${pageContext.request.contextPath}/checkgroupperson/selectTeacherAndStudentCount.action?groupid='+groupid1
            ,cols:[[
                {checkbox:true, fixed: true}
                ,{field:'teacherid',width:100, title: '老师ID'}
                ,{field:'teachername',width:120, title: '老师名称'}
                ,{field:'studentcount',width:140, title: '负责学生人数'}
            ]]
            ,id:'leftTeacherInfo'
        })

        //渲染右面小组成员表格，初始化数据
        var rightTeacherInfo = table.render({
            elem: '#rightTeacherInfo'
            ,width: 413
            ,url: '${pageContext.request.contextPath}/checkgroupperson/selectTeacherAndStudentCount.action?groupid='+groupid2
            ,cols:[[
                {checkbox:true, fixed: true}
                ,{field:'teacherid',width:100, title: '老师ID'}
                ,{field:'teachername',width:120, title: '老师名称'}
                ,{field:'studentcount',width:140, title: '负责学生人数'}
            ]]
            ,id:'rightTeacherInfo'
        })

        //渲染下面小组成员表格，初始化数据
        var arrangeResult = table.render({
            elem: '#arrangeResult'
            ,url: '${pageContext.request.contextPath}/checkgroupperson/selectArrangeResult.action'
            ,cols:[[
                {type:'checkbox'}
                ,{field:'teachernameone',width:300, title: '老师名称'}
                ,{field:'studentCountInTeacherOne',width:120, title: '负责学生人数'}
                ,{field:'teachernametwo',width:300, title: '老师名称'}
                ,{field:'studentCountInTeacherTwo',width:120, title: '负责学生人数'}
                ,{fixed: 'right', width:100, align:'center', toolbar: '#barDemo', title: '操作'}
            ]]
            ,id:'arrangeResult'
        })

        //监听上面表格复选框选择
        table.on('checkbox(leftTeacherInfo)', function(obj){
            console.log(obj)
        });

        //监听上面表格复选框选择
        table.on('checkbox(rightTeacherInfo)', function(obj){
            console.log(obj)
        });

        //监听工具条
        table.on('tool(arrangeResult)', function(obj){
            var data = obj.data;
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(){
                    $.ajax({
                        type:'POST',
                        url:'${pageContext.request.contextPath}/checkgroupperson/deleteArrangeResult.action?arrangeresultid='+data.arrangeresultid,
                        success:function (msg) {
                            if(msg == '0'){
                                layer.msg("删除成功");
                            }else if(msg == '1'){
                                layer.msg("删除失败");
                            }else{
                                layer.msg("错误发生");
                            }
                            arrangeResult.reload({});
                        }
                    })
                });
            }
        });

        active = {
            //开始分配
            arrangeteacher: function () {
                //获取左边表格选中的值
                var checkStatus1 = table.checkStatus('leftTeacherInfo')
                    ,data1 = checkStatus1.data;

                var param1 = encodeURIComponent(JSON.stringify(data1));

                //获取右边表格选中的值
                var checkStatus2 = table.checkStatus('rightTeacherInfo')
                    ,data2 = checkStatus2.data;
                var param2 = encodeURIComponent(JSON.stringify(data2));

                if(data1.length == 0 || data2.length == 0){
                    layer.msg("请选择需要互审的老师")
                }else {
                    $.ajax({
                        type:'POST',
                        url:'${pageContext.request.contextPath}/checkgroupperson/arrangeTeacher.action?data1='+param1+'&data2='+param2,
                        success:function (msg) {
                            if(msg=='0'){
                                layer.msg("安排成功");
                            }else if (msg=='1'){
                                layer.msg("安排失败");
                            }else{
                                layer.msg("错误发生了");
                            }
                            arrangeResult.reload({});
                        }
                    })
                }

            },

            //导出互审结果表
            downloadArrangeResult:function () {
                layer.msg("暂未实现")
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    })
</script>
</body>
</html>