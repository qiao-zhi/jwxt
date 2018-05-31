$(function () {
    //初始化课题信息
    initTitleInfo();

    //初始化任务书
    initAssignment();
});

var teacherTitleID = getUrlParam(teacherTitleID);

//初始化课题基本信息
function initTitleInfo() {
    $.ajax({
        url: contextPath + '/assignmentManage/getProjectInfo.do',
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
                '</tr>' +
                '<tr>' +
                '    <td>教研室审核结果</td>' +
                '    <td>'+data.checkFirstResult+'</td>' +
                '    <td>教研室审核意见</td>' +
                '    <td colspan="3">'+data.checkFirstDesc+'</td>' +
                '</tr>'+
                '<tr>' +
                '    <td>院长审核结果</td>' +
                '    <td>'+data.checkSecondResult+'</td>' +
                '    <td>院长审核意见</td>' +
                '    <td colspan="3">'+data.checkSecondDesc+'</td>' +
                '</tr>'
            ;
            $("#titleInfo").append(tbodyContent);
        }
    });
}

//填写对应的任务书
function initAssignment() {

    var studentID =  getUrlParam(studentID);
    $.ajax({
        url: contextPath + '/assignmentManage/getAssignmentInfo.do',
        data: {"teacherTitleID":teacherTitleID,"studentID":studentID},
        type: 'POST',
        dataType: 'json',
        async: true,
        success: function (data) {
            $("#assignment").html("");
            var tbodyContent =
                '<tr>' +
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
                '    <td><input class="layui-input" name="taskSendTime" id="startDate" type="text" value="'+ data.tasksendtime +'" lay-verify="required"></td>' +
                '    <td>任务完成时间</td>' +
                '    <td><input class="layui-input" name="taskCompleteTime" id="endDate" type="text" value="'+ data.taskcompletetime +'" lay-verify="required"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td style="width:110px">设计（论文）题目</td>' +
                '    <td><input class="layui-input" name="thesisTitle" type="text" value="'+ data.thesistitle +'" lay-verify="required"></td>' +
                '    <td>毕设题目</td>' +
                '    <td><input class="layui-input" name="gdTitle" type="text" value="'+ data.gdTitle +'" lay-verify="required"></td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计目的要求</td>' +
                '    <td colspan="3">' +
                '        <textarea name="designTargetRequire" class="layui-textarea" value="'+ data.designtargetrequire +'" lay-verify="required"></textarea>' +
                '    </td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计主要内容</td>' +
                '    <td colspan="3">' +
                '        <textarea name="designContent" class="layui-textarea" value="'+ data.designcontent +'" lay-verify="required"></textarea>' +
                '    </td>' +
                '</tr>' +
                '<tr>' +
                '    <td>设计提交资料</td>' +
                '    <td colspan="3">' +
                '        <textarea name="designSubmitFile" class="layui-textarea" value="'+ data.designsubmitfile +'" lay-verify="required"></textarea>' +
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
}

//保存
function y_save() {
    $.ajax({
        url : contextPath+'/assignmentManage/modifyAssignment.do',
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
            url : contextPath+'/assignmentManage/modifyAssignment.do',
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

//照片上传
layui.use('upload', function () {
    var $ = layui.jquery, upload = layui.upload;
    var uploadInst = upload.render({
        elem: '#test1'
        , url: '/upload/'
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('#demo1').attr('src', result); //图片链接（base64）
            });
        }
        , done: function (res) {
            //如果上传失败
            if (res.code > 0) {
                return layer.msg('上传失败');
            }
            //上传成功
        }
        , error: function () {
            //演示失败状态，并实现重传
            var demoText = $('#demoText');
            demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
            demoText.find('.demo-reload').on('click', function () {
                uploadInst.upload();
            });
        }
    });
});//end 照片上传

/*时间*/
layui.use('laydate', function () {
    var laydate = layui.laydate;

    $("#startDate").click(function () {
        var edate = $("#endDate").val();
        laydate.render({
            elem:'#startDate',
            show: true,
            max:edate
        })
    });
    $("#endDate").click(function () {
        var sdate = $("#startDate").val();
        laydate.render({
            elem:'#endDate',
            show: true,
            min:sdate
        })
    })
})
