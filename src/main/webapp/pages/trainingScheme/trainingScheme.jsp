<%@ page  language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%--全局配置JSP--%>
<%@ include file ="/tag.jsp"%>

<html>

<head>
    <meta charset="UTF-8">
    <title>培养方案管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${baseurl}/css/font.css">
    <link rel="stylesheet" href="${baseurl}/css/xadmin.css">
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${baseurl}/js/xadmin.js"></script>


    <%--S   QLQ引入的--%>
    <script>

    </script>
    <%--培养方案管理的JS--%>
    <script type="text/javascript" src="${baseurl}/js/trainScheme/trainSchemeManage.js"></script>


    <%--E   QLQ引入的--%>


</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">培养方案管理</a>
        <a>
          <cite>培养方案</cite></a>
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

    <div class="layui-row">
        <%--查询条件的form--%>
        <form class="layui-form layui-col-md12 x-so" id="queryTrainschemeForm">
            <%--隐藏当前页和页号--%>
                <input type="hidden" name="pageNum">
                <input type="hidden" name="pageSize">



            <input type="text" name="trainingschemaname" placeholder="培养方案名称" autocomplete="off" class="layui-input">
            <input type="text" name="majorname" class="layui-input"  placeholder="专业名称" autocomplete="off">
            <input type="text" name="majorid" class="layui-input"  placeholder="专业代码" autocomplete="off">
            <div class="layui-input-inline">
                <select name="remark1">
                    <option value="">编辑状态</option>
                    <option value="保存">保存</option>
                    <option value="已提交">已提交</option>
                </select>
            </div>
<%--            <div class="layui-input-inline">
                <select name="contrller">
                    <option>是否使用</option>
                    <option>是</option>
                    <option>否</option>
                </select>
            </div>--%>
            <button class="layui-btn" type="button" onclick="queryTrainSchemeFYBtn()"><i class="layui-icon">&#xe615;</i></button>
            <button class="layui-btn layui-btn-normal" type="button" onclick='clearQueryCondition(this)' title="点击重置查询条件"><i class="layui-icon">&#xe639;</i></button>
        </form>
    </div>

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" type="button" onclick="openAddPictureModal()">上传课程结构图</button>
        <button class="layui-btn" onclick="arrangeTrainschemeCourse()">安排课程与课程能力</button>
        <button class="layui-btn layui-btn-normal" onclick="">下载培养方案 </button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
            <tr>
                <th></th>
                <th>序号</th>
                <th>培养方案名称</th>
                <th>专业名称</th>
                <th>专业代码</th>
                <th>学科门类</th>
                <th>专业负责人</th>
                <th>修业年限</th>
                <th>修订人</th>
                <th>修订时间</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody id="trainSchemeTbody">
            <!--动态填充数据-->
        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>
<script>
    /*学年*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#y_year' //指定元素
            ,type: 'year'
        });
    })

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

<!--相关的几个模态框-->
<!--1 S    上传图片的模态框-->
<%--隐藏打开的index--%>
<input type="hidden" id="hidden_picture_index">
<div class="x-body" style="display: none" id="pictureModal">
    <div class="layui-upload">
        <!--隐藏培养方案编号-->
        <input type="hidden" id="hidden_trainSchemeId">
        <!--隐藏上传文件的操作-->
        <input type="hidden" id="hidden_tmp_index">
        <button type="button" class="layui-btn" id="structurePicture"><!--动态赋值--></button>
        <!--预留一个预览的img标签-->
        <div id="imgDiv" style="display: none;margin-top: 10px;">
            <img id="imgPreview" width="400px" height="200px">
        </div>
        <div id="promptDiv" style="margin-top: 10px;display: none">
            <p><font style="font-size: 30px">您还没有上传课程关系结构图，请先上传课程关系结构图!</font></p>
        </div>
    </div>
</div>
<!--1 E    上传图片的模态框-->















