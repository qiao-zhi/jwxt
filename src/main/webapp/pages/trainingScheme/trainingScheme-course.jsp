<!--培养方案课程类别和培养方案课程管理界面-->
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@include file="/tag.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>培养方案-课程管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>

    <!--树-->
    <link rel="stylesheet" href="../../lib/zTree/demo.css" type="text/css">
    <link rel="stylesheet" href="../../lib/zTree/zTreeStyle/zTreeStyle.css" type="text/css">

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.exedit.js"></script>

    <!--S  qlq引入的 -->
    <%--<link rel="stylesheet" href="${baseurl}/lib/bootstrap/css/bootstrap.css">--%>
    <script type="text/javascript" src="${baseurl}/js/trainScheme/trainSchemeCourseManage.js"></script>
    <% String trainSchemeId = request.getParameter("trainSchemeId"); %>

    <!--E  qlq引入的 -->

</head>
<style>
    <%--S  QLQ--%>
    .semesterInput {
        width: 60px;
    }

    <%--E  QLQ--%>

    .el_leftTree {
        width: 15%;
        float: left;
    }

    .el_treeTitle {
        display: block;
        font-size: 15px;
        padding: 20px;
        padding-bottom: 0;
    }

    ul.ztree {
        width: 100%;
        background-color: white;
        height: auto;
        border: 0;
        padding-bottom: 30px;
        overflow-y: auto;
        text-align: center;
    }

    /*树对应的相关按钮*/
    .ztree li span.button.add {
        margin-left: 2px;
        margin-right: -1px;
        background-position: -144px 0;
        vertical-align: top;
        *vertical-align: middle
    }
</style>

<body>
<!--隐藏培养方案编号到这里-->
<input type="hidden" name="trainSchemeId" id="trainSchemeId" value="<%= trainSchemeId %>">

<!--树-->
<div style="width:16%;float:left;">
    <br/>
    <span>&nbsp;&nbsp;课程类别&nbsp;&nbsp;&nbsp; <i class="layui-icon" title="点击刷新树" onclick="javascript:getTypeTree()">&#x1002;</i></span>
    &nbsp;&nbsp;
    <button class="layui-btn layui-btn-sm layui-btn-radius" type="button" onclick="openArrangeCourseModal()">排课</button>
    <hr>
    <ul id="treeDiv" class="ztree"></ul>
</div>

<!--主体-->
<div class="x-body" style="width:80%;float:right">

    <!--S   培养方案的基本信息-->
    <div style="float: right">
        <i style="right: 20px;" class="layui-icon"  title="点击隐藏培养方案基本信息"  onclick="toggleTrainSchemeBaseInfoDiv(this)">&#xe63c;</i>
        <i style="right: 20px;" class="layui-icon"  title="点击刷新当前页面"  onclick="javascript:window.location.reload()">&#x1002;</i>
    </div>


    <div id="trainSchemeBaseInfo">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
            <legend>
                <a name="zero" style="font-size: 14px">培养方案基本信息</a>
            </legend>
        </fieldset>
        <table class="layui-table">
            <thead>
            <tr>
                <th>培养方案名称</th>
                <th>专业名称</th>
                <th>专业代码</th>
                <th>学科门类</th>
                <th>专业负责人</th>
                <th>修订人</th>
                <th>修订时间</th>
            </tr>
            </thead>
            <tbody id="trainSchemeBaseInfoTbody">
            <!--动态填充数据-->
            </tbody>
        </table>
    </div>
    <br/>
    <!--E   培养方案的基本信息-->


    <!--S   培养方案课程的信息-->
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
        <legend><a name="one" style="font-size: 14px">培养方案课程信息</a></legend>
    </fieldset>


    <!--S    查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="queryTrainCourseForm">
            <%--S 隐藏一些信息--%>
            <input type="hidden" name="trainSchemeId" value="<%= trainSchemeId%>" id="queryTrainCourseTrainshemeId"/>
            <input type="hidden" name="pageNum"  id="pageNum_0"/>
            <input type="hidden" name="pageSize" id="pageSize_0"/>
            <%--课程类别编号信息--%>
            <input type="hidden" name="typeNum" id="typeNum_0"/>
            <%--E 隐藏一些信息--%>
            <input type="text" name="courseNameCN" placeholder="课程名称" title="请输入课程名称" autocomplete="off"
                   class="layui-input">
            <input type="text" name="courseNum" placeholder="课程编号" title="请输入课程编号" autocomplete="off"
                   class="layui-input">
            <div class="layui-input-inline">
                <select name="courseNature">
                    <option value="">课程性质</option>
                    <option value="选修">选修</option>
                    <option value="必修">必修</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="coursePlatform">
                    <option value="">请选择课程平台</option>
                    <option value="通识教育">通识教育</option>
                    <option value="学科基础课">学科基础课</option>
                    <option value="专业课程">专业课程</option>
                    <option value="个性培养">个性培养</option>
                    <option value="教学环节">教学环节</option>
                </select>
            </div>
            <%--一个查询按钮--%>
            <button class="layui-btn layui-btn-sm" type="button" onclick="queryTrainCourseByCondition()"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-sm" type="button" title="清空条件重新查询" onclick="clearConAndQueryTrainCourse(this)"><i class="layui-icon">&#xe639;</i></button>
            <%--一个清空条件查询牛--%>
            <%--<button class="layui-btn"><i class="layui-icon">&#xe615;</i></button>--%>
        </form>
    </div>
    <!--E    查询-->

    <!--S    按钮-->
    <div class="layui-row">
        <button class="layui-btn layui-btn-sm" type="button" onclick="openAddCourseCapacityModal()">安排课程能力</button>
        <button class="layui-btn layui-btn-sm layui-btn-danger" type="button" onclick="deleteTrainCourseBatch()">批量删除</button>
    </div>
    <!--E    按钮-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <input type="checkbox" onclick="toggleSelectAndNotSelect(this)">
            </th>
            <th>序号</th>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>所属类别</th>
            <th>学期</th>
            <th>课程平台</th>
            <th>课程性质</th>
            <th>学分/学时</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="trainCourseTbody">
        <%--动态JS填充数据--%>
        </tbody>
    </table>
    <!--分页-->
    <div id="trainCoursePage"></div>
    <!--end 分页-->
    <!--S   培养方案课程的信息-->
