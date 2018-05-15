<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/15
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加学院</title>
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

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>

    <%--ll nameAndId的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/commonNameAndId.js"></script>

</head>

<body>
<div class="x-body">
    <form class="layui-form">
        <div class="layui-form-item" style="display:none">
            <label for="upCollegeNum" class="layui-form-label">
                上级学院编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="upCollegeNum" name="upcollegenum"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--1-->
        <div class="layui-form-item">
            <label for="collegeNum" class="layui-form-label">
                学院编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="collegeNum" name="collegenum"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2-->
        <div class="layui-form-item">
            <label for="collegeName" class="layui-form-label">
                学院名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="collegeName" name="collegename"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2-1-->
        <div class="layui-form-item">
            <label for="collegePresident" class="layui-form-label">
                院长
            </label>
            <div class="layui-input-inline">
                <select name="teacherid" id="collegePresident" >

                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2-2-->
        <div class="layui-form-item">
            <label for="collegePresidentF" class="layui-form-label">
                副院长
            </label>
            <div class="layui-input-inline">
                <select name="teacherid" id="collegePresidentF" >

                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="collegeShortName" class="layui-form-label">
                简称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="collegeShortName" name="collegeshortname"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <%--<!--1-->--%>
        <%--<div class="layui-form-item">--%>
            <%--<label for="collegeupNum" class="layui-form-label">--%>
                <%--上级学院--%>
            <%--</label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<select name="collegeid" id="collegeupNum">--%>
                <%--</select>--%>
            <%--</div>--%>
            <%--<div class="layui-form-mid layui-word-aux">--%>
                <%--<span class="x-red">*</span>必须填写--%>
            <%--</div>--%>
        <%--</div>--%>
        <!--4-->
        <div class="layui-form-item">
            <label class="layui-form-label">学院简介</label>
            <div class="layui-input-inline">
                <textarea placeholder="请输入内容" name="collegeintroduction" id="collegeIntroduction"  class="layui-textarea" autocomplete="off"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
        </div>
    </form>
</div>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

        //初始化教师（院长副院长下拉框;
        findTeacherNameAndIdForSelect(form);

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
                url:contextPath+"/collegeInfo/addCollegeInfo.action",
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
            //阻止表单跳转。如果需要表单跳转，去掉这段即可。
            return false;
        });


    });
</script>
</body>

</html>
