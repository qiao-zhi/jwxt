<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>订购教材</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"  content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>


    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
    <!--引入的教材库管理的JS-->
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookOrder.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/orderBooksCommonFunction.js" charset="utf-8"></script>

    <script>
        //页面加载完成执行一些操作
        //使用表单模块和弹出层模块。第二个参数是回调函数
        layui.use(['form', 'layer'], function () {
            $ = layui.jquery;
            var form = layui.form, layer = layui.layer;//获取所需要的模块

            //初始化专业下拉框
            findMajorNameAndIdForSelect(form);
            //初始化表格
            openNewTaskDialog();

            //查询按钮事件过滤器,search,jsp中lay-filter字段
            form.on('submit(search)', function(data){
                var year=$("input[name='year']").val();
                var term=$("select[name='term']").val();
                var major=$("select[name='major']").val();
                var isOrder=$("select[name='isOrder']").val();
                if((term!='')&&(year=='')&&(major=='')&&(isOrder=='')){
                    layer.msg("请先输入学年！");
                }
                else {
                    //清空当前页和页号
                    $("input[name='pageSize']").val('');
                    $("input[name='pageNum']").val('');
                    //调用查询方法
                    findTextbookOrderFY();
                    return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
                }
            });
        });

    </script>

    <%--<script>--%>
        <%--$(function () {--%>
            <%--//页面加载完成执行一些操作--%>
            <%--//alert($("#orderID").val())--%>
        <%--})--%>
    <%--</script>--%>
       <%----%>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程管理</a>
        <a>
          <cite>订购教材</cite></a>
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
        <form class="layui-form layui-col-md12 x-so" id="findTextbookOrderForm">

            <%--S 隐藏一些信息--%>
            <input type="hidden" name="pageNum"  id="pageNum_0"/>
            <input type="hidden" name="pageSize" id="pageSize_0"/>
            <input type="hidden" name="roomname" id="roomname"/>
            <input type="hidden" name="setyear" id="setyear"/>
            <input type="hidden" name="semester" id="semester"/>
            <input type="hidden" name="nowOrderid" id="nowOrderid">

            <div class="layui-input-inline">
                <select name="major" id="major">
                </select>
            </div>
            <div class="layui-input-inline">
                <%--<select name="year">--%>
                    <%--&lt;%&ndash;<option>请输入学年</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<option>2014-2015学年</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<option>2015-2016学年</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<option>2016-2017学年</option>&ndash;%&gt;--%>
                <%--</select>--%>
                <input id="year" name="year" class="layui-input" placeholder="请输入学年"  lay-key="1"/>
            </div>
            <div class="layui-input-inline">
                <select name="term" id="term">
                    <option value="">请选择学期</option>
                    <option value="1">第一学期</option>
                    <option value="2" >第二学期</option>

                </select>
            </div>

            <div class="layui-input-inline">
                <select name="isOrder">
                    <option value="">请选择状态</option>
                    <option value="0">未订购</option>
                    <option value="1">已订购</option>
                </select>
            </div>

            <button class="layui-btn" id="search" type="button" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>



    </form>
    </div>
</div>
    <div class="layui-input-inline">
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>

        <%--<button class="layui-btn" onclick="orderTextBookHistory()">历史教材订购信息 </button>--%>
        <button class="layui-btn" onclick="openModal()">历史教材订购信息 </button>

    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>

        <tr>
            <%--<th><input type="checkbox" name="orderIdCheckbox" onclick="selectAllCheck(this)">--%>
            <%--</input>--%>
            <%--</th>--%>
            <th></th>
            <th>所属教研室</th>
            <th>学年</th>
            <th>学期</th>
            <th>创建人</th>
            <th>创建时间</th>
            <th>订购状态</th>
            <th>操作</th>

        </tr>
        </thead>
        <tbody id="textbookOrderTbody">
        <%--<tr>--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">--%>
                    <%--&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>Y0201012</td>--%>
            <%--<td>201</td>--%>
            <%--<td>未订购</td>--%>
            <%--<td>未确认</td>--%>
            <%--<td>未订购</td>--%>
            <%--<td>未确认</td>--%>

            <%--<td class="td-manage">--%>
                <%--<a title="点击查看排课详细信息" onclick="x_admin_show_big('详细信息','orderTextbook-info.jsp')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe63c;</i>--%>
                <%--</a>--%>
                <%--<!--<a title="修改"  onclick="x_admin_show('修改','orderTextBook-orderEdit.jsp')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe642;</i>--%>
                <%--</a>-->--%>
                <%--<!--<a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe640;</i>--%>
                <%--</a>-->--%>
            <%--</td>--%>
        <%--</tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="textbookOrder"></div>
    <!--end 分页-->
</div>

<script>

//    var chooseCourse=0;//判断是否选中课程
//    function panduan(){
//        $(".layui-form-checkbox").each(function() {
//            if ($(this).hasClass("layui-form-checked")) {
//                chooseCourse++;
//            }
//        })
//    }
//    function orderTextBookHistory(){
////  		x_admin_show('根据历史信息订购教材','orderTextBook-history.html')
//        panduan();//调用判断方法
//        if (chooseCourse>0) {
//            if(chooseCourse==1){
//                x_admin_show('根据历史信息订购教材','orderTextBook-history.html')
//            }else{
//                layer.alert('每次只能选择一条订单');
//            }
//        }
//        else{
//            layer.alert('请先选择需要订购教材的订单');
//        }
//        chooseCourse=0;//清空值
//    }

    /*分页js*/
