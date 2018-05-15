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
            <!--<div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>-->
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
                <input type="text"  name="createrName" required=""  lay-verify="required"
                        autocomplete="off" class="layui-input" readonly>
                <%--隐藏创建人ID--%>
                <input type="hidden" value="asdfwiefjiwenxhuwe" name="createrId"/>
            </div>
            <!--<div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>-->
        </div>
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              创建时间
            </label>
            <div class="layui-input-inline">
                <input id="giveTime" class="layui-input" name="createTime"  lay-verify="required" />
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
                $("select[name='academicId']").val(response.academicId);
                $("input[name='academicName']").val(response.academicName);
                $("input[name='createrName']").val(response.createrName);
                $("input[name='createTime']").val(response.createTime);
                //更新渲染
                form.render('select');
                var date = response.academicYear.substring(0,4);
                $("#y_year").val(date);
                $("#end_year").val(parseInt(date)+1);
            }
        });
    }

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;
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
                datatype:"text",
                success:function(response){
                    alert(response)
                    if("修改成功！" == response){
                        //实现父页面的刷新
                        window.parent.location.reload();
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                    }
                }
            })

            /*//发异步，把数据提交给
            layer.alert("增加成功", {icon: 6}, function () {
                // 获得frame索引
              var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
             parent.layer.close(index);
            });*/
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
    });

</script>

</body>

</html>