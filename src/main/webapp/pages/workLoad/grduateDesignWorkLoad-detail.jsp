<%@page pageEncoding="utf-8" %>
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

    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>

    <style>
        .layui-table-wang-info{
            width: 100%;
            margin: 10px 0;
            background-color: #fff;
            border-collapse: collapse;
            border-spacing: 0;
            padding: 0px;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            font-size: 12px;
        }
        .layui-table-wang-info tr{
            -webkit-transition: all .3s;
            margin: 0px;
            padding: 0px;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            font-size: 12px;
            border-collapse: collapse;
            border-spacing: 0;
        }
        .layui-table-wang-info tr td{
            text-align: center;
            float: left;
            /*position: relative;*/
            padding: 9px 15px;
            min-height: 20px;
            line-height: 20px;
            font-size: 14px;
            border: 1px solid #e2e2e2;
            word-break: break-all;
        }
        .layui-table-wang-info tr td:nth-child(2n+1){
            width: 110px;
            background-color: #FBFBFB;
            box-sizing: border-box;

        }
        .layui-table-wang-info tr td:nth-child(2n){
            width: 200px;
        }

    </style>

    <script type="text/javascript">
        var teacherTitleID;
        $(function () {
            <%
                String teacherTitleID = request.getParameter("teacherTitleID");
            %>
            teacherTitleID = "<%=teacherTitleID%>";

            showDetailInfo();
        })

        function showDetailInfo() {
            $.ajax({
                url:contextPath + "/grduateDesignWorkLoad/findGrduateDesignWorkLoadDetail.do",
                type:"post",
                data:{"teacherTitleID":teacherTitleID},
                dataType:"json",
                success:function (mapInfo) {
                    $("#courseDesignName").html(mapInfo.graduateDesignName);
                  //  $("#courseDesignNum").html(mapInfo.course_code); // 毕设编号
                    $("#teacherName").html(mapInfo.teacherName);
                    $("#teacherNum").html(mapInfo.teacherNum);
                    $("#startTime").html(mapInfo.yearNum);
                    $("#endTime").html(mapInfo.semesterNum);

                    var stuList = mapInfo.stuList;
                    for(var i=0;i<stuList.length;i++){
                        var index = i+1;
                        $("#stuDiv").append(
                       //  "<input type=''   style='font-size: 14px;width: 575px;padding-left: 25px;' value='"+stuList[i].finallyName+"&nbsp;:&nbsp;"+stuList[i].studentName+"&nbsp;-&nbsp;"+stuList[i].studentNum+"&nbsp;-&nbsp;"+stuList[i].className+"' class='layui-input'>"
                            "<tr>" +
                                "<td>"+index+"</td>" +
                                "<td>"+stuList[i].studentName+"</td>" +
                                "<td>"+stuList[i].studentNum+"</td>" +
                                "<td>"+stuList[i].finallyName+"</td>"+
                                "<td>"+stuList[i].className+"</td>"+
                            "</tr>"
                        );
                    }

                },
                error:function () {
                    layer.msg("详细信息加载失败")
                }
            })
        }


    </script>

</head>

<body>
<div class="x-body">
    <table class="layui-table-wang-info">
        <tr>
            <td>课程名称</td>
            <td id="courseDesignName"></td>
            <td>课程编号</td>
            <td id="courseDesignNum"></td>
        </tr>
        <tr>
            <td>教师名称</td>
            <td id="teacherName"></td>
            <td>教师编号</td>
            <td id="teacherNum"></td>
        </tr>
        <tr>
            <td>学年</td>
            <td id="startTime"></td>
            <td>学期</td>
            <td id="endTime"></td>
        </tr>
    </table>
    <form class="layui-form layui-form-pane">

        <%--<div class="layui-form-item">--%>
        <%--<label for="" class="layui-form-label">--%>
            <%--所带班级--%>
        <%--</label>--%>
        <%--<div class="layui-input-inline"  id="classInfo">--%>

            <%--&lt;%&ndash;<input type="" id="classNames" name="" required="" lay-verify="required" disabled  style="width: 575px;" value=""&ndash;%&gt;--%>
            <%--&lt;%&ndash;autocomplete="off" class="layui-input">&ndash;%&gt;--%>
        <%--</div>--%>
    <%--</div>--%>


        <div class="layui-form-item">
            <%--<div>--%>
            <%--<label for="" class="layui-form-label">--%>
            <%--学生列表--%>
            <%--</label>--%>
            <%--</div>--%>

                <table>
                    <table class="layui-table" style="width: 685px;">
                        <thead>
                        <tr>
                            <th style="width:9%;">序号</th>
                            <th>学生姓名</th>
                            <th>学生学号</th>
                            <th>毕设题目</th>
                            <th>班级</th>
                        </tr>
                        </thead>
                        <tbody id="stuDiv">

                        </tbody>
                </table>


        </div>

    </form>
</div>

<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

    });
</script>

</body>

</html>