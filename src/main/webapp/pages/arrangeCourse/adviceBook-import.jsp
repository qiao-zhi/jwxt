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

</head>

<body>

<!--主体-->
<div class="x-body">

    <!--end查询-->

    <!--操作区域-->
    <xblock>
    	 <button type="button" class="layui-btn" id="adviceImport">选择文件导入 </button>
    	 
        <button class="layui-btn" onclick="adviceCommit()" style="float: right;">提交</button>
        <button class="layui-btn" onclick="adviceSave()" style="float: right; margin-right: 10px;">保存</button>
    </xblock>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	<tr>
		      <th lay-data="{field:'', width:80}" rowspan="2">课程代码</th>
		      <th lay-data="{field:'', width:120}" rowspan="2">课程名称</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">校区</th>
		      <th lay-data="{field:'', width:120}" rowspan="2">专业</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">年级</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">总人数</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">上课班级及人数</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">考查方式</th>
		       <th lay-data="{field:'', width:80}" rowspan="2">周学时</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">总学时</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">上课起始周</th>
		      <th lay-data="{align:''}" colspan="4">实验分配</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">课内周学时</th>
		      <th lay-data="{field:'', width:80}" rowspan="2">记分方式</th>
		      
		      
		    </tr>
		    <tr>
		      <th lay-data="{field:'', }">讲课</th>
		      <th lay-data="{field:'', }">实验</th>
		      <th lay-data="{field:'', }">上机</th>
		      <th lay-data="{field:'',}">实践</th>
		    </tr>
        </thead>
        <tbody>
        <tr>
           
            <td>Y0201012</td>
            <td>201</td>
            <td>老王</td>
            <td>男</td>
            <td>1854-10-2</td>
            <td>软12004</td>
            <td>学生</td>
            <td>1854-10-2</td>
            <td>软12004</td>
            <td>学生</td>
             <td>软件工程142001，软件工程142002，软件工程142003</td>
             <td>123</td>
             <td>老王</td>
            <td>男</td>
            <td>1854-10-2</td>
            <td>软12004</td>
            <td>学生</td>
            
            </td>
        </tr>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
    <!--end 分页-->
</div>

<script>
	//保存按钮
    	function adviceSave(){
    		layer.alert("保存成功")
    	}
    	//提交按钮
    	function adviceCommit(){
    		layer.confirm("您确认提交此通知书的课程吗？",function(){
    			x_admin_close()
    		})
    	}
	
			layui.use('upload', function(){
		  var upload = layui.upload;
		   
		  //执行实例
		  var uploadInst = upload.render({
		    elem: '#adviceImport' //绑定元素
		    ,url: '' //上传接口
		    ,accept:'file'
		    ,done: function(res){
		      //上传完毕回调
		    }
		    ,error: function(){
		      //请求异常回调
		    }
		  });
		});
    	
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'demo7'
            ,count: 100
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj){
                console.log(obj)
            }
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