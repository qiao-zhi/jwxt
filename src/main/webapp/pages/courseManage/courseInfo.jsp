<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../lib/layui/lay/modules/layui-xtree.js"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>


    <%--S       qlq引入的--%>
    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
    <!--qlq引入的课程管理的JS-->
    <script type="text/javascript" src="../../js/trainScheme/courseLibrary.js" charset="utf-8"></script>
    <%--页面加载完成后执行一些函数--%>
    <script>
        //页面初始化的时候执行一些JS函数
        $(function () {
            queryCourseFY();//分页查询课程信息
        });
    </script>
    <%--E         qlq引入的--%>





</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程管理</a>
        <a>
          <cite>课程信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="iconfont" style="line-height:30px">&#xe6aa;</i>
    </a>
    <a class="layui-btn layui-btn-warm layui-btn-small" style="margin-top:3px;float:right;margin-right:3px;"
       onclick="closeOther()" title="关闭其他">
        <i class="iconfont" style="line-height:30px">&#xe6b7;</i>
    </a>
</div>
<!--主体-->
<div class="layui-row">

<div class="x-body layui-col-md10" style="float: right; width: 100%;">
    <!--查询-->
    <div class="layui-row">

        <%--隐藏弹出修改窗口时候的index--%>
            <input type="hidden" id="hidden_update_index">


        <form class="layui-form layui-col-md12 x-so" id="queryCourseForm">
            <%--隐藏两个，一个当前页，一个页号--%>
                <%--当前页--%>
                <input type="hidden" name="pageNum"/>
                <input type="hidden" name="pageSize"/>

           <div class="layui-input-inline">
                <input type="text" name="coursenamecn"  placeholder="请输入课程中文名称" autocomplete="off" class="layui-input">
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
            <div class="layui-input-inline">
                <select name="credit">
                	<option value="">请选择课程学分</option>
                    <option value="0-2">0-2</option>
                    <option value="2-4">2-4</option>
                    <option value="4-1000">4分以上</option>
                </select>
            </div>

            <button class="layui-btn" type="button" onclick="queryCourseFYBtn()"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击重置查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('新增课程','./addCourse.jsp')">新增 </button>
        <button class="layui-btn" onclick="copyAndUpdateAdd()">复制性新增 </button>
        <button class="layui-btn" onclick="openUploadLayer()">上传教学资料 </button>
        <button class="layui-btn layui-btn-normal" onclick="downloadCourses()" style="float: right"><i class="layui-icon">&#xe601;</i>导出课程</button>
        <button class="layui-btn layui-btn-warm" type="button" id="importCoursesBtn" style="float: right"><i class="layui-icon">&#xe67c;</i>导入课程</button>
    </xblock>
    <!--end 操作区域-->
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>
            </th>
                <th>序号</th>
                <th>课程编号</th>
                <th>课程平台</th>
                <th>课程性质</th>
                <th>中文名称</th>
                <th>学分/学时</th>
                <th>周学时分配</th>
                <th>计分方式</th>
                <th>操作</th>
        </tr>
        </thead>
        <tbody id="courseTbody">
<%--            <tr >
                <td>
                    <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>
                </td>
                <td>1</td>
                <td>11111</td>
                <td>课程平台</td>
                <td>课程性质</td>
                <td>中文名称</td>
                <td>学分/学时</td>
                <td>周学时分配</td>
                <td>计分方式</td>
                <td class="td-manage">
                    <a title="点击查看课程详细信息" onclick="x_admin_show('详细信息','course-view.jsp')" href="javascript:;">
                        <i class="layui-icon">&#xe63c;</i>
                    </a>
                    <a title="编辑"  onclick="x_admin_show('修改','course-edit.jsp')" href="javascript:;">
                        <i class="layui-icon">&#xe642;</i>
                    </a>
                    <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                        <i class="layui-icon">&#xe640;</i>
                    </a>
                </td>
            </tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>
</div>

<script>
    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }
</script>
<!--文件上传-->
<script>
</script>
</body>

</html>