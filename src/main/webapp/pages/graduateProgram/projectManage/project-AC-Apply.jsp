<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>填写课题申请表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
</head>

<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<div class="x-body" style="margin:20px auto 50px auto; width:70%;">
    <button class="btn-primary btn">保存</button>
    <button class="btn-primary btn">提交</button>
    <form action="" class="layui-form">
        <table class="table table-bordered">
            <caption><h1>太原科技大学毕业设计（论文）课题申请表</h1>
                <span style="position:relative;top:15px;left:10px;">学院（直属系）：***</span><!--根据登录教师所在学院显示-->
                <div style="float: right">
                    <label for="L_pass" class="layui-form-label">
                        时间：
                    </label>
                    <div class="layui-input-inline" style="width: 135px">
                        <input type="text" class="layui-input" id="L_pass">
                    </div>
                </div>
            </caption>
            <tbody>
            <tr>
                <td rowspan="5">课题情况</td>
                <td>课题名称</td>
                <td colspan="5">
                    <input  class="layui-input" type="text">
                </td>
            </tr>
            <tr>
                <td>教师姓名</td>
                <td>
                </td>
                <td>职称</td>
                <td>
                </td>
                <td>学位</td>
                <td>
                </td>
            </tr>
            <tr>
                <td>课题来源</td>
                <td colspan="5">
                    <select name="" class="small" id="">
                        <option value="">--请选择--</option>
                        <option value="">科研</option>
                        <option value="">生产</option>
                        <option value="">理论</option>
                        <option value="">其他</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>课题类别</td>
                <td>
                    <select name="" class="small">
                        <option value="">--请选择--</option>
                        <option value="">设计</option>
                        <option value="">论文</option>
                    </select>
                </td>
                <td>设计时间</td>
                <td colspan="3">
                    <input type="text" placeholder="14" class="layui-input layui-input-inline" style="width:60px" value="14"> 周
                </td>
            </tr>
            <tr>
                <td>学生专业</td>
                <td>
                    <select name="" class="small">
                        <option value="">--请选择--</option>
                        <option value="">软件工程</option>
                        <option value="">计算机</option>
                    </select>
                </td>
                <td>学生人数</td>
                <td colspan="3">
                    <input class="layui-input" type="text">
                </td>
            </tr>
            <tr>
                <td>课题类型</td>
                <td colspan="6">
                    <input type="radio" name="projectType" lay-skin="primary" title="纵向科研课题">
                    <input type="radio" name="projectType" lay-skin="primary" title="横向科研课题">
                    <input type="radio" name="projectType" lay-skin="primary" title="教师预研课题">
                    <input type="radio" name="projectType" lay-skin="primary" title="自选课题">
                </td>
            </tr>
            <tr>
                <td>成果形式</td>
                <td colspan="6">
                    <input type="radio" name="resultType" lay-skin="primary" title="论文">
                    <input type="radio" name="resultType" lay-skin="primary" title="软件">
                    <input type="radio" name="resultType" lay-skin="primary" title="实物制作">
                    <input type="radio" name="resultType" lay-skin="primary" title="图纸">
                    <input type="radio" name="resultType" lay-skin="primary" title="其它">
                </td>
            </tr>
            <tr>
                <td>主要研究内容</td>
                <td colspan="6">
                    <textarea class="layui-textarea" name=""></textarea>
                </td>
            </tr>
            <tr>
                <td>设计目标要求</td>
                <td colspan="6">
                    <textarea name="" class="layui-textarea"></textarea>
                </td>
            </tr>
            </tbody>
        </table>
        <span style="color:#777">说明：一式两份，交学院（直属系）审批合格后，一份学院（直属系）留底，一份发给指导教师留底。</span>
    </form>
</div>
<script>
    /*时间*/
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            ,format: 'yyyy年MM月dd日'
        });
    })
    var myDate = new Date;
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth()+1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;
    
    $("#L_pass").val(year + "年" + month + "月" + date + "日");
</script>
</body>

</html>