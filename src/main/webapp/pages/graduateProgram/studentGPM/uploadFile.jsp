<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>上传相关文件</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}/js/y_public.js"></script>

    <script src="${baseurl}/js/graduateProgram/studentGPM/studentGPM-view.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="layui-table">
        <caption>相关文件</caption>
        <thead>
        <tr>
            <td>文件名称</td>
            <td>提交截止时间</td>
            <td>填写截止时间</td>
            <td>完成填写状态</td>
            <td>审核状态</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>任务书</td>
            <td>2017-1-1</td>
            <td>2017-1-1</td>
            <td>完成</td>
            <td>通过</td>
            <td>下载</td>
        </tr>
        <tr>
            <td>中期检查表</td>
            <td>2017-1-1</td>
            <td>2017-1-1</td>
            <td>完成</td>
            <td>通过</td>
            <td>下载</td>
        </tr>
        <tr>
            <td>计划进程表</td>
            <td>2017-1-1</td>
            <td>2017-1-1</td>
            <td>完成</td>
            <td>通过</td>
            <td>下载</td>
        </tr>
        <tr>
            <td>论文评审表</td>
            <td>2017-1-1</td>
            <td>2017-1-1</td>
            <td>完成</td>
            <td>通过</td>
            <td>下载</td>
        </tr>
        <tr>
            <td>考勤表</td>
            <td>2017-1-1</td>
            <td>2017-1-1</td>
            <td>完成</td>
            <td>通过</td>
            <td>下载</td>
        </tr>
        <tr>
            <td>毕业论文</td>
            <td>2017-1-1</td>
            <td>2017-1-1</td>
            <td>完成</td>
            <td>通过</td>
            <td>下载</td>
        </tr>
        </tbody>
    </table>

    <fieldset style="margin-top: 30px;">
        <legend>上传论文</legend>
    </fieldset>
    <div class="layui-upload" style="margin-bottom: 50px;">
        <div class="layui-upload">
            <button type="button" class="layui-btn layui-btn-normal" id="test8">上传论文</button>
            <button type="button" class="layui-btn" id="test9">开始上传</button>
        </div>
    </div>

    <script>
        layui.use('upload', function(){
            var $ = layui.jquery
                ,upload = layui.upload;

            upload.render({
                elem: '#test8'
                ,url: '/upload/'
                ,auto: false
                //,multiple: true
                ,bindAction: '#test9'
                ,done: function(res){
                    console.log(res)
                }
            });
        });
    </script>
</div>

</body>

</html>