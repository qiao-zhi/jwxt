$(function () {
    //初始化教研室审核信息
    var teacherTitleID = getUrlParam("teacherTitleID");
    $.ajax({
        url: contextPath + '/chooseProject/getProjectInfoDetail.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("tbody").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>课题名称</td>' +
                '    <td colspan="5">'+ data.titlename + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题类型</td>' +
                '    <td>'+ data.projectType + '</td>' +
                '    <td>课题来源</td>' +
                '    <td>'+ data.titleOrigin + '</td>' +
                '    <td>课题类别</td>' +
                '    <td>'+ data.titleType + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>成果形式</td>' +
                '    <td>'+ data.resultType + '</td>' +
                '    <td>需要人数</td>' +
                '    <td>'+ data.reqireStudentNum + '</td>' +
                '    <td>设计时间</td>' +
                '    <td>'+ data.gdTime + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>目标要求</td>' +
                '    <td colspan="5">'+ data.targetRequire + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>研究内容</td>' +
                '    <td colspan="5">'+ data.researchContent + '</td>' +
                '</tr>';

            $("tbody").append(tbodyContent);
        }
    });
});
