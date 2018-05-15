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
                <select name="noticeBookId" lay-filter="noticeBook">
                </select>
            </div>
            <%--隐藏任务通知书名称--%>
            <input type="hidden" name="noticeBookName"/>
            <%--隐藏排课任务主键--%>
            <input type="hidden" name="arrangeTaskId"/>
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              专业
            </label>
            <div class="layui-input-inline">
                <select name="majorId" lay-filter="major">
                </select>
                <%--隐藏专业名称--%>
                <input type="hidden" name="majorName"/>
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
             <!--<div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>-->
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
             <!--<div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>-->
            
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                创建人
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="originatorName" required=""  lay-verify="required"
                         autocomplete="off" class="layui-input">
                <%--隐藏创建人ID--%>
                <input type="hidden" value="asdfwiefjiwenxhuwe" name="originatorId"/>
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
        </div>

        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                创建时间
            </label>
            <div class="layui-input-inline">
                <input id="giveTime" class="layui-input" name="taskCreateTime" lay-verify="required" />
            </div>
        </div>


        <!--5-->
        <div class="layui-form-item">
              <!--<label for="L_repass" class="layui-form-label">
              </label>-->
              <button class="layui-btn" lay-filter="update" lay-submit="" style="margin-left: 275px;">
                  确认修改
              </button>
        </div>
        <!---->
    </form>
</div>

<script>
    //根据通知书ID查询通知书信息
    function getArrangeCourseTaskInfo(arrangeTaskId,form){
        $.ajax({
            url : contextPath+'/arrangeCourse/getArrangeCourseTask.action',
            data :{"arrangeTaskId":arrangeTaskId},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='arrangeTaskId']").val(response.arrangeTaskId);
                //$("select[name='noticeBookId']").val(response.noticeBookId);
                $("input[name='noticeBookName']").val(response.noticeBookName);
                $("input[name='academicYear']").val(response.academicYear);
                $("select[name='term']").val(response.term);
                //$("select[name='majorId']").val(response.majorId);
                $("input[name='majorName']").val(response.majorName);
                $("input[name='originatorName']").val(response.originatorName);
                $("input[name='taskReceiptName']").val(response.taskReceiptName);
                $("input[name='taskReceiptId']").val(response.taskReceiptId);
                $("input[name='taskCreateTime']").val(response.taskCreateTime);
                //更新渲染
                form.render('select');
                var date = response.academicYear.substring(0,4);
                $("#y_year").val(date);
                $("#end_year").val(parseInt(date)+1);

                //初始化教学任务通知书下拉框
                findNoticeNameAndId(form,response.noticeBookId);
                //初始化专业下拉框
                findMajorNameAndId(form,response.majorId);
            }
        });
    }

    //出生年月
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#giveTime' //指定元素
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
        //初始化排课任务信息
        getArrangeCourseTaskInfo('${param.arrangeTaskId}',form);
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
        form.on('submit(update)', function (data) {
            $.ajax({
                url:contextPath+"/arrangeCourse/updateArrangeCourseTask.action",
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
            return false;
        });
    });
    //初始化教学任务通知书下拉框
    function findNoticeNameAndId(form,noticeBookId){
        $.ajax({
            url:contextPath+"/arrangeCourse/findNoticeNameAndId.action",
            dataType:"json",
            type:"post",
            success:function (response) {
                //console.log(response);
                var optionStr = "";
                for(var i=0;i<response.length;i++){
                    if(noticeBookId==response[i].noticeBookId){
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
    function findMajorNameAndId(form,majorId){
        $.ajax({
            url:contextPath+"/TrainScheme/getMajorNameAndCode.action",
            dataType:"json",
            type:"post",
            success:function (response) {
                //console.log(response);
                var optionStr = "";
                for(var i=0;i<response.length;i++){
                    if(response[i].majorId==majorId){
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