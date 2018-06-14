<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生详细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--ll nameAndId的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/commonNameAndId.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <table class="table table-bordered">
        <caption><h1>学生详细信息</h1></caption>
        <tbody>

        </tbody>
    </table>

</div>
<script>
    layui.use([],function(){
        //第一次执行
        findStudentInfo();
    });
    //查询学生基本信息
    function findStudentInfo(){
        $.ajax({
            url : contextPath+'/studentInfo/getStudentInfo.action',
            data : {"studentId":'${param.sId}'},
            type : 'POST',
            dataType : 'json',
            success : showStudentInfo
        });
    }
    function showStudentInfo(pageInfo){
        var studentInfoList = pageInfo;
        console.log(pageInfo);
        $("tbody").html("");//清空表格中数据并重新填充数据
            var tr ="<tr><td>学生学号</td><td>"
                +studentInfoList.studentnum+"</td><td>学生姓名</td><td>"
                +studentInfoList.studentname+"</td></tr><tr>"
                +"<tr><td>学院</td><td>"
                +studentInfoList.collegename+"</td><td>专业</td><td>"
                +studentInfoList.majorname+"</td></tr><tr>"
                +"<tr><td>班级</td><td>"
                +studentInfoList.classname+"</td><td>出生年月</td><td>"
                +studentInfoList.studentbirth+"</td></tr><tr>"
                +"<tr><td>性别</td><td>"
                +studentInfoList.studentsex+"</td><td>身份证</td><td>"
                +studentInfoList.idnum+"</td></tr><tr>"
                +"<tr><td>入学时间</td><td>"
                +studentInfoList.enrollmenttime+"</td><td>毕业时间</td><td>"
                +studentInfoList.endtime+"</td><td>是否毕业</td><td>"
                +studentInfoList.isgraduate+"</td></tr>";
            $("tbody").append(tr);


    }
    //分页函数
    function detailInfoListPage(total,pageNum,pageSize){
        /*分页js*/
        layui.use(['laypage', 'layer'], function(){
            var laypage = layui.laypage,layer = layui.layer;

            //完整功能
            laypage.render({
                elem: 'detailPage', //注意，这里的 test1 是 ID，不用加 # 号
                count: total, //数据总数，从服务端得到
                limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
                curr:pageNum,//当前页号
                limits:[6,10,15,20],
                layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
                jump: function(obj, first){//点击页号的时候执行的函数
                    if(!first){//首次不执行(点击的时候才执行)
                        findTaskNoticeDetailInfo(obj.curr,obj.limit);//执行查询分页函数(这个函数必须写在这里)
                    }
                }
            });
        });
    }

</script>
</body>

</html>
