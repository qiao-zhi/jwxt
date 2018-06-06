$(function () {
    //初始进度表
    initTitleInfo();
});

//初始化课题基本信息
function initTitleInfo() {
    $.ajax({
        url: contextPath + '/studentGPM/getProgramTable.do',
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {

            $("#collegeName").val(data.collegeName);

            $("tbody").html("");
            var tbodyContent =
                '<tr>' +
                '    <td><input type="hidden" id="y_ID" value="'+data.progressId+'" />' +
                '           学生姓名</td>' +
                '    <td>' + data.studentName + '</td>' +
                '    <td>指导教师</td>' +
                '    <td>' + data.teacherName + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>专业班级</td>' +
                '    <td>' + data.className + '</td>' +
                '    <td>学号</td>' +
                '    <td>' + data.studentNum + '</td>' +
                '</tr>' +
                '<tr><!--从任务书中，提取-->' +
                '    <td style="width:150px">设计（论文）题目</td>' +
                '    <td>' + data.thesisTitle + '</td>' +
                '    <td>毕设题目</td>' +
                '    <td>' + data.gdTitle + '</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>时间（阶段安排）</td>' +
                '    <td colspan="3">应完成的工作内容</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>' +
                '        <textarea name="taskTimeRange" id="y_taskTimeRange" class="layui-textarea" cols="20" rows="25">' +
                data.taskTimeRange +
                '       </textarea>' +
                '    </td>' +
                '    <td colspan="3">' +
                '        <textarea name="content" id="y_content" class="layui-textarea" cols="75" rows="25">' +
                data.content +
                '       </textarea>' +
                '    </td>' +
                '</tr>';
            $("tbody").append(tbodyContent);
        }
    });
}

//保存
function y_save() {
    var y_taskTimeRange = $("#y_taskTimeRange").html();
    var y_content = $("#y_content").html();
    var editTime = $("#L_pass").val();
    $.ajax({
        url: contextPath + '/studentGPM/saveProgramTable.do',
        data: {"progressid":$("#y_ID").val(), "tasktimerange":y_taskTimeRange, "content":y_content, "edittime":editTime, "fillStatus":"0"},
        type: 'POST',
        dataType: 'text',
        success: function (data) {
            if (data == "success") {
                layui.alert("保存成功！");
                closePage();
            }
        }
    })
}

//提交
function y_submit() {

    var y_taskTimeRange = "";
    if ($("#y_taskTimeRange").val() == "" || $("#y_taskTimeRange").val() == null) {
        layui.alert("时间（阶段安排）不能为空！");
        return false;
    } else {
        y_taskTimeRange = $("#y_taskTimeRange").html()
    }
    var y_content = "";
    if ($("#y_content").val() == "" || $("#y_content").val() == null) {
        layui.alert("应完成的工作内容不能为空！");
        return false;
    } else {
        y_content = $("#y_content").html()
    }
    var editTime = $("#L_pass").val();

    layer.confirm("提交之后将不能更改,确认提交?", function (index) {
        $.ajax({
            url: contextPath + '/studentGPM/saveProgramTable.do',
            data: {"progressid":progressId, "tasktimerange":y_taskTimeRange, "content":y_content, "edittime":editTime, "fillStatus":"1"},
            type: 'POST',
            dataType: 'text',
            success: function (data) {
                if (data == "success") {
                    layui.alert("提交成功！");
                    closePage();
                }
            }
        })

    });
}

/*时间*/
layui.use('laydate', function () {
    var laydate = layui.laydate;
    laydate.render({
        elem: '#L_pass' //指定元素
        , format: 'yyyy年MM月dd日'
    });
})
var myDate = new Date;
var year = myDate.getFullYear();//获取当前年
var month = myDate.getMonth() + 1;//获取当前月
var date = myDate.getDate();
if (month < 10) month = "0" + month;
if (date < 10) date = "0" + date;

$("#L_pass").val(year + "年" + month + "月" + date + "日");