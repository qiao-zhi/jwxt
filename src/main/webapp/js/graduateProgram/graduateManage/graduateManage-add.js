$(function () {
    initMajor();
})

layui.use('form', function(){
    var form = layui.form;

    //监听提交
    form.on('submit(add)', function(data){
        $.post(contextPath+"/graduateManage/addGraduateInfo.do",
            $("#y_from").serialize(),
            function (response) {
                layer.close(index);//关闭当前询问窗口
                layer.msg(response,{time:2000},function () {
                    //关闭当前tab
                    if("添加成功"==response) {
                        closeNowPage();
                    }
                })
            },'text')
    });
});
