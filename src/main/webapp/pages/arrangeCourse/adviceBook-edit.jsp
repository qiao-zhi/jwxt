<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改课程</title>
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
    <%--排课公共方法--%>
    <script type="text/javascript" src="${baseurl}/js/arrangeCourse/arrangeCommonFunction.js"></script>

</head>
<body>
<div class="x-body">
	
    <form class="layui-form ">
        <!--3-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                通知书名称
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="noticeBookName"  lay-verify="required"
                       autocomplete="off" class="layui-input">
                <%--隐藏通知书ID--%>
                <input type="hidden" name="noticeBookId"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              学院
            </label>
            <div class="layui-input-inline">
                <select name="academicId" lay-filter="academic">
                </select>
                <input type="hidden" name="academicName"/>
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
            <%--隐藏学年--%>
                <input type="hidden" name="academicYear" />
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

        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                创建人
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="createrName" required=""  lay-verify="required"
                        autocomplete="off" class="layui-input" readonly>
            </div>

        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              创建时间
            </label>
            <div class="layui-input-inline">
                <input id="nowTime" class="layui-input" name="createTime"  lay-verify="required" />
            </div>
           
        </div>
        
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
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form;
        //查询任务通知书基本信息
        getTaskNoticeBaseInfo('${param.noticeId}',form);
        //监听学院下拉框事件
        form.on('select(academic)',function (data) {
            //获取学院的option对象
            var $option = $("select[name='academicId'] option:selected");
            //将学院名称设置到隐藏域中
            $("input[name='academicName']").val($option.text())
        })
        //监听提交
        form.on('submit(update)', function (data) {
            $.ajax({
                url:contextPath+"/arrangeCourse/updateApTaskNoticeBaseInfo.action",
                data:data.field,
                type:"POST",
                dataType:"text",
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

    //根据通知书ID查询通知书信息
    function getTaskNoticeBaseInfo(noticeId,form){
        $.ajax({
            url : contextPath+'/arrangeCourse/getApTaskNoticeBaseInfo.action',
            data :{"noticeBookId":noticeId},
            type : 'POST',
            dataType : 'json',
            success : function(response){
                $("input[name='noticeBookId']").val(response.noticeBookId);
                $("input[name='noticeBookName']").val(response.noticeBookName);
                $("input[name='academicYear']").val(response.academicYear);
                $("select[name='term']").val(response.term);
                //$("select[name='academicId']").val(response.academicId);
                $("input[name='academicName']").val(response.academicName);
                $("input[name='createrName']").val(response.createrName);
                $("input[name='createTime']").val(response.createTime);
                //初始化学院下拉框
                findCollegeNameAndId(form,response.academicId);
                var date = response.academicYear.substring(0,4);
                $("#y_year").val(date);
                $("#end_year").val(parseInt(date)+1);
            }
        });
    }

    //初始化学院下拉框
    function findCollegeNameAndId(form,academicId){
        $.ajax({
            url:contextPath+"/arrangeCourse/findAllCollegeInfo.action",
            dataType:"json",
            type:"post",
            success:function (response) {
                //console.log(response);
                var optionStr = "";
                for(var i=0;i<response.length;i++){
                    if(academicId==response[i].collegeId){
                        //设置默认选中第一条  value值设置编号，标签中间设置给用户显示的信息
                        optionStr = "<option value='" + response[i].collegeId+"' selected>"+response[i].collegeName+"</option>";
                        $("input[name='academicName']").val(response[i].collegeName);
                    } else{
                        optionStr = "<option value='"+response[i].collegeId+" ' >"+response[i].collegeName+"</option>";
                    }
                    $("select[name='academicId']").append(optionStr);
                }
                //更新渲染
                form.render('select');
            }
        })
    }

</script>

</body>

</html>