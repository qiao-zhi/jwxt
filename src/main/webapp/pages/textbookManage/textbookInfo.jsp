<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课程进度管理</title>
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


    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
    <!--引入的教材库管理的JS-->
    <script type="text/javascript" src="../../js/orderBooks/TextbookRepository.js" charset="utf-8"></script>

    <script>
        //页面加载完成执行一些操作
        $(function () {
            findTextbookFY();
        })
    </script>

</head>
<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">教材管理</a>
        <a>
          <cite>教材库管理</cite></a>
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
        <form class="layui-form layui-col-md12 x-so" id="findTextbookForm">

            <%--S 隐藏一些信息--%>
            <input type="hidden" name="pageNum"  id="pageNum_0"/>
            <input type="hidden" name="pageSize" id="pageSize_0"/>

            <input type="" name="textbookName" placeholder="请输入教材名称" autocomplete="off" class="layui-input">
            <input type="" name="courseName" placeholder="请输入课程名称" autocomplete="off" class="layui-input">
            <!--<div class="layui-input-inline">
                <select name="" lay-verify="">
				  <option value="">请选择资料类别</option>
				  <option value="010">doc</option>
				  <option value="021">video</option>
				</select>
            </div>-->
            <button class="layui-btn" type="button" onclick="findTextbookFYBtn()"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('新增教材','./textbookInfo-add.jsp')">新增 </button>
       
    </xblock>
    	
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <!--<th>
                <div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i></div>
            </th>-->
         	<th>序号</th>
            <th>编号</th>
            <th>教材名称</th>
            <th>出版社</th>
            <th>作者</th>
            <th>ISBN</th>
            <th>单价</th>
            <th>课程名称</th>
            
            
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="textbookTbody">
        <%--<tr>--%>
            <%--<!--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">--%>
                    <%--&#xe605;</i></div>--%>
            <%--</td>-->--%>
            <%--<td>201700917</td>--%>
            <%--<td>201700917</td>--%>
            <%--<td>老王</td>--%>
            <%--<td>1854-10-2</td>--%>
            <%--<td>201700917</td>--%>
            <%--<td>201700917</td>--%>
            <%--<td>201700917</td>--%>
            <%--<td>201700917</td>--%>
            <%----%>
            <%----%>
            <%--<td class="td-manage">--%>
                <%--<!--<a title="点击查看教材详细信息" onclick="x_admin_show('详细信息','textbookInfo-view.html')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe63c;</i>--%>
                <%--</a>-->--%>
                <%--<a title="点击修改教材信息"  onclick="x_admin_show('修改','textbookInfo-edit.jsp')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe642;</i>--%>
                <%--</a>--%>
                <%--<a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe640;</i>--%>
                <%--</a>--%>
            <%--</td>--%>
        <%--</tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
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