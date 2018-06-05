<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加毕业答辩小组</title>
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
        .layui-form-item .layui-input-inline {
            width: 300px !important;
        }

        /*.y_left {*/
        /*float: right;*/
        /*width: 43%;*/
        /*height: 200px;*/
        /*background-color: #eee;*/
        /*position: fixed;*/
        /*margin-left: 500px;*/
        /*}*/

        /*.y_left table {*/
        /*box-shadow: 0 -2px 2px #ccc;*/
        /*}*/
    </style>
</head>
<body>
<div class="x-body">
    <form class="layui-form" style="width:55%;float:left;">
        <!--2-->
        <div class="layui-form-item">
            <label for="groupname" class="layui-form-label">
                小组名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="groupname" name="groupname" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="replayaddress" class="layui-form-label">
                答辩地点
            </label>
            <div class="layui-input-inline">
                <input type="text" id="replayaddress" name="replayaddress" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="replaytime" class="layui-form-label">
                检查时间
            </label>
            <div class="layui-input-inline">
                <input type="text" id="replaytime" name="replaytime" class="layui-input" id="L_pass" placeholder="yyyy-MM-dd">
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="teacherid" class="layui-form-label">
                小组组长
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="groupleader" id="teacherid">
                        <option>请选择</option>
                        <c:forEach var="tTeacherBaseInfo" items="${tTeacherBaseInfos}">
                            <option value="${tTeacherBaseInfo.teacherid}">${tTeacherBaseInfo.teachername}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label class="layui-form-label">
                检查教师
            </label>
            <div class="layui-input-inline" style="width: 100px">
                <c:forEach var="tTeacherBaseInfo" items="${tTeacherBaseInfos}">
                    <input type="hidden" class="layui-input" name="teacherid" value="${tTeacherBaseInfo.teacherid}"/>
                    <input type="text" disabled class="layui-input" name="teachername" value="${tTeacherBaseInfo.teachername}"/>
                    <%--<span>${tTeacherBaseInfo.teachername}</span>--%>
                    <%--<button class="layui-btn layui-btn-sm" onclick="addStudent(${tTeacherBaseInfo.teacherid})">添加学生</button>--%>
                    <%--<textarea class="layui-textarea" name=""></textarea>--%>
                </c:forEach>
            </div>
        </div>

        <!--10-->
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="addGroup">增加</button>
        </div>
    </form>

    <%--<div class="y_left">--%>
    <%--<!--展示数据的表格-->--%>
    <%--<table class="layui-hide" id="studentInfo" lay-filter="studentInfo"></table>--%>
    <%--</div>--%>
</div>
<script>
    //答辩时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });

    layui.use(['form', 'layer','table'], function () {
        $ = layui.jquery;
        var form = layui.form
            , table = layui.table
            , layer = layui.layer;

        //监听提交
        form.on('submit(addGroup)', function (data) {
            //页面上的老师id
            var pageteacherids = $("input[name='teacherid']");
            var teacherids = [];
            for(var i = 0;i<pageteacherids.length;i++){
                teacherids[i] = pageteacherids[i].value;
            }

            //页面上的老师名称
            var pageteachernames = $("input[name='teachername']");
            var teachernames = [];
            for(var i = 0;i<pageteachernames.length;i++){
                teachernames[i] = pageteachernames[i].value;
            }
            teacherids = JSON.stringify(teacherids);
            teachernames = JSON.stringify(teachernames);

            $.ajax({
                type:'POST',
                url:"${pageContext.request.contextPath}/gradesigncheckgroup/addNew.action?data="+JSON.stringify(data.field)+"&teacherids="+teacherids+"&teachernames="+teachernames,
                success:function(msg){
                    if(msg == "0"){
                        layer.alert("添加成功", {icon: 6}, function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                        });
                    }else if (msg == "1"){
                        layer.alert("添加失败", {icon: 7}, function () {
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        });
                    }else{
                        layer.alert("未知的错误，请联系管理员", {icon: 7}, function () {
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        });
                    }
                }
            });
            return false;
        });

        active = {

        }

        //渲染学生表格
        <%--var studentInfo = table.render({--%>
        <%--elem: '#studentInfo'--%>
        <%--,width: 400--%>
        <%--,height: 400--%>
        <%--,url: '${pageContext.request.contextPath}/checkgroupperson/selectPage.action'--%>
        <%--,cols:[[--%>
        <%--{checkbox:true, fixed: true}--%>
        <%--,{field:'studentid', width:90, title: '学生ID'}--%>
        <%--,{field:'studentname', width:90, title: '学生姓名'}--%>
        <%--,{field:'classname', width:60, title: '班级'}--%>
        <%--,{field:'gratitle', width:100, title: '毕设题目'}--%>
        <%--,{field:'leaderteacher', width:100, title: '指导老师'}--%>
        <%--]]--%>
        <%--,id:'studentInfo'--%>
        <%--})--%>
    });

</script>
</body>

</html>
