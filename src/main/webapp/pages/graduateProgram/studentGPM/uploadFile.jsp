<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>上传相关文件</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}/js/y_public.js"></script>

    <script src="${baseurl}/js/graduateProgram/studentGPM/uploadFile.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="layui-table">
        <caption>相关文件</caption>
        <thead>
        <tr>
            <td>文件名称</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody id="y_table">
        </tbody>
    </table>

    <fieldset style="margin-top: 30px;">
        <legend>上传论文</legend>
    </fieldset>
    <div class="layui-upload" style="margin-bottom: 50px;">
        <div class="layui-upload">
            <button type="button" class="layui-btn" id="test3"><i class="layui-icon"></i>上传论文</button>
        </div>
    </div>

    <script>
        layui.use('upload', function(){
            var $ = layui.jquery
                ,upload = layui.upload;

            upload.render({
                elem: '#test3'
                ,url: '/upload/'
                ,accept: 'file' //普通文件
                ,done: function(res){
                    console.log(res)
                }
            });
        });
    </script>
</div>

</body>

</html>