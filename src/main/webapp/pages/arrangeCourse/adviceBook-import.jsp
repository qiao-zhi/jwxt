<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
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
</head>

<body>

<!--主体-->
<div class="x-body">

    <div class="layui-form-item">
        <label for="" class="layui-form-label">
            通知书名称
        </label>
        <div class="layui-input-inline">
            <input type="text" value="${param.noticeBookName}" readonly required="" lay-verify="required"
                   autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label for="" class="layui-form-label">
            通知书附件
        </label>
        <div class="layui-input-inline">
            <input  id="uploadNoticeMaterial" required="" lay-verify="required"
                   autocomplete="off" class="layui-input">
            <%--隐藏索引--%>
            <input type="hidden" id="hidden_index"/>
        </div>
        <div class="layui-form-mid layui-word-aux">
            <span class="x-red">*</span>必须选择
        </div>
    </div>

    <div class="layui-form-item">
        <label for="" class="layui-form-label">
        </label>
        <button type="button" class="layui-btn" id="uploadNoticeFile">上传文件</button>
    </div>
</div>

<script>

    layui.use('upload', function(){
		  var upload = layui.upload;

        //选完文件后不自动上传
        upload.render({
            elem: '#uploadNoticeMaterial',//对哪个元素进性格式化选择文件
            url: contextPath+'/arrangeCourse/addDetailInfoList.action',//上传的url
            auto: false,//是否自动上传
            accept: 'file', //普通文件,
            multiple:false,//支持多文件上传
            exts: 'xls', //只允许上传xls文件
            //filed:"noticeBookFile",//设定文件域的字段名
            bindAction: '#uploadNoticeFile',//绑定到哪个按钮进行提交(提交按钮进行提交)
            data:{//另外携带的数据
                noticeBookId: '${param.noticeBookId}',//携带通知书编号
            },
            choose:function (obj,file) {//选中文件执行的操作
                //将每次选择的文件追加到文件队列
                // var files = obj.pushFile();//会导致传一个文件多次选择传多个文件(不可以用)
                var file = this.files ; //获取到选择的文件
                obj.preview(function(index, file, result){
                    // alert(file.name+file.size)//获取文件的名字和大小
                    $("#uploadNoticeMaterial").val(file.name+"("+(file.size/1024)+"kb)")
                });
            },
            before:function (obj) {//文件上传前
                $("#uploadNoticeFile").addClass("layui-btn-disabled");//设置按钮不可以点击(增加layui的禁用按钮属性)
                var index = layer.load(); //开始上传之后打开load层
                $("#hidden_index").val(index);//隐藏到页面中
            },
            done: function(res, index, upload){//请求成功的回调，第一个参数代表返回的信息。必须是JSON格式的对象
                //如果你想关闭最新弹出的层，直接获取layer.index即可
                //layer.close(layer.index); //它获取的始终是最新弹出的某个层，值是由layer内部动态递增计算的
               if(res !=null && res.success==true){//上传成功
                    layer.msg(res.msg,{time: 2000},function () {//弹出消息三秒后关闭当前iframe
                        layer.close($("#hidden_index").val());//成功之后获取页面隐藏的load层并且关闭
                        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index); //再执行关闭
                        //实现父页面的刷新
                        window.parent.location.reload();
                    });
                }
            }
        });
    });

</script>

</body>

</html>