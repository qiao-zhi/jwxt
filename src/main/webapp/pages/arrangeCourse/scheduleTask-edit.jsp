<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <script>
        //全局变量
        //排课任务ID
        var arrangeTaskId_all  = '${param.arrangeTaskId}';
    </script>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
    <%--排课任务修改的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/scheduleTask-edit.js"></script>
</head>
<body>
<div class="x-body">
	
    <form class="layui-form ">
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                任务通知书
            </label>
            <div class="layui-input-inline">
                <select name="noticeBookId" lay-filter="noticeBook">
                </select>
            </div>
            <%--隐藏任务通知书名称--%>
            <input type="hidden" name="noticeBookName"/>
            <%--隐藏排课任务主键--%>
            <input type="hidden" name="arrangeTaskId"/>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              专业
            </label>
            <div class="layui-input-inline">
                <select name="majorId" lay-filter="major">
                </select>
                <%--隐藏专业名称--%>
                <input type="hidden" name="majorName"/>
            </div>
            
        </div>
         <div class="layui-form-item">
             <label for="" class="layui-form-label">
                 学年
             </label>
             <div class="layui-input-inline">
                 <input type="datetime" style="width: 100px;float: left" class="layui-input" id="y_year" placeholder="起始学年" lay-verify="required">
                 <div class="layui-form-mid" style="margin-left: 10px">-</div>
                 <input type="datetime"  style="width: 100px;" class="layui-input" id="end_year" readonly placeholder="结束学年" >
                 <!--隐藏学年-->
                 <input type="hidden" name="academicYear" />
             </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              学期
            </label>
            <div class="layui-input-inline">
                <select name="term">
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                创建人
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="originatorName" required=""  lay-verify="required"
                    readonly  autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                接收人
            </label>
            <div class="layui-input-inline">
                <input type="text" id="" name="taskReceiptName" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
                <%--隐藏接收人ID--%>
                <input type="hidden"  name="taskReceiptId"/>
            </div>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                创建时间
            </label>
            <div class="layui-input-inline">
                <input id="nowTime" class="layui-input" name="taskCreateTime" lay-verify="required" />
            </div>
        </div>

        <!--5-->
        <div class="layui-form-item">
              <!--<label for="L_repass" class="layui-form-label">
              </label>-->
              <button class="layui-btn" lay-filter="update" lay-submit="" style="margin-left: 275px;">
                  确认修改
              </button>
        </div>
        <!---->
    </form>
</div>

</body>

</html>