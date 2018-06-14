<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/5
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>班级信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <!--树-->
    <link rel="stylesheet" href="../../lib/zTree/demo.css" type="text/css">
    <link rel="stylesheet" href="../../lib/zTree/zTreeStyle/zTreeStyle.css" type="text/css">

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="../../lib/zTree/jquery.ztree.excheck.js"></script>
    <style>
        .el_leftTree{
            width:15%;
            float:left;
        }
        .el_treeTitle{
            display: block;
            font-size:15px;
            padding:20px;
            padding-bottom:0;
        }
        ul.ztree {
            width: 100%;
            background-color: white;
            height: auto;
            border:0;
            padding-bottom:30px;
            overflow-y: auto;
            text-align:center;
        }
    </style>

    <%--公共标签--%>
    <%@include file="/tag.jsp"%>

    <%--ll 通知书管理的js--%>
    <script type="text/javascript" src="${baseurl}/js/baseInfo/class.js"></script>
</head>

<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">基础信息管理</a>
        <a>
          <cite>班级信息</cite></a>
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
<div style="width:16%;float:left;">
    <ul id="treeDemo" class="ztree"></ul>
</div>
<!--主体-->
<div class="x-body" style="width:80%;float:right">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so"  id="selectClassInfoForm">
            <input type="text" name="classnum" placeholder="班级编号" autocomplete="off" class="layui-input">
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-search="" name="grade" id="grade">
                    <option value="">年级</option>
                    <option value="2014">2014</option>
                    <option value="2015">2015</option>
                    <option value="2016">2016</option>
                    <option value="2017">2017</option>
                </select>
            </div>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select  lay-search="" name="majorid" id="majorName">
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="collegeid">
                </select>
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="search"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->

    <!--操作区域-->
    <xblock>
        <button class="layui-btn" onclick="openAddClassModel()">添加班级</button>
        <button class="layui-btn layui-btn-danger" onclick="delAll()">批量删除</button>
    </xblock>
    <!--end 操作区域-->

    <!--表格内容-->
    <table class="layui-table">
        <thead>
        <tr>
            <th>班级编号</th>
            <th>班级名称</th>
            <th>专业名称</th>
            <th>学院名称</th>
            <th>班级人数</th>
            <th>年级</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody  id="classInfoList">

        </tbody>
    </table>
    <!--end 表格内容-->

    <!--分页-->
    <div id="demo7"></div>
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


</script>

</body>

</html>




<%--隐藏一些模态框--%>
<%--1.添加模态框--%>
<input type="hidden" id="hidden_add_class_index"/>
<div class="x-body" style="display: none" id="addClassModal">
    <form class="layui-form">
        <!--1-->
        <div class="layui-form-item">
            <label for="classNum" class="layui-form-label">
                班级编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="classNum" name="classnum" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>

        <!--3-->
        <div class="layui-form-item">
            <label for="majorName" class="layui-form-label">
                所属专业
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <%--隐藏专业编号--%>
                <input lay-verify="required" lay-search="" name="majorid" type="hidden" id="add_majorid">
                <input lay-verify="required" class="layui-input" id="add_majorName" type="text" readonly>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="grade" class="layui-form-label">
                所属年级
            </label>
            <div class="layui-input-inline"><!--带搜索的查询-->
                <select lay-verify="required" id="grade" name="grade">
                    <option value=" ">请选择</option>
                    <option value="2014">2014</option>
                    <option value="2015">2015</option>
                    <option value="2016">2016</option>
                    <option value="2017">2017</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>
        <!--2-->
        <div class="layui-form-item">
            <label for="className" class="layui-form-label">
                班级名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="className" name="classname" required=""
                       autocomplete="off" class="layui-input" onclick="class_name()">
            </div>
            <div class="layui-form-mid layui-word-aux">
                自动生成
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label for="trainingSchemeID" class="layui-form-label">
                培养方案编号
            </label>
            <div class="layui-input-inline">
                <select lay-verify="required" id="trainingSchemeID" name="trainingschemeid"><!--带搜索的查询-->
                    <option value=" ">请选择</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
        </div>
    </form>
</div>
<script>
    //入学时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
        });
    });
</script>
<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
        findMajorNameAndIdForSelect(form);

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
            $.ajax({
                url:contextPath+"/classInfo/addClassInfo.action",
                data:data.field,
                type:"POST",
                datatype:"text",
                success:function(response){
                    alert(response)
                    if("添加成功" == response){
                        layer.close($("#hidden_add_class_index").val());//关闭模态框
                        window.location.reload();
                    }
                }
            })
            return false;
        });
    });
</script>
<script>
    //自动生成班级名称
    function class_name(){
        var major_name=$("#add_majorName").val();
        var class_num=$("#classNum").val();
        $("#className").val(major_name+class_num+"班");
    }
</script>
