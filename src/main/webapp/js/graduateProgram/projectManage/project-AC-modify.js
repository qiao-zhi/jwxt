/**
 * 页面加载完成后执行一些函数
 */
var teacherTitleID = "";
$(function () {
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            , format: 'yyyy-MM-dd'
        });
    });

    $("#L_pass").val(getCurrentTime());
    teacherTitleID = getUrlParam("teacherTitleID");

    initCollege();//初始化学院
    initMajor();//初始化专业

    initTeacherInfo();//初始化教师信息

    initProjectInfo();//初始化课题信息
});

function initTeacherInfo() {
    $("#teacherTitleID").val(teacherTitleID);

    $.ajax({
        url: contextPath + '/project_AC/getProjectTeacherInfo.do',
        type: 'POST',
        data: {"teacherTitleID": teacherTitleID},
        async: true,
        success: function (response) {
            var data = ajaxGetStringToJson(response);
            $("#positionalTitle").text(data.positionaltitle);
            $("#teacherName").text(data.teachername);
            $("#degree").text(data.degree);
        }
    });
}

function initProjectInfo() {
    $.ajax({
        url: contextPath + '/project_AC/initProjectInfo.do',
        type: 'POST',
        data: {"teacherTitleID": teacherTitleID},
        async: true,
        success: function (response) {
            var data = ajaxGetStringToJson(response);
            //初始化：graDesignID、titlename、gdTime、reqireStudentNum、researchContent、targetRequire
            //titleOrigin、titleType、y_major、(projectType、resultType)
            $("#graDesignID").val(data.gradesignid);
            $("#titlename").val(data.titlename);
            $("#gdTime").val(data.gdTime);
            $("#reqireStudentNum").val(data.reqirestudentnum);
            $("#researchContent").val(data.researchcontent);
            $("#targetRequire").val(data.targetrequire);

            $("#titleOrigin").find("option[value='" + data.titleorigin + "']").attr("selected", true);
            $("#titleType").find("option[value='" + data.titletype + "']").attr("selected", true);
            $("#y_major").find("option[value='" + data.y_major + "']").attr("selected", true);

            var projectTypeArray = ["纵向科研课题", "横向科研课题", "教师预研课题", "自选课题"];
            var projectTypeTr = "";
            for (var i = 0; i < projectTypeArray.length; i++) {
                if (projectTypeArray[i] == data.projecttype) {
                    projectTypeTr = projectTypeTr + '<input type="radio" class="projectType" name="projecttype" lay-skin="primary" checked value="' + projectTypeArray[i] + '" title="' + projectTypeArray[i] + '">'
                } else {
                    projectTypeTr = projectTypeTr + '<input type="radio" class="projectType" name="projecttype" lay-skin="primary" value="' + projectTypeArray[i] + '" title="' + projectTypeArray[i] + '">'
                }
            }
            $("#projectTypeTr").append(projectTypeTr);


            var resulttypes = (data.resulttype).split(",");
            var resultTypeArray = ["论文", "软件", "实物制作", "图纸", "其它"];
            var resultTypeTr = "";
            for (var j = 0; j < resultTypeArray.length; j++) {
                var n = 0;
                for (var s = 0; s < resulttypes.length; s++) {
                    if (resultTypeArray[j] == resulttypes[s]) {
                        resultTypeTr = resultTypeTr + '<input type="checkbox" class="resultType" checked name="resultyype" lay-skin="primary" value="' + resultTypeArray[j] + '" title="' + resultTypeArray[j] + '" lay-verify="resultType">';
                        n = 1;
                        break;
                    }
                }
                if (n != 1) {
                    resultTypeTr = resultTypeTr + '<input type="checkbox" class="resultType" name="resultyype" lay-skin="primary" value="' + resultTypeArray[j] + '" title="' + resultTypeArray[j] + '" lay-verify="resultType">';
                }
            }
            $("#resultTypeTr").append(resultTypeTr);
            layui.form.render();
        }
    });
}

//提交
function y_submit() {

    layer.confirm("提交之后将不能更改,确认提交?", function (index) {
        $.ajax({
            url: contextPath + '/project_AC/modifyProjectInfo.do',
            data: $("#y_form").serialize(),
            type: 'POST',
            dataType: 'text',
            success: function (response) {
                layer.alert(response, function () {
                    closePage();
                })
            }
        })

    });
}