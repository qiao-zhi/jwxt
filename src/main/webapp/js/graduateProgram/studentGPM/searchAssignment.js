$(function () {
    //初始化任务书
    initTitleInfo();
});

//初始化任务书
function initTitleInfo() {
    $.ajax({
        url: contextPath + '/chooseGPStudent/getAssignmentTable.do',
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("tbody").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>学生姓名</td>' +
                '    <td>' + data.studentName + '</td>' +
                '    <td>学号</td>' +
                '    <td>' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>专业班级</td>' +
                '    <td>' + data.studentName + '</td>' +
                '    <td>同组人</td>' +
                '    <td>' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>任务下发时间</td>' +
                '    <td>' + data.studentName + '</td>' +
                '    <td>任务完成时间</td>' +
                '    <td>' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td style="width:110px">设计（论文）题目</td>' +
                '    <td>' + data.studentName + '</td>' +
                '    <td>毕设题目</td>' +
                '    <td>' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计目的要求</td>' +
                '    <td colspan="3">' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计主要内容</td>' +
                '    <td colspan="3">' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计提交资料</td>' +
                '    <td colspan="3">' + data.studentName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>学生签名</td>' +
                '    <td><input type="text" class="layui-input" autofocus></td>' +
                '    <td>指导教师签名</td>' +
                '    <td><img class="layui-upload-img" width="100" id="demo1"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td>系主任签名</td>' +
                '    <td><img class="layui-upload-img" width="100" id="demo13"></td>' +
                '    <td>主管院长签名</td>' +
                '    <td><img class="layui-upload-img" width="100" id="demo14"></td>' +
                '</tr>';
              
            $("tbody").append(tbodyContent);
        }
    });
}

//提交
function y_submit() {

    layer.confirm("确认提交?",function (index) {
        $.ajax({
            url : contextPath+'/chooseGPStudent/saveStudentSign.do',
            type : 'POST',
            dataType : 'json',
            success : function (data) {
                if (data == "success") {
                    layui.alert("提交成功！");
                    //重新刷新，添加任务书界面。
                    closePage();
                }
            }
        })

    });
}