<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@include file="/tag.jsp"%>
<html>

<head>
    <meta charset="UTF-8">
    <title>培养方案详情</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/css/xadmin.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
    <!--漂浮导航-->
    <script src="${baseurl}/js/demo.js"></script>


    <!--S   QLQ引入的JS-->
    <script type="text/javascript" src="${baseurl}/js/trainScheme/trainScheme-view.js"></script>
    <!--E   QLQ引入的JS-->


    <style>
        /*漂浮导航*/
        .box { position:fixed; top:350px; left:870px; min-width:240px; min-height:200px; border:1px solid #ccc; background:#fff; }
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

        /*编辑器*/
        .layui-layedit-tool {
            padding: 0px 5px;
        }
        .layui-layedit-tool .layui-icon {
            font-size: 13px !important;
        }

    </style>
    <!--编辑器-->
    <script>
        layui.use('layedit', function () {
            var layedit = layui.layedit;
            layedit.build('demo');
            layedit.build('demo2');
            layedit.build('demo3');
        });
    </script>
</head>

<body>
<div class="x-body">
    <%--隐藏一个培养方案编号--%>
    <input type="hidden" id="hidden_trainSchemeId" value="${trainSchemeId}">

    <form class="layui-form-pane" action="">

        <!--培养方案的基本信息-->
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="zero">基本信息</a></legend>
        </fieldset>
        <table class="layui-table">
            <thead>
                <tr>
                    <th>培养方案名称</th>
                    <th>专业名称</th>
                    <th>专业代码</th>
                    <th>学科门类</th>
                    <th>专业负责人</th>
                    <th>修订人</th>
                    <th>修订时间</th>
                </tr>
            </thead>
            <tbody id="trainSchemeBaseInfoTbody">
            <!--动态填充数据-->
                <%--<tr>
                    <th>培养方案名称</th>
                    <th>专业名称</th>
                    <th>专业代码</th>
                    <th>专科学科</th>
                    <th>专业负责人</th>
                    <th>修订人</th>
                    <th>修订时间</th>
                </tr>--%>
            </tbody>
        </table>


        <br/>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="one">培养目标</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">1、培养目标</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="trainingtarget" ></textarea>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="two">培养要求</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">2、培养要求</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="trainingrequire"></textarea>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="three">毕业生能力</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">3、毕业生能力</label>
            <div id="capacityDiv" style="display: none;">
                <%--能力是一个表格--%>
                <table class="layui-table">
                    <colgroup>
                        <col width="10%">
                        <col width="90%">
                    </colgroup>
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>能力描述</th>
                    </tr>
                    </thead>
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
            <div id="capacityProptDiv" style="display: none">
                <center>
                    <br/>
                    <p><span style="font-size: 20px;color: red;">您还没有添加培养能力，请先添加培养方案能力</span></p>
                </center>
            </div>

        </div>

        <br/>
        <br/>
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="four">修业年限</a></legend>
        </fieldset>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                4、修业年限
            </label>
            <div class="layui-input-inline">
                <input type="text" name="trainyears" required="" lay-verify="email"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                5、授予学位
            </label>
            <div class="layui-input-inline">
                <input type="text" name="traindegree" required="" lay-verify="email"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="classNam2到e" class="layui-form-label">
                6、主干学科
            </label>
            <div class="layui-input-inline">
                <input type="text" name="maincourse" required="" lay-verify="email"
                       autocomplete="off" class="layui-input">
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="seven">核心课程</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">7、核心课程</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="corecourse"></textarea>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="eight">专业特色</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">8、专业特色</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="majorfeature"></textarea>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="nine">主要实践性教学环节</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">9、主要实践性教学环节</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="maintestitem"></textarea>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="ten">主要专业实验</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">10、主要专业实验</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="mainmajorexperience"></textarea>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="eleven">毕业总学分及总学时基本要求与分配</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">11、毕业总学分及总学时基本要求与分配 </label>
            <div class="layui-input-block">
                <table class="layui-table">
                    <thead>
                        <tr>
                            <th>课程类别</th>
                            <th>课程性质</th>
                            <th>学分</th>
                            <th>占总学分比例</th>
                            <th>学时</th>
                            <th>占总学时比例</th>
                        </tr>
                    </thead>
                    <tbody id="11Tbody">
                        <%--动态填充数据--%>
                    </tbody>
                </table>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="twelve">主要课程关系结构图</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">12、主要课程关系结构图</label>
            <div class="layui-input-block">
                <!--预留一个预览的img标签-->
                <div id="imgDiv" style="display: none;margin-top: 10px;text-align: center">
                    <img id="imgPreview" width="80%" height="40%">
                </div>
                <div id="promptDiv" style="margin-top: 10px;display: none;text-align: center;color:red;">
                    <p><font style="font-size: 30px">您还没有上传课程关系结构图，请先上传课程关系结构图!</font></p>
                </div>
            </div>
        </div>
        <br/><br/><br/>


        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="thirteen">毕业总学分及总学时基本要求与分配</a></legend>
        </fieldset>
        <div class="layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">13、课程与毕业生能力要求的对应关系 </label>
            <div>
                <table class="layui-table">
                    <caption>毕业生能力要求的对应关系表</caption>
                    <thead>
                        <tr id="courseCapacityThead">
                            <th>序号</th>
                            <th>课程或环节</th>
                            <%--<th>G1</th>
                            <th>G2</th>--%>
                            <%--动态往这里填充表格--%>
                        </tr>
                    </thead>
                    <tbody id="courseCapacityTbody">
                        <%--动态往这里填充数据--%>
                    </tbody>
                </table>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="fourteen">毕业总学分及总学时基本要求与分配</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">14、指导性教学计划 </label>
            <div class="layui-input-block">
                <h2 style="font-size:20px;font-weight:bolder" align="center">软件工程专业指导性教学计划</h2>
                <br><br>
                <h2 style="font-size:18px;font-weight:bolder" align="center">（一）必修课程设置及进程表</h2>
                <table class="layui-table" id="BXTable">
                    <thead>
                            <tr>
                                <td rowspan="2">课程平台</td>
                                <td rowspan="2">课程编号</td>
                                <td rowspan="2">课程名称</td>
                                <td rowspan="2">学分</td>
                                <td rowspan="2">学时</td>
                                <td colspan="3">学时分配</td>
                                <td colspan="8">各学期周学时分配</td>
                                <td rowspan="2">记分方式</td>
                            </tr>
                            <tr>
                                <td>讲课</td>
                                <td>实验</td>
                                <td>上机</td>
                                <td>一</td>
                                <td>二</td>
                                <td>三</td>
                                <td>四</td>
                                <td>五</td>
                                <td>六</td>
                                <td>七</td>
                                <td>八</td>
                            </tr>
                    </thead>
                    <tbody id="BXTbody">
                        <%--动态填充数据--%>
                    </tbody>
                </table>

                <br><br>

                <h2 style="font-size:18px;font-weight:bolder" align="center">（二）选修课程设置及进程表</h2>
                <table class="layui-table" id="XXTable">
                    <thead>
                        <tr>
                            <td rowspan="2">课程平台</td>
                            <td rowspan="2">课程编号</td>
                            <td rowspan="2">课程名称</td>
                            <td rowspan="2">学分</td>
                            <td rowspan="2">学时</td>
                            <td colspan="3">学时分配</td>
                            <td colspan="8">各学期周学时分配</td>
                            <td rowspan="2">记分方式</td>
                        </tr>
                        <tr>
                            <td>讲课</td>
                            <td>实验</td>
                            <td>上机</td>
                            <td>一</td>
                            <td>二</td>
                            <td>三</td>
                            <td>四</td>
                            <td>五</td>
                            <td>六</td>
                            <td>七</td>
                            <td>八</td>
                        </tr>
                    </thead>
                    <tbody id="XXTbody">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <br/><br/>

                <h2 style="font-size:18px;font-weight:bolder" align="center">（三）实践性教学环节及进程表</h2>
                <table class="layui-table">
                    <thead>
                        <tr>
                            <td rowspan="2">课程平台</td>
                            <td rowspan="2">课程编号</td>
                            <td rowspan="2">课程名称</td>
                            <td rowspan="2">学分</td>
                            <td rowspan="2">周数/学时</td>
                            <td rowspan="2">上机</td>
                            <td colspan="8">各学期周学时分配</td>
                            <td rowspan="2">记分方式</td>
                        </tr>
                        <tr>
                            <td>一</td>
                            <td>二</td>
                            <td>三</td>
                            <td>四</td>
                            <td>五</td>
                            <td>六</td>
                            <td>七</td>
                            <td>八</td>
                        </tr>
                    </thead>
                    <tbody id="nouseTbody">
                    <%--动态往这里写数据--%>
                    </tbody>
                </table>
            </div>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="fifteen">每学期教学安排一览表</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">15、每学期教学安排一览表（不含通识选修课）</label>
            <div class="layui-input-block">
                <%--第一个学期表格--%>
                <table class="layui-table" id="semestertable1">
                    <caption>(一)第一学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester1th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第二个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable2">
                    <caption>(二)第二学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester2th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第三个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable3">
                    <caption>(三)第三学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester3th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第四个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable4">
                    <caption>(四)第四学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester4th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第五个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable5">
                    <caption>(五)第五学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester5th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第六个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable6">
                    <caption>(六)第六学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester6th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第7个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable7">
                    <caption>(七)第七学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester7th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>

                <%--第8个学期表格--%>
                <br>
                <table class="layui-table" id="semestertable8">
                    <caption>(八)第八学期统计信息</caption>
                    <thead>
                    <tr>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">课内周学时</td>
                        <td rowspan="2">记分方式</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    </thead>
                    <tbody class="semester8th">
                    <%--动态填充数据--%>
                    </tbody>
                </table>
            </div>
        </div>

       <%-- <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend><a name="sixteen">课程分类及学分比例</a></legend>
        </fieldset>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label" style="font-weight: bolder">16 课程分类及学分比例（工科专业填写）</label>
            <div class="layui-input-block">
                <table class="layui-table">
                    <tr>
                        <td rowspan="2">课程类别</td>
                        <td rowspan="2">课程编号</td>
                        <td rowspan="2">课程名称</td>
                        <td rowspan="2">学分</td>
                        <td rowspan="2">学时</td>
                        <td colspan="4">学时分配</td>
                        <td rowspan="2">周学时</td>
                        <td rowspan="2">记分方式</td>
                        <td rowspan="2">学期</td>
                        <td rowspan="2">占总学分比例%</td>
                    </tr>
                    <tr>
                        <td>讲课</td>
                        <td>实验</td>
                        <td>上机</td>
                        <td>实践</td>
                    </tr>
                    <tr>
                        <td rowspan="6">数学及自然科学类</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td rowspan="6"></td>
                    </tr>
                </table>
            </div>
        </div>--%>
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
                <li><a href="#seven" class="">核心课程</a></li>
                <li><a href="#eight" class="">专业特色</a></li>
                <li><a href="#nine" class="">主要实践性教学环节</a></li>
                <li><a href="#ten" class="">主要专业实验</a></li>
                <li><a href="#eleven" class="">毕业总学分及总学时基本要求与分配</a></li>
                <li><a href="#twelve" class="">主要课程关系结构图</a></li>
                <li><a href="#thirteen" class="">毕业总学分及总学时基本要求与分配</a></li>
                <li><a href="#fourteen" class="">指导性教学计划</a></li>
                <li><a href="#fifteen" class="">每学期教学安排一览表</a></li>
                <li><a href="#sixteen" class="">课程分类及学分比例</a></li>
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

</body>

</html>