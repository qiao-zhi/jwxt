<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript" src="../../js/jquery.min.js" ></script>
    <script type="text/javascript" src="../../lib/layui/layui.js"></script>
    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>
    <script type="text/javascript">
        $(function () {
           <%
               String courseDesignTeacherStudentID = request.getParameter("courseDesignTeacherStudentID");
           %>
            var courseDesignTeacherStudentID = "<%=courseDesignTeacherStudentID%>";
            $.ajax({
                url:contextPath +"/studentCourseDesignFileInfo/checkCourseDesignFile.do",
                type:"post",
                data:{"courseDesignTeacherStudentID":courseDesignTeacherStudentID},
                dataType:"json",
                success:function (fileInfo) {
                    fileName = fileInfo.courseDesignReportStore;
                    window.location.href="/file/courseDesignFile/"+fileName;
                },
                error:function () {
                    layer.msg("加载信息失败")
                }
            })

        })
    </script>
</head>
<body>
    <a></a>
</body>
</html>
