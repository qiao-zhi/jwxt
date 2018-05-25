<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>排课审核</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"  content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
</head>

<%--公共标签--%>
<%@include file="/tag.jsp"%>
<%--查看排课详细信息的js--%>
<script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookOrder.js"></script>
<script type="text/javascript" src="${baseurl}/js/orderBooks/orderBooksCommonFunction.js" charset="utf-8"></script>


<script>
    //页面加载完成执行一些操作
    //使用表单模块和弹出层模块。第二个参数是回调函数
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form, layer = layui.layer;//获取所需要的模块

        findArrageCourseDetailInfoFY();
        findAllCourseByCourseCode();

        //查询按钮事件过滤器,find,jsp中lay-filter字段
        form.on('submit(find)', function(data){
                //清空当前页和页号
                $("input[name='pageSize']").val('');
                $("input[name='pageNum']").val('');
                //调用查询方法
                findOperationInArrgeCoursePageFY();
                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });
    });

</script>

<body>

<!--主体-->
<div class="x-body">
    <form class="layui-form layui-col-md12 x-so"id="arrageCourseDetailInfoForm">
        <%--S 隐藏一些信息--%>
        <input type="hidden" name="pageNum"  id="pageNum_0"/>
        <input type="hidden" name="pageSize" id="pageSize_0"/>
        <input type="hidden" name="orderId" id="orderId" value='<%= request.getParameter("orderID")%>'/>

            <div class="layui-input-inline">
                <select name="course" id="course" lay-search="">>
                    <option value="">请选择课程</option>
                </select>
            </div>

            <div class="layui-input-inline">
                <select name="isOrder" id="isOrder">
                    <option value="">请选择订购状态</option>
                    <option value="0">未订购</option>
                    <option value="1">已订购</option>
                </select>
            </div>

            <div class="layui-input-inline">
                <select name="isConfirm" id="isConfirm">
                    <option value="">请选择确认状态</option>
                    <option value="0">未确认</option>
                    <option value="1">已确认</option>
                </select>
            </div>

            <button class="layui-btn" id="search" type="button" lay-submit="" lay-filter="find"><i class="layui-icon">&#xe615;</i></button>

    </form>
    <!--表格内容-->
    <table class="layui-table">
        <thead>

        <tr>
            <%--<th><div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">--%>
                <%--&#xe605;</i>--%>
            <%--</div>--%>
            <%--</th>--%>
            <th>序号</th>
            <th>课程名称</th>
            <th>课程编号</th>
            <th>教师名称</th>
            <th>教师编号</th>
            <th>所任班级</th>
            <th>所任人数</th>
            <!--<th>上课人数</th>-->
            <!--<th>上课周数</th>-->
            <%--<th>教材名</th>--%>
            <%--<th>订购数量</th>--%>
            <%--<th>订购状态</th>--%>
            <%--<th>确认状态</th>--%>
            <th>操作</th>

        </tr>
        </thead>
        <tbody id="ArrageCourseDetailInfoTbody">
        <%--<tr>--%>
            <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;&#xe605;</i></div>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
            <%--<td>Y0201012</td>--%>
            <%--<td>201</td>--%>
            <%--<td>老王</td>--%>
            <%--<td>男</td>--%>
            <%--<!--<td>1854-10-2</td>-->--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--&lt;%&ndash;<td>未订购</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>未确认</td>&ndash;%&gt;--%>

            <%--<td class="td-manage">--%>
                <%--<!--<a title="点击查看排课详细信息" onclick="x_admin_show('详细信息','scheduleManage-view.html')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe63c;</i>--%>
                <%--</a>-->--%>
                <%--<a title="查看订单详细信息"  onclick="x_admin_show('查看订单详细信息','orderTextbook-orderInfo.jsp')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe63c;</i>--%>
                <%--</a>--%>
                <%--&lt;%&ndash;<a title="点击修改订单"  onclick="x_admin_show('点击修改订单','orderTextBook-orderEdit.html')" href="javascript:;">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<i class="layui-icon">&#xe642;</i>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</a>&ndash;%&gt;--%>
                <%--<!--<a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe640;</i>--%>
                <%--</a>-->--%>
            <%--</td>--%>
        <%--</tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="arrageCourseDetailInfo"></div>
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
<script>
    //???
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });
        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

</script>
</body>

</html>



