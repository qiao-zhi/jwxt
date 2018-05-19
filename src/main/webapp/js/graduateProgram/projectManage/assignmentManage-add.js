$(function () {
    //初始化课题信息
    initTitleInfo();
});

//初始化课题基本信息
function initTitleInfo() {
    var teacherTitleID = getUrlParam(teacherTitleID);
    $.ajax({
        url: contextPath + '/chooseGPStudent/getProjectInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#titleInfo").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>课题名称</td>' +
                '    <td colspan="3">'+data.titlename+'</td>' +
                '    <td>专业</td>' +
                '    <td>'+data.majorName+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>课题来源</td>' +
                '    <td>'+data.titleOrigin+'</td>' +
                '    <td>课题类别</td>' +
                '    <td>'+data.titleType+'</td>' +
                '    <td>成果形式</td>' +
                '    <td>'+data.resultType+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>主要研究内容</td>' +
                '    <td colspan="5">'+data.researchContent+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计目标要求</td>' +
                '    <td colspan="5">'+data.targetRequire+'</td>' +
                '</tr>'
            $("#titleInfo").append(tbodyContent);
        }
    });
}

//声明填写状态，在点击查看，或填写时，通过判断状态，来提示，是否需要保存或提交
//0 表示，处于查看状态
var isFillStatus = 0;

//填写对应的任务书
function fillAssignment(studentID) {

    //判断当前状态，是否处于编辑状态.0 保存、1 提交。-1 位未填写
    if (isFillStatus != 0) {
        layui.alert("请先保存或提交当前填写！")
    }

    $.ajax({
        url: contextPath + '/chooseGPStudent/getAssignmentInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#assignment").html("");
            var tbodyContent =
                '<tr>' +
                '    <td>学生姓名</td>' +
                '    <td>\'+data.studentName+\'</td>' +
                '    <td>学号</td>' +
                '    <td>\'+data.studentID+\'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>专业班级</td>' +
                '    <td>\'+data.majorName+\'</td>' +
                '    <td>同组人</td>' +
                '    <td>\'+data.studentPartners+\'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>任务下发时间</td>' +
                '    <td><input class="layui-input" name="taskSendTime" id="startDate" type="text"></td>' +
                '    <td>任务完成时间</td>' +
                '    <td><input class="layui-input" name="taskCompleteTime" id="endDate" type="text"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td style="width:110px">设计（论文）题目</td>' +
                '    <td><input class="layui-input" name="thesisTitle" type="text"></td>' +
                '    <td>毕设题目</td>' +
                '    <td><input class="layui-input" name="gdTitle" type="text"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计目的要求</td>' +
                '    <td colspan="3">' +
                '        <textarea name="designTargetRequire" class="layui-textarea"></textarea>' +
                '    </td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计主要内容</td>' +
                '    <td colspan="3">' +
                '        <textarea name="designContent" class="layui-textarea"></textarea>' +
                '    </td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计提交资料</td>' +
                '    <td colspan="3">' +
                '        <textarea name="designSubmitFile" class="layui-textarea"></textarea>' +
                '    </td>' +
                '</tr>' +
                '<tr>' +
                '    <td>指导教师签名</td>' +
                '    <td colspan="3">' +
                '        <button type="button" class="layui-btn" id="test1">上传签名</button>' +
                '        <div class="layui-upload-list">' +
                '            <img class="layui-upload-img" width="100" id="demo1">' +
                '            <p id="demoText"></p>' +
                '        </div>' +
                '    </td>' +
                '</tr>';

            $("#assignment").append(tbodyContent);
        }
    });

    isFillStatus = 1;
}

//根据学生id，显示学生对应的任务书
function showAssignment(studentID) {
    $.ajax({
        url: contextPath + '/chooseGPStudent/getStudentInfo.do',
        data: teacherTitleID,
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#assignment").html("");
            var divContent =
                '<table class="table table-bordered">' +
                '<caption>太原科技大学毕业设计（论文）任务书</caption>' +
                '<tbody>' +
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
                '    <td>'+data.taskSendTime+'</td>' +
                '    <td>任务完成时间</td>' +
                '    <td>'+data.taskCompleteTime+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td style="width:110px">设计（论文）题目</td>' +
                '    <td>'+data.thesisTitle+'</td>' +
                '    <td>毕设题目</td>' +
                '    <td>'+data.gdTitle+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计目的要求</td>' +
                '    <td colspan="3">'+data.designTargetRequire+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计主要内容</td>' +
                '    <td colspan="3">'+data.designContent+'</td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计提交资料</td>' +
                '    <td colspan="3">'+data.designSubmitFile+'</td>' +
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
                '</tr></tbody></table>'+
                '<span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>';

            $("#assignment").append(divContent);
        }
    });

    isFillStatus = 0;
}


//保存
function y_save() {
        $.ajax({
            url : contextPath+'/chooseGPStudent/saveAssignment.do',
            data : $("#y_form").serialize(),
            type : 'POST',
            dataType : 'json',
            success : function (data) {
                if (data == "success") {
                    layui.alert("保存成功！");
                    //重新刷新，添加任务书界面。
                    initTitleInfo();
                }
            }
        })
}

//提交
function y_submit() {

    layer.confirm("提交之后将不能更改,确认提交?",function (index) {
        $.ajax({
            url : contextPath+'/chooseGPStudent/saveAssignment.do',
            data : $("#y_form").serialize(),
            type : 'POST',
            dataType : 'json',
            success : function (data) {
                if (data == "success") {
                    layui.alert("提交成功！");
                    //重新刷新，添加任务书界面。
                    initTitleInfo();
                }
            }
        })

    });
}