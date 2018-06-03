$(function () {
    //初始化专业下拉框
    initMajor()
})

//提交
function y_submit() {
    $.post(contextPath+"/graduateManage/addGraduateInfo.do",
        $("#y_formAdd").serialize(),
        function (response) {
            layer.alert(response,function(){
                closePage();
            })
        },'text')
}
