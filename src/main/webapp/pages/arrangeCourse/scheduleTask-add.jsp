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
    <%--公共标签--%>
    <%@include file="/tag.jsp"%>
</head>
<body>
<div class="x-body">
	
    <form class="layui-form ">
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                任务通知书
            </label>
            <div class="layui-input-inline">
                <select name="noticeBookId" lay-filter="noticeBook" lay-search="">
                </select>
            </div>
            <%--隐藏任务通知书名称--%>
            <input type="hidden" name="noticeBookName"/>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>


        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              专业
            </label>
            <div class="layui-input-inline">
                <select name="majorId" lay-filter="major" lay-search="">
                </select>
                <%--隐藏专业名称--%>
                <input type="hidden" name="majorName"/>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
         <div class="layui-form-item">
             <label for="" class="layui-form-label">
                 学年
             </label>
             <div class="layui-input-inline">
                 <input type="datetime" style="width: 100px;float: left" class="layui-input" id="y_year" placeholder="起始学年" lay-verify="required">
                 <div class="layui-form-mid" style="margin-left: 10px">-</div>
                 <input type="datetime"  style="width: 100px;" class="layui-input" id="end_year" readonly placeholder="结束学年" >
                 <!--隐藏学年-->
                 <input type="hidden" name="academicYear" />
             </div>
             <div class="layui-form-mid layui-word-aux">
                 <span class="x-red">*</span>必须填写
             </div>
            
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              学期
            </label>
            <div class="layui-input-inline">
                <select name="term">
                    <option value="1">第一学期</option>
                    <option value="2">第二学期</option>
                </select>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
            
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                创建人
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="originatorName" required=""  lay-verify="required"
                       value="正陈宫"  autocomplete="off" class="layui-input">
                <%--隐藏创建人ID--%>
                <input type="hidden" value="asdfwiefjiwenxhuwe" name="originatorId"/>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                接收人
            </label>
            <div class="layui-input-inline">
                <input type="text" id="" name="taskReceiptName" required=""  lay-verify="required"
                       autocomplete="off" class="layui-input">
                <%--隐藏接收人ID--%>
                <input type="hidden" value="asdfwiefjiwenxhuwe" name="taskReceiptId"/>
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              创建时间
            </label>
            <div class="layui-input-inline">
             <input id="giveTime" class="layui-input" name="taskCreateTime" lay-verify="required" />
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>

      
        <div class="layui-form-item">
              <!--<label for="L_repass" class="layui-form-label">
              </label>-->
              <button class="layui-btn" lay-filter="add" lay-submit="" style="margin-left: 275px;">
                  确认新增
              </button>
        </div>
        <!---->
    </form>
</div>

<script>
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        //初始化时间
        getNowTime();
        //创建时间
        laydate.render({
            elem: '#giveTime'//指定元素,
        });
        //学年
        laydate.render({
            elem: '#y_year' //指定元素
            ,type: 'year'
            ,done:function(date){
                //判断date是否有值
                if(date != null && date !=""){
                    date = parseInt(date)
                    $("#end_year").val(date+1)
                    $("input[name='academicYear']").val(date+'-'+(date+1)+"学年")
                }else{
                    $("#end_year").val('')
                    $("input[name='academicYear']").val('')
                }
            }
        });
    });
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
        //初始化教学任务通知书下拉框
        findNoticeNameAndId(form);
        //初始化专业下拉框
        findMajorNameAndId(form);
        //监听专业下拉框事件
        form.on('select(major)',function (data) {
            //获取学院的option对象
            var $option = $("select[name='majorId'] option:selected");
            //将学院名称设置到隐藏域中
            $("input[name='majorName']").val($option.text())
        })

        //监听专业下拉框事件
        form.on('select(noticeBook)',function (data) {
            //获取学院的option对象
            var $option = $("select[name='noticeBookId'] option:selected");
            //将学院名称设置到隐藏域中
            $("input[name='noticeBookName']").val($option.text())
        })

        //监听提交
        form.on('submit(add)', function (data) {
            $.ajax({
                url:contextPath+"/arrangeCourse/addArrangeCourseTask.action",
                data:data.field,
                type:"POST",
                datatype:"text",
                success:function(response){
                    layer.alert(response,function(){
                        //实现父页面的刷新
                        window.parent.location.reload();
                    })
                }
            })
            //阻止表单跳转。如果需要表单跳转，去掉这段即可。
            return false;
        });
    })
    //获取当前时间设置到相应字段
    function getNowTime(){
        var myDate = new Date();//获取系统当前时间
        var year = myDate.getFullYear();//获取当前年
        var month = myDate.getMonth()+1;//获取当前月
        var date = myDate.getDate();
        if (month < 10) month = "0" + month;
        if (date < 10) date = "0" + date;
        var nowTime = year + "-" + month + "-" + date;
        $("input[name='taskCreateTime']").val(nowTime);
    }
    //初始化教学任务通知书下拉框
    function findNoticeNameAndId(form){
        $.ajax({
            url:contextPath+"/arrangeCourse/findNoticeNameAndId.action",
            dataType:"json",
            type:"post",
            success:function (response) {
                //console.log(response);
                var optionStr = "";
                for(var i=0;i<response.length;i++){
                    if(i==0){
                        //设置默认选中第一条  value值设置编号，标签中间设置给用户显示的信息
                        optionStr = "<option value='" + response[i].noticeBookId+"' selected>"+response[i].noticeBookName+"</option>";
                        $("input[name='noticeBookName']").val(response[i].noticeBookName);
                    } else{
                        optionStr = "<option value='"+response[i].noticeBookId+" ' >"+response[i].noticeBookName+"</option>";
                    }
                    $("select[name='noticeBookId']").append(optionStr)
                }
                //更新渲染
                form.render('select');
            }
        })
    }
    //初始化专业下拉框
    function findMajorNameAndId(form){
        $.ajax({
            url:contextPath+"/TrainScheme/getMajorNameAndCode.action",
            dataType:"json",
            type:"post",
            success:function (response) {
                //console.log(response);
                var optionStr = "";
                for(var i=0;i<response.length;i++){
                    if(i==0){
                        //设置默认选中第一条  value值设置编号，标签中间设置给用户显示的信息
                        optionStr = "<option value='" + response[i].majorId+"' selected>"+response[i].majorName+"</option>";
                        $("input[name='majorName']").val(response[i].majorName);
                    } else{
                        optionStr = "<option value='"+response[i].majorId+" ' >"+response[i].majorName+"</option>";
                    }
                    $("select[name='majorId']").append(optionStr)
                }
                //更新渲染
                form.render('select');
            }
        })
    }
</script>

</body>

</html>