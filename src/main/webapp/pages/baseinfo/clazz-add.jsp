<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加班级</title>
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
        <!--1-->
        <div class="layui-form-item">
            <label for="classNum" class="layui-form-label">
                班级编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="classNum" name="classnum" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <!--3-->
        <div class="layui-form-item">
            <label for="majorName" class="layui-form-label">
                所属专业
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-verify="required" lay-search="" name="majorid" id="majorName">
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="grade" class="layui-form-label">
                所属年级
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-verify="required" id="grade" name="grade">
                    <option value=" ">请选择</option>
                    <option value="2014">2014</option>
                    <option value="2015">2015</option>
                    <option value="2016">2016</option>
                    <option value="2017">2017</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--2-->
        <div class="layui-form-item">
            <label for="className" class="layui-form-label">
                班级名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="className" name="classname" required=""
                       autocomplete="off" class="layui-input" onclick="class_name()">
            </div>
            <div class="layui-form-mid layui-word-aux">
                自动生成
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="trainingSchemeID" class="layui-form-label">
                培养方案编号
            </label>
            <div class="layui-input-inline">
                <select lay-verify="required" id="trainingSchemeID" name="trainingschemeid"><!--带搜索的查询-->
                    <option value=" ">请选择</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
        </div>
    </form>
</div>
<script>
    //入学时间
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
        findMajorNameAndIdForSelect(form);

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
                url:contextPath+"/classInfo/addClassInfo.action",
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
<script>
    //自动生成班级名称
    function class_name(){

        var major_name=$("#majorName option:checked").text();

        var class_num=$("#classNum").val();
        $("#className").val(major_name+class_num+"班");



    }
</script>
</body>

</html>
