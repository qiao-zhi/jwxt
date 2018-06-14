<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
    <%--查看排课详细信息的js--%>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/TextbookOrder.js"></script>
    <script type="text/javascript" src="${baseurl}/js/orderBooks/orderBooksCommonFunction.js" charset="utf-8"></script>

    <script>
        //页面初始化执行函数
        $(function () {
            findOrderDetailInfo('<%= request.getParameter("orderDetailId")%>');
            //debugger//控制台调试
        })
    </script>
</head>

<body>
<div class="x-body">

    <form class="layui-form layui-col-md12 x-so" id="orderForm">
    <%--隐藏一些信息--%>
         <input type="hidden" name="orderDetailId" id="orderDetailId" value="<%= request.getParameter("orderDetailId")%>"/>
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
                <input type="text" id="price" name="price" readonly required="" lay-verify="required" value=""
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
              <button class="layui-btn" type="button" lay-filter="order" lay-submit="">
                  确认订购
              </button>
        </div>
        <!---->
    </form>
</div>
<%--<script>--%>
    <%--layui.use(['form', 'layer'], function () {--%>
        <%--$ = layui.jquery;--%>
        <%--var form = layui.form--%>
            <%--, layer = layui.layer;--%>
        <%--$(document).ready(function () {--%>
            <%--calOrderNum()--%>
        <%--});--%>

        <%--function calOrderNum() {--%>
            <%--var before = $("[name='personNum']").text();//用.personNum说明是class属性--%>
            <%--var beforeNum = parseInt(before);--%>
            <%--var orderNum = beforeNum + 2;--%>
            <%--$("#textbookNum").val(orderNum);--%>
        <%--}--%>
    <%--});--%>
<%--</script>--%>

<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

        //自定义验证规则
        form.verify({
            nikename: function (value) {
                if (value.length < 5) {
                    return '昵称至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , repass: function (value) {
                if ($('#L_pass').val() != $('#L_repass').val()) {
                    return '两次密码不一致';
                }
            }
        });
    })
        //监听提交
//        form.on('submit(add)', function (data) {
//            console.log(data);
//            //发异步，把数据提交给
//            layer.alert("增加成功", {icon: 6}, function () {
//                // 获得frame索引
//                var index = parent.layer.getFrameIndex(window.name);
//                //关闭当前frame
//                parent.layer.close(index);
//            });
//            return false;
//        });
//        //监听选择教材事件
//		form.on('select(chooseHistoryBook)', function (data) {
//			var ISBN={
//				num1:"001"
//
//			};
//			var press={
//				num1:"出版社1"
//
//			};
//			var price={
//				pri1:"100"
//			};
//		    textBookName = data.elem[data.elem.selectedIndex].text;
//		    form.render('select');
//		    $("#textBookName").val(textBookName);
//		    $("#textBookISBN").val(ISBN.num1);
//		    $("#textBookpress").val(press.num1);
//		    $("#textBookPrice").val(price.pri1);
//			});
//    });
</script>

</body>

</html>