<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>教研室-课题选择管理-分配学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <%-- qlq引入的公共的JSP --%>
    <%@include file="/tag.jsp"%>

    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/css/xadmin.css">
    <link rel="stylesheet" href="${baseurl}/lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!--根据课设专业，筛选同专业的同学。 判断学生数量是否达到，达到。再选择，提示，人数已经符合需要人数，无法添加-->
<!--主体-->
<div class="x-body layui-container">
    <div class="layui-row  layui-col-space10">
        <div class="layui-col-xs6">
            <!--表格内容-->
            <table class="layui-table">
                <thead>
                <tr>
                    <th>指导教师</th>
                    <th>课题名称</th>
                    <th>所需人数</th>
                    <th>确认人数</th>
                    <th>调整学生</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>网名</td>
                    <td>课题民</td>
                    <td>2</td>
                    <td>1</td>
                    <td class="y_student"></td>
                </tr>
                </tbody>
            </table>
            <!--end 表格内容-->
            <button class="btn-primary btn">提交</button>
        </div>
        <div class="layui-col-xs6">
            <!--表格内容-->
            <table class="layui-table">
                <thead>
                <tr>
                    <th>选择</th>
                    <th>姓名</th>
                    <th>学号</th>
                    <th>班级</th>
                    <th>第一志愿</th>
                    <th>第二志愿</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                            &#xe605;</i></div>
                    </td>
                    <td>网名</td>
                    <td>201511513</td>
                    <td>软件工程1</td>
                    <td>张明/课题民</td>
                    <td>张明/课题民</td>
                </tr>
                <tr>
                    <td>
                        <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                            &#xe605;</i></div>
                    </td>
                    <td>网名</td>
                    <td>201511513</td>
                    <td>软件工程1</td>
                    <td>张明/课题民</td>
                    <td>张明/课题民</td>
                </tr>
                <tr>
                    <td>
                        <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                            &#xe605;</i></div>
                    </td>
                    <td>网名</td>
                    <td>201511513</td>
                    <td>软件工程1</td>
                    <td>张明/课题民</td>
                    <td>张明/课题民</td>
                </tr>
                </tbody>
            </table>
            <!--end 表格内容-->

            <!--分页-->
            <div id="demo7"></div>
            <!--end 分页-->
        </div>
    </div>


</div>
<script>
    /*分页js*/
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage
            , layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'demo7'
            , count: 100
            , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            , jump: function (obj) {
                console.log(obj)
            }
        });
    });

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }

    $(document).on("click",".layui-table-body table.layui-table tbody tr td.layui-form-checkbox", function () {
        alert();
    })
    $(".layui-form-checkbox").on("click",function () {
        var index = $(this).parents("tr").index();
        if($(this).hasClass("layui-form-checked")) { //true为已经选中
            layer.confirm('确认取消选择？', {
                btn: ['确认','取消'] //按钮
            }, function(){ //删除左侧表格中对应内容
                $(".y_addStudent"+index).remove();
                layer.msg('取消成功', {icon: 1});
            })
        } else { //添加到左侧表格中
            var studentName = $(this).parent().next().text();
            $(".y_student").append("<span class='y_addStudent"+index+"'>"+studentName+" </span>")
        }
    })
</script>
</body>

</html>