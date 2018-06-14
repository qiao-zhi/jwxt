<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改课程基本信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
    <!--qlq引入的课程管理的JS-->
    <script type="text/javascript" src="../../js/trainScheme/courseLibrary.js" charset="UTF-8"></script>
    <%--用于复制性新增课程的东西--%>

    <%--S    复制性新增的操作--%>
    <%--如果满足复制新增的条件就设置一全局变量标记可以复制性新增--%>
    <script type="text/javascript" charset="utf-8">
        var updateOk = false;//定义一个全局变量，如果是复制性新增新盖为true
    </script>
    <%
        String courseId=request.getParameter("courseId");
    %>
    <% if (courseId != null) { %>
    <script type="text/javascript" charset="utf-8">
        updateOk = true;
        var courseId = "<%= courseId %>";//将传过来的课程编号赋给JS的全局变量
    </script>
    <% }%>
    <%--E    复制性新增的操作--%>
    <script>
        //页面加载完成执行一些操作
        $(function () {
            updateCourseBaseInfo();//修改基本信息相关操作
            initUpdateForm();//初始化layui的修改的提交表单
            queryCourseFileInfoForDeleteFile();//查看课程教学资料信息
        })
    </script>



</head>

<body>

<div class="x-body">
    <form class="layui-form" id="updateForm">

        <%--隐藏课程主键--%>
        <input type="hidden" name="courseid" value="<%=courseId %>">


        <!--1-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课程编号
            </label>
            <div class="layui-input-inline">
                <input type="text" name="coursenum" readonly="readonly" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--1-1-->


        <!--2-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课程平台
            </label>
            <div class="layui-input-inline">
                <select name="courseplatform" lay-verify="required">
                    <option value="">请选择课程平台</option>
                    <option value="通识教育">通识教育</option>
                    <option value="学科基础课">学科基础课</option>
                    <option value="专业课程">专业课程</option>
                    <option value="个性培养">个性培养</option>
                    <option value="教学环节">教学环节</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <!--3-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课程名称
            </label>
            <div class="layui-input-inline">
                <input type="text" name="coursenamecn" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                英文名称
            </label>
            <div class="layui-input-inline">
                <input type="text" name="coursenameen" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <!--5-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课程性质
            </label>
            <div class="layui-input-inline">
                <select name="coursenature" lay-verify="required">
                    <option value="必修">必修</option>
                    <option value="选修">选修</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--6-->

        <!--7-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                学分
            </label>
            <div class="layui-input-inline">
                <input type="text" id="xuefen" name="credit" required="" lay-verify="required,number" value="" onkeyup="calculatexueshi(value)"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <!--8-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                学时
            </label>
            <div class="layui-input-inline">
                <input type="text" id="xueshi" readonly name="coursehour" required="" lay-verify="required,number" value=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <!--9-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                讲课时长
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="teachhour" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <!--10实验时长(和上机时长只能存在一个)-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                实验时长
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="experimenthour" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <!--11 上级时长 -->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                上机时长
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="computerhour" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>



        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                实践时长
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="practicehour" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--10-->

        <!--11-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                周学时分配
            </label>
            <div class="layui-input-inline">
                <input type="text" id="" name="weeklyhour" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--12-->

        <!--13-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                学时单位
            </label>
            <div class="layui-input-inline">
                <select name="coursehourmethod" lay-verify="required">
                    <option value="学时">学时</option>
                    <option value="周">周</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>
            </div>
        </div>


        <!--14-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                记分方式
            </label>
            <div class="layui-input-inline">
                <select name="scoringway" lay-verify="required">
                    <option value="五级制">五级制</option>
                    <option value="百分制">百分制</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须选择
            </div>
        </div>
        <!--15-->

        <!--16-->

        <!---->
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" lay-filter="updateCourse" lay-submit="">
                确认修改
            </button>
        </div>
        <!---->
    </form>

    <%--S 课程教学资料用于修改--%>
    <h3>教学资料信息</h3>
    <%--开始的时候表格不显示，只有当表格有数据才显示表格--%>
    <center id="promptLabel" style="display: none;">
        <h1>您还没有课程资料，请先上传培训资料</h1>
    </center>
    <table class="layui-table" style="display: none" id="courseFileTable">
        <thead>
        <tr>
            <th>资料类型</th>
            <th>资料名称</th>
            <th>删除资料</th>
        </tr>
        </thead>
        <tbody id="courseFileTbody">
        <%--异步往这里填充数据--%>
        </tbody>
    </table>
    <%--E 课程教学资料用于修改--%>




</div>
<script>

    //根据学分计算学时
    function calculatexueshi(value){
        score=$("#xuefen").val();
        var value=score*16;
        $("#xueshi").val(value);
        checkRe(score)
    }
    function checkRe(val){
        if(""==val)
            $("#xueshi").val("请输入学分");
    }
</script>

</body>

</html>