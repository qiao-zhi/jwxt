<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设分配</title>
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


</head>
    <div id="arrangeInfo"></div>

<script type="text/javascript">
    var yearNum;
    var majorID;
    var trainCourseID;
    var courseNum;
    var grade;
    // 自动加载
    $(function(){
        // 获取git请求的参数
        <%--<%--%>
            <%--String yearNum = request.getParameter("yearNum");--%>
            <%--String majorID = request.getParameter("majorID");--%>
            <%--String trainCourseID = request.getParameter("trainCourseID");--%>
            <%--String courseNum = request.getParameter("courseNum");--%>
            <%--String grade = request.getParameter("grade");--%>
        <%--%>--%>
        <%--courseNum = "<%=courseNum%>";--%>
        <%--trainCourseID = "<%=trainCourseID%>";--%>
        <%--majorID = "<%=majorID%>";--%>
        <%--yearNum = "<%=yearNum%>";--%>
        <%--grade = "<%=grade%>";--%>

        var courseDesignArrangeID;
        <%
            String courseDesignArrangeID = request.getParameter("courseDesignArrangeID");
        %>
        courseDesignArrangeID = "<%=courseDesignArrangeID%>";

        $.ajax({
            url:"/jwxt/arrangeCourseDesign/findArrangeInfoDetail.do",
            type:"post",
            //data:{"trainCourseID":trainCourseID,"majorID":majorID,"yearNum":yearNum,"grade":grade},
            data:{"courseDesignArrangeID":courseDesignArrangeID},
            async:false,
            dataType:"json",
            success:function (infoList) {
                for(var i=0;i<infoList.length;i++){
                    var courseDesignName = infoList[i].courseDesignName;
                    var courseDesignNum = infoList[i].courseDesignNum;
                    var startTime = infoList[i].startTime;
                    var endTime = infoList[i].endTime;
                    var CourseArrangeInfo = infoList[i].CourseArrangeInfo;
                    var teacherName = infoList[i].teacherName;
                    var teacherNum = infoList[i].teacherNum;
                    var classNames = infoList[i].classNames;
                    var stuList = infoList[i].stuList;

                    var str = "";
                    str += "<div class='x-body'>" +
                        "<table class='layui-table-wang-info'>" +
                        "<tr>" +
                        "<td>课程名称</td>" +
                        "<td>"+courseDesignName+"</td>" +
                        "<td>课程编号</td>" +
                        "<td>"+courseDesignNum+"</td>" +
                        "</tr>" +
                        "<tr>" +
                        "<td>教师名称</td>" +
                        "<td>"+teacherName+"</td>" +
                        "<td>教师编号</td>" +
                        "<td>"+teacherNum+"</td>" +
                        "</tr>" +
                        "<tr>" +
                        "<td>开始时间</td>" +
                        "<td>"+startTime+"</td>" +
                        "<td>结束时间</td>" +
                        "<td>"+endTime+"</td>" +
                        "</tr>" +
                        "<tr>" +
                        "<td>所带班级</td>" +
                        "<td style='width: 762px;'>"+classNames+"</td>" +
                        "</tr>" +
                        "</table>" +
                        "<br/>" +
                        "<form class='layui-form'>" +
                        "<div class='layui-form-item'>" +
                        "<label for='' class='layui-form-label'>学生列表</label>" +
                        "<div class='layui-input-block'>";

                    // 学生信息
                    for(var j = 0,length_1 =stuList.length;j<length_1;j++ ){
                        str +=  "<div class='layui-unselect layui-form-checkbox layui-form-checked'><span>"+stuList[j]+"</span><i class='layui-icon'></i></div>";

                    }

                    str+="</div>" +
                        "</div>" +
                        "<div class='layui-form-item'>" +
                        "<label for='' class='layui-form-label'>备注信息</label>"+
                        "<div class='layui-input-inline' style='width: 600px;'>" +
                        "<textarea name='' readonly='readonly'  class='layui-textarea'>"+CourseArrangeInfo+"</textarea>" +
                        "</div>" +
                        "</div>" +
                        "</form>" +
                        "</div>"+
                        "<hr>";
                    // 动态加载数据
                    $("#arrangeInfo").append(str);

                }
            },
            error:function () {
                layer.alert("加载数据失败！")
            }
        });

    });

</script>
<body>




<script>

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

    });
</script>

</body>

</html>