/**
 * @author: LL
 * @createtime: 2018/5/16 22:14
 * @description:排课任务修改的js
 */

layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form
        , layer = layui.layer;
    //初始化排课任务信息
    getArrangeCourseTaskInfo(arrangeTaskId_all,form);
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
                //判断回显
                if(response[i].majorId==majorId){
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