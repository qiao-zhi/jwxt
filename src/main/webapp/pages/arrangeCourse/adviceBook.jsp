<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>通知书管理</title>
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

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--ll 通知书管理的js--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/adviceBook.js"></script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">排课管理</a>
        <a>
          <cite>通知书管理</cite></a>
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
        <form class="layui-form layui-col-md12 x-so" id="selectNoticeInfoForm">
        	
            <div class="layui-input-inline">
                <select name="contrller">
                    <option value="">请输入学院</option>
                    <option value="1">计算机科学与技术学院</option>
                    <option value="2">机械学院</option>
                    <option value="3">法学院</option>
                    <option value="4">经济管理学院</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="contrller">
                	<option value="">请输入学年</option>
                    <option value="2014-2015学年">2014-2015学年</option>
                    <option value="2015-2016学年">2015-2016学年</option>
                    <option value="2016-2017学年">2016-2017学年</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="contrller">
                	<option value="">请输入学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>
        	
            <div class="layui-input-inline">
                 <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
            </div>
            <%--隐藏当前页和当前页显示条数--%>
            <input type="hidden" name="pageSize"/>
            <input type="hidden" name="currentPage"/>

        </form>
    </div>
    <!--end查询-->

    
    <xblock>
	<button class="layui-btn" onclick="addTask()" >新增</button>
	<button class="layui-btn" onclick="allotCourse()" >导入课程</button>
	</xblock>
	<script>
		//新增任务
		function addTask(){
			x_admin_show('新增通知书','./adviceBook-add.jsp')
		}
		var chooseCourse=0;//判断是否选中课程
    	function panduan(){
    		$(".layui-form-checkbox").each(function() { 
				if ($(this).hasClass("layui-form-checked")) {
					chooseCourse++;
				}
			})
    	}
    	//分配课程
    	function allotCourse(){
    		panduan();//调用判断方法
    		if (chooseCourse>0) {
    			if(chooseCourse===1){
    				x_admin_show('导入课程','./adviceBook-import.jsp')
    			}else{
    				layer.alert('每次只可为一个通知书导入课程');
    			}
					}
    		else{
    			layer.alert('请先选择需要导入课程的通知书');
    		}
    		chooseCourse=0;//清空值
    	}
    	//接收任务
    	function accept(){
    		panduan();//调用判断方法
    		if (chooseCourse>0) {
    			layer.confirm("您确定接收选中的教学任务？")
					}
    		else{
    			layer.alert('请先选择需要接收的任务');
    		}
    		chooseCourse=0;//清空值
    	}
	</script>
    <!--表格内容-->
    <table class="layui-table">
        <thead>
        	
        	<tr>
                <th>
                    <%--<div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i>
                    </div>--%>
                </th>
         	<th>序号</th>
            <th>学院名称</th>
            <th>学年</th>
            <th>学期</th>
            <th>创建人</th>
            <th>创建时间</th>
            <th>状态</th>
            <th>操作</th>
		    </tr>
        </thead>
        <tbody id="noticeBaseInfoList">
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="noticePage"></div>
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

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }
</script>

</body>

</html>