</div>

</body>
</html>


<!--一些模态框-->

<%--1.S       添加课程类别模态框--%>

<input type="hidden" id="hidden_addType_index">
<div class="x-body" style="display: none" id="addTypeModal">
    <form class="layui-form" id="addCourseTypeForm">
        <!--隐藏一些信息-->
        <%--上级类别编号--%>
        <input type="hidden" name="uptypenum" id="addType_uptypenum" class="clear-input">
        <%--培养方案编号--%>
        <input type="hidden" name="trainingschemeid" id="add_trainingschemeid" class="clear-input">

        <!--0.上级课程类别名称-->
        <div class="layui-form-item">
            <label for="addType_upTypeName" class="layui-form-label">
                上级类别
            </label>
            <div class="layui-input-inline">
                <input type="text" id="addType_upTypeName" name="upTypeName" disabled class="layui-input clear-input"
                       value="">
            </div>
        </div>

        <!--1.字典名称-->
        <div class="layui-form-item">
            <label for="typename" class="layui-form-label">
                类别名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="typename" name="typename" lay-verify="required"
                       autocomplete="off" class="layui-input clear-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <!--2 类别描述-->
        <div class="layui-form-item layui-form-text">
            <label for="addType_remark" class="layui-form-label">
                类别描述
            </label>
            <div class="layui-input-inline">
                <input type="text" name="remark" lay-verify="required" id="addType_remark"
                       autocomplete="off" class="layui-input clear-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="addCourseType" type="button">保存</button>
        </div>
    </form>
</div>

<%--E添加课程类别模态框--%>


<%--2.S       安排课程模态框--%>
<input type="hidden" id="hidden_arrangeCourse_index">
<div class="x-body layui-col-md10" style="display: none" id="arrangeCourseModal">
    <div class="layui-row">
        <!--隐藏培养方案课程类别Num,用于最后提交数据-->
        <input type="hidden" name="trainCourseTypeNum" id="trainCourseTypeNum">
        <input type="hidden" name="trainCourseTypeName" id="trainCourseTypeName">
        <form id="add_trainCourseForm">
            <!--动态往这里写数据-->
        </form>
        <form class="layui-form layui-col-md12 x-so" id="queryCourseForm">
            <%--隐藏两个，一个当前页，一个页号--%>
            <%--当前页--%>
            <input type="hidden" name="pageNum" id="pageNum_1"/>
            <input type="hidden" name="pageSize" id="pageSize_1"/>
            <%--培养方案编号--%>
            <input type="hidden" name="trainSchemeId" id="trainSchemeId_queryCourse" value="<%= trainSchemeId%>"/>


            <div class="layui-input-inline">
                <input type="text" name="coursenamecn" placeholder="请输入课程中文名称" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-input-inline">
                <select name="courseplatform">
                    <option value="">请选择课程平台</option>
                    <option value="通识教育">通识教育</option>
                    <option value="学科基础课">学科基础课</option>
                    <option value="专业课程">专业课程</option>
                    <option value="个性培养">个性培养</option>
                    <option value="教学环节">教学环节</option>
                </select>
            </div>

            <div class="layui-input-inline">
                <select name="coursenature">
                    <option value="">请选择课程性质</option>
                    <option value="必修">必修</option>
                    <option value="选修">选修</option>
                </select>
            </div>
            <button class="layui-btn" type="button" onclick="queryCourseFYBtn()"><i class="layui-icon">&#xe615;</i>
            </button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)'
                    title="点击重置查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <div class="layui-row">
        <button class="layui-btn" type="button" onclick="openCourse2addModal()">分配课程</button>
    </div>


    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <input type="checkbox" onclick="selectAllCheckbox(this)">
            </th>
            <th>序号</th>
            <th>课程编号</th>
            <th>课程平台</th>
            <th>课程性质</th>
            <th>中文名称</th>
            <th>学分/学时</th>
            <th>周学时分配</th>
            <th>计分方式</th>
        </tr>
        </thead>
        <tbody id="courseTbody">
        <%--动态往这里写数据--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>


