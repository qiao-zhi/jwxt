<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.*" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
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
    <style>
        .layui-form-item .layui-input-inline {
            width: 200px !important;
        }
    </style>
</head>
<body>
<div class="x-body">
    <form class="layui-form ">
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课设名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="cdName" value="" readonly="readonly" class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                开始时间
            </label>
            <div class="layui-input-inline">
                <select id="startTime" name="" lay-verify="">
                    <option value="">请选择教学周</option>
                    <option value="1">第一周</option>
                    <option value="2">第二周</option>
                    <option value="3">第三周</option>
                    <option value="4">第四周</option>
                    <option value="5">第五周</option>
                    <option value="6">第六周</option>
                    <option value="7">第七周</option>
                    <option value="8">第八周</option>
                    <option value="9">第九周</option>
                    <option value="10">第十周</option>
                    <option value="11">第十一周</option>
                    <option value="12">第十二周</option>
                    <option value="13">第十三周</option>
                    <option value="14">第十四周</option>
                    <option value="15">第十五周</option>
                    <option value="16">第十六周</option>
                    <option value="17">第十七周</option>
                    <option value="18">第十八周</option>
                </select>
            </div>
            <label for="" class="layui-form-label">
                结束时间
            </label>
            <div class="layui-input-inline">
                <select name="" id="endTime" lay-verify="">
                    <option value="">请选择教学周</option>
                    <option value="1">第一周</option>
                    <option value="2">第二周</option>
                    <option value="3">第三周</option>
                    <option value="4">第四周</option>
                    <option value="5">第五周</option>
                    <option value="6">第六周</option>
                    <option value="7">第七周</option>
                    <option value="8">第八周</option>
                    <option value="9">第九周</option>
                    <option value="10">第十周</option>
                    <option value="11">第十一周</option>
                    <option value="12">第十二周</option>
                    <option value="13">第十三周</option>
                    <option value="14">第十四周</option>
                    <option value="15">第十五周</option>
                    <option value="16">第十六周</option>
                    <option value="17">第十七周</option>
                    <option value="18">第十八周</option>
                </select>
            </div>

        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                安排信息
            </label>
            <div class="layui-input-inline">
                <textarea name="" id="CourseArrangeInfo" placeholder="请输入备注信息" class="layui-textarea" style="width: 520px !important;"></textarea>
            </div>

        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                教师名称
            </label>
            <div class="layui-input-inline">
                <select id="teacherName"  name="" lay-verify="" lay-filter="chooseTeacher" lay-search>
                    <option value="" >请选择教师</option>

                </select>
            </div>
            <label for="" class="layui-form-label">
                教师编号
            </label>
            <div class="layui-input-inline">
                <input type="text"  id="teacherId" name="" readonly="readonly" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>

        <script type="text/javascript">
            /* layui 监听select*/
            layui.use(['form','layer','util'],function () {
                var form = layui.form;
                var layer =layui.layer;
                form.on('select(chooseTeacher)', function(data){
//            console.log(data.elem); //得到select原始DOM对象
  //             console.log(data.value); //得到被选中的值
//            console.log(data.othis); //得到美化后的DOM对象
                // 清空班级信息
                 $("#appendGrade").val("");
                 $(".layui-form-checkbox").removeClass("layui-form-checked");
                $("#studentList").empty();
                 $(".displayNone").attr("selected","selected");
                    var teacherName = data.value;
                 //   alert(teacherName);
                    if(teacherName!=null&&teacherName!=""){
                        $.ajax({
                            url:"/jwxt/arrangeCourseDesign/getTeacherNum.do",
                            type:"post",
                            data:{"teacherName":teacherName,"majorID":majorID},
                            dataType:"json",
                            success:function (teacherNum) {
                                $("#teacherId").attr("value",teacherNum);
                            },
                            error:function () {
                                alert("获取教师编号失败！");
                            }
                        });
                    }

                });

            })
        </script>


        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                所带班级
            </label>
            <div class="layui-input-inline">
                <select name=""  lay-verify="" lay-filter="selectGrade" id="selectgrade">
                    <option  class="displayNone" value="">请选择班级</option>

                </select>


                <input type="hidden" name="" id="hiddenValue" value="" />
            </div>
            <label for="" class="layui-form-label">
                班级名称
            </label>
            <div class="layui-input-inline">
               <textarea type="" id="appendGrade" name="" readonly="readonly"  required="" lay-verify="required"
                         autocomplete="off" class="layui-textarea"></textarea>
            </div>

    <script type="text/javascript">
        /* layui 监听select*/
        var className;
        layui.use(['form','util'],function () {
            var form = layui.form;
            var util = layui.util;

            form.on('select(selectGrade)', function (data) {
//            console.log(data.elem); //得到select原始DOM对象
                //             console.log(data.value); //得到被选中的值
//            console.log(data.othis); //得到美化后的DOM对象
                className = data.value;
                //   alert(className);
                if(className==""||className==null){
                    return;
                }
                $.ajax({
                    url:"/jwxt/arrangeCourseDesign/getSrudentList.do",
                    type:"post",
                    data:{"className":className,"majorID":majorID},
                    dataType:"json",
                    success:function (studentList) {
                      //  $("#studentList").html("");
                        $("#studentList").append( "<p>"+className+"</p><br>")
                        var str = $("#appendGrade").val();
                        $("#appendGrade").val(str+"/"+className);
                        for (var i=0;i<studentList.length;i++){
                            $("#studentList").append(
                                "<div class='layui-unselect layui-form-checkbox "+className+"' lay-skin='' name='none'  onclick='changeClass(this);'><a style='display: none;'>"+studentList[i].studentID+"</a><span>"+studentList[i].studentName+"</span><i class='layui-icon'></i></div>"
                         //   "<input type='checkbox' class='stuInfoBox'  name='stuInfoBox' title='"+studentList[i].studentName+"' value='"+studentList[i].studentID+"' />"
                            )
                        }
                        $("#studentList").append("<br><br>")
                        form.render();//重新渲染表单
                    },
                    error:function () {
                        alert("获取学生信息失败");
                    }
                });
            });
        })

        function changeClass(obj) {
            if($(obj).hasClass("layui-form-checked")){
                $(obj).removeClass("layui-form-checked");
                //$(obj).attr("name","selected");
            }else {
                $(obj).addClass("layui-form-checked");
                //$(obj).attr("name","none");
            }
        }

    </script>

        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                选择学生
            </label>
            <div class="layui-input-block">
                <input type="radio" name="aaa" title="选择所有" lay-filter="selectAll">
                <input type="radio" name="aaa" title="选择前半部分" lay-filter="selectBefore">
                <input type="radio" name="aaa" title="选择后半部分" lay-filter="selectAfter">
                <input type="radio" name="aaa" title="清除选择" lay-filter="clear">
            </div>
        </div>
        <div class="layui-form-item" >
            <!--
            <label for="" id="classLabel" class="layui-form-label">
                软件一班
            </label>
            -->
            <div class="layui-input-block" id="studentList">

                <!--
                <input type="checkbox" checked="checked" name="" value="111">
                <input type="checkbox" name="" title="发呆">
                <div class="layui-unselect layui-form-checkbox" lay-skin=""><span>李四</span><i class="layui-icon"></i></div>
                -->
            </div>
        </div>

        <!---->
        <div class="layui-form-item">
            <button class="layui-btn" style="margin-left: 45px;" type="button" onclick="addToTable();">
                <i class="layui-icon">&#xe608;</i> 添加至表格
            </button>
        </div>
        <!---->
    </form>
    <button class="layui-btn" lay-filter="add" lay-submit="" type="button" onclick="submitInfo();">
        确认分配
    </button>
    <table class="layui-table">
        <thead>
        <tr>
            <th>教师编号</th>
            <th>教师姓名</th>
            <th>班级</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="filterTeacher">

