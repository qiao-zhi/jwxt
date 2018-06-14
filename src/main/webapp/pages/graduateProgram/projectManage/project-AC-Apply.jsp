<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>填写课题申请表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
    <script type="text/javascript" src="${baseurl}/js/y_public.js"></script>

    <script src="${baseurl}/js/graduateProgram/projectManage/project-AC-Apply.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <form class="layui-form" id="y_form">
        <button class="layui-btn" type="button" onclick="y_save()">保存</button>
        <button class="layui-btn" type="button" lay-submit="" onclick="y_submit()">添加</button>

        <input type="hidden" name="isSubmit" id="isSubmit">
        <table class="table table-bordered">
            <caption><h1>太原科技大学毕业设计（论文）课题申请表</h1>
                <span style="position:relative;top:15px;left:10px;">学院（直属系）：
                    <input type="text" id="y_college" style="border:none;background-color:white;" disabled></span>
                <div style="float: right">
                    <label for="L_pass" class="layui-form-label">
                        时间：
                    </label>
                    <div class="layui-input-inline" style="width: 135px">
                        <input type="text" class="layui-input" name="applyTime" id="L_pass">
                        <input type="hidden" name="gradesignid" id="graDesignID">
                    </div>
                </div>
            </caption>
            <tbody>
            <tr>
                <td rowspan="5">课题情况</td>
                <td>课题名称</td>
                <td colspan="5">
                    <input  class="layui-input" name="titlename" type="text" lay-verify="required">
                </td>
            </tr>
            <tr>
                <td>教师姓名</td>
                <td id="teacherName"></td>
                <td>职称</td>
                <td id="positionalTitle"></td>
                <td>学位</td>
                <td id="degree"></td>
            </tr>
            <tr>
                <td>课题来源</td>
                <td colspan="5">
                    <select name="titleorigin" class="small" lay-verify="required">
                        <option value="">--请选择--</option>
                        <option value="科研">科研</option>
                        <option value="生产">生产</option>
                        <option value="理论">理论</option>
                        <option value="其他">其他</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>课题类别</td>
                <td>
                    <select name="titletype" class="small" lay-verify="required">
                        <option value="">--请选择--</option>
                        <option value="设计">设计</option>
                        <option value="论文">论文</option>
                    </select>
                </td>
                <td>设计时间</td>
                <td colspan="3">
                    <input type="text" lay-verify="required|number" name="gdTime" class="layui-input layui-input-inline" style="width:60px" value="14"> 周
                </td>
            </tr>
            <tr>
                <td>学生专业</td>
                <td>
                    <select name="majorID" class="small" id="y_major" lay-verify="required">
                    </select>
                </td>
                <td>学生人数</td>
                <td colspan="3">
                    <input class="layui-input" name="reqirestudentnum" type="text" lay-verify="required|number">
                </td>
            </tr>
            <tr>
                <td>课题类型</td>
                <td colspan="6">
                    <input type="radio" name="projecttype" checked lay-skin="primary" value="纵向科研课题" title="纵向科研课题">
                    <input type="radio" name="projecttype" lay-skin="primary" value="横向科研课题" title="横向科研课题">
                    <input type="radio" name="projecttype" lay-skin="primary" value="教师预研课题" title="教师预研课题">
                    <input type="radio" name="projecttype" lay-skin="primary" value="自选课题" title="自选课题">
                </td>
            </tr>
            <tr>
                <td>成果形式</td>
                <td colspan="6">
                    <input type="checkbox" name="resulttype" checked lay-skin="primary" value="论文" title="论文" lay-verify="resultType">
                    <input type="checkbox" name="resulttype" lay-skin="primary" value="软件"  title="软件" lay-verify="resultType">
                    <input type="checkbox" name="resulttype" lay-skin="primary" value="实物制作"  title="实物制作" lay-verify="resultType">
                    <input type="checkbox" name="resulttype" lay-skin="primary" value="图纸"  title="图纸" lay-verify="resultType">
                    <input type="checkbox" name="resulttype" lay-skin="primary" value="其它"  title="其它" lay-verify="resultType">
                </td>
            </tr>
            <tr>
                <td>主要研究内容</td>
                <td colspan="6">
                    <textarea class="layui-textarea" name="researchcontent" lay-verify="required"></textarea>
                </td>
            </tr>
            <tr>
                <td>设计目标要求</td>
                <td colspan="6">
                    <textarea name="targetrequire" class="layui-textarea" lay-verify="required"></textarea>
                </td>
            </tr>
            </tbody>
        </table>
        <span style="color:#777">说明：一式两份，交学院（直属系）审批合格后，一份学院（直属系）留底，一份发给指导教师留底。</span>
    </form>
</div>

</body>

</html>