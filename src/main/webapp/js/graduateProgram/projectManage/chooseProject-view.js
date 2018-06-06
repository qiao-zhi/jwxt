$(function () {
    //初始化教研室审核信息
    var teacherTitleID = getUrlParam("teacherTitleID");
    $.ajax({
        url: contextPath + '/chooseProject/getProjectInfoDetail.do',
        data: {"teacherTitleID" : teacherTitleID},
        type: 'POST',
        async: true,
        success: function (response) {
            var data = ajaxGetStringToJson(response);
            $("tbody").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>课题名称</td>' +
                '    <td colspan="5">'+ checkNull(data.titlename) + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题类型</td>' +
                '    <td>'+ checkNull(data.projecttype) + '</td>' +
                '    <td>课题来源</td>' +
                '    <td>'+ checkNull(data.titleorigin) + '</td>' +
                '    <td>课题类别</td>' +
                '    <td>'+ checkNull(data.titletype) + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>成果形式</td>' +
                '    <td>'+ checkNull(data.resulttype) + '</td>' +
                '    <td>需要人数</td>' +
                '    <td>'+ checkNull(data.reqiresudentnum) + '</td>' +
                '    <td>设计时间</td>' +
                '    <td>'+ checkNull(data.gdTime) + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>目标要求</td>' +
                '    <td colspan="5">'+ checkNull(data.targetrequire) + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>研究内容</td>' +
                '    <td colspan="5">'+ checkNull(data.researchcontent) + '</td>' +
                '</tr>';

            $("tbody").append(tbodyContent);
        }
    });
});
