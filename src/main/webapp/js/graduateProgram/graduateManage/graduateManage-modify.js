$(function () {
    //初始化查询学年
    initYearNum();
    //初始化专业
    initMajor();

    initGraduateInfo();
})

var gradesignid = "";

//初始化毕设信息
function initGraduateInfo() {

    gradesignid = getUrlParam(gradesignid);
    var yearnum = getUrlParam(yearnum);
    var semesternum = getUrlParam(semesternum);
    var graduatedesignname = getUrlParam(graduatedesignname);
    var majorid = getUrlParam(majorid);
    var graduatedesc = getUrlParam(graduatedesc);

    $("#y_yearNum").find("option[value='" + data.yearNum + "']").attr("selected",true);
    $("#semesternum").find("option[value='" + data.semesternum + "']").attr("selected",true);
    $("#y_major").find("option[value='" + data.majorid + "']").attr("selected",true);
    $("#graduatedesignname").val(data.graduatedesignname);
    $("#graduatedesc").val(data.graduatedesc);
}

layui.use('form', function(){
    var form = layui.form;

    //监听提交
    form.on('submit(add)', function(data){
        $.post(contextPath+"/graduateManage/modifyGraduateInfo.do",
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
