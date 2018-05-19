var teacherTitleID = "";
$(function(){
    //获取传过来的选题Id
    teacherTitleID = getUrlParam(teacherTitleID);
    
    //初始化课题表格
    findTaskNoticeBaseInfo();

    //初始化学生信息
    findStudentInfo();
});

//初始化课题表格
function findTaskNoticeBaseInfo(){
    $.ajax({
        url : contextPath+'/chooseGPStudent/c_getProjectInfo.do',
        data : teacherTitleID,
        type : 'POST',
        dataType : 'json',
        async:true,
        success : function (data) {
            $("#y_titleBody").html("");//清空表格中数据并重新填充数据
            var tr =
                '<td>' +
                + date.titlename + '</td><td>' +
                + date.titleOrigin + '</td><td>' +
                + date.projectType + '</td><td>' +
                + date.majorName + '</td><td id="needPerson">' +
                + date.reqireStudentNum +
                '</td></tr>';
            $("#y_titleBody").append(tr);
        }
    });
}

//初始化学生信息
function findStudentInfo(){
    $.ajax({
        url : contextPath+'/chooseGPStudent/c_getStudentInfo.do',
        data : teacherTitleID,
        type : 'POST',
        dataType : 'json',
        async:true,
        success : function (data) {
            $("#y_studentBody").html("");//清空表格中数据并重新填充数据
            for(var i = 0; i < data.length; i ++){
                var tr =
                    ' <tr><td>' +
                    + (i+1) + '</td><td>'
                    + data.studentName + '</td><td>'
                    + data.studentSex + '</td><td>'
                    + data.className + '</td><td>'
                    + data.chooseBank + '</td><td>'
                    + '<input type="radio" name="isConfirm' + i + '" class="'+ data.studentID +'" value="确认" title="确认" checked>'
                    + '<input type="radio" name="isConfirm' + i + '" value="取消" title="取消">'
                    + '</td></tr>';

                $("#y_studentBody").append(tr);
            }
        }
    });
}

//提交
function y_submit() {

    layer.confirm("提交之后将不能更改,确认提交?",function (index) {
        var num = 0;
        var studentIDs = "";
        $('input:radio:checked').each(function(){
            if ($(this).val() == "确认") {
                num ++ ;
                studentIDs = studentIDs + $(this).attr("class") + ",";
            }
        });
        //获取确认的学生
        studentIDs = studentIDs.substring(0,studnetIDs.length - 1);
        if ($("#needPerson").text() < num ) {
            layui.alert("选择的学生人数超过课题需要人数！");
        }
        $.ajax({
            url : contextPath+'/chooseGPStudent/submitChooseStudent.do',
            data : {"teacherTitleID":teacherTitleID, "studentIDs":studentIDs},
            type : 'POST',
            dataType : 'json',
            success : function (data) {
                if (data == "success") {
                    layui.alert("提交成功！");
                }
            }
        })
    });
}