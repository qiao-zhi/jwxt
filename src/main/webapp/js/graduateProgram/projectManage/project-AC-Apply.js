/**
 * 页面加载完成后执行一些函数
 */
$(function () {
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            ,format: 'yyyy-MM-dd'
            ,value :getCurrentTime()
        });
    });

    $("#L_pass").val(getCurrentTime());

    initCollege();//初始化学院
    initMajor();//初始化专业

    //毕设基本信息编号
    $("#graDesignID").val(getUrlParam("graDesignID"));

    initData();//初始化部分数据
});

function initData() {
    //初始化教师信息：teacherID，teacherName，职称positionalTitle，学位degree
    $.ajax({
        url : contextPath+'/project_AC/getProjectTeacherInfo.do',
        type : 'POST',
        async:true,
        success : function(response){
            var data = ajaxGetStringToJson(response);

            $("#positionalTitle").text(data.positionaltitle);
            $("#teacherName").text(data.teachername);
            $("#degree").text(data.degree);
        }
    });
}

//保存
function y_save() {

    $("#isSubmit").val("0");
    $.ajax({
        url: contextPath + '/project_AC/saveProjectInfo.do',
        data: $("#y_form").serialize(),
        type: 'POST',
        dataType: 'text',
        success: function (response) {
            layer.alert(response,function(){
                closePage();
            })
        }
    })
}

//提交
function y_submit() {

    layer.confirm("添加之后将不能修改,确认添加?", function (index) {
        $("#isSubmit").val("1");

        $.ajax({
            url: contextPath + '/project_AC/addProjectInfo.do',
            data: $("#y_form").serialize(),
            type: 'POST',
            dataType: 'text',
            success: function (response) {
                layer.alert(response,function(){
                    closePage();
                })
            }
        })

    });
}