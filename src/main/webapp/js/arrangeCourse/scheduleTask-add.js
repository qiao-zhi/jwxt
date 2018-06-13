/**
 * @author: LL
 * @createtime: 2018/5/16 22:10
 * @description:排课任务添加的js
 */
layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form
        , layer = layui.layer;
    //获取学院ID
    getCollegeId();
    //初始化时间
    getNowTime();
    //初始化教学任务通知书下拉框
    findNoticeNameAndId(form);
    //初始化专业下拉框
    findMajorNameAndId(form);
    //初始接收人下拉框
    findReceiptInfoForSelect(form);
    //监听专业下拉框事件
    form.on('select(major)',function (data) {
        //获取学院的option对象
        var $option = $("select[name='majorId'] option:selected");
        //将学院名称设置到隐藏域中
        $("input[name='majorName']").val($option.text())
    })

    //监听接收人下拉框
    form.on('select(receiptName)',function (data) {
        //获取学院的option对象
        var $option = $("select[name='taskReceiptName'] option:selected");
        //将学院名称设置到隐藏域中
        $("input[name='taskReceiptId']").val($option.text())
    })

    //监听任务通知书下拉框事件
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

//初始接收人下拉框
function findReceiptInfoForSelect(form){
    $.ajax({
        url:contextPath+"/arrangeCourse/findTeacherBaseInfo.action",
        dataType:"json",
        data:{"academicId":collegeId_all},
        type:"post",
        success:function (response) {
            var optionStr = "<option value=''>请输入教师姓名</option>";
            $("select[name='taskReceiptName']").append(optionStr);
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].teachernum+"'>"+response[i].teachername+"</option>";
                $("select[name='taskReceiptName']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}