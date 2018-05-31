<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>任务书审核</title>
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

    <script src="${baseurl}/js/graduateProgram/projectManage/assignmentManage.js"></script>
</head>

<body>

<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <c:if test="${userinfo.usersort}== '院长'">
        <table class="layui-table" style="width:850px;margin-left:45px;" width="">
            <thead>
            <tr>
                <th>教研室审核结果</th>
                <th>教研室审核意见</th>
                <th>教研室审核时间</th>
                <th>教研室审核人</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${teachertitleFirstcheckinfo.checkResult}</td>
                <td>${teachertitleFirstcheckinfo.checkDesc}</td>
                <td>${teachertitleFirstcheckinfo.checkTime}</td>
                <td>${teachertitleFirstcheckinfo.checkPerson}</td>
            </tr>
            </tbody>
        </table>
    </c:if>
    <form class="layui-form">

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="checkResult" lay-skin="primary" value="同意" title="同意" checked>
                <input type="radio" name="checkResult" lay-skin="primary" value="不同意" title="不同意">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
                <textarea id="checkDesc" placeholder="请填写审核意见" name="checkDesc" class="layui-textarea"
                          lay-verify="required"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label" for="checkDesc">
                审核时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="L_pass" name="checkTime" lay-verify="required">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">提交</button>
        </div>
    </form>

</div>
<script>
    //照片上传
    layui.use('upload', function () {
        var $ = layui.jquery, upload = layui.upload;
        var uploadInst = upload.render({
            elem: '#test1'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
    });//end 照片上传

    /*学年*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        $("#startDate").click(function () {
            var edate = $("#endDate").val();
            laydate.render({
                elem:'#startDate',
                show: true,
                max:edate
            })
        });
        $("#endDate").click(function () {
            var sdate = $("#startDate").val();
            laydate.render({
                elem:'#endDate',
                show: true,
                min:sdate
            })
        })
    })
</script>
</body>

</html>