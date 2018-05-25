<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>课程教学大纲</title>
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
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookOrderConfirm.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/orderBooksCommonFunction.js" charset="utf-8"></script>

    <script>
        //页面加载完成执行一些操作
        //使用表单模块和弹出层模块。第二个参数是回调函数
        layui.use(['form', 'layer'], function () {
            $ = layui.jquery;
            var form = layui.form, layer = layui.layer;//获取所需要的模块

            //初始化专业下拉框
            findMajorNameAndIdForSelect(form);
            //获取userCode并初始化表格
            getUserCode();

            //查询按钮事件过滤器,search,jsp中lay-filter字段
            form.on('submit(search)', function(data){
                var year=$("input[name='year']").val();
                var term=$("select[name='term']").val();
                var major=$("select[name='major']").val();
                var isConfirm=$("select[name='isConfirm']").val();
                if((term!='')&&(year=='')&&(major=='')&&(isConfirm=='')){
                    layer.msg("请先输入学年！");
                }
                else {
                    //清空当前页和页号
                    $("input[name='pageSize']").val('');
                    $("input[name='pageNum']").val('');
                    //调用查询方法
                    displayTextbookOrderFY();
                    return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
                }
            });
        });

    </script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">教材管理</a>
        <a>
          <cite>教师确认订单</cite></a>
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
            <input type="hidden" name="userCode" id="userCode"/>

            <div class="layui-input-inline">
                <select name="major" id="major">
                </select>
            </div>
            <div class="layui-input-inline">
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
                <select name="isConfirm" id="isConfirm">
                    <option value="">请选择确认状态</option>
                    <option value="0">未确认</option>
                    <option value="1">已确认</option>
                </select>
            </div>
                 <button class="layui-btn" type="button" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
        </form>
        </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <!--<button class="layui-btn" onclick="x_admin_show('新增订单','./orderInfo-add.html')">新增 </button>-->
        <!--<button class="layui-btn" onclick="x_admin_show('导出','./ourseSyllabus-add.html')">导出 </button>-->
        <button class="layui-btn" type="button" onclick="confirmOrder()">确认订单 </button>
        
    </xblock>
    	
		    <%--<script>--%>
				<%--function courseSyllabusImport(){--%>
						<%--var choosePlan = 0;// 判断是否有订单被选中--%>
						<%--$(".layui-form-checkbox").each(function() { // 获取选择的订单--%>
							<%--if ($(this).hasClass("layui-form-checked")) {// 如果选中。。。--%>
								<%--choosePlan++;--%>
							<%--}--%>
						<%--})--%>
						<%--if (choosePlan>0) {--%>
							<%--layer.confirm('是否确认订单');--%>
<%--//							x_admin_show('教师确认订单','./teacherConfirm-order.html');--%>
						<%--}--%>
						<%--else {--%>
							<%--layer.alert('请先选择要确认的订单');--%>
						<%--}--%>

					<%----%>
						<%----%>

				<%--}--%>
			<%--</script>--%>
    <!--end 操作区域-->

    <!--表格内容-->
    <form>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <input type="checkbox" name="orderIdCheckbox" onclick="selectAllCheck(this)">
                </input>
            </th>
             <th>序号</th>
             <th>教材名称</th>
            <th>出版社</th>

            <th>作者</th>
            <th>单价</th>
            <th>本季征订号</th>
            <th>课程名称</th>
            <th>教师名称</th>
            <th>使用专业班级</th>
            <th>预定数量</th>
            <th>是否确认</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="textbookOrderTbody">
            <%--<tr>--%>
            <%--<td>--%>
                <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">--%>
                    <%--&#xe605;</i></div>--%>
            <%--</td>--%>
            <%--<td>20</td>--%>
            <%--<td>201700917</td>--%>
            <%--<td>老王</td>--%>
            <%--<td>1854-10-2</td>--%>
            <%--<td>软12004</td>--%>
            <%--<td>学生</td>--%>
            <%--<td>学生</td>--%>
             <%--<td>软12004</td>--%>
            <%--<td>学生</td>--%>
            <%--<td>学生</td>--%>
            <%--<td class="td-manage">--%>
                <%--<!--<a title="点击查看订单详细信息" onclick="x_admin_show('详细信息','orderInfo-view.html')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe63c;</i>--%>
                <%--</a>-->--%>
                <%--<a title="点击修改教材订购信息"  onclick="x_admin_show('修改教材订购信息','orderTextBook-orderEdit.html')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe642;</i>--%>
                <%--</a>--%>
                <%--<!--<a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">--%>
                    <%--<i class="layui-icon">&#xe640;</i>--%>
                <%--</a>-->--%>
            <%--</td>--%>
        <%--</tr>--%>
        </tbody>
    </table>
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo785444"></div>
    <!--end 分页-->
