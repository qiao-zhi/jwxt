<%--用户管理界面--%>
<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/tag.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--S  QLQ--%>
    <script type="text/javascript" src="${baseurl}/js/system/user.js"></script>
    <%--E  QLQ--%>

</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">系统管理</a>
        <a>
          <cite>用户管理</cite></a>
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
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" id="queryUserForm">
            <input type="hidden" name="pageSize">
            <input type="hidden" name="pageNum">
            <input type="text" name="username" placeholder="用户姓名" autocomplete="off" class="layui-input">
            <input type="text" name="userstuteanum" placeholder="教师编号或学生学号" autocomplete="off" class="layui-input">
            <input type="text" name="userunitname" placeholder="所属机构" autocomplete="off" class="layui-input">
            <div class="layui-input-inline">
                <select name="usersort">
                    <option value="">类型</option>
                    <option value="学生">学生</option>
                    <option value="教师">教师</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="isuse">
                    <option value="">状态</option>
                    <option value="1">启用</option>
                    <option value="0">禁用</option>
                </select>
            </div>
            <%--两个按钮--%>
            <button class="layui-btn" type="button" onclick="queryUserFY()"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击重置查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn" onclick="openAddUserModal()">添加用户</button>
        <button class="layui-btn" type="button" onclick="openBatchModal()">批量分配角色</button>
        <button class="layui-btn layui-btn-danger" onclick="deleteUserBatch()">批量删除</button>

        <%--<button class="layui-btn layui-btn-normal" onclick="downloadCourses()" style="float: right"><i class="layui-icon">&#xe601;</i>导出用户</button>--%>
        <button class="layui-btn layui-btn-warm" type="button" id="importCoursesBtn" style="float: right"><i class="layui-icon">&#xe67c;</i>导入用户</button>

    </xblock>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <input type="checkbox" onclick="toggleSelectAll(this)">
            </th>
            <th>序号</th>
            <th>用户姓名</th>
            <th>用户类型</th>
            <th>用户账户</th>
            <th>所属机构</th>
            <th>机构代码</th>
            <th>账户状态</th>
            <th>角色状态</th>
            <th>操作</th>
        </thead>
        <tbody id="userTbody">
        <%--动态往这里填数据--%>
        </tbody>
    </table>

    <!--分页-->
    <div id="pageDiv_user"></div>
    <!--end 分页-->

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

</script>
</body>
</html>


<!--1.添加用户的模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_add_user_index">
<div class="x-body" style="display: none" id="add_user_modal">
    <%--隐藏是否可以添加--%>
    <input type="hidden" id="isExisted" value="0">
    <form class="layui-form" id="addUserForm">
        <%--1.用户账户--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                用户账号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_usercode" name="usercode" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--2.用户姓名--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                用户姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_username" name="username" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--3.用户密码--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                用户密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="add_password" name="password" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--4.用户密码--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                确认密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="sure_password" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--5用户类型--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                用户类型
            </label>
            <div class="layui-input-inline">
                <select name="usersort">
                    <option value="学生">学生</option>
                    <option value="教师">教师</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--6用户机构(学生班级或者教研室名称)--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                所属机构
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_userunitname" class="layui-input clearInput" value="无" name="userunitname" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--6用户机构编码(学生班级或者教研室编号)--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                机构代码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="add_userunitnum" class="layui-input clearInput" name="userunitnum" value="无" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--7是否启用--%>
        <div class="layui-form-item">
            <label class="layui-form-label">
                账号状态
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="isuse" value="1" title="启用" checked>
                <input type="radio" name="isuse" value="0" title="禁用">
            </div>
        </div>

        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="addUser" type="button">保存</button>
        </div>
    </form>
</div>





<!--2.修改用户的模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_update_user_index">
<div class="x-body" style="display: none" id="update_user_modal">
    <form class="layui-form" id="updateUserForm">
        <%--0.隐藏UserId--%>
        <input type="hidden" name="userid" id="update_userid"/>

        <%--1.用户账户--%>
        <div class="layui-form-item">
            <label for="add_usercode" class="layui-form-label">
                用户账号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_usercode" name="usercode" readonly class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--2.用户姓名--%>
        <div class="layui-form-item">
            <label for="update_usercode" class="layui-form-label">
                用户姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_username" name="username" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--3.用户密码--%>
        <div class="layui-form-item">
            <label for="update_usercode" class="layui-form-label">
                用户密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="update_password" name="password" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--4.用户密码--%>
        <div class="layui-form-item">
            <label for="update_usercode" class="layui-form-label">
                确认密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="sure_update_password" class="layui-input clearInput" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--5用户类型--%>
        <div class="layui-form-item">
            <label for="update_usercode" class="layui-form-label">
                用户类型
            </label>
            <div class="layui-input-inline">
                <select name="usersort" id="update_usersort">
                    <option value="学生" class="update_usersort" >学生</option>
                    <option value="教师" class="update_usersort">教师</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <%--6用户机构(学生班级或者教研室名称)--%>
        <div class="layui-form-item">
            <label for="update_usercode" class="layui-form-label">
                所属机构
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_userunitname" class="layui-input clearInput" name="userunitname" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--6用户机构编码(学生班级或者教研室编号)--%>
        <div class="layui-form-item">
            <label for="update_usercode" class="layui-form-label">
                机构代码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="update_userunitnum" class="layui-input clearInput" name="userunitnum" lay-verify="required">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <%--7是否启用--%>
        <div class="layui-form-item">
            <label class="layui-form-label">
                账号状态
            </label>
            <div class="layui-input-inline">
                <input type="radio" name="isuse" value="1" title="启用" class="update_isuse" checked>
                <input type="radio" name="isuse" value="0" class="update_isuse" title="禁用">
            </div>
        </div>

        <%--提交按钮--%>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit lay-filter="updateUser" type="button">修改</button>
        </div>
    </form>
</div>


<!--3.给单个用户分配角色的模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_set_oneUserRole_index">
<div class="x-body" style="display: none" id="set_oneUserRole_modal">
    <input type="hidden" id="hidden_one_userId">
    <table class="layui-table">
        <thead>
        <tr>
            <th><input type="checkbox" onclick="toggleSelectAllRole4Oneuser(this)"></th>
            <th>角色名称</th>
            <th>角色描述</th>
        </tr>
        </thead>
        <tbody id="roleOneUserTbody">
        <%--动态填充数据--%>
        </tbody>
    </table>
    <hr/>
    <%--提交按钮--%>
    <button class="layui-btn" type="button"  onclick="sureSetRoleOne()" style="float: right">确认分配</button>
</div>




<!--4.批量分配角色的模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_set_batchUserRole_index">
<div class="x-body" style="display: none" id="set_batchUserRole_modal">
    <table class="layui-table">
        <thead>
        <tr>
            <th><input type="checkbox" onclick="toggleSelectAllRole4Batchuser(this)"></th>
            <th>角色名称</th>
            <th>角色描述</th>
        </tr>
        </thead>
        <tbody id="roleBatchUserTbody">
        <%--动态填充数据--%>
        </tbody>
    </table>
    <hr/>
    <%--提交按钮--%>
    <button class="layui-btn" type="button" style="float: right" onclick="sureSetRoleBatch()">确认分配</button>
</div>




<!--5.查询已分配的用户的角色-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_view_oneUserRole_index">
<div class="x-body" style="display: none" id="view_oneUserRole_modal">
    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>角色名称</th>
            <th>角色描述</th>
        </tr>
        </thead>
        <tbody id="viewRoleOneUserTbody">
        <%--动态填充数据--%>
        </tbody>
    </table>
</div>





