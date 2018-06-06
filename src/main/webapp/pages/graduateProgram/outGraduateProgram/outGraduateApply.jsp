<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>校外毕设申请</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
    <%--s   bzy--%>
    <script>
        //获取全局变量
        var userID = ${id};   //获取当前学生用户ID

    </script>
    <%@include file="/tag.jsp"%>
    <script typr="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script typr="text/javascript" src="../../../js/outsideGraduateDesiner/apply.js"></script>
    <%--E   bzy--%>


    <style>
        tbody tr td:nth-child(3){
            color:#01AAED;
            cursor: pointer
        }
    </style>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../../welcome.html">首页</a>
        <a href="">毕业设计管理</a>
        <a href="">校外毕设管理</a>
        <a>
          <cite>校外毕设申请</cite>
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

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('查看校外毕设要求','./outGraduateApply-require.jsp')">查看校外毕设要求 </button>
        <button class="layui-btn" onclick="applyDownload()">下载申请资料 </button>
        <button class="layui-btn" onclick="outApplyCommit()" style="float: right;" id="commitAll">提交 </button>
    </xblock>
    <!--end 操作区域-->
    <script>
        //
        var chooseCourse=0;
        function panduan(){
            $(".layui-form-checkbox").each(function() {
                if ($(this).hasClass("layui-form-checked")) {
                    chooseCourse++;
                }
            })
        }
        //下载资料
        function applyDownload(){
            panduan();//调用判断方法
            if (chooseCourse>0) {
//  			x_admin_show('下载模板','./outGraduateApply-download.html')
                layer.confirm("确定下载选中的校外课设申请资料",function(index){
                    layer.close(index)
                })
            }
            else{
                layer.alert('请先选择需要下载的的申请信息');
            }
            chooseCourse=0;//清空值
        }

    </script>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <!--文件名称，上传成功，还能点击，-->
        <tr>
            <th style="width:50px;">
                <div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i></div>
            </th>
            <th style="width:50px;">序号</th>
            <th style="width:300px;">文件名称</th>
            <th style="width:100px;">申请状态</th>
            <th style="width:300px;">审核状态</th>
            <th>审核结果</th>
        </tr>
        </thead>
        <tbody class="thead-tbody">
        <%--<tr>
        	<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>1</td>
            <td title="点击填写" onclick="x_admin_show_big('校外毕业设计申请表','./basicInfoApply.jsp')">校外毕业设计申请</td>
            <td>未申请</td>
            <td>导员审核通过，待指导教师审核</td>
            <td>不通过</td>
        </tr>
        <tr>
        	<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>2</td>
            <td title="点击填写" onclick="x_admin_show_big('校外实践课题申请表','./outGraduatePractice.jsp')">校外实践课题申请</td>
            <td>已申请</td>
            <td>不通过</td>
            <td>不通过</td>
        </tr>
        <tr>
        	<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>3</td>
            <td title="点击填写" onclick="x_admin_show_big('请假申请表','./leaveApply.jsp')">请假申请</td>
            <td>已提交</td>
            <td>不通过</td>
            <td>不通过</td>
        </tr>
        <tr>
        	<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>4</td>
            <td title="点击填写" onclick="x_admin_show('自我管理协议和保证书','./selfManageAgreement.jsp')">自我管理协议书</td>
            <td>已提交</td>
            <td>不通过</td>
            <td>不通过</td>
        </tr>
        <tr>
        	<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>5</td>
            <td title="点击填写" onclick="x_admin_show('自我管理协议和保证书','./guarantee.jsp')">保证书</td>
            <td>已提交</td>
            <td>不通过</td>
            <td>不通过</td>
        </tr>
        <tr>
        	<td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>6</td>
            <td title="点击填写" onclick="x_admin_show_big('附件上传','./graduateStudentManage-addAssignment.jsp')">附件信息</td>
            <td>已提交</td>
            <td>不通过</td>
            <td>不通过</td>
        </tr>--%>
        </tbody>
    </table>

    <hr />
    <%--<blockquote class="layui-elem-quote">申请进度</blockquote>
    <ul class="layui-timeline">
        <li class="layui-timeline-item">
            <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
            <div class="layui-timeline-content layui-text">
                <h3 class="layui-timeline-title"></h3>
                <p>
                    导员审核通过，待指导教师审核
                </p>
            </div>
        </li>
        <li class="layui-timeline-item">
            <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
            <div class="layui-timeline-content layui-text">
                <h3 class="layui-timeline-title"></h3>
                <p>申请已提交，待导员审核</p>

            </div>
        </li>
    </ul>--%>
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
    //提交所有的申请
    function outApplyCommit(){
        var tr1 = $(".thead-tbody").children("tr:eq(0)");
        var outsideApplyId = $(tr1).data("id");
        var tr2 = $(".thead-tbody").children("tr:eq(1)");
        var titleId = $(tr2).data("id");
        var tr3 = $(".thead-tbody").children("tr:eq(2)");
        var leaveId = $(tr3).data("id");
        var tr4 = $(".thead-tbody").children("tr:eq(3)");
        var assignmentId = $(tr4).data("id");
        var tr5 = $(".thead-tbody").children("tr:eq(4)");
        var aggreementId = $(tr5).data("id");
        var tr6 = $(".thead-tbody").children("tr:eq(5)");
        var sureId = $(tr6).data("id");
        var tr7 = $(".thead-tbody").children("tr:eq(6)");
        var attachementId = $(tr7).data("id");
        //获取tr中的提交状态
        var trs = $(".thead-tbody").children("tr");
        var flag = true;
        for(var i=0;i<trs.length;i++){
            var td3 = $(trs[i]).find("td:eq(3)").text();
            if(td3=="待提交"){
                flag = false;
            }
        }
        if(flag){
            layer.confirm("您确定要提交此次校外毕设申请信息吗？文件一旦提交将无法修改，进入审批流程。",function(index){
                layer.close(index);
                commitAll(outsideApplyId,titleId,leaveId,aggreementId,sureId,attachementId,assignmentId);
            })
        } else{
            layer.confirm("您有未提交的文件，确定提交么？文件一旦提交将无法修改，进入审批流程。",function(index){
                layer.close(index);
                commitAll(outsideApplyId,titleId,leaveId,aggreementId,sureId,attachementId,assignmentId);
            })
        }
    }
    function commitAll(outsideApplyId,titleId,leaveId,aggreementId,sureId,attachementId,assignmentId){
        $.ajax({
            url:contextPath+"/baseInfo/commitODGApply.do",
            type:"post",
            data:{"outsideApplyId":outsideApplyId,"titleId":titleId,"leaveId":leaveId
                ,"aggreementId":aggreementId,"sureId":sureId,"attachementId":attachementId,
            "assignmentId":assignmentId},
            dataType:"text",
            success:function(result){
                layer.msg(result);
                window.loadFile();
            },
            error:function(){
                layer.msg("请求失败");
            }
        })
    }
</script>
</body>

</html>