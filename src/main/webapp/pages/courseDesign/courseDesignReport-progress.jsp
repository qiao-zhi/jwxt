<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课设管理</title>
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
    
    <script type="text/javascript" src="../../js/courseDesign/courseDesignReportProgress.js">
    </script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程设计</a>
        <a>
          <cite>报告上传情况</cite></a>
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
             <div class="layui-input-inline">
               <select name="" lay-verify="grade" lay-filter="filter" id="gradeSelect">
				  <option value="">请选择年级</option>

				</select>
            </div>
             <div class="layui-input-inline">
               <select name="" lay-verify="" lay-filter="filter" id="majorSelect" onchange="courseDesignNames();">
				  <option value="">请选择专业</option>

				</select>
            </div>
             
             <div class="layui-input-inline">
               <select name="" lay-verify="" lay-filter="filter" id="yearNum">
				  <option value="">请选择学年</option>
				</select>
            </div>
            <div class="layui-input-inline">
                <select name="" lay-verify="" lay-filter="filter" id="semester">
                    <option value="">请选择学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>

            <div class="layui-input-inline">
               <select name="" lay-verify="" id="courseDesignInfo">
				  <option value="">请选择课设</option>

				</select>
            </div>
            <div class="layui-input-inline" >
               <select name="" lay-verify="" id="classInfo">
				  <option value="">请选择班级</option>
				 
				</select>
            </div>
            <div class="layui-input-inline">
               <select name="" lay-verify="" id="uploadStatus">
				  <option value="">上传状态</option>
				  <option value="1">已上传</option>
				  <option value="0">未上传</option>
				 
				</select>
            </div>
            <button type="button" onclick="findStudentReportStatus();" class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->
    <!--操作区域-->
    <xblock>
        <button type="button" class="layui-btn" onclick="checkCDReport()">审核 </button>
    </xblock>
    	
		    <script>
			</script>
    <!--end 操作区域-->

    <!--表格内容-->
    <form>
    <table class="layui-table reportUpInfo">
        <thead>
        <tr>
            <th>
                <div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i></div>
            </th>
         	<th>序号</th>
         	<th>学生姓名</th>
            <th>学生学号</th>
            <th>课程名称</th>
            <th>教师姓名</th>
            <th>上传状态</th>
            <th>审核状态</th>
            <!--<th>开始时间</th>
            <th>结束时间</th>-->
            <!--<th>上传人</th>
            <th>课程设计安排</th>-->
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="studentReportStatus">
<!--
        <tr>
            <td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>20</td>
            <td>201700917</td>
            <td>老王</td>
            <td>学生</td>
            <td>老王</td>
            <td>未上传</td>
            <td>通过审核</td>
            <td class="td-manage">
                <a title="点击查看课设报告" onclick="checkReport();" >
                    <i class="layui-icon">&#xe63c;</i>
                </a>
            </td>
        </tr>
-->
        </tbody>
    </table>
        <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>

</body>

</html>