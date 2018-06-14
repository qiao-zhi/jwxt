<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加专业</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>

    <%--ll nameAndId的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/commonNameAndId.js"></script>
</head>

<body>
<div class="x-body">
    <form class="layui-form">
        <!--0-->
        <div class="layui-form-item">
            <label for="collegeName" class="layui-form-label">
                学院名称
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="collegeid" id="collegeName" lay-verify="required">
                    </select>
                </div>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--1-->
        <div class="layui-form-item">
            <label for="majorNum" class="layui-form-label">
                专业代码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorNum" name="majornum" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--2-->
        <div class="layui-form-item">
            <label for="majorName" class="layui-form-label">
                专业名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorName" name="majorname" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="phone" class="layui-form-label">
                专业门类
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="majorsort" id="phone" name="majorsort" lay-verify="required">
                        <option value="">请选择</option>
                        <option value="工科">工科</option>
                        <option value="理科">理科</option>
                        <option value="文科">文科</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="majorShortName" class="layui-form-label">
                专业简称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorShortName" name="majorshortname" required=""
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="majorManager" class="layui-form-label">
                专业负责人
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorManager" name="majormanager" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
        </div>
    </form>
</div>
<script>
    //出生年月
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });
</script>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
        findCollegeNameAndIdForSelect(form);

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
            $.ajax({
                url:contextPath+"/majorInfo/addMajorInfo.action",
                data:data.field,
                type:"POST",
                datatype:"text",
                success:function(response){
                    alert(response)
                    if("添加成功" == response){
                        //实现父页面的刷新
                        window.parent.location.reload();
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                    }
                }
            })
            return false;
        });


    });
</script>
</body>

</html>
