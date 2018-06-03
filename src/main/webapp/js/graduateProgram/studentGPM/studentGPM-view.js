$(function () {
    initTitleInfo();
});

//初始化课题详细信息
function initTitleInfo() {
    $.ajax({
        url: contextPath + '/studentGPM/getProjectDetailInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            if (data != null) {
                return true;
            }
        }
    });
    initStudentInfo(teacherTitleID);
}
