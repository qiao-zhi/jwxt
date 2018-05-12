<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>中期检查审核管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
</head>
<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="table table-bordered">
        <caption><h1>太原科技大学毕业设计（论文）中期检查表</h1></caption>
        <tbody>
        <tr>
            <td>学院（直属系）</td>
            <td></td>
            <td>教研室</td>
            <td></td>
        </tr>
        <tr>
            <td>指导教师</td>
            <td>${middleReportManage.leaderteacher}</td>
            <td>检查人</td>
            <td></td>
        </tr>
        <tr>
            <td>学生姓名</td>
            <td>${middleReportManage.studentname}</td>
            <td>学  号</td>
            <td>${middleReportManage.studentnum}</td>
        </tr>
        <input type="hidden" id="cenArrangeInfoId" value="${middleReportManage.cenArrangeInfoId}"/>
        <tr>
            <td colspan="4">
                工作进度情况（对照学生的计划进程表和任务书）：<br/>
                <textarea class="layui-textarea" name="wordProgress" id="wordProgress" cols="100" rows="8">${middleReportManage.wordProgress}</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                工作态度情况（学生对毕业设计、毕业论文的认真程度、纪律及出勤情况；指导教师具体指导情况）：<br/>
                <textarea class="layui-textarea" name="workAttitude" id="workAttitude" cols="100" rows="8">${middleReportManage.workAttitude}</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                质量评价（学生前期已完成工作的质量情况）：<br/>
                <textarea class="layui-textarea" name="qualityAdvice" id="qualityAdvice" cols="100" rows="8">${middleReportManage.qualityAdvice}</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                存在的问题与建议：<br/>
                <textarea class="layui-textarea" name="problemAndAatter" id="problemAndAatter" cols="100" rows="8">${middleReportManage.problemAndAatter}</textarea>
            </td>
        </tr>
        </tbody>
    </table>
    <div style="float: right">
        <label for="checkTime" class="layui-form-label">
            时间：
        </label>
        <div class="layui-input-inline" style="width: 135px">
            <input type="text" name="checkTime" id="checkTime" class="layui-input" value="${middleReportManage.checkTime}">
        </div>
    </div>
    <div style="clear:both">
        说明：<p>1、此表由学院（直属系）教学院长（主任）组织相关检查人员填写；<br/>
        2、此表一式两份，一份附入学生毕业设计（论文）资料袋内，一份交学院（直属系）。
    </p>
    </div>
    <div style="margin: 20px;float: right" class="submitCencheckResult">
        <button class="btn-primary btn"  data-type="submitCencheckResult" >提交</button>
    </div>

</div>
<script>
    /*时间*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#checkTime' //指定元素
            ,format: 'yyyy-MM-dd'
        });
    })
</script>
<script>
    layui.use(['layer'], function(){
        var layer = layui.layer;
        active = {
            submitCencheckResult:function () {
                var cenArrangeInfoId = $("#cenArrangeInfoId").val();
                var wordProgress = $("#wordProgress").val();
                var workAttitude = $("#workAttitude").val();
                var qualityAdvice = $("#qualityAdvice").val();
                var problemAndAatter = $("#problemAndAatter").val();
                var checkTime = $("#checkTime").val();
                $.ajax({
                    type:'POST',
                    url:'${pageContext.request.contextPath}/cencheckresultinfo/addCencheckresultinfo.action?cenArrangeInfoId='+cenArrangeInfoId+'&wordProgress='+wordProgress+'&workAttitude='+workAttitude+'&qualityAdvice='+qualityAdvice+'&problemAndAatter='+problemAndAatter+'&checkTime='+checkTime,
                    success:function (msg) {
                        if(msg == 1){
                            layer.msg("提交成功");
                        }else if(msg == 0){
                            layer.msg("提交失败");
                        }else{
                            layer.msg("发生错误");
                        }
                    },
                    error:function () {
                        layer.msg("发生错误");
                    }
                })
            }
        }

        $('.submitCencheckResult .btn-primary').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    })
//    function submitCencheckResult() {
//
//    }
</script>
</body>

</html>