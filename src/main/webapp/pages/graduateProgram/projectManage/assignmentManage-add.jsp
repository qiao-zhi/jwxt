<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加任务书</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp" %>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>

    <script src="${baseurl}/js/graduateProgram/projectManage/assignmentManage-add.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="table table-bordered">
        <tbody id="titleInfo">
        </tbody>
    </table>
    <div>
        <button class="btn-primary btn" type="button" onclick="y_save()">保存</button>
        <button class="btn-primary btn" type="button" lay-submit="" onclick="y_submit()">提交</button>
        <form class="layui-form" id="y_form">

            <input type="hidden" name="studentID" id="studentID"/>
            <input type="hidden" name="teacherTitleID" id="teacherTitleID"/>
            <input type="hidden" name="studenttitleresultid" id="StudentTitleresultID"/>
            <input type="hidden" name="taskedittime" id="taskEditTime"/>
            <input type="hidden" name="fillStatus" id="fillStatus"/>
            <table class="table table-bordered">
                <caption>太原科技大学毕业设计（论文）任务书</caption>
                <tbody>
                <tr>
                    <td>学生姓名</td>
                    <td id="studentName"></td>
                    <td>学号</td>
                    <td id="studentNum"></td>
                </tr>
                <tr>
                    <td>专业班级</td>
                    <td id="className"></td>
                    <td>同组人</td>
                    <td id="teamworkStudentName">data.studentPartners</td>
                </tr>
                <tr>
                    <td>任务下发时间</td>
                    <td><input class="layui-input" name="tasksendtime" id="startDate" type="text" lay-verify="required"></td>
                    <td>任务完成时间</td>
                    <td><input class="layui-input" name="taskcompletetime" id="endDate" type="text" lay-verify="required"></td>
                </tr>
                <tr>
                    <td style="width:110px">设计（论文）题目</td>
                    <td><input class="layui-input" name="thesistitle" type="text" lay-verify="required"></td>
                    <td>毕设题目</td>
                    <td><input class="layui-input" name="gdTitle" type="text" lay-verify="required"></td>
                </tr>
                <tr>
                    <td>设计目的要求</td>
                    <td colspan="3">
                        <textarea name="designtargetrequire" class="layui-textarea" lay-verify="required"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>设计主要内容</td>
                    <td colspan="3">
                        <textarea name="designcontent" class="layui-textarea" lay-verify="required"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>设计提交资料</td>
                    <td colspan="3">
                        <textarea name="designsubmitfile" class="layui-textarea" lay-verify="required"></textarea>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
        <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>
    </div>
</div>
</body>

</html>