$(function () {
    //初始化教研室审核信息
    var teacherTitleID = getUrlParam(teacherTitleID);
    initTitleInfo(teacherTitleID);
});

//初始化课题基本信息
function initTitleInfo(teacherTitleID) {
    $.ajax({
        url: contextPath + '/chooseProject/getProjectInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#title_student").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>课题名称</td>' +
                '    <td colspan="5">'+data.titlename+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题类型</td>' +
                '    <td colspan="2">'+data.projectType+'</td>' +
                '    <td>课题类别</td>' +
                '    <td>'+data.titleType+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题来源</td>' +
                '    <td colspan="2">'+data.titleOrigin+'</td>' +
                '    <td>指导教师</td>' +
                '    <td>'+data.teacherName+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>专业</td>' +
                '    <td colspan="2">'+data.majorName+'</td>' +
                '    <td>学生人数</td>' +
                '    <td>'+data.reqireStudentNum+'</td>' +
                '</tr>' +
                '<tr style="background-color: #f2f2f2;">' +
                '    <td>选择学生</td>' +
                '    <td>班级</td>' +
                '    <td>性别</td>' +
                '    <td>志愿</td>' +
                '    <td>操作</td>' +
                '</tr>';
            $("#title_student").append(tbodyContent);
        }
    });
    initStudentInfo(teacherTitleID);
}

//初始化学生信息
function initStudentInfo(teacherTitleID){
    $.ajax({
        url: contextPath + '/chooseProject/getProjectInfoDetail.do',
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
                    data.chooseBank + '</td><td>' +
                    '<button  class="y_assignment" onclick="y_showAssignment('+ data.studentID +')">任务书</button></td>' +
                    '</tr>';
            }

            $("#title_student").append(tr);
        }
    });
}

//根据学生id，显示学生对应的任务书
function y_showAssignment(studentID) {
    $.ajax({
        url: contextPath + '/chooseProject/getProjectInfoDetail.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#assignmentTbody").html("");
            var tbodyContent =
                ' <tr>' +
                '    <td>学生姓名</td>' +
                '    <td>'+data.studentName+'</td>' +
                '    <td>学号</td>' +
                '    <td>'+data.studentID+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>专业班级</td>' +
                '    <td>'+data.majorName+'</td>' +
                '    <td>同组人</td>' +
                '    <td>'+data.studentPartners+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>任务下发时间</td>' +
                '    <td>'+data.time+'</td>' +
                '    <td>任务完成时间</td>' +
                '    <td></td>' +
                '</tr>' +
                '<tr>' +
                '    <td style="width:110px">设计（论文）题目</td>' +
                '    <td></td>' +
                '    <td>毕设题目</td>' +
                '    <td></td>' +
                '</tr>' +

                '<tr>' +
                '    <td>设计目的要求</td>' +
                '    <td colspan="3"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计主要内容</td>' +
                '    <td colspan="3"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计提交资料</td>' +
                '    <td colspan="3"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td>学生签名</td>' +
                '    <td>' +
                '        <img class="layui-upload-img" width="100">' +
                '    </td>' +
                '    <td>指导教师签名</td>' +
                '    <td>' +
                '        <img class="layui-upload-img" width="100">' +
                '    </td>' +
                '</tr>' +
                '<tr>' +
                '    <td>系主任签名</td>' +
                '    <td>' +
                '        <img class="layui-upload-img" width="100">' +
                '    </td>' +
                '    <td>主管院长签名</td>' +
                '    <td>' +
                '        <img class="layui-upload-img" width="100">' +
                '    </td>' +
                '</tr>'

            $("#assignmentTbody").append(tbodyContent);
        }
    });
}