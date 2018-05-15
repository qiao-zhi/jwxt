<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改任务书</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="table table-bordered">
        <tr>
            <td>课题名称</td>
            <td colspan="3"></td>
            <td>专业</td>
            <td></td>
        </tr>
        <tr>
            <td>课题来源</td>
            <td></td>
            <td>课题类别</td>
            <td></td>
            <td>成果形式</td>
            <td></td>
        </tr>
        <tr>
            <td>主要研究内容</td>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td>设计目标要求</td>
            <td colspan="5"></td>
        </tr>
    </table>

    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>学号</th>
            <th>性别</th>
            <th>班级</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td>撒的</td>
            <td>2342314</td>
            <td>男</td>
            <td>软1</td>
            <td>
                <!--根据学生的情况，若已经填写过任务书，出来查看按钮。点击其他填写，会提示保存。
                 保存时单保存，编辑一个学生信息保存一次，方便查看。提交后，关闭页面-->
                <button class="layui-btn layui-btn-sm">填写</button>
                <button class="layui-btn layui-btn-sm layui-btn-normal">查看</button>
            </td>
        </tr>
        </tbody>
    </table>

    <button class="btn-primary btn">保存</button>
    <button class="btn-primary btn">提交</button>
    <table class="table table-bordered">
        <caption>太原科技大学毕业设计（论文）任务书</caption>
        <tbody>
        <tr>
            <td>学生姓名</td>
            <td></td>
            <td>学号</td>
            <td></td>
        </tr>
        <tr>
            <td>专业班级</td>
            <td></td>
            <td>同组人</td>
            <td></td>
        </tr>
        <tr>
            <td>任务下发时间</td>
            <td><input class="layui-input" id="startDate" type="text"></td>
            <td>任务完成时间</td>
            <td><input class="layui-input" id="endDate" type="text"></td>
        </tr>
        <tr>
            <td style="width:110px">设计（论文）题目</td>
            <td><input class="layui-input" id="" type="text"></td>
            <td>毕设题目</td>
            <td><input class="layui-input" type="text"></td>
        </tr>
        <tr>
            <td>设计目的要求</td>
            <td colspan="3">
                <textarea name="" class="layui-textarea"></textarea>
            </td>
        </tr>
        <tr>
            <td>设计主要内容</td>
            <td colspan="3">
                <textarea name="" class="layui-textarea"></textarea>
            </td>
        </tr>
        <tr>
            <td>设计提交资料</td>
            <td colspan="3">
                <textarea name="" class="layui-textarea"></textarea>
            </td>
        </tr>
        <tr>
            <td>指导教师签名</td>
            <td colspan="3">
                <button type="button" class="layui-btn" id="test1">上传签名</button>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" width="100" id="demo1">
                    <p id="demoText"></p>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>

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