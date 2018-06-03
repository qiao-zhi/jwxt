$(function () {
    //初始化查询学年
    initYearNum();
    //初始化专业
    initMajor();

    initGraduateInfo();
})

//初始化毕设信息
function initGraduateInfo() {

    var parameters = getUrlParam2();

    $("#y_gradesignid").val(parameters.gradesignid);
    $("#y_yearNum").find("option[value='" + parameters.yearnum + "']").attr("selected",true);
    $("#semesternum").find("option[value='" + parameters.semesternum + "']").attr("selected",true);

    $("#y_major").find("option").each(function(){
        if ($.trim($(this).text()) ==  parameters.majorname ) {
            $(this).attr("selected", true);
        }
    })
    // $("#y_major").find("option[text='" + parameters.majorname + "']").attr("selected",true);
    $("#graduatedesignname").val(parameters.graduatedesignname);
    $("#graduatedesc").val(parameters.graduatedesc);
}

//提交
function y_submit() {
    $.post(contextPath+"/graduateManage/modifyGraduateInfo.do",
        $("#y_form").serialize(),
        function (response) {
            layer.alert(response,function(){
                closePage();
            })
        },'text')
}