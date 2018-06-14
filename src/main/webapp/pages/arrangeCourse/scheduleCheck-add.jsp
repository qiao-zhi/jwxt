<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>审核排课情况</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <style>
    	.layui-table th:nth-child(2n){
    		background-color: rgb(255,255,255);
    		bottom: 0.4px;
    		border-bottom-width: 1.66px;
    		border-right-width: 1.66px;
    	}
    </style>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>

</head>

<body>
<div class="x-body">
	
	 <!--<h4 style="text-align: center; font-size: 14px;">计算机学院&nbsp;&nbsp;软件工程专业&nbsp;&nbsp;2016/2017学年&nbsp;&nbsp;第2学期 &nbsp;&nbsp;排课计划表</h4><br />-->
	
    <form class="layui-form">
    	<div class="layui-form-item" >
            <label for="" class="layui-form-label">
              审核人
            </label>
            <div class="layui-input-inline">
                 <input type="text" name="auditorName" required  lay-verify="required" class="layui-input" value="${userinfo.username}" readonly>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
            <%--隐藏审核人ID--%>
            <input type="hidden" value="${userinfo.usercode}" name="auditorId"/>
            <%--隐藏排课任务ID--%>
            <input type="hidden" value="${param.arrangeTaskId}" name="arrangeTaskId"/>
        </div>
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
              审核时间
            </label>
            <div class="layui-input-inline">
                 <input type="text" id="nowTime" name="auditTime" readonly  lay-verify="required" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
              审核结果
            </label>
            <div class="layui-input-inline">
                <select name="auditResult" lay-verify=""  lay-filter="selectTeacher" >
				  <option value="1">审核通过</option>
                  <option value="0">审核不通过</option>
				</select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
         
        
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              审核意见
            </label>
            <div class="layui-input-inline">
                <textarea name="auditSuggestion" required lay-verify="required" placeholder="请输入审核意见" class="layui-textarea"></textarea>
				 
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--4-->
        
        <!---->
        <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button class="layui-btn" lay-filter="check" lay-submit="">
                  确认审核
              </button>
        </div>
        <!---->
    </form>
</div>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form;
        getNowTime();
        //监听提交
        form.on('submit(check)', function (data) {
            $.ajax({
                url:contextPath+"/arrangeCourse/addArrangeCourseAuditInfo.action",
                data:data.field,
                type:"POST",
                dataType:"text",
                success:function(response){
                    layer.alert(response, {icon: 6}, function () {
                        //实现父页面的刷新
                        window.parent.location.reload();
                    });
                }
            })
            return false;
        });
    });

</script>

</body>

</html>