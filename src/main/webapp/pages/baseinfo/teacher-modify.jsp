<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改教师</title>
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

        <%--隐藏教师id--%>
        <input type="hidden" name="teacherid" value=""/>

        <!--2-->
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
            <label for="L_email" class="layui-form-label">
                <span class="x-red">*</span>专业
            </label>
            <div class="layui-input-inline">
                <select name="majorid" id="L_email" lay-filter="major">
                </select>
            </div>
        </div>


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
                <input type="radio" name="teachersex" lay-skin="primary" title="男" value="1" >
                <input type="radio" name="teachersex" lay-skin="primary" value="2" title="女">
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
                        <option value="0">学士</option>
                        <option value="1">硕士</option>
                        <option value="2">博士</option>
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
                        <option value="0">助教</option>
                        <option value="1">讲师</option>
                        <option value="2">副教授</option>
                        <option value="3">教授</option>
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
            <label class="layui-form-label"><span class="x-red">*</span>是否在职</label>
            <div class="layui-input-block">
                <input type="radio" name="inposition" lay-skin="primary" title="是" value="1">
                <input type="radio" name="inposition" lay-skin="primary" title="否" value="0">
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
    //根据教师ID查询教师信息
    function getTeacherBaseInfo(teacherbaseid,form){
        $.ajax({
            url : contextPath+'/teacherInfo/getTeacherInfo.action',
            data :{"teacherId":teacherbaseid},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("select[name='degree']").val(response.degree);
                $("input[name='teacherid']").val(response.teacherid);
                $("input[name='teachernum']").val(response.teachernum);
                $("input[name='teachername']").val(response.teachername);
                $("select[name='teacherposition']").val(response.teacherposition);
                $("select[name='majorid']").val(response.majorid);
                $("select[name='teachername']").val(response.teachername);
                $("input[name='teacherbirth']").val(response.teacherbirth);
                $("input[name='teachertel']").val(response.teachertel);
                $("select[name='education']").val(response.education);

                $("select[name='positionaltitle']").val(response.positionaltitle);
                $("input[name='joinschooltime']").val(response.joinschooltime);
                var $radioSex = $("input[name='teachersex']");
                $radioSex.each(function(){

                    var sex = $(this).val();
                    if(sex==response.teachersex){
                        $(this).prop("checked",true);
                        return false;
                    }
                })
                var $radioPos = $("input[name='inposition']");
                $radioPos.each(function(){

                    var pos = $(this).val();
                    if(pos==response.inposition){
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
        findMajorNameAndIdForSelect(form);
        getTeacherBaseInfo('${param.tId}',form);



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
            url:contextPath+"/teacherInfo/updateTeacherInfo.action",
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
            return false;
        });


    });
</script>
</body>

</html>
