<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设分配</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
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
        var teacher_course_id;
        $(function () {
            <%
                String teacher_course_id = request.getParameter("teacher_course_id");
            %>
            teacher_course_id = "<%=teacher_course_id%>";

            showDetailInfo();
        })

        function showDetailInfo() {
            $.ajax({
                url:"/jwxt/courseWorkLoad/findCourseDetail.do",
                type:"post",
                data:{"teacher_course_id":teacher_course_id},
                dataType:"json",
                success:function (mapInfo) {
                    $("#courseDesignName").html(mapInfo.course_name);
                    $("#courseDesignNum").html(mapInfo.course_code);
                    $("#teacherName").html(mapInfo.teacher_name);
                    $("#teacherNum").html(mapInfo.teacher_number);
                    $("#startTime").html(mapInfo.academic_year);
                    $("#endTime").html(mapInfo.term);

                    var classInfoList = mapInfo.list;
                    for(var i=0;i<classInfoList.length;i++){
                        $("#classInfo").append(
                           // "<label for='' class='layui-form-label'>&nbsp;&nbsp;"+classInfoList[i].class_name+" ["+classInfoList[i].class_size+"]</label>"
                            " <input type='button' onclick='showStuList(this);' style='width: 150px;float: left;margin-left: 8px;' name='"+classInfoList[i].class_size+"' value='"+classInfoList[i].class_name+"'  class='layui-input'/>"
                        );
                    }

                },
                error:function () {
                    layer.alert("详细信息加载失败")
                }
            })
        }

        function showStuList(obj) {
            var className = $(obj).val();
            var stuNum = $(obj).attr("name");
            //alert(stuNum)
            //alert(className);
            $.ajax({
                url:"/jwxt/courseWorkLoad/findStuListInfo.do",
                type:"post",
                data:{"className":className},
                dataType:"json",
                success:function (list) {
                    $("#stuDiv").append(
                        "<div style='margin-left: -100px;' class='layui-unselect layui-form-checkbox layui-form-checked' lay-skin=''><span>"+className+"</span></a><i class='layui-icon'>"+stuNum+"</i></div><br>"
                    );
                    for(var i=0;i<list.length;i++){
                       // alert(list[i])
                        $("#stuDiv").append(
                            "<div class='layui-unselect layui-form-checkbox layui-form-checked' lay-skin=''><a>"+list[i]+"</a><i class='layui-icon'></i></div>"
                        );
                    }
                    $("#stuDiv").append("<br><br>")
                  //  layer.alert("success")

                },
                error:function () {
                    layer.alert("加载学生列表失败")
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

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                所带班级
            </label>
            <div class="layui-input-inline"  id="classInfo">

                <%--<input type="" id="classNames" name="" required="" lay-verify="required" disabled  style="width: 575px;" value=""--%>
                       <%--autocomplete="off" class="layui-input">--%>
            </div>


        </div>
        <div class="layui-form-item">
            <%--<label for="" class="layui-form-label">--%>
                <%--学生列表--%>
            <%--</label>--%>
            <div class="layui-input-block" id="stuDiv">
                <%--<input type="checkbox" name="" title="张三" checked="" >--%>

            </div>

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