<!--
        <tr>
            <td>王五</td>
            <td>2016-11-29</td>
            <td>人生就像是一场修行</td>
            <td class="td-manage">

                <a title="删除" onclick="member_del(this,'要删除的id')">
                    <i class="layui-icon">&#xe640;</i>
                </a>
            </td>
        </tr>
-->

        </tbody>
    </table>

</div>

    <div style="display: none;">
        <form id="infoForm" action="" method="post">

        </form>
    </div>
<script  type="text/javascript">
    var majorID;
    var courseDesignName;
    var trainCourseID;
    var year;
    var semester;
    var courseDesignNum;
    // 自动加载
    $(function () {
       <%
            String majorID = request.getParameter("majorID");
            String courseName = request.getParameter("courseName");
            courseName = URLDecoder.decode(courseName, "utf-8");
            String trainCourseID = request.getParameter("trainCourseID");
            String semester = request.getParameter("semester");
            String year = request.getParameter("year");
            String courseNum = request.getParameter("courseNum");
       %>
         majorID = "<%=majorID%>";
        courseDesignName = "<%=courseName%>";
        trainCourseID = "<%=trainCourseID%>";
        year = "<%=year%>";
        semester = "<%=semester%>";
        courseDesignNum = "<%=courseNum%>";
        $("#cdName").attr("value",courseDesignName);
       // alert(courseName);

            $.ajax({
                url:"/jwxt/arrangeCourseDesign/getTeacherInfoAndClassInfo.do",
                type:"post",
                data:{"majorID":majorID,"year":year},
                dataType:"json",
                success:function (infoMap) {
                    var teacherList = infoMap.teacherList;
                    //alert(teacherList);
                    for (var i=0;i<teacherList.length;i++){
                        $("#teacherName").append("<option value='"+teacherList[i]+"'>"+teacherList[i]+"</option>")
                    }
                    var classList = infoMap.classList;
                    for (var i=0;i<classList.length;i++){
                        $("#selectgrade").append("<option value='"+classList[i]+"'>"+classList[i]+"</option>")
                    }
                    layui.use(['form'],function () {
                        var form = layui.form;
                        form.render('select'); //刷新select选择框渲染
                    });

                },
                error:function () {
                    alert("获取班级信息和教师信息失败！");
                }
            });



    });

    function addToTable() {
//        alert(majorID);
        // 获取输入的值
        //   semester   yearNum   display  CourseArrangeTeacher CourseArrangeTime  isArrange 在控制层控制
        var startTime = $("#startTime").find("option:selected").val();
        var endTime = $("#endTime").find("option:selected").val();
        var CourseArrangeInfo = $("#CourseArrangeInfo").val();
        var teacherName = $("#teacherName").find("option:selected").val();
        var teacherNum = $("#teacherId").val();
        var classNames = $("#appendGrade").val();
        //获取学生id
        var stuArr = [];
        $("#studentList").find("div").each(function () {
            if($(this).hasClass("layui-form-checked")){
                stuArr.push($(this).find("a").text());
            }

        });
       // alert(stuArr);
        $("#filterTeacher").append(
            "<tr>" +
                "<td class='infoNum'>"+teacherNum+"</td>" +
                "<td class='infoName'>"+teacherName+"</td>" +
                "<td class='infoClass'>"+classNames+"</td>" +
                "<td class='infoStart' style='display:none;'>"+startTime+"</td>" +
                "<td class='infoEnd' style='display:none;'>"+endTime+"</td>" +
                "<td class='infoMessage' style='display:none;'>"+CourseArrangeInfo+"</td>" +
                "<td class='infoStuArr' style='display:none;'>"+stuArr+"</td>" +
                "<td class='trainCourseID' style='display:none;'>"+trainCourseID+"</td>" +
                "<td class='majorID' style='display:none;'>"+majorID+"</td>" +
                "<td class='courseDesignName' style='display:none;'>"+courseDesignName+"</td>" +
                "<td class='year' style='display:none;'>"+year+"</td>" +
                "<td class='semester' style='display:none;'>"+semester+"</td>" +
                "<td class='courseDesignNum' style='display:none;'>"+courseDesignNum+"</td>" +
                "<td class='td-manage'>"+
                    "<a title='删除' onclick='deleteTr(this);'>" +
                        "<i class='layui-icon'>&#xe640;</i>" +
                    "</a>" +
                "</td>" +
            "</tr>"
        );
    }

    function deleteTr(klj){
        $(klj).parents("tr").remove();
    }

    // 将表格中的数据添加到表单中
    function addToForm() {
        $("#infoForm").html(""); // 清空表单
        // 遍历表格中每一行
        $("#filterTeacher").children("tr").each(function (index) {
            // 获取表格中的数据
            var teacherNum = $(this).children("td:eq(0)").text();
            var teacherName = $(this).children("td:eq(1)").text();
            var classNames = $(this).children("td:eq(2)").text();
            var startTime = $(this).children("td:eq(3)").text();
            var endTime = $(this).children("td:eq(4)").text();
            var CourseArrangeInfo = $(this).children("td:eq(5)").text();
            var stuArr = $(this).children("td:eq(6)").text();
            var trainCourseID = $(this).children("td:eq(7)").text();
            var majorID = $(this).children("td:eq(8)").text();
            var courseDesignName = $(this).children("td:eq(9)").text();
            var year = $(this).children("td:eq(10)").text();
            var semester = $(this).children("td:eq(11)").text();
            var courseDesignNum = $(this).children("td:eq(12)").text();
            // 添加数据到表单中
            $("#infoForm").append(
                "<input type='hidden' name='TCourseDesignVos["+index+"].teacherNum' value='"+teacherNum+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].teacherName' value='"+teacherName+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].classNames' value='"+classNames+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].startTime' value='"+startTime+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].endTime' value='"+endTime+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].CourseArrangeInfo' value='"+CourseArrangeInfo+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].stuArr' value='"+stuArr+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].trainCourseID' value='"+trainCourseID+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].majorID' value='"+majorID+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].courseDesignName' value='"+courseDesignName+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].year' value='"+year+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].semester' value='"+semester+"'/>"+
                "<input type='hidden' name='TCourseDesignVos["+index+"].courseDesignNum' value='"+courseDesignNum+"'/>"
            );
        });

    }
    
    function submitInfo() {
        addToForm();
        $.ajax({
            url:"/jwxt/arrangeCourseDesign/arrangeCourseDesignInfo.do",
            type:"post",
            async:false,
            data:$("#infoForm").serialize(),
            dataType:"json",
            success:function () {
                //发异步，把数据提交
                layer.alert("安排成功", {icon: 6}, function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    // 关闭窗口前，先重新执行一次父窗口查询
                    window.parent.findNeedArrangeCD();
                    //  window.parent.location.reload();  //刷新父窗口
                    //关闭当前frame
                    parent.layer.close(index);
                });
            },
            error:function () {
                layer.alert("安排失败！")
            }
        });
    }
    
