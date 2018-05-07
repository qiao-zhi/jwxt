<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加中期答辩小组</title>
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

        .y_left {
            float: right;
            width: 43%;
            height: 200px;
            background-color: #eee;
        }

        .y_left table {
            margin-top: 200px;
            box-shadow: 0 -2px 2px #ccc;
        }
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
                答辩时间
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
                    <select name="teacherid" id="teacherid">
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
                设置检查教师
            </label>
            <div class="layui-input-inline">
                <c:forEach var="tTeacherBaseInfo" items="${tTeacherBaseInfos}">
                    <div><span>${tTeacherBaseInfo.teachername}</span>
                        <button class="layui-btn layui-btn-sm">添加学生</button>
                        <textarea class="layui-textarea" name="" rows="5"></textarea>
                    </div>
                </c:forEach>
            </div>
        </div>

        <!--10-->
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
        </div>
    </form>

    <div class="y_left">
        <table class="layui-table">
            <thead>
            <tr>
                <th>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </th>
                <th>学生姓名</th>
                <th>班级</th>
                <th>毕设题目</th>
                <th>指导教师</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </td>
                <td>学生1</td>
                <td>软件工程1</td>
                <td>8888</td>
                <td>教师1</td>
            </tr>
            <tr>
                <td>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </td>
                <td>学生1</td>
                <td>软件工程1</td>
                <td>8888</td>
                <td>教师1</td>
            </tr>
            <tr>
                <td>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </td>
                <td>学生1</td>
                <td>软件工程1</td>
                <td>8888</td>
                <td>教师1</td>
            </tr>
            <tr>
                <td>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </td>
                <td>学生1</td>
                <td>软件工程1</td>
                <td>8888</td>
                <td>教师1</td>
            </tr>
            <tr>
                <td>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </td>
                <td>学生1</td>
                <td>软件工程1</td>
                <td>8888</td>
                <td>教师1</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<script>
    //答辩时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

        //自定义验证规则
        form.verify({
            nikename: function (value) {
                if (value.length < 5) {
                    return '昵称至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , repass: function (value) {
                if ($('#L_pass').val() != $('#L_repass').val()) {
                    return '两次密码不一致';
                }
            }
        });

        //监听提交
        form.on('submit(add)', function (data) {
            console.log(data);
            $.ajax({
                type:"POST",
                url:"${pageContext.request.contextPath}/gradesigncheckgroup/add.action",
                data:JSON.stringify(data.field),
                dataType:"json",
                success:function(){
                    layer.alert("增加成功", {icon: 6}, function () {
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                    });
                    return false;
                }
            });
            //发异步，把数据提交给php
        });
    });
</script>
</body>

</html>
