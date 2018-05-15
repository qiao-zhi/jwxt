<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/15
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改学院</title>
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
        <div class="layui-form-item" style="display:none">
            <label for="upCollegeNum" class="layui-form-label">
                上级学院编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="upCollegeNum" name="upcollegenum"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--1-->
        <div class="layui-form-item">
            <label for="collegeNum" class="layui-form-label">
                学院编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="collegeNum" name="collegenum"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--隐藏教师id--%>
        <input type="hidden" name="collegeid" value=""/>
        <!--2-->
        <div class="layui-form-item">
            <label for="collegeName" class="layui-form-label">
                学院名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="collegeName" name="collegename"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2-1-->
        <div class="layui-form-item">
            <label for="collegePresident" class="layui-form-label">
                院长
            </label>
            <div class="layui-input-inline">
                <select name="teacherid" id="collegePresident" >

                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2-2-->
        <div class="layui-form-item">
            <label for="collegePresidentF" class="layui-form-label">
                副院长
            </label>
            <div class="layui-input-inline">
                <select name="teacherid" id="collegePresidentF" >

                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="collegeShortName" class="layui-form-label">
                简称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="collegeShortName" name="collegeshortname" required=""
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label class="layui-form-label">学院简介</label>
            <div class="layui-input-inline">
                <textarea placeholder="请输入内容" id="collegeIntroduction" name="collegeintroduction"  class="layui-textarea" autocomplete="off"></textarea>
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
    //根据教师ID查询教师信息
    function getCollegeBaseInfo(collegebaseid,form){
        $.ajax({
            url : contextPath+'/collegeInfo/getCollegeInfo.action',
            data :{"collegeId":collegebaseid},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='collegeid']").val(response.collegeid);
                $("input[name='collegenum']").val(response.collegenum);
                $("input[name='collegename']").val(response.collegename);
                $("input[name='collegeshortname']").val(response.collegeshortname);
                $("input[name='collegeintroduction']").val(response.collegeintroduction);
                $("select[name='collegepresident']").val(response.collegepresident);
                $("select[name='collegepresidentf']").val(response.collegepresidentf);
                $("input[name='upcollegenum']").val(response.upcollegenum);//最好改成上级学院名称


                //更新渲染
                form.render('select');
            }
        });
    }


    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
        //初始化教师（院长副院长下拉框;
        findTeacherNameAndIdForSelect(form);
        //查询学院基本信息
        getCollegeBaseInfo('${param.cId}',form);


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
            url:contextPath+"/collegeInfo/updateCollegeInfo.action",
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
