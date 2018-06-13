var teacherTitleID = "";
$(function () {
    teacherTitleID = getUrlParam("teacherTitleID");
    $.ajax({
        url: contextPath + '/projectManage/getProjectInfoDetail.do',
        data: {"teacherTitleID":teacherTitleID},
        type: 'POST',
        success: initViewInfo
    });
});

var tbodyContent = "";
//初始化课题信息
function initViewInfo(response) {
    var data = ajaxGetStringToJson(response);
    
    $("tbody").html("");
    tbodyContent =
        '<tr>' +
        '    <td>课题名称</td>' +
        '    <td colspan="3">' + checkNull(data.titlename) + '</td>' +
        '</tr>' +
        '<tr>' +
        '    <td>课题类型</td>' +
        '    <td>' + checkNull(data.projecttype) + '</td>' +
        '    <td>题目类别</td>' +
        '    <td>' + checkNull(data.titletype) + '</td>' +
        '</tr>' +
        '<tr>' +
        '    <td>课题来源</td>' +
        '    <td>' + checkNull(data.titleorigin) + '</td>' +
        '    <td>指导教师</td>' +
        '    <td>' + checkNull(data.teacherName) + '</td>' +
        '</tr>' +
        '<tr>' +
        '    <td>专业</td>' +
        '    <td>' + checkNull(data.majorname) + '</td>' +
        '    <td>申请人数</td>' +
        '    <td>' + checkNull(data.reqirestudentnum) + '</td>' +
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
        data: {"teacherTitleID":teacherTitleID},
        type: 'POST',
        dataType: 'json',
        async: true,
        success:
        function (data) {
            for (var i = 0; i < data.length; i ++) {
                var student =
                    '<tr>' +
                    '    <td>' + (i+1) + '</td>' +
                    '    <td>' + checkNull(data[i].studentName) + '</td>' +
                    '    <td>' + checkNull(data[i].className) + '</td>' +
                    '    <td>' + checkNull(data[i].studentSex) + '</td>' +
                    '</tr>';
                tbodyContent = tbodyContent + student;
            }

            $("tbody").append(tbodyContent);
        }
    });


}