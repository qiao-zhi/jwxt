<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>校外毕设审核管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>

    <%--s       BZY      --%>
    <%@include file="/tag.jsp" %>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/selectApply.js"></script>

    <%--3       Bzy      --%>
    <style>
        .y_files{
            color:#01AAED;
            cursor: pointer
        }
    </style>

</head>
<input type="hidden" value="${id}" id="userID"/>
<input type="hidden" value="${userInfo.username}" id="userName"/>
<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.html">首页</a>
          <a href="">毕业设计管理</a>
        <a href="">校外毕设管理</a>
        <a>
          <cite>校外毕设审核管理</cite>
        </a>
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
<div class="x-body">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">
            <div class="layui-input-inline">
                <select lay-filter="identity" name="contrller" id="identity" >
                    <option value="">请选择身份</option>

                    <shiro:hasPermission name="instructor:instructor">
                        <option value="辅导员">辅导员</option>
                    </shiro:hasPermission>

                    <shiro:hasPermission name="deputySecretary:dep">
                        <option value="副书记">副书记</option>
                    </shiro:hasPermission>

                    <shiro:hasPermission name="tutor:tutor">
                        <option value="指导教师">指导教师</option>
                    </shiro:hasPermission>

                    <shiro:hasPermission name="staffRoom:staffRoom">
                        <option value="教研室主任">教研室主任</option>
                    </shiro:hasPermission>

                    <shiro:hasPermission name="deanDepartment:dean">
                        <option value="系主任">系主任</option>
                    </shiro:hasPermission>

                    <shiro:hasPermission name="inChargeOfDean:dean">
                        <option value="主管院长">主管院长</option>
                    </shiro:hasPermission>
                </select>
            </div>
            <input type="text"  class="layui-input"  placeholder="指导教师姓名" autocomplete="off" id="inteachername" style="display: none;"readonly>
            <input type="text"  class="layui-input" id="y_year" placeholder="学年" autocomplete="off">
            <input type="text" id="major" placeholder="专业" autocomplete="off" class="layui-input">
            <input type="text" id="studentNum" placeholder="学号" autocomplete="off" class="layui-input">

            <div class="layui-input-inline">
                <select name="contrller" id="checkStatus" >
                    <option value="">全部</option>
                    <option value="未审核">未审核</option>
                    <option value="已审核">已审核</option>
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="sreach" type="button" onclick="serachStudentInfoByValue()"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th style="width: 100px;">学号</th>
            <th style="width: 70px;">学生姓名</th>
            <th>专业班级</th>
            <th style="width: 70px;">指导教师</th>
            <th>接收单位</th>
            <th style="width: 70px;">校外导师</th>
            <th style="width: 80px;">申请时间</th>
            <th style="width: 70px;">审核文件</th>
            <th style="width: 50px;">签字</th>
        </tr>
        </thead>
        <tbody id="thead-tbody">
        <%--<tr>
            <td>201700917</td>
            <td>老王</td>
            <td>软12004</td>
            <td>老王</td>
            <td>阿萨德发</td>
            <td>老王</td>
            <td>1854-10-2</td>
            <td>通过</td>
            <td class="y_files" title="点击查看审核内容" onclick="x_admin_show_big('相关申请表','./outGraduateManage-table.html')">相关申请表</td>
        </tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pagediv" style="margin-left: 200px"></div>
    <!--end 分页-->
</div>




<script>


    function xxxx() {

    }
    /*学年*/
    layui.use(['laydate','form','layer'], function () {
        var laydate = layui.laydate;
        var form = layui.form;
        var layer = layui.layer;
        //监听select选项框
        form.on('select(identity)', function(data){
//            console.log(data.elem); //得到select原始DOM对象
//            console.log(data.value); //得到被选中的值
//            console.log(data.othis); //得到美化后的DOM对象
            if(data.value=="指导教师"){
                $("#inteachername").css("display","");
                $("#inteachername").val("${userinfo.username}");
            }
            else{
                $("#inteachername").css("display","none").val("");
            }
            serachStudentInfoByValue();
        });
        laydate.render({
            elem: '#y_year' //指定元素
            ,type: 'year'
        });

    })

    //发布时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });



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
<!--2.修改模态框-->
<%--隐藏打开的index--%>

<div class="x-body" style="display: none" id="sureSign">
    <form class="layui-form" method="post" id="signInfo">
        <%--隐藏域--%>
        <input type="hidden" id="hidden_identify" name="identify"/>
        <input type="hidden" id="hidden_name" name="inTeacherName"/>
        <input type="hidden" id="hidden_update_index"/>
        <input type="hidden" id="hidden_userId" name="userId"/>
        <input type="hidden" id="hidden_outsideApplyId" name="outsideApplyID"/>
        <input type="hidden" id="hidden_leaveID" name="leaveID"/>
        <input type="hidden" id="hidden_titleID" name="titleID"/>
        <input type="hidden" id="hidden_assignmentID" name="assignmentID"/>
        <input type="hidden" id="hidden_agreementID" name="agreementID"/>
        <input type="hidden" id="hidden_attachmentID" name="attachmentID"/>

        <input type="hidden" id="hidden_sureID" name="sureID"/>
        <%--隐藏域--%>
        <div id="result">
            <input type="radio" name="result" class="agree" value="1" title="同意" checked />
            <input type="radio" name="result" class="disagree" value="0" title="不同意"/>
        </div>
        <textarea cols="50" rows="5" class="form-control advice" name="advice" id="advice"></textarea>
        <br>
        <tr>
            <td >
                签名密码：
            </td>
            <td>
                <input type="password" class="form-control" id="signPassword" name="signPassword" style="width: 180px;height: 25px;">
            </td>
            <td>
                <input onclick="sureSign();" type="button" class="layui-btn layui-btn-sm"  value="确认签名"></input>
            </td>
        </tr>
    </form>
</div>