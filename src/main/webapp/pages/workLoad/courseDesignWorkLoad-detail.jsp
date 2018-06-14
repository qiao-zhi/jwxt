<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设分配</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>
 <style>
 	.layui-table-wang-info{
 		width: 100%;
		margin: 10px 0;
		background-color: #fff;
		border-collapse: collapse;
		border-spacing: 0;
		padding: 0px;
		font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
		font-size: 12px;
		 	}
 	.layui-table-wang-info tr{
 		-webkit-transition: all .3s;
 		margin: 0px;
		padding: 0px;
		font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
		font-size: 12px;
		border-collapse: collapse;
		border-spacing: 0;
		 	}
 	 .layui-table-wang-info tr td{
 		text-align: center;
 		float: left;
 		/*position: relative;*/
		padding: 9px 15px;
		min-height: 20px;
		line-height: 20px;
		font-size: 14px;
		border: 1px solid #e2e2e2;
		word-break: break-all;
		 	}
	 	 .layui-table-wang-info tr td:nth-child(2n+1){
	 	 	width: 110px;
	 	 	background-color: #FBFBFB;
	 	 	box-sizing: border-box;
			
			}
	 	 .layui-table-wang-info tr td:nth-child(2n){
	 	 	width: 200px;
	 	 	}
	 	 	
 </style>

	<script type="text/javascript">
		var courseDesignTeacherArrangeID;
		$(function () {
			<%
				String courseDesignTeacherArrangeID = request.getParameter("courseDesignTeacherArrangeID");
			%>
            courseDesignTeacherArrangeID = "<%=courseDesignTeacherArrangeID%>";

            showDetailInfo();
        })

		function showDetailInfo() {
			$.ajax({
				url:contextPath + "/teachingWorkLoad/findOneTeacherCourseDesignInfo.do",
				type:"post",
				data:{"courseDesignTeacherArrangeID":courseDesignTeacherArrangeID},
				dataType:"json",
				success:function (mapInfo) {
				    $("#courseDesignName").html(mapInfo.courseDesignName);
				    $("#courseDesignNum").html(mapInfo.courseDesignNum);
                    $("#teacherName").html(mapInfo.teacherName);
                    $("#teacherNum").html(mapInfo.teacherNum);
                    $("#startTime").html("第"+mapInfo.startTime+"周");
                    $("#endTime").html("第"+mapInfo.endTime+"周");
                    $("#classNames").val(mapInfo.classNames)
					var stuList = mapInfo.stuList;  // 学生信息list
					//alert(stuList[0].studentName)
					for(var i=0;i<stuList.length;i++){
						$("#stuDiv").append(
						//    "<input type='checkbox' name='' title='"+stuList[i].studentName+"' checked='checked'  >"
                            "<div class='layui-unselect layui-form-checkbox layui-form-checked' lay-skin=''>" +
                            "<a style='display: none;'>"+stuList[i].studentID+"</a>" +
                            "<span>"+stuList[i].studentName+"</span><i class='layui-icon'></i></div>"
						);
					}
                },
				error:function () {
					layer.msg("详细信息加载失败")
                }
			})
        }

	</script>

</head>

<body>
<div class="x-body">
	<table class="layui-table-wang-info">
		<tr>
			<td>课程名称</td>
			<td id="courseDesignName"></td>
			<td>课程编号</td>
			<td id="courseDesignNum"></td>
		</tr>
		<tr>
			<td>教师名称</td>
			<td id="teacherName"></td>
			<td>教师编号</td>
			<td id="teacherNum"></td>
		</tr>
		<tr>
			<td>开始时间</td>
			<td id="startTime"></td>
			<td>结束时间</td>
			<td id="endTime"></td>
		</tr>
	</table>
    <form class="layui-form layui-form-pane">

         <div class="layui-form-item">
            <label for="" class="layui-form-label">
              所带班级
            </label>
            <div class="layui-input-inline">
            	
				<input type="" id="classNames" name="" required="" lay-verify="required" disabled  style="width: 575px;" value=""
                       autocomplete="off" class="layui-input">
            </div>
            
            
        </div>
        
         <div class="layui-form-item">
            <label for="" class="layui-form-label">
               学生列表
            </label>
            <div class="layui-input-block" id="stuDiv">
		      <%--<input type="checkbox" name="" title="张三" checked="" >--%>

		    </div>
            
        </div>
      
    </form>
</div>

<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

    });
</script>

</body>

</html>