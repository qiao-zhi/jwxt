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
    <script type="text/javascript" src="../../js/courseDesign/courseDesignArrange.js"></script>

    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>

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
               <div type="" id="appendGrade" name="" readonly="readonly"  required="" lay-verify="required"
                         autocomplete="off" class="layui-textarea">

               </div>
            </div>

    <script type="text/javascript"> </script>

        </div>
        <div class="layui-form-item">
           <!--
            <label for="" class="layui-form-label">
                选择学生
            </label>

            <div class="layui-input-block">
                <input type="radio" name="aaa" title="选择所有" lay-filter="selectAll">
                <input type="radio" name="aaa" title="选择前半部分" lay-filter="selectBefore">
                <input type="radio" name="aaa" title="选择后半部分" lay-filter="selectAfter">
                <input type="radio" name="aaa" title="清除选择" lay-filter="clear">
            </div>
            -->
        </div>
        <div class="layui-form-item" id="class_sel_stu">
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
        保存分配
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
            courseName = courseName.replace(" ","+");
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

       // alert(courseDesignName)
       // alert(courseName);

            $.ajax({
                url:contextPath +"/arrangeCourseDesign/getTeacherInfoAndClassInfo.do",
                type:"post",
                data:{"majorID":majorID,"year":year},
                dataType:"json",
                success:function (infoMap) {
                    var teacherList = infoMap.teacherList;
                    //alert(teacherList);
                    for (var i=0;i<teacherList.length;i++){
                        $("#teacherName").append("<option value='"+teacherList[i].teacherID+"'>"+teacherList[i].teacherName+"</option>")
                    }
                    var classList = infoMap.classList;
                    for (var i=0;i<classList.length;i++){
                        $("#selectgrade").append("<option value='"+classList[i].classID+"'>"+classList[i].className+"</option>")
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


</script>



<script>

</script>

</body>

</html>