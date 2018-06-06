$(function(){
    //初始化表格
    findTaskNoticeBaseInfo();
});

function signAssignment() {
    var teacherTitleID = $("#y_ID").val();
    x_admin_show('任务书签字','./searchAssignment.jsp?teacherTitleID=' + teacherTitleID);
}

function findTaskNoticeBaseInfo(){
    $.ajax({
        url : contextPath+'/studentGPM/getPDInfo.do',
        type : 'POST',
        //dataType : 'json',
        async:true,
        success:function(response){
            var data = ajaxGetStringToJson(response);

            //if data 为空，不显示内容，提示，请选择课题
            $("#y_table").html("");//清空表格中数据并重新填充数据
            if(data == "") {
                $("#y_table").html("当前没有课题信息，请查看通知！");
                $("#y_assignment").hide();
                $("#y_programTable").hide();
                return false;
            }
            var thead =
                '<thead>' +
                '<tr>' +
                '    <th>课题名称</th>' +
                '    <th>课题类型</th>' +
                '    <th>课题来源</th>' +
                '    <th>指导教师</th>' +
                '    <th>学生姓名</th>' +
                '    <th>论文上传情况</th>';
            var tbody =
                '<tbody>' +
                '<tr>' +
                '    <td><input type="hidden" id="y_ID" vlaue="'+data.teacherTitleID+'"/>' +
                '    <input type="hidden" id="y_bookID" vlaue="'+data.bookID+'"/>' +
                            data.titlename +'</td>' +
                '    <td>'+ data.projectType +'</td>' +
                '    <td>'+ data.titleOrigin +'</td>' +
                '    <td>'+ data.teacherName +'</td>' +
                '    <td>'+ data.studentName +'</td>' +
                '    <td>'+ data.isUpThesis +'</td>';

            if (data.isStudentSign == "1") { //判断任务书是否签字。已签字1，未签字0.若签字，则显示，可查看
                thead = thead + '<th>任务书</th>';
                tbody  = tbody + '<td>'+ data.assignment +'</td>';
                $("#y_assignment").hide();
            } else if (data.isStudentSign == "0") { //显示任务书签字按钮
                $("#y_assignment").show();
            }

            if (data.fillStatus == "1") { //判断进程表是否填写。填写1，未填写0.若填写，则显示，可查看
                thead = thead + '<th>计划进程表</th>';
                tbody  = tbody + '<td>'+ data.programTable +'</td>';
                $("#y_programTable").hide();
            } else if (data.fillStatus == "0") { //显示填写进程表按钮
                $("#y_programTable").show();
            }

            thead = thead + '<th>操作</th></tr></thead>';
            tbody = tbody +
                '   <td class="td-manage">' +
                '        <a title="详细信息" onclick="x_admin_show(\'详细信息\',\'studentGPM-view.jsp\')">' +
                '            <i class="layui-icon">&#xe63c;</i>' +
                '        </a>' +
                '    </td>' +
                '</tr></tbody>';

            $("#y_table").append(thead + tbody);
        }
    });
}

//点击关闭其他，触发事件
function closeOther() {
    var closeTable = $(".layui-tab-title", parent.document).children("li");
    closeTable.each(function () {
        if ($(this).attr("class") == "") {
            $(this).children("i").trigger("click");
        }
    })
}