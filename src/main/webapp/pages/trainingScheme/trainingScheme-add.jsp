<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加培养方案基本信息</title>
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
    <!--漂浮导航-->
    <script src="../../js/demo.js"></script>


    <%--S   QLQ引入的--%>
    <script>

    </script>

    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>
    <%--增加培养方案的JS--%>
    <script type="text/javascript" src="../../js/trainScheme/trainScheme-add.js"></script>


    <%--E   QLQ引入的--%>

    <style>
        /*漂浮导航*/
        .box { position:fixed; top:150px; left:800px; min-width:240px; min-height:200px; border:1px solid #ccc; background:#fff; }
        .box .title { background:#ddd; height:35px; min-width:200px; cursor:move; }
        .box .close { border:1px solid #d08; color:#d08; display:block; width:18px; height:18px; line-height:20px; text-align:center; cursor:pointer; position:absolute; right:5px; top:5px; font-weight:bold; }
        .con { padding:20px; }
        .box .title .titleContent{
            line-height: 35px;
            padding-left: 30px;
            font-size: 16px;
        }
        .site-dir li{
            line-height: 26px;
            margin-left: 20px;
            overflow: visible;
            list-style-type: disc;
        }
        /*输入框的宽度为100%*/
        #graduateCapacityTbody input{
            width: 100%;
        }
    </style>
</head>

<body>
<div class="x-body">
    <form class="layui-form layui-form-pane" id="addTrainSchemeForm" action="">

        <%--隐藏将来使用的培养方案能力--%>
        <div id="hidden_capacity_div">
            <%--JS添加数据到这里--%>
        </div>


        <!--基本信息-->
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="zero">基本信息</a></legend>
        </fieldset>
        <!--1.培养方案名称-->
        <div class="layui-form-item">
            <label for="classID" class="layui-form-label">
                培养方案名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="classID" name="trainingschemaname" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="太原科技大学本科专业人才培养方案">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--2.专业名称-->
        <div class="layui-form-item">
            <label for="majorname" class="layui-form-label">
                专业名称
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <input type="hidden" name="majorname">
                <select lay-verify="required" lay-filter="majornameSelect" id="majorname">
                    <!--动态填充数据-->
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--2.专业代码-->
        <div class="layui-form-item">
            <label for="majorid" class="layui-form-label">
                专业代码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="majorid" name="majorid" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--3.学科门类-->
        <div class="layui-form-item">
            <label for="majortype" class="layui-form-label">
                学科门类
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-verify="required" name="majortype" id="majortype">
                    <option value="工学">工学</option><!--哲学、经济学、法学、教育学、文学、历史学、理学、工学、农学、医学、管理学-->
                    <option value="法学">法学</option>
                    <option value="农学">农学</option>
                    <option value="医学">医学</option>
                    <option value="经济学">经济学</option>
                    <option value="管理学">管理学</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--4.专业负责人-->
        <div class="layui-form-item">
            <label for="add_majormanager" class="layui-form-label">
                专业负责人
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_majormanager" name="majormanager" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--5.时间-->
        <div class="layui-form-item">
            <label for="L_pass" class="layui-form-label">
                时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="createtime" id="L_pass" placeholder="yyyy-MM-dd">
            </div>
            <div class="layui-form-mid layui-word-aux">
                请选择年月
            </div>
        </div>

        <br>
        <!--6.培养目标-->
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="one">培养目标</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">培养目标</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="trainingtarget"></textarea>
            </div>
        </div>

        <%--7.培养要求--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="two">培养要求</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">培养要求</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="trainingrequire"></textarea>
            </div>
        </div>

        <%--8.--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="three">毕业生能力</a> <i class="layui-icon" title="点击添加一行到表格中" onclick="addTr()">&#xe608;</i></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
           <table class="layui-table">
                <colgroup>
                    <col width="10%">
                    <col width="80%">
                    <col width="10%">
                </colgroup>
               <tbody id="graduateCapacityTbody">
               <%--毕业生能力表格，手动往这里添加--%>
                   <%--<tr>
                       <td>G1</td>
                       <td><input type="text"></td>
                       <td><a class="layui-icon" title="点击删除当前行数据" onclick="deleteTr(this)">&#xe640;</a></td>
                   </tr>--%>

               </tbody>
           </table>
        </div>


        <%--9.修业年限--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="four">修业年限</a></legend>
        </fieldset>
        <div class="layui-form-item">
            <label for="trainyears" class="layui-form-label">
                4、修业年限
            </label>
            <div class="layui-input-inline">
                <input type="text" id="trainyears" name="trainyears" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>


        <%--10授予学位--%>
        <div class="layui-form-item">
            <label for="traindegree" class="layui-form-label">
                5、授予学位
            </label>
            <div class="layui-input-inline">
                <input type="text" id="traindegree" name="traindegree" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <%--11.主干学科--%>
        <div class="layui-form-item">
            <label for="maincourse" class="layui-form-label">
                6、主干学科
            </label>
            <div class="layui-input-inline">
                <input type="text" id="maincourse" name="maincourse" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <%--12.核心课程--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="five">核心课程</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">7、核心课程</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" id="corecourse" name="corecourse"></textarea>
            </div>
        </div>

        <%--13.专业特色--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="six">专业特色</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">专业特色</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="majorfeature"></textarea>
            </div>
        </div>


        <%--14.主要实践性教学环节--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="seven">主要实践性教学环节</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">主要实践性教学环节</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="maintestitem"></textarea>
            </div>
        </div>


        <%--15.主要专业实验--%>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="eight">主要专业实验</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">主要专业实验</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="mainmajorexperience"></textarea>
            </div>
        </div>

       <%-- <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="nine">主要课程关系结构图</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">主要课程关系结构图</label>
            <div class="layui-input-block">
                <div class="layui-upload">
                    <button type="button" class="layui-btn" id="test1">上传图片</button>
                    <div class="layui-upload-list">
                        <img class="layui-upload-img" width="100" id="img1">
                        <p id="demoText"></p>
                    </div>
                </div>
            </div>
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
            })//end 照片上传
        </script>--%>
        <p></p>
        <p></p>
        <p></p>
        <%--保存和提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" type="button" onclick="saveTrainschemeInfo()">保存</button>
            <button class="layui-btn layui-btn-normal" lay-submit="" lay-filter="demo2">提交</button>
        </div>

    </form>

    <!--漂浮导航-->
    <div class="box">
        <div class="title"><span class="titleContent">目录</span>&nbsp;<span class="close">X</span></div>
        <div class="con layui-layer-content">
            <ul class="site-dir layui-layer-wrap" style="display: block;">
                <li><a href="#zero" class="">基本信息</a></li>
                <li><a href="#one" class="">培养目标</a></li>
                <li><a href="#two" class="">培养要求</a></li>
                <li><a href="#three" class="">毕业生能力</a></li>
                <li><a href="#four" class="">修业年限</a></li>
                <li><a href="#five" class="">核心课程</a></li>
                <li><a href="#six" class="">专业特色</a></li>
                <li><a href="#seven" class="">主要实践性教学环节</a></li>
                <li><a href="#eight" class="">主要专业实验</a></li>
                <li><a href="#nine" class="">主要课程关系结构图</a></li>
            </ul>
        </div>
    </div>

</div>
<script>
    //漂浮菜单
    $(document).ready(function() {
        $(".box").bg_move({
            move:'.title',
            closed:'.close',
            size : 6
        });
    });

    //出生年月
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

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
        form.on('submit(add)', function (data) {
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6}, function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
        });
    });
</script>


<!--隐藏一个打开的窗口的index，用于关闭-->
<input type="hidden" id="index_temp"/>


</body>

</html>