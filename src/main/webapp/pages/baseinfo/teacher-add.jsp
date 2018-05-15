<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加教师</title>
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
        <!--0-->
        <div class="layui-form-item">
            <label for="test1" class="layui-form-label">
                个人照片
            </label>
            <div class="layui-upload">
                <button type="button" class="layui-btn" id="test1">上传照片</button>
                <div class="layui-upload-list" style="position:relative;left:110px;">
                    <img class="layui-upload-img" width="100" id="demo1">
                    <p id="demoText"></p>
                </div>
            </div>
        </div>
        <!--1-->
        <div class="layui-form-item">
            <label for="username" class="layui-form-label">
                <span class="x-red">*</span>教师编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="username" name="teachernum" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2  有问题-->
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
                <span class="x-red">*</span>职务
            </label>
            <div class="layui-input-inline">
                <select name="teacherposition" id="L_repass">
                    <option value="">请选择</option>
                    <option value="1">教师</option>
                    <option value="2">教导主任</option>
                    <option value="3">教研室主任</option>
                    <option value="4">系主任</option>
                    <option value="5">学院院长</option>
                    <option value="6">校长助理</option>
                    <option value="7">副校长</option>
                    <option value="8">校长</option>
                    <option value="9">书记</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_email" class="layui-form-label" >
                <span class="x-red">*</span>专业
            </label>
            <div class="layui-input-inline">
                <select name="majorid" id="L_email" lay-filter="major">

                </select>
            </div>
        </div>

        <%--隐藏学院名称--%>
        <input type="hidden" name="majorname" value="计算机科学与技术学院"/>
        <!--3-->
        <div class="layui-form-item">
            <label for="username" class="layui-form-label">
                <span class="x-red">*</span>姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="phone" name="teachername" required="" lay-verify="username"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label class="layui-form-label"><span class="x-red">*</span>性别</label>
            <div class="layui-input-block">
                <input type="radio" name="teachersex" lay-skin="primary" title="男" value="1" checked="">
                <input type="radio" name="teachersex" lay-skin="primary" title="女" value="2">
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="L_pass" class="layui-form-label">
                <span class="x-red">*</span>出生日期
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="teacherbirth" id="L_pass" placeholder="yyyy-MM-dd">
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择生成年月
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="teacherTel" class="layui-form-label">
                <span class="x-red">*</span>联系电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="teacherTel" name="teachertel" required="" lay-verify="phone"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <div class="layui-form-item">
            <label for="education" class="layui-form-label">
                <span class="x-red">*</span>学历
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="education" id="education">
                        <option value=" ">请选择</option>
                        <option value="1">大学本科</option>
                        <option value="2">硕士研究生</option>
                        <option value="3">博士研究生</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="degree" class="layui-form-label">
                <span class="x-red">*</span>学位
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="degree" id="degree">
                        <option value=" ">请选择</option>
                        <option value="1">学士</option>
                        <option value="2">硕士</option>
                        <option value="3">博士</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="positionalTitle" class="layui-form-label">
                <span class="x-red">*</span>职称
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="positionaltitle" id="positionalTitle">
                        <option value=" ">请选择</option>
                        <option value="1">助教</option>
                        <option value="2">讲师</option>
                        <option value="3">副教授</option>
                        <option value="4">教授</option>
                    </select>
                </div>
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="joinSchoolTime" class="layui-form-label">
                <span class="x-red">*</span>入校时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="joinSchoolTime" name="joinschooltime" placeholder="yyyy-MM-dd">
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择生成年月
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
        laydate.render({
            elem: '#joinSchoolTime' //指定元素
        });
    });

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
    })//end 照片上传
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

        //监听专业下拉框事件
        form.on('select(major)',function (data) {
            //获取专业的option对象
            var $option = $("select[name='majorid'] option:selected");
            //将学院名称设置到隐藏域中
            $("input[name='majorname']").val($option.text())
        })


        //监听提交
        form.on('submit(add)', function (data) {
            $.ajax({
                url:contextPath+"/teacherInfo/addTeacherInfo.action",
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
