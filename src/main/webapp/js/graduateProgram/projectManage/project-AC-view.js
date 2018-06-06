$(function () {
    //初始化教研室审核信息
    var teacherTitleID = getUrlParam("teacherTitleID");
    $.ajax({
        url: contextPath + '/project_AC/getProjectInfoDetail.do',
        data: {"teacherTitleID": teacherTitleID},
        type: 'POST',
        success: function (data) {
            var data1 = ajaxGetStringToJson(data);
            $("tbody").html("");

            var tbodyContent =
                '<tr><td>课题名称</td><td colspan="5">'
                + data1.titlename + '</td></tr> ' +
                '<tr><td>课题类型</td><td>'
                + data1.projecttype + '</td>' +
                '<td>课题类别</td><td>'
                + data1.titletype + '</td>' +
                '<td>课题来源</td><td>'
                +data1.titleorigin + '</td></tr> ' +
                '<tr><td>成果形式</td><td>'
                +data1.resulttype + '</td> ' +
                '<td>设计时间</td><td colspan="3">' +
                +data1.gdTime + '</td></tr> ' +
                '<tr><td>指导教师</td><td>'
                +data1.teacherName + '</td> ' +
                '<td>职称</td><td>'
                +data1.positionalTitle + '</td>' +
                '<td>学位</td><td>'
                +data1.degree + '</td></tr> ' +
                '<tr><td>学生专业</td><td>'
                +data1.majorName + '</td>' +
                '<td>学生人数</td><td>'
                +data1.reqirestudentnum + '</td>' +
                '<td>申请时间</td><td>'
                +data1.applyTime + '</td></tr> ' +
                '<tr><td>教研室审核</td><td>'
                +data1.checkFirstResult + '</td>' +
                '<td>教研室审核意见</td><td colspan="3">'
                +data1.checkFirstDesc + '</td></tr> ' +
                '<tr><td>院长审核</td><td>'
                +data1.checkSecondResult + '</td>' +
                '<td>院长审核意见</td><td colspan="3">'
                +data1.checkSecondDesc + '</td></tr> ' +
                '<tr><td>目标要求</td><td colspan="5">'
                +data1.targetrequire + '</td></tr> ' +
                '<tr><td>研究内容</td><td colspan="5">'
                +data1.researchcontent + '</td></tr>';

            $("tbody").append(tbodyContent);
        }
    });
});
