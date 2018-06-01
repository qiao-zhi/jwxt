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

    initTeacherInfo();//初始化教师信息

    initProjectInfo();//初始化课题信息
});

function initTeacherInfo() {
    var teacherTitleID = getUrlParam(teacherTitleID);

    $.ajax({
        url : contextPath+'/project_AC/getProjectTeacherInfo.do',
        type : 'POST',
        data: {"teacherTitleID":teacherTitleID},
        dataType : 'json',
        async:true,
        success : function(data){



            $("#positionalTitle").text(data.positionalTitle);
            $("#teacherName").text(data.teacherName);
            $("#degree").text(data.degree);
        }
    });
}

function initTeacherInfo() {
    //初始化教师信息：teacherID，teacherName，职称positionalTitle，学位degree
    $.ajax({
        url : contextPath+'/project_AC/initProjectInfo.do',
        type : 'POST',
        dataType : 'json',
        async:true,
        success : function(data){
            //初始化：graDesignID、titlename、gdTime、reqireStudentNum、researchContent、targetRequire
            //titleOrigin、titleType、y_major、(projectType、resultType)
            $("#graDesignID").val(graDesignID);
            $("#titlename").val(titlename);
            $("#gdTime").val(gdTime);
            $("#reqireStudentNum").val(reqireStudentNum);
            $("#researchContent").val(researchContent);
            $("#targetRequire").val(targetRequire);

            $("#titleOrigin").find("option[value='" + data.titleOrigin + "']").attr("selected",true);
            $("#titleType").find("option[value='" + data.titleType + "']").attr("selected",true);
            $("#y_major").find("option[value='" + data.y_major + "']").attr("selected",true);

            $(".projectType :radio[name="+ data.projectType +"]").attr(checked);
            $(".resultType :radio[name="+ data.resultType +"]").attr(checked);
        }
    });
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
                    layui.alert("修改成功！");
                    closePage();
                }
            }
        })

    });
}