</div>

<script>
//    /*分页js*/
//    layui.use(['laypage', 'layer'], function(){
//        var laypage = layui.laypage
//            ,layer = layui.layer;
//
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

//    /*用户-删除*/
//    function member_del(obj, id) {
//        layer.confirm('确认要删除吗？', function (index) {
//            //发异步删除数据
//            $(obj).parents("tr").remove();
//            layer.msg('已删除!', {icon: 1, time: 1000});
//        });
//    }
</script>
<%--<script>--%>
    <%--//???--%>
    <%--layui.use('laydate', function () {--%>
        <%--var laydate = layui.laydate;--%>

        <%--//执行一个laydate实例--%>
        <%--laydate.render({--%>
            <%--elem: '#start' //指定元素--%>
        <%--});--%>

        <%--//执行一个laydate实例--%>
        <%--laydate.render({--%>
            <%--elem: '#end' //指定元素--%>
        <%--});--%>
    <%--});--%>
   <%----%>
<%--</script>--%>

</body>

</html>





<%--模态框--%>
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_update_index">
<div class="x-body"  style="display: none" id="updateModal">

    <form class="layui-form layui-col-md12 x-so" id="orderForm">
        <%--隐藏一些信息--%>
        <input type="hidden" name="orderDetailId" id="orderDetailId"/>
        <input type="hidden" name="textbookId" id="textbookId">
        <input type="hidden" name="textbookNum" id="textbookNum">
    </form>

    <table class="layui-table">
        <tr>
            <td>课程名称</td>
            <td name="courseName"></td>
            <td>课程编号</td>
            <td name="courseCode" id="courseCode"></td>
        </tr>
        <tr>
            <td>教师名称</td>
            <td name="teacherName"></td>
            <td>教师编号</td>
            <td name="teacherCode"></td>
        </tr>
        <tr>
            <td>所任班级</td>
            <td name="className"></td>
            <td>所任人数</td>
            <td name="personNum"></td>
        </tr>
    </table>
    <form class="layui-form">
        <!--1-->

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                推荐教材
            </label>
            <div class="layui-input-inline">
                <select name="historyTextbookName" id="historyTextbookName"  lay-search="" lay-filter="selectHistoryTextbookName">
                    <option value="">请选择历史教材</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>可选择使用历史教材
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                教材名称
            </label>
            <div class="layui-input-inline">
                <%--lay-search可输入--%>
                <select name="textbookName" id="textbookName" lay-search="" lay-filter="selectTextbookName">
                    <option value="">请选择新教材</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>可选择使用新教材
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                ISBN
            </label>
            <div class="layui-input-inline">
                <input type="text" id="isbn" name="isbn" required="" readonly lay-verify="required" value=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                出版社
            </label>
            <div class="layui-input-inline">
                <input type="text" id="publishingHouse" name="publishingHouse" required="" readonly lay-verify="required" value=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                作者
            </label>
            <div class="layui-input-inline">
                <input type="text" id="author" name="author" required="" readonly lay-verify="required" value=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                单价
            </label>
            <div class="layui-input-inline">
                <input type="text" id="price" name="price" readonly required="" lay-verify="required|number" value=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                订购数量
            </label>
            <div class="layui-input-inline">
                <input  id="textbook_number" name="textbook_number" required="" lay-verify="required|number" value=""
                        autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red"></span>默认数量为上课总人数+2
            </div>
        </div>

        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" type="button" lay-filter="update" lay-submit="">
                确认修改
            </button>
        </div>
        <!---->
    </form>
</div>