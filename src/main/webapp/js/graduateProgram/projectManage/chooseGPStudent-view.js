$(function () {
    //初始化教研室审核信息
    var teacherTitleID = getUrlParam(teacherTitleID);
    initTitleInfo(teacherTitleID);
});

//初始化课题基本信息
function initTitleInfo(teacherTitleID) {
    $.ajax({
        url: contextPath + '/chooseGPStudent/getProjectInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#title_student").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>课题名称</td>' +
                '    <td colspan="4">'+data.titlename+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题类型</td>' +
                '    <td>'+data.projectType+'</td>' +
                '    <td>课题类别</td>' +
                '    <td>'+data.titleType+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题来源</td>' +
                '    <td>'+data.titleOrigin+'</td>' +
                '    <td>指导教师</td>' +
                '    <td>'+data.teacherName+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>专业</td>' +
                '    <td>'+data.majorName+'</td>' +
                '    <td>学生人数</td>' +
                '    <td>'+data.reqireStudentNum+'</td>' +
                '</tr>' +
                '<tr style="background-color: #f2f2f2;">' +
                '    <td>选择学生</td>' +
                '    <td>班级</td>' +
                '    <td>性别</td>' +
                '    <td>志愿</td>' +
                '</tr>';
            $("#title_student").append(tbodyContent);
        }
    });
    initStudentInfo(teacherTitleID);
}

//初始化学生信息
function initStudentInfo(teacherTitleID){
    $.ajax({
        url: contextPath + '/chooseGPStudent/getStudentInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            for (var i = 0; i < data.length; i ++) {
                var tr =
                    '<tr><td>' +
                    data.studentName + '</td><td>' +
                    data.className + '</td><td>' +
                    data.studentSex + '</td><td>' +
                    data.chooseBank + '</td>'+
                    '</tr>';
            }

            $("#title_student").append(tr);
        }
    });
}
