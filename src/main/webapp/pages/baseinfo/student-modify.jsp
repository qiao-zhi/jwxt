<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改学生信息</title>
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

        <div class="layui-form-item">
            <label for="clazzName" class="layui-form-label">
                所属班级
            </label>
            <div class="layui-input-inline"><!--带搜索的查询 -->
                <select name="classid" id="clazzName">
                </select>
            </div>
        </div>
        <!--1-->
        <div class="layui-form-item">
            <label for="studentNum" class="layui-form-label">
                学号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="studentNum" name="studentnum"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <%--隐藏学院名称--%>
        <input type="hidden" name="studentid" value=""/>

        <!--2-->
        <div class="layui-form-item">
            <label for="studentName" class="layui-form-label">
                姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="studentName" name="studentname"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="studentsex" lay-skin="primary" title="男" value="1" checked>
                <input type="radio" name="studentsex" lay-skin="primary" title="女" value="2">
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="L_pass" class="layui-form-label">
                出生日期
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="L_pass" name="studentbirth" placeholder="yyyy-MM-dd">
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择生成年月
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="IDnum" class="layui-form-label">
                身份证号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="IDnum" name="idnum" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--6-->
        <div class="layui-form-item">
            <label for="Lpass" class="layui-form-label">
                入学时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="Lpass" name="enrollmenttime" placeholder="yyyy-MM-dd">
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择入学时间
            </div>
        </div>
        <!--6-->
        <div class="layui-form-item">
            <label class="layui-form-label">是否毕业</label>
            <div class="layui-input-block">
                <input type="radio" name="isgraduate" lay-skin="primary" title="是" value="1" checked>
                <input type="radio" name="isgraduate" lay-skin="primary" title="否" value="2">
            </div>
        </div>
        <!--6-->
        <div class="layui-form-item">
            <label for="Lipass" class="layui-form-label">
                毕业时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="Lipass" name="endtime" placeholder="yyyy-MM-dd">
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择毕业时间
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button  class="layui-btn" lay-filter="save" lay-submit="">
                保存
            </button>
        </div>
    </form>
</div>
<script>
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
        laydate.render({
            elem: '#Lpass' //指定元素
        });
        laydate.render({
            elem: '#Lipass' //指定元素
        });
    })
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
    //根据学生ID查询学生信息
    function getStudentBaseInfo(studentbaseid,form){
        $.ajax({
            url : contextPath+'/studentInfo/getStudentInfo.action',
            data :{"studentId":studentbaseid},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='studentid']").val(response.studentid);
                $("input[name='studentnum']").val(response.studentnum);
                $("input[name='studentname']").val(response.studentname);
                $("select[name='classid']").val(response.classid);
                $("input[name='studentbirth']").val(response.studentbirth);
                $("input[name='idnum']").val(response.idnum);
                $("input[name='enrollmenttime']").val(response.enrollmenttime);
                $("input[name='endtime']").val(response.endtime);

                var $radioSex = $("input[name='studentsex']");
                $radioSex.each(function(){

                    var sex = $(this).val();
                    if(sex==response.studentsex){
                        $(this).prop("checked",true);
                        return false;
                    }
                })

                var $radioPos = $("input[name='isgraduate']");
                $radioPos.each(function(){

                    var pos = $(this).val();
                    if(pos==response.isgraduate){
                        $(this).prop("checked",true);
                        return false;
                    }
                })

                //更新渲染
                form.render('select');
                form.render('radio');
                // var date = response.academicYear.substring(0,4);
                //$("#y_year").val(date);
                // $("#end_year").val(parseInt(date)+1);
            }
        });
    }


    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
        //查询教师基本信息
        getStudentBaseInfo('${param.sId}',form);
        findClassNameAndIdForSelect(form);


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
        form.on('submit(save)', function (data) {$.ajax({
            url:contextPath+"/studentInfo/updateStudentInfo.action",
            data:data.field,
            type:"POST",
            datatype:"text",
            success:function(response){
                alert(response)
                if("修改成功！" == response){
                    //实现父页面的刷新
                    window.parent.location.reload();
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                }
            }
        })

            /*//发异步，把数据提交给
            layer.alert("增加成功", {icon: 6}, function () {
                // 获得frame索引
              var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
             parent.layer.close(index);
            });*/
            return false;
        });


    });
</script>
</body>

</html>