//    layui.use(['laypage', 'layer'], function(){
//        var laypage = layui.laypage
//            ,layer = layui.layer;
//        //完整功能
//        laypage.render({
//            elem: 'demo7'
//            ,count: 100
//            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
//            ,jump: function(obj){
//                console.log(obj)
//            }
//        });
//    });
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
//    function member_del(obj, id) {
//        layer.confirm('确认要删除吗？', function (index) {
//            //发异步删除数据
//            $(obj).parents("tr").remove();
//            layer.msg('已删除!', {icon: 1, time: 1000});
//        });
//    }
</script>

</body>

</html>



<%--模态框--%>
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_update_index">
<div class="x-body"  style="display: none" id="updateModal">
    <!--查询-->
    <!--<div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            <div class="layui-input-inline">
                <select name="">
                	<option>请输入专业</option>
                    <option>软件工程</option>
                    <option>物联网</option>
                    <option>计算机</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="">
                	<option>请输入学年</option>
                    <option>2014-2015学年</option>
                    <option>2015-2016学年</option>
                    <option>2016-2017学年</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="contrller">
                	<option>请选择学期</option>
                    <option>第一学期</option>
                    <option>第二学期</option>

                </select>
            </div>
                 <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>

            </div>

        </form>-->
    <!--<div class="layui-input-inline">
</div>-->
    <!--end查询-->

    <!--操作区域-->
    <xblock>

        <button class="layui-btn" onclick="useHistoryTextbook()" id="">使用 </button>
        <!--<button class="layui-btn" onclick="orderTextBookHistory()" id="">历史教材订购信息 </button>
        <button class="layui-btn" style="float: right;" onclick="commit()" id="">提交 </button>
        <button class="layui-btn" style="float: right;" onclick="save()" id="">保存 </button>-->
    </xblock>
    <!--end 操作区域-->
    <script>
//        var chooseCourse=0;//判断是否选中课程
//        function panduan(){
//            $(".layui-form-checkbox").each(function() {
//                if ($(this).hasClass("layui-form-checked")) {
//                    chooseCourse++;
//                }
//            })
//        }
//        function orderHistoryUse(){
//
//            panduan();//调用判断方法
//            if (chooseCourse>0) {
//                layer.confirm('确认使用历史订购信息吗？',function(){
//                    var index = parent.layer.getFrameIndex(window.name);
//                    parent.layer.close(index);
//                });
////							var index = parent.layer.getFrameIndex(window.name);
////			                parent.layer.close(index);
////
//
//            }
//            else{
//                layer.alert('请先选择需要使用的历史订购信息');
//            }
//            chooseCourse=0;//清空值
//        }
        //  	function orderTextBook(){
        //  		panduan();//调用判断方法
        //  		if (chooseCourse>0) {
        //  			if(chooseCourse==1){
        //  				x_admin_show('订购教材','orderTextBook-order.jsp')
        //  			}else{
        //  				layer.alert('每次只能为一门课程订购教材');
        //  			}
        //						}
        //  		else{
        //  			layer.alert('请先选择需要订购教材的课程');
        //  		}
        //  		chooseCourse=0;//清空值
        //  	}
        //
        //  	//保存按钮事件
        //		function save(){
        //			layer.alert('保存成功');
        //		}
        //		//提交按钮事件
        //		function commit(){
        //			layer.confirm('您确认要提交此次教材订购信息吗？');
        //		}
    </script>
    <!--表格内容-->
    <table class="layui-table">
        <thead>

        <tr>
            <th><input type="checkbox" name="orderIdCheckbox" onclick="selectAllCheck(this)">
            </input>
            </th>
            <%--<th><div class="checkbox" lay-skin="primary"><i class="layui-icon">--%>
                <%--&#xe605;</i>--%>
            <%--</div>--%>
            <%--</th>--%>
            <th>课程名称</th>
            <th>课程编号</th>
            <th>教师名称</th>
            <th>教师编号</th>
            <th>所任班级</th>
            <!--<th>上课人数</th>-->
            <!--<th>上课周数</th>-->
            <th>教材名</th>
            <th>出版社</th>
            <th>ISBN</th>
            <th>单价</th>
            <th>订购数量</th>


        </tr>
        </thead>
        <tbody id="historyTextbookOrderTbody">
        <%--<tr>--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">--%>
                    <%--&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<!--<td>1854-10-2</td>-->--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>
            <%--<td></td>--%>

            <!--<td class="td-manage">
                <a title="点击查看排课详细信息" onclick="x_admin_show('详细信息','scheduleManage-view.html')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
                <a title="修改"  onclick="x_admin_show('修改','scheduleManage-edit.html')" href="javascript:;">
                    <i class="layui-icon">&#xe642;</i>
                </a>
                <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                    <i class="layui-icon">&#xe640;</i>
                </a>
            </td>-->
        <%--</tr>--%>
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7111"></div>
    <!--end 分页-->
</div>



