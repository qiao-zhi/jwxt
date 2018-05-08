<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>上传课设报告</title>
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

    <script type="text/javascript">
        $(function findNeedUploadFile(curr,pageSize) {
            // 该数据应该从seesion中获取
            var studentID = 1;
            $.ajax({
                url:"/jwxt/studentCourseDesignFileInfo/findNeedUploadCourseDesignFile.do",
                type:"post",
                data:{"studentID":studentID},
                dataType:"json",
                success:function (pageInfo) {
                    var total = pageInfo.total;
                    var pageNum = pageInfo.pageNum;
                    var pageSize = pageInfo.pageSize;
                    var list = pageInfo.list;

                    $("#tbodyInfo").html("");
                    for(var i=0;i<list.length;i++){
                        var index =(pageNum - 1)*pageSize+i+1; //编号
                        var uploadInfo = "----";
                        if(list[i].uploadStatus==1){
                            uploadInfo = "已上传";
                        }else{
                            uploadInfo = "未上传";
                        }
                        var checkInfo = "----";
                        if(list[i].checkStatus==1){
                            checkInfo = "已审核";
                        }else{
                            checkInfo = "未审核";
                        }
                        $("#tbodyInfo").append(
                            "<tr>" +
                            "<td>" +
                            "<div class='layui-unselect layui-form-checkbox' onclick='changeClass(this);' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                            "</td>" +
                            "<td>"+index+"</td>" +
                            "<td>"+list[i].courseDesignName+"</td>" +
                            "<td>"+list[i].courseDesignNum+"</td>" +
                            "<td>"+list[i].teacherName+"</td>" +
                            "<td>"+list[i].teacherNum+"</td>" +
                            "<td>"+uploadInfo+"</td>" +
                            "<td>"+checkInfo+"</td>" +
                            "<td class='td-manage'>" +
                            "<a title='点击查看课设报告' onclick=\"x_admin_show('XXX的课设报告','courseDesignReport-view.html')\">" +
                            "<i class='layui-icon'>&#xe63c;</i>" +
                            "</a>" +
                            "</td>" +
                            "</tr>"
                        );
                    }
                    // 开启分页查询组件
                    needUploadCourseDesignFile(total,pageNum,pageSize);
                },
                error:function () {
                    alert("加载信息失败！");
                }
            });
        });
        function needUploadCourseDesignFile(total,pageNum,pageSize) {
            // 使用layui的分页插件
            layui.use(['laypage','layer'],function () {
                var laypage = layui.laypage,layer = layui.layer;
                // 执行一个laypage实例
                laypage.render({
                    elem:'pageDiv', // 此处时id，但不用加#
                    count:total,    // 数据总数（服务端获取）
                    limit:pageSize, // 每页显示条数
                    curr:pageNum,   //当前页号
                    limits:[8],
                    layout:['limit','prev','page','next','skip','count'],//显示哪些分页组件
                    jump:function (obj,first) { // 点击页号时执行的函数
                        // obj包含了当前分页的所有参数，例如：
                        //     console.log(obj.curr);  //得到当前页，以便向服务器请求对应的数据
                        //    console.log(obj.limit);   //得到每页显示的条数
                        $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                        $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                        if(!first){ //首次不执行（点击的时候才执行）
                            findNeedUploadFile(obj.curr,pageSize); //执行查询分页函数（这个函数必须写在这）

                        }
                    }
                });
            });
        }

        function changeClass(obj) {
            if ($(obj).hasClass("layui-form-checked")) {
                $(obj).removeClass("layui-form-checked");
                //$(obj).attr("name","selected");
            } else {
                $(obj).addClass("layui-form-checked");
                //$(obj).attr("name","none");
            }
        }
    </script>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程设计</a>
        <a>
          <cite>上传课设报告</cite></a>
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
    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="courseDesignArrange()">上传 </button>
        <button class="layui-btn" onclick="checkResult()">查看审核结果</button>
    </xblock>

    <script>
        var chooseCourse=0;//判断是否选中课程
        function panduan(){
            $(".layui-form-checkbox").each(function() {
                if ($(this).hasClass("layui-form-checked")) {
                    chooseCourse++;
                }
            })
        }
        function courseDesignArrange(){
            panduan();//调用判断方法
            if (chooseCourse>0) {
                x_admin_show('上传课设报告','./courseDesignReport-add.html')
            }
            else{
                layer.alert('请先选择需要上传文件的课设');
            }
            chooseCourse=0;//清空值
        }
        function checkResult(){
            panduan();//调用判断方法
            if (chooseCourse>0) {
                if(chooseCourse===1){
                    x_admin_show('上传课设报告','./courseDesign-checkOpinion.html')
                }
                else{
                    layer.alert('每次只可查看一门课设的审核信息')
                }
            }
            else{
                layer.alert('请先选择需要查看审核结果的课设');
            }
            chooseCourse=0;//清空值
        }

    </script>
    <!--end 操作区域-->

    <!--表格内容-->
    <form>
        <table class="layui-table">
            <thead>
            <tr>
                <th>选择
                    <!--<div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                        &#xe605;</i></div>-->
                </th>
                <th>序号</th>
                <th>课程名称</th>
                <th>课程编号</th>
                <!--
                <th>课程设计简介</th>
                -->
                <th>教师名称</th>
                <th>教师编号</th>
                <th>上传状态</th>
                <th>审核结果</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="tbodyInfo">
<!--
            <tr>
                <td>
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
                </td>
                <td>20</td>
                <td>201700917</td>
                <td>老王</td>
                <td>学生</td>
                <td>未上传</td>
                <td>通过</td>
                <td class="td-manage">
                    <a title="点击查看课设报告" onclick="x_admin_show('XXX的课设报告','courseDesignReport-view.html')" href="javascript:;">
                        <i class="layui-icon">&#xe63c;</i>
                    </a>
                </td>
            </tr>
-->
            </tbody>
        </table>
    </form>
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