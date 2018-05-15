<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改专业</title>
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
            <label for="collegeName" class="layui-form-label">
                学院名称
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="collegeid" id="collegeName">
                    </select>
                </div>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--1-->
        <div class="layui-form-item">
            <label for="majorNum" class="layui-form-label">
                专业代码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorNum" name="majornum" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--2-->
        <div class="layui-form-item">
            <label for="majorName" class="layui-form-label">
                专业名称
            </label>
            <div class="layui-input-inline">
                <select name="majorid" id="majorName" lay-filter="major">
                    <option value=" ">请选择</option>
                    <option value="1">软件工程</option>
                    <option value="2">网络工程</option>
                    <option value="3">物联网</option>
                    <option value="4">计算机</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <%--隐藏学院名称--%>
        <input type="hidden" name="majorid" value=""/>

        <!--3-->
        <div class="layui-form-item">
            <label for="phone" class="layui-form-label">
                专业门类
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="majorsort" id="phone">
                        <option value="">学科门类</option>
                        <option value="1">工学</option>
                        <option value="2">理科</option>
                        <option value="3">文科</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="majorShortName" class="layui-form-label">
                专业简称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorShortName" name="majorshortname"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="majorManager" class="layui-form-label">
                专业负责人
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorManager" name="majormanager"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
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
    });
</script>
<script>
    //根据专业ID查询专业信息
    function getMajorBaseInfo(majorbaseid,form){
        $.ajax({
            url : contextPath+'/majorInfo/getMajorInfo.action',
            data :{"majorId":majorbaseid},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='majorid']").val(response.majorid);
                $("input[name='majornum']").val(response.majornum);
                $("input[name='majorname']").val(response.majorname);
                $("input[name='majorshortname']").val(response.majorshortname);
                $("select[name='majorsort']").val(response.majorsort);
                $("input[name='majormanager']").val(response.majormanager);
                $("select[name='collegeid']").val(response.collegeid);

                //更新渲染
                form.render('select');
                //form.render('radio');
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
        getMajorBaseInfo('${param.mId}',form);
        findCollegeNameAndIdForSelect(form);


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
            url:contextPath+"/majorInfo/updateMajorInfo.action",
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
