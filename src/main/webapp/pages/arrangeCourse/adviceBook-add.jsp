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
	
    <form class="layui-form">
        <!--3-->
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                通知书名称
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="noticeBookName" required=""  lay-verify="required"
                      value="计算机科学与技术学院通知书" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              学院
            </label>
            <div class="layui-input-inline">
                <select name="academicId" lay-filter="academic">
                    <option value="1">计算机科学与技术学院</option>
                    <option value="2">机械学院</option>
                    <option value="3">法学院</option>
                    <option value="4">经济管理学院</option>
                </select>
                <%--隐藏学院名称--%>
                <input type="hidden" name="academicName" value="计算机科学与技术学院"/>
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
                <%--隐藏学年--%>
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
                <input type="text"  name="createrName" required=""  lay-verify="required"
                     value="正陈宫"  autocomplete="off" class="layui-input">
                <%--隐藏创建人ID--%>
                <input type="hidden" value="asdfwiefjiwenxhuwe" name="createrId"/>
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
             <input id="giveTime" class="layui-input" name="createTime"  lay-verify="required" />
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

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form;
        var layer = layui.layer;
        getNowTime();
        //监听学院下拉框事件
        form.on('select(academic)',function (data) {
            //获取学院的option对象
            var $option = $("select[name='academicId'] option:selected");
            //将学院名称设置到隐藏域中
            $("input[name='academicName']").val($option.text())
        })
        //监听提交
        form.on('submit(add)', function (data) {
            $.ajax({
                url:contextPath+"/arrangeCourse/addTaskNoticeBaseInfo.action",
                data:data.field,
                type:"POST",
                datatype:"text",
                success:function(response){
                    alert(response)
                    if("添加成功" == response){
                        //实现父页面的刷新
                        window.parent.location.reload();
                        // 获得frame索引
                       var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                    }
                }
            })
            //阻止表单跳转。如果需要表单跳转，去掉这段即可。
            return false;
        });
     });

    //日期控件
    layui.use('laydate', function () {
        var laydate = layui.laydate;
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
        $("input[name='createTime']").val(nowTime);
    }
</script>

</body>

</html>