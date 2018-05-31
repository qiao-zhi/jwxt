$(function () {
    //初始化教研室审核信息
    var teacherTitleID = getUrlParam(teacherTitleID);
    $.ajax({
        url: contextPath + '/project_AC/getProjectInfoDetail.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("tbody").html("");
            var tbodyContent =
                '<tr><td>课题名称</td><td colspan="5">'
                + data.titlename + '</td></tr> ' +
                '<tr><td>课题类型</td><td>'
                + data.projectType + '</td>' +
                '<td>课题类别</td><td>'
                + data.titleType + '</td>' +
                '<td>课题来源</td><td>' +
                +data.titleOrigin + '</td></tr> ' +
                '<tr><td>成果形式</td><td>' +
                +data.resultType + '</td> ' +
                '<td>设计时间</td><td colspan="3">' +
                +data.gdTime + '</td></tr> ' +
                '<tr><td>指导教师</td><td>' +
                +data.teacherName + '</td> ' +
                '<td>职称</td><td>' +
                +data.positionalTitle + '</td>' +
                '<td>学位</td><td>' +
                +data.degree + '</td></tr> ' +
                '<tr><td>学生专业</td><td>' +
                +data.majorName + '</td>' +
                '<td>学生人数</td><td>' +
                +data.reqirestudentnum + '</td>' +
                '<td>申请时间</td><td>' +
                +data.applyTime + '</td></tr> ' +
                '<tr><td>教研室审核</td><td>' +
                +data.checkFirstResult + '</td>' +
                '<td>教研室审核意见</td><td colspan="3">' +
                +data.checkFirstDesc + '</td></tr> ' +
                '<tr><td>院长审核</td><td>' +
                +data.checkSecondResult + '</td>' +
                '<td>院长审核意见</td><td colspan="3">' +
                +data.checkSecondDesc + '</td></tr> ' +
                '<tr><td>目标要求</td><td colspan="5">' +
                +data.targetRequire + '</td></tr> ' +
                '<tr><td>研究内容</td><td colspan="5">' +
                +data.researchContent + '</td></tr>';

            $("tbody").append(tbodyContent);
        }
    });
});
