<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改班级</title>
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
        <!--1-->
        <div class="layui-form-item">
            <label for="classID" class="layui-form-label">
                班级编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="classID" name="classnum" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <%--隐藏学院名称--%>
        <input type="hidden" name="classid" value=""/>

        <!--2-->
        <div class="layui-form-item">
            <label for="className" class="layui-form-label">
                班级名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="className" name="classname" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="majorName" class="layui-form-label">
                所属专业
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select  lay-search="" name="majorid" id="majorName">
                    <option value=" ">请选择</option>
                    <option value="1">软件工程</option>
                    <option value="2">网络工程</option>
                    <option value="3">物联网</option>
                    <option value="4">计算机</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="trainingSchemeID" class="layui-form-label">
                培养方案编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="trainingSchemeID" name="trainingschemeid"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="Lpass" class="layui-form-label">
                年级
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select  lay-search="" name="grade" id="Lpass">
                    <option value=" ">请选择</option>
                    <option value="2014">2014</option>
                    <option value="2015">2015</option>
                    <option value="2016">2016</option>
                    <option value="2017">2017</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">
            </label>
            <button  class="layui-btn" lay-filter="save" lay-submit="">
                保存
            </button>
        </div>
    </form>
</div>
<script>
    //入学时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });
</script>
<script>
    //根据教师ID查询班级信息
    function getClassBaseInfo(classbaseid,form){
        $.ajax({
            url : contextPath+'/classInfo/getClassInfo.action',
            data :{"classId":classbaseid},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='classid']").val(response.classID);
                $("input[name='classnum']").val(response.classNum);
                $("input[name='classname']").val(response.classname);
                $("select[name='majorid']").val(response.majorid);
                $("input[name='trainingschemeid']").val(response.trainingschemeid);
                $("select[name='grade']").val(response.grade);

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
        getClassBaseInfo('${param.cId}',form);
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

        //监听提交
        form.on('submit(save)', function (data) {$.ajax({
            url:contextPath+"/classInfo/updateClassInfo.action",
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
