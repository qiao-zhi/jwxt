<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>审核排课情况</title>
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
<div class="x-body">

    <form class="layui-form">
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
                审核人
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="auditorName" lay-verify="required" class="layui-input"  readonly>
            </div>
        </div>
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
                审核时间
            </label>
            <div class="layui-input-inline">
                <input type="text"  readonly name="auditTime" required  lay-verify="required"   class="layui-input" value="2018-03-28" >
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="auditResult" readonly  lay-verify="required" class="layui-input">
            </div>
        </div>


        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline">
                <textarea name="auditSuggestion" readonly required lay-verify="required" placeholder="请输入审核意见" class="layui-textarea"></textarea>
            </div>
        </div>
        <!--4-->

    </form>
</div>


<script>
    layui.use([], function () {
        getLastArrangeCourseAudit();
    });

    //根据通知书ID查询通知书信息
    function getLastArrangeCourseAudit(){
        $.ajax({
            url : contextPath+'/arrangeCourse/getLastArrangeCourseAudit.action',
            data :{"arrangeTaskId":"${param.arrangeTaskId}"},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='auditorName']").val(response.auditorName);
                $("input[name='auditTime']").val(response.auditTime);
                $("textarea[name='auditSuggestion']").val(response.auditSuggestion);
                $("input[name='auditResult']").val((response.auditResult>0?"审核通过":"审核不通过"));
            }
        });
    }
</script>

</body>

</html>