</script>



<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;


        form.on('checkbox(stus)', function(data){
            alert(data.value); //得到checkbox原始DOM对象
        });



        //自定义验证规则
        form.verify({
            nikename: function (value) {
                if (value.length < 5) {
                    return '昵称至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , repass: function (value) {
                if ($('#L_pass').val() != $('#L_repass').val()) {
                    return '两次密码不一致';
                }
            }
        });

        //监听选择教师事件
        form.on('select(chooseTeacher)',function(data){
            var teacherNum={
                a:'001',
                b:'002'
            }
            form.render('select');
            $("#teacherId").val(teacherNum.a)
        });

        //监听选择所有单选按钮事件
        form.on('radio(selectAll)',function(date){
            $("."+className).addClass("layui-form-checked");
//			layer.alert("选择所有学生成功");

        });
        //监听选择前半部分单选按钮事件
        form.on('radio(selectBefore)',function(date){
            var students=$("."+className).length;
            var before=Math.round(students/2);
//       	alert(before)
            $("."+className).removeClass("layui-form-checked");
            $("."+className).slice(0,before).addClass("layui-form-checked");
//       	alert(students)
//			layer.alert("选择前半部分学生成功");

        });
        //监听选择后半部分单选按钮事件
        form.on('radio(selectAfter)',function(date){
            var students=$("."+className).length;
            var before=Math.round(students/2);
//       	alert(before)
            $("."+className).removeClass("layui-form-checked");
            $("."+className).slice(before,students).addClass("layui-form-checked");
//			layer.alert("选择后半部分学生成功");

        });
        //监听清除单选按钮事件
        form.on('radio(clear)',function(date){
            $("."+className).removeClass("layui-form-checked");
//			layer.alert("清除选择学生成功");

        });

    });
</script>

</body>

</html>