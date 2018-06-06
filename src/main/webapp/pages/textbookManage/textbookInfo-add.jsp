<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
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
    <%--新增教材的js--%>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookRepository.js"></script>

    <script>
        //页面加载完成执行一些操作
        $(function () {
            findAllCourse();
        })
    </script>


</head>

<body>
<div class="x-body">
    <form class="layui-form">
        <!--1-->
         <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课程名称
            </label>
            <div class="layui-input-inline">
                <select name="courseid" id="allCourse" lay-filter="course" lay-search="">
                    <%--<option value="1">计算机网络</option>--%>
                    <%--<option value="2">软件工程</option>--%>
                    <%--<option value="3">数据库原理</option>--%>
                    <%--<option value="4">操作系统</option>--%>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                教材编号
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="textbooknum" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--1-1-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
               教材名称
            </label>
            <div class="layui-input-inline">
                <input type=""  name="textbookname" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                出版社
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="publishinghouse" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              作者
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="author" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                ISBN
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="isbn" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                单价
            </label>
            <div class="layui-input-inline">
               <input type="text"  name="price" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--6-->
       
       
        <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-filter="addTextbook" lay-submit="">
                  确认添加
              </button>
        </div>
        <!---->
    </form>
</div>


<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;


//        //监听提交
//        form.on('submit(add)', function (data) {
//            console.log(data);
//            //发异步，把数据提交给php
//            layer.alert("增加成功", {icon: 6}, function () {
//                // 获得frame索引
//                var index = parent.layer.getFrameIndex(window.name);
//                //关闭当前frame
//                parent.layer.close(index);
//            });
//            return false;
//        });


    });
</script>

</body>

</html>