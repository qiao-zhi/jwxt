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

</head>

<body>
<div class="x-body">

    <!--操作区域-->
    <xblock>

        <button class="layui-btn" onclick="orderTextBook()" id="">订购教材 </button>
        <button class="layui-btn" style="float: right;" onclick="commit()" id="">提交 </button>
        <button class="layui-btn" style="float: right;" onclick="save()" id="">保存 </button>
    </xblock>
    <!--end 操作区域-->

    <table class="layui-table-wang-info">
        <tr>
            <td>课程名称</td>
            <td>数据结构与算法</td>
            <td>课程编号</td>
            <td>4315543556</td>
        </tr>
        <tr>
            <td>教师名称</td>
            <td>王五</td>
            <td>教师编号</td>
            <td>1432673563</td>
        </tr>
        <tr>
            <td>所任班级</td>
            <td>软件工程142001</td>
            <td>所任人数</td>
            <td class="renshu">123</td>
        </tr>
        <tr>
            <td>订购教材</td>
            <td>算法与数据结构</td>
            <td>订购数量</td>
            <td class="total">123</td>
        </tr>
        <tr>
            <td>出版社</td>
            <td>清华大学出版社</td>
            <td>作者</td>
            <td class="total">张三</td>
        </tr>
        <tr>
            <td>ISBN</td>
            <td>1111</td>
            <td>单价</td>
            <td class="total">123</td>
        </tr>
        <tr>
            <td>是否订购</td>
            <td>未订购</td>
            <td>是否确认</td>
            <td class="renshu">未确认</td>
        </tr>
    </table>
</div>


<script>

    function orderTextBook() {
        x_admin_show('订购教材', 'orderTextBook-order.html')
    }

    //保存按钮事件
    function save(){
        layer.alert('保存成功');
    }
    //提交按钮事件
    function commit(){

        layer.confirm('您确认要提交此次教材订购信息吗？',function(){
            x_admin_close()
        });
    }
</script>
<script>
    $(document).ready(function(){
        calOrderNum()

    });
    function calOrderNum(){
        var before=$(".renshu").text();
        var beforeNum=parseInt(before);
        var orderNum=beforeNum+2;
        $("#textBookNum").val(orderNum);
    }
</script>

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
        //监听选择教材事件
        form.on('select(chooseHistoryBook)', function (data) {
            var ISBN={
                num1:"001"

            };
            var press={
                num1:"出版社1"

            };
            var price={
                pri1:"100"
            };
            textBookName = data.elem[data.elem.selectedIndex].text;
            form.render('select');
            $("#textBookName").val(textBookName);
            $("#textBookISBN").val(ISBN.num1);
            $("#textBookpress").val(press.num1);
            $("#textBookPrice").val(price.pri1);
        });
    });
</script>

</body>

</html>