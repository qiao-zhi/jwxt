var teacherTitleID = "";
$(function () {
    teacherTitleID = getUrlParam(teacherTitleID);
    $.ajax({
        url: contextPath + '/projectManage/getProjectInfoDetail.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: initViewInfo
    });
});

var tbodyContent = "";
//初始化课题信息
function initViewInfo(data) {
    $("tbody").html("");
    tbodyContent =
        '<tr>' +
        '    <td>课题名称</td>' +
        '    <td colspan="3">' + data.titlename + '</td>' +
        '</tr>' +
        '<tr>' +
        '    <td>课题类型</td>' +
        '    <td>' + data.projectType + '</td>' +
        '    <td>题目类别</td>' +
        '    <td>' + data.titleType + '</td>' +
        '</tr>' +
        '<tr>' +
        '    <td>课题来源</td>' +
        '    <td>' + data.titleOrigin + '</td>' +
        '    <td>指导教师</td>' +
        '    <td>' + data.teacherName + '</td>' +
        '</tr>' +
        '<tr>' +
        '    <td>专业</td>' +
        '    <td>' + data.majorName + '</td>' +
        '    <td>申请人数</td>' +
        '    <td>' + data.reqireStudentNum + '</td>' +
        '</tr>'+
        '<tr style="background-color: #f2f2f2;">' +
        '    <td>序号</td>' +
        '    <td>选择学生</td>' +
        '    <td>班级</td>' +
        '    <td>性别</td>' +
        '</tr>';

    initStudentInfo();
}

//初始化学生信息
function  initStudentInfo() {
    $.ajax({
        url: contextPath + '/projectManage/getStudentInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success:
        function (data) {
            for (var i = 0; i < data.length; i ++) {
                var student =
                    '<tr>' +
                    '    <td>' + (i+1) + '</td>' +
                    '    <td>\' + data[i].studentName + \'</td>' +
                    '    <td>\' + data[i].className + \'</td>' +
                    '    <td>\' + data[i].studentSex + \'</td>' +
                    '</tr>';
                tbodyContent = tbodyContent + student;
            }

            $("tbody").append(tbodyContent);
        }
    });


}