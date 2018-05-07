<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课管理</title>
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
    
    <%@include file="/tag.jsp"%>
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>
</head>

<body>

<!--主体-->
<div class="x-body">
    <%--<table class="layui-table-wang-info">
        <tr>
            <td>学院</td>
            <td></td>
            <td>创建人</td>
            <td></td>
        </tr>
        <tr>
            <td>学年</td>
            <td></td>
            <td>学期</td>
            <td></td>
        </tr>
    </table>--%>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th lay-data="{field:'', width:80}">序号</th>
                <th lay-data="{field:'', width:80}">课程代码</th>
                <th lay-data="{field:'', width:120}">课程名称</th>
                <th lay-data="{field:'', width:80}">校区</th>
                <th lay-data="{field:'', width:120}">专业</th>
                <th lay-data="{field:'', width:80}">年级</th>
                <th lay-data="{field:'', width:80}">专业总人数</th>
                <th lay-data="{field:'', width:80}">上课班级</th>
                <th lay-data="{field:'', width:80}">班级人数</th>
                <th lay-data="{field:'', width:80}">总学时</th>
            </tr>
        	<%--<tr>
		      <th lay-data="{field:'', width:80}" rowspan="2">课程代码</th>
		      <th lay-data="{field:'', width:120}" rowspan="2">课程名称</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">校区</th>
		      <th lay-data="{field:'', width:120}" rowspan="2">专业</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">年级</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">总人数</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">上课班级人数</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">班级人数</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">总学时</th>
		      <th lay-data="{align:''}" colspan="4">实验分配</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">课内周学时</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">记分方式</th>
		    </tr>
		    <tr>
		      <th lay-data="{field:'', }">讲课</th>
		      <th lay-data="{field:'', }">实验</th>
		      <th lay-data="{field:'', }">上机</th>
		      <th lay-data="{field:'',}">实践</th>
		    </tr>--%>
        </thead>
        <tbody>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="detailPage"></div>
    <!--end 分页-->
</div>

<script>
    layui.use([],function(){
        //第一次执行
        findTaskNoticeDetailInfo();
    });
    //查询任务通知书基本信息
    function findTaskNoticeDetailInfo(currentPage,pageSize){
        $.ajax({
            url : contextPath+'/arrangeCourse/findNoticeDetailInfo.action',
            data : {"noticeBookId":'${param.noticeId}',"currentPage":currentPage,"pageSize":pageSize},
            type : 'POST',
            dataType : 'json',
            success : showTaskNoticeDetailInfo
        });
    }
    function showTaskNoticeDetailInfo(pageInfo){
        //console.log(response)
        var total = pageInfo.total;//页总数
        var pageNum = pageInfo.pageNum;//页号
        var pageSize = pageInfo.pageSize;//页大小
        var detailInfoList = pageInfo.list;
        $("tbody").html("");//清空表格中数据并重新填充数据
        for(var i=0,length_l = detailInfoList.length;i<length_l;i++){
            var index = (pageNum - 1) * pageSize + i + 1;
            var tr ="<tr><td>"+index+"</td><td>"
                +detailInfoList[i].courseCode+"</td><td>"
                +detailInfoList[i].courseName+"</td><td>"
                +replaceStatus(detailInfoList[i].campusCode)+"</td><td>"
                +detailInfoList[i].majorName+"</td><td>"
                +detailInfoList[i].grade+"</td><td>"
                +detailInfoList[i].majorStudentsNumber+"</td><td>"
                +detailInfoList[i].className+"</td><td>"
                +detailInfoList[i].classStudentNum+"</td><td>"
                +detailInfoList[i].totalPeriod+"</td></tr>";
            $("tbody").append(tr);
        }
        //开启分页组件
        DetailInfoListPage(total,pageNum,pageSize);
    }
    //分页函数
    function DetailInfoListPage(total,pageNum,pageSize){
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