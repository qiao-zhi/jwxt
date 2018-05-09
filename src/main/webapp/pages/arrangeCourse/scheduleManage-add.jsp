<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
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
    <style>
    	.layui-table-wang-info tr td:nth-child(2n){
	 	 	width: 200px;
	 	 	}
    	.layui-form-item .layui-input-inline {
		    width: 200px !important;
		}
    </style>
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
</head>
<body>
<div class="x-body">
	<table class="layui-table-wang-info">
			<tr>
		      <td>课程名称</td>
		      <td>Java高级程序语言设计</td>
		      <td>课程编号</td>
		      <td>Y12476417</td>
		    </tr> 
		    <tr>
		      <td>校区</td>
		      <td>主校区</td>
		      <td>学时</td>
		      <td>48</td>
		    </tr>
            <tr>
                <td>专业名称</td>
                <td>软件工程</td>
                <td>专业人数</td>
                <td>110</td>
            </tr>
    </table>
    <form class="layui-form ">

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                任课教师
            </label>
            <div class="layui-input-inline">
                <input type="text"  id="teacherName" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <label for="" class="layui-form-label">
                教师编号
            </label>
            <div class="layui-input-inline">
                <input type="text"  id="teacherNumber" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              历史任课教师
            </label>
            <div class="layui-input-inline">
                <select name="" lay-verify="" id="selectcalss" lay-search lay-filter="selectTeacher" >
				  <option value="">点击查看历史任课教师</option>
				  <option value="张三">张三</option>
				  <option value="李四">李四</option>
                  <option value="王二麻子">王二麻子</option>
				</select>
            </div>
            <label for="" class="layui-form-label">
                在职教师查询
            </label>
            <div class="layui-input-inline">
                <select name="" lay-verify="" lay-search="" lay-filter="selectTeacher">
                    <option value="">直接选择或搜索选择</option>
                    <option value="1">layer</option>
                    <option value="2">form</option>
                    <option value="3">layim</option>
                    <option value="4">element</option>
                    <option value="5">laytpl</option>
                    <option value="6">upload</option>
                </select>
            </div>

        </div>
        <!--3-->
        <div class="layui-form-item">
            <label class="layui-form-label">所任班级</label>
            <div class="layui-input-block">
                <input type="checkbox" name="like1" lay-skin="primary" title="写作">
                <input type="checkbox" name="like1" lay-skin="primary" title="阅读">
                <input type="checkbox" name="like1" lay-skin="primary" title="游戏">
            </div>
            <div class="layui-input-inline">
                <button class="layui-btn" onclick="addToTable()" style="margin-left: 44px;" >
                  <i class="layui-icon">&#xe608;</i> 添加至表格
                </button>
			</div>
        </div>
    </form>
    <button class="layui-btn" lay-filter="add" lay-submit="">
                  确认排课
     </button>
    <table class="layui-table">
        	<thead>
		    <tr>
		      <th>教师名称</th>
		      <th>教师编号</th>
		      <th>所任班级</th>
		      <th>操作</th>
		    </tr> 
		  </thead>
		  <tbody id="filterTeacher">
		    <tr>
		      <td>王五</td>
		      <td>2016-11-29</td>
		      <td>人生就像是一场修行</td>
		      <td class="td-manage">
                
                <a title="删除" onclick="member_del(this,'要删除的id')">
                    <i class="layui-icon">&#xe640;</i>
                </a>
            </td>
		    </tr>
		    
  			</tbody>
        </table>
        
</div>
<script>
	function addToTable(){
		var teacherNametotable=$("#courseTeacher").val();
		var teacherNumber=$("#teacherNume").val();
		var className=$("#appendGrade").val();
		console.log(teacherNametotable)
		console.log(teacherNumber)
		console.log(className)
		
	}
	
</script>

<script>
	/*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }

	//layui
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;


        //监听提交
        form.on('submit(add)', function (data) {
            console.log(data);
            //发异步，把数据提交给
            layer.alert("增加成功", {icon: 6}, function () {
                // 获得frame索引
              var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
             parent.layer.close(index);
            });
            return false;
        });
        //监听教师下拉框事件
		form.on('select(selectTeacher)', function (data) {  
		    var teacherNumber = data.value;
		    var teacherName = data.elem[data.elem.selectedIndex].text;
		    form.render('select');
		    $("#teacherName").val(teacherName);
		    $("#teacherNumber").val(teacherNumber);
        });
    });

    //初始化在职教师下拉框
    function findMajorNameAndIdForSelect(form){
        $.ajax({
            url:contextPath+"/TrainScheme/getMajorNameAndCode.action",
            dataType:"json",
            type:"post",
            success:function (response) {
                //console.log(response);
                var optionStr = "<option value=''>请输入专业</option>";
                $("select[name='majorId']").append(optionStr)
                for(var i=0;i<response.length;i++){
                    optionStr = "<option value='" + response[i].majorId+"'>"+response[i].majorName+"</option>";
                    $("select[name='majorId']").append(optionStr)
                }
                //更新渲染
                form.render('select');
            }
        })
    }
</script>

</body>

</html>