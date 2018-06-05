<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改课程</title>
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
    <%--新增教材的js--%>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookRepository.js"></script>

    <%
        String textbookId=request.getParameter("textbookId");//TextbookRepository.js文件231行中的自定义变量textbookId，值为copyTextbookID
    %>
    <% if (textbookId != null) { %>
    <script type="text/javascript" charset="utf-8">
        var textbookId = "<%=textbookId %>";//将传过来的教材ID赋给JS的全局变量
    </script>
    <% }%>

    <script>
        //页面加载完成执行一些操作
        $(function () {
            updateTextbookBaseInfo();//修改基本信息相关操作
            initUpdateForm();//初始化layui的修改的提交表单
        })
    </script>

</head>

<body>
<div class="x-body">
    <form class="layui-form">

        <%--隐藏教材主键--%>
        <input type="hidden" name="textbookid" value="<%=textbookId %>"><!--将隐藏的主键传给实体类-->

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
                <!--readonly只读-->
                <input type="text" id="" name="textbooknum"  readonly required="" lay-verify="required"
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
                <input type="" id="" name="textbookname" required="" lay-verify="required"
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
                <input type="text" id="" name="publishinghouse" required=""  lay-verify="required"
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
                <input type="text" id="" name="author" required="" lay-verify="required"
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
                <input type="text" id="" name="isbn" required=""  lay-verify="required"
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
               <input type="text" id="" name="price" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--6-->
        
        <!---->
        <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-filter="updateTextbook" lay-submit="">
                  确认修改
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