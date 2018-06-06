<%@page pageEncoding="UTF-8" %>
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

    <%--全局配置JSP--%>
    <%@ include file ="/tag.jsp"%>

</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">课程设计</a>
        <a>
          <cite>课设管理</cite></a>
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

            <div class="layui-input-inline">
                <select name="" lay-verify="" id="yearNum">
                    <option value="">请选择学年</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="" lay-verify="" id="semester">
                    <option value="">请选择学期</option>
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>
            <div  class="layui-input-inline">
                <input type="hidden" id="userId" value="${id}"/>
            </div>
            <button type="button" onclick="findCourseDesignArrange();" class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--表格内容-->
    <form>
        <table class="layui-table">
            <thead>
            <tr>
                <th>序号</th>
                <th>课程名称</th>
                <th>课程编号</th>
                <th>学年</th>
                <th>学期</th>
                <th>开始时间</th>
                <th>结束时间</th>
                <th>教师</th>
                <th>教师编号</th>
                <th>班级</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="arrangeInfo">

            <%--<tr>--%>
                <%--<td>20</td>--%>
                <%--<td>201700917</td>--%>
                <%--<td>老王</td>--%>
                <%--<td>学生</td>--%>
                <%--<td></td>--%>
                <%--<td></td>--%>
                <%--<td class="td-manage">--%>
                    <%--<a title="点击查看订单详细信息" onclick="x_admin_show('详细信息','courseDesign-ArrangeInfoDetail.html')" href="javascript:;">--%>
                        <%--<i class="layui-icon">&#xe63c;</i>--%>
                    <%--</a>--%>
                <%--</td>--%>
            <%--</tr>--%>

            </tbody>
        </table>
        <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>

<script>
    $(function () {
        $.ajax({
            url:contextPath +"/findcourseDesign/yearAndMajor.do",
            type:"post",
            data:{},
            dataType:"json",
            success:function (resultMap) {
                var gradeList = resultMap.yearList;
                for(var i=0; i<gradeList.length;i++){
                    var nextYear = parseInt(gradeList[i])+1;
                    var yearNum = gradeList[i]+"-"+nextYear;
                    $("#yearNum").append("<option value=" + yearNum + ">" + yearNum + "</option>")
                }
                layui.use(['form'], function () {
                    var form = layui.form;
                    form.render('select'); //刷新select选择框渲染
                });
                findCourseDesignArrange();
            },
            error:function () {
                layer.msg("页面加载信息失败")
            }
        })
    });

    function findCourseDesignArrange() {
        // 获取参数
        var yearNum = $("#yearNum").find("option:selected").val();
        var semester = $("#semester").find("option:selected").val();
        var userId = $("#userId").val();
        // 发送ajax
        $.ajax({
            url:contextPath +"/lookCourseDesignArrange/findCourseDesignArrange.do",
            type:"post",
            data:{"yearNum":yearNum,"semester":semester,"userID":userId,
                "pageNum": $("[name='pageNum']").val(),"pageSize": $("[name='pageSize']").val()},
            dataType:"json",
            success:function (pageInfo) {
                var pageSize = pageInfo.pageSize;
                var pageNum = pageInfo.pageNum;
                var total = pageInfo.total;
                var infoList = pageInfo.list;
                $("#arrangeInfo").html("");
                for(var i = 0; i < infoList.length; i++){
                    var index = (pageNum - 1)*pageSize +i+1;
                    $("#arrangeInfo").append(
                        "<tr>" +
                            "<td>"+index+"</td>" +
                            "<td style='display:none;'>"+infoList[i].selKey+"</td>" +
                            "<td>"+infoList[i].courseDesignName+"</td>" +
                            "<td>"+infoList[i].courseDesignNum+"</td>" +
                            "<td>"+infoList[i].yearNum+"</td>" +
                            "<td>"+infoList[i].semester+"</td>" +
                            "<td>第"+infoList[i].startTime+"周</td>" +
                            "<td>第"+infoList[i].endTime+"周</td>" +
                            "<td>"+infoList[i].teacherName+"</td>" +
                            "<td>"+infoList[i].teacherNum+"</td>" +
                            "<td>"+infoList[i].classNames+"</td>" +
                            "<td class='td-manage'>" +
                                "<a title='点击查看详细信息' onclick='showDetailInfo(this)' >" +
                                    "<i class='layui-icon'>&#xe63c;</i>" +
                                "</a>" +
                            "</td>" +
                        "</tr>"
                    )
                }
                openStartPage(total,pageNum,pageSize);
            },
            error:function () {
                layer.msg("查询安排信息出错")
            }
        });

    }

    function openStartPage(total,pageNum,pageSize){
        layui.use(['laypage','layer'],function () {
            var laypage = layui.laypage,layer = layui.layer;
            laypage.render({
                elem:"pageDiv",
                count:total,
                curr:pageNum,
                limit:pageSize,
                limits:[6],
                layout:['limit','prev','page','next','skip','count'],
                jump:function (obj,first) {
                    $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                    $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                    if(!first){
                        findCourseDesignArrange();
                    }
                }
            })
        })
    }

    function showDetailInfo(obj) {
        // 学生
        
        // 教师
        var courseDesignTeacherArrangeID = $(obj).parent("td").parent("tr").find("td").eq(1).text();
        //alert(courseDesignTeacherArrangeID)
        x_admin_show("详细信息","lookCourseDesignInfoDetail.jsp?courseDesignTeacherArrangeID="+courseDesignTeacherArrangeID);

    }

</script>




<script>
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;
        //完整功能
        laypage.render({
            elem: 'demo7'
            ,count: 100
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj){
                console.log(obj)
            }
        });
    });
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