<%--2.E       安排课程模态框--%>


<%--3.S       存放选好的课程的模态框(最后提交)--%>
<input type="hidden" id="hidden_courses_2add">
<div class="x-body layui-col-md10" style="display: none" id="course2addModal">
    <%--最后需要提交的大表单，需要动态提交--%>
    <form id="Course2AddForm">
        <!--动态往这里写数据-->
    </form>

    <div class="layui-row">
        <button class="layui-btn" type="button" onclick="allocateCourse()">确认分配</button>
    </div>

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>课程名称</th>
            <th>课程编号</th>
            <th>学期
                <select name="" id="" style="width: 80px;height: auto" onchange="changeSemester(this)">
                    <option value=""></option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                </select>
            </th>
        </tr>
        </thead>
        <tbody id="course2AddTbody">
        <%--动态往这里写数据--%>
        </tbody>
    </table>
    <!--end 表格内容-->
</div>
<%--3.E       安排课程模态框--%>




<%--4.S       安排课程能力模态框--%>
<input type="hidden" id="hidden_courses_capacity_index">
<div class="x-body layui-col-md10" style="display: none" id="courses_capacity_add_modal">
    <%--最后需要提交的大表单，需要动态提交--%>
    <form id="CourseCapacity2AddForm">
        <!--动态往这里写数据-->
    </form>

    <div class="layui-row">
        <button class="layui-btn" type="button" onclick="allocateCourse()">确认分配</button>
    </div>

    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th>序号</th>
                <th>课程名称</th>
                <th>课程编号</th>
                <th title="XXXX能力">G1</th>
                <th title="xxx能力2">G2</th>
            </tr>
        </thead>
        <tbody id="courseCapacity2AddTbody">
            <%--动态往这里写数据--%>
            <tr>
                <td>1 <input type="hidden" ></td>
                <td>英语课</td>
                <td>数学课</td>
                <td><input type="checkbox" name="" class="XX"></td>
                <td><input type="checkbox" name=""></td>
            </tr>
        </tbody>
    </table>
    <!--end 表格内容-->
</div>
<%--4.E       安排课程能力模态框--%>



<%--5.S       修改培养方案课程学期--%>
<input type="hidden" id="hidden_update_semester_index">
<div class="x-body layui-col-md10" style="display: none" id="hidden_update_semester_modal">
    <form class="layui-form" id="updateSemesterForm" >
        <!--隐藏一些信息-->
        <%--隐藏培养方案课程编号--%>
        <input type="hidden" name="traincourseid" id="update_traincourseid" class="clear-input">

        <!--1.课程编号-->
        <div class="layui-form-item">
            <label for="typename" class="layui-form-label">
                课程编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="updateCourseNum" disabled readonly lay-verify="required"
                       autocomplete="off" class="layui-input clear-input">
            </div>
        </div>


        <!--2.课程名称-->
        <div class="layui-form-item">
            <label for="typename" class="layui-form-label">
                课程名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="updateCourseName" disabled readonly lay-verify="required"
                       autocomplete="off" class="layui-input clear-input">
            </div>
        </div>

        <!--3.学期-->
        <div class="layui-form-item">
            <label for="typename" class="layui-form-label">
                学期
            </label>
            <div class="layui-input-inline">
                <input type="text" id="updatesemester" name="semester" lay-verify="required"
                       autocomplete="off" class="layui-input clear-input">
            </div>
        </div>

        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn"  type="button" onclick="updateTrainCourse()">确认修改</button>
        </div>
    </form>

</div>
<%--5.E       修改培养方案课程学期--%>
















