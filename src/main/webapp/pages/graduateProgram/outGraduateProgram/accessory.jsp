<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrapFileinput/css/default.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrapFileinput/css/fileinput.css">
    <%--<script type="text/javascript" src="../../../js/jquery.min.js"></script>--%>
    <script type="text/javascript" src="${baseurl}/lib/bootstrapFileinput/jquery1.11.o.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
    <script src="${baseurl}/lib/bootstrapFileinput/js/fileinput.js" type="text/javascript"></script>
    <!--简体中文-->
    <script src="${baseurl}/lib/bootstrapFileinput/js/locales/zh.js" type="text/javascript"></script>
    <!--繁体中文-->
    <script src="${baseurl}/lib/bootstrapFileinput/js/locales/zh-TW.js" type="text/javascript"></script>
    <script src="${baseurl}/lib/bootstrapFileinput/js/bootstrap.min.js" type="text/javascript"></script>

    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>


    <%--s      bzy--%>

    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/attachment.js"></script>
    <%--e      bzy--%>


</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn hidden1 saveAndCommit" onclick="basicSave()" type="button" style="display: none">保存</button>
    <button class="btn-primary btn hidden1 saveAndCommit" onclick="basicCommit()" type="button" style="display: none">提交</button>

    <form action="" class="layui-form">
        <table class="table table-bordered ">
            <caption style="text-align: center;">
                <p id="promt_p" style="color: red;">
                    <span><font>已提交，无法修改。</font></span>
                </p>
                <h1>附件上传</h1>
            </caption>
            <tbody>
            <tr>
                <td>
                    <div class="layui-form-item" id="head">
                        <div class="layui-inline">
                            <label>附件类型：</label>
                            <input type="text" class="form-control" id="types" readonly>
                        </div>
                    </div>

                    <form enctype="multipart/form-data">
                        <hr>
                        <div id="input_div" style="display: none">
                            <input id="bootUpMultiple" class="file" multiple type="file"  name="file">
                        </div>
                        <hr>
                    </form>
                </td>
            </tr>

            <tr>
                <td colspan="6">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <div class="upload-img-box" id="td-content">


                                <%--<dd class="upload-icon-img">
                                    <div class="upload-pre-item" id="contentNum">
                                        <button onclick="deleteImg($(this))" class="layui-btn">
                                            <i class="layui-icon" ></i>
                                        </button>
                                        <img src="test.png" width="600px" height="800px"  >
                                    </div>
                                </dd>
                                <hr/>
                                <dd class="upload-icon-img" >
                                    <div class="upload-pre-item">
                                        <button onclick="deleteImg($(this))" class="layui-btn">
                                            <i    class="layui-icon" ></i>
                                        </button>
                                        <img src="">
                                    </div>
                                </dd>
                                <hr/>

                                <dd class="upload-icon-img" >
                                    <div class="upload-pre-item">
                                        <button onclick="deleteImg($(this))" class="layui-btn">
                                            <i    class="layui-icon" ></i>
                                        </button>
                                        <img src="">
                                    </div>
                                </dd>
                                <hr/>--%>

                                <%--<dd class="upload-icon-img" >
                                    <div class="upload-pre-item">
                                        <button onclick="deleteImg($(this))" class="layui-btn">
                                            <i    class="layui-icon" ></i>
                                        </button>
                                        <img src="">
                                    </div>
                                </dd>--%>
                            </div>
                        </div>
                    </div>
                </td>

            </tr>

            </tbody>
        </table>
    </form>
</div>
<script>
    //保存
    function basicSave() {
        var attachmentID = getAddressParameter("id");
        //获取当前文件类型的值
        var contentType = $("#types").val();
        $.ajax({
            url:contextPath+"/outGraduateDesiner/saveOGDAttachment.do",
            type:"post",
            data:{"attachmentID":attachmentID,"contentType":contentType},
            dataType:"text",
            success:function(result){
                layer.msg(result);
            },
            error:function () {
                alert("保存出错！！！");
                x_admin_close();
            }
        });
    }
    //提交
    function basicCommit() {
        var attachmentID = getAddressParameter("id");
        //获取当前文件类型的值
        var contentType = $("#types").val();
        $.ajax({
            url:contextPath+"/outGraduateDesiner/commitOGDAttachment.do",
            type:"post",
            data:{"attachmentID":attachmentID,"contentType":contentType},
            dataType:"text",
            success:function(result){
                layer.msg(result);
                window.parent.loadFile("${id}");
            },
            error:function () {
                alert("提交失败！！！");
                x_admin_close();
            }
        });
    }


    //利用插件异步上传多文件

    $("#bootUpMultiple").fileinput({
        language: 'zh',//中文
        uploadUrl: contextPath + "/oGDAttachment/uploadFile.do",//上传的地址，加上这个才会出现删除按钮
        dropZoneEnabled: false,//是否显示拖拽区域
        showUpload: true, //是否显示上传按钮,跟随文本框的那个
        showRemove: true, //显示移除按钮,跟随文本框的那个
        showCaption: true,//是否显示标题,就是那个文本框
        uploadAsync: true,
        enctype: 'multipart/form-data',

        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
        uploadExtraData: function (previewId, index) {  //携带其他一些数据的格式
            var id = getAddressParameter("id");
            var data = {
                attachmentID: id,
                index:previewId,
            };
            return data;
        },

        validateInitialCount: true,                        //
        allowedFileExtensions: ['jpg', 'png', 'gif'],   //允许上传文件的后缀
    }).on('filepreupload', function (event, data, previewId, index) {
        var form = data.form, files = data.files, extra = data.extra,
            response = data.response, reader = data.reader;
    }).on("fileuploaded", function (event, data) {//上传成功之后的一些处理

    });
    /*E           开始使用插件的上传功能*/
</script>
</body>

</html>