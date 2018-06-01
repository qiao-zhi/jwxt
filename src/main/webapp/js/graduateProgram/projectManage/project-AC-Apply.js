layui.use('laydate', function () {
    var laydate = layui.laydate;
    laydate.render({
        elem: '#L_pass' //指定元素
        ,format: 'yyyy年MM月dd日'
    });
});

/**
 * 页面加载完成后执行一些函数
 */
$(function () {
    //初始化时间为当前时间
    var myDate = new Date;
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth()+1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;

    $("#L_pass").val(year + "年" + month + "月" + date + "日");

    initCollege();//初始化学院
    initMajor();//初始化专业

    //毕设基本信息编号
    var graDesignID = getUrlParam(graDesignID);
    $("#graDesignID").val(graDesignID);

    initData();//初始化部分数据
});

function initData() {
    //初始化教师信息：teacherID，teacherName，职称positionalTitle，学位degree
    $.ajax({
        url : contextPath+'/project_AC/getProjectTeacherInfo.do',
        type : 'POST',
        dataType : 'json',
        async:true,
        success : function(data){
            $("#positionalTitle").text(data.positionalTitle);
            $("#teacherName").text(data.teacherName);
            $("#degree").text(data.degree);
        }
    });
}

//保存
function y_save() {
    $.ajax({
        url: contextPath + '/project_AC/addProjectInfo.do',
        data: $("#y_form").serialize(),
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            if (data == "success") {
                layui.alert("保存成功！");
            }
        }
    })
}

//提交
function y_submit() {

    layer.confirm("提交之后将不能更改,确认提交?", function (index) {
        $.ajax({
            url: contextPath + '/project_AC/addProjectInfo.do',
            data: $("#y_form").serialize(),
            type: 'POST',
            dataType: 'json',
            success: function (data) {
                if (data == "success") {
                    layui.alert("添加成功！");
                    closePage();
                }
            }
        })

    });
}