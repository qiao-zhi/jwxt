<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设审核结果</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>

    <script type="text/javascript">
        $(function () {
            <%
                String courseDesignTeacherStudentID = request.getParameter("courseDesignTeacherStudentID");
            %>
            var courseDesignTeacherStudentID = "<%=courseDesignTeacherStudentID%>";
            $.ajax({
                url:contextPath +"/studentCourseDesignFileInfo/getCourseDesingCheckResult.do",
                type:"post",
                data:{"courseDesignTeacherStudentID":courseDesignTeacherStudentID},
                dataType:"json",
                success:function (checkInfo) {
                    $("#checkTeacher").val(checkInfo.teacherName);
                    var checkMsg;
                    if(checkInfo.checkStatus == 1){
                        checkMsg = "审核通过";
                    }else{
                        checkMsg = "审核未通过";
                    }
                    $("#checkResult").val(checkMsg);
                    $("#checkAdvice").val(checkInfo.checkAdvice);

                },
                error:function () {
                    layer.msg("加载信息失败");
                }
            })
        })
    </script>

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
                <input type="text" name="" id="checkTeacher" required  lay-verify="required"   class="layui-input" value="张三" disabled>
            </div>
        </div>

        <!--3-->
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
                审核结果
            </label>
            <div class="layui-input-inline">
                <input type="text" name="" id="checkResult" required  lay-verify="required"   class="layui-input" value="审核通过" disabled>
            </div>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                审核意见
            </label>
            <div class="layui-input-inline" >
                <textarea style="height: 300px;" name="" id="checkAdvice" required lay-verify="required" disabled="" class="layui-textarea">666666666666</textarea>

            </div>

        </div>
        <!--4-->
        
    </form>
</div>


</body>

</html>