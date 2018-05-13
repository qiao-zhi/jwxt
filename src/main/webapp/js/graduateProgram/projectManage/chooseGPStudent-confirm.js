/*查询*/
layui.use('form', function(){
    var form = layui.form;

    //监听提交
    form.on('submit(sreach)', function(data){
        layer.alert(JSON.stringify(data.field), {
            title: '最终的提交信息'
        });
        //清空当前页和页号
        $("input[name='pageSize']").val('');
        $("input[name='currentPage']").val('');
        //调用查询方法
        findTaskNoticeBaseInfo();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });
});

//确认选择
function confirmChooose() {
    var checkedTr = $("td").children(".layui-form-checked");
    if (checkedTr.length == 0) {
        layer.alert('请选择一条数据！');
    } else if (checkedTr.length > 1) {
        layer.alert('只能选择一条数据！');
    } else {
        var teacherTitleID = checkedTr.parent().find(".y_id").val();
        x_admin_show('确认学生','./chooseGPStudent-confirm.jsp?teacherTitleID='+teacherTitleID)
    }
}

//填写任务书
function fillAssignment() {
    var checkedTr = $("td").children(".layui-form-checked");
    if (checkedTr.length == 0) {
        layer.alert('请选择一条数据！');
    } else if (checkedTr.length > 1) {
        layer.alert('只能选择一条数据！');
    } else {
        var teacherTitleID = checkedTr.parent().find(".y_id").val();
        x_admin_show('填写任务书','./chooseGPStudent-addAssignment.jsp?teacherTitleID='+teacherTitleID);
    }
}
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
                + date.majorName + '</td><td>' +
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
            $("#y_titleBody").html("");//清空表格中数据并重新填充数据
            for(var i = 0; i < data.length; i ++){
                var tr =
                    '<tr><td>' +
                    '    <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id=\'2\'><i class="layui-icon">' +
                    '        &#xe605;</i></div>' +
                    '   <input type="hidden" class="y_id" value="'+ baseInfoList[i].teacherTitleID + '"></td>' +
                    '</td><td>' +
                    + baseInfoList[i].syear + '</td><td>' +
                    + baseInfoList[i].titlename + '</td><td>' +
                    + baseInfoList[i].majorName + '</td><td>' +
                    + baseInfoList[i].reqireStudentNum + '</td><td>' +
                    + baseInfoList[i].applyStudentNum + '</td><td>' +
                    + baseInfoList[i].confirmStudentNum + '</td><td>' +
                    + baseInfoList[i].isConfirm + '</td><td>' +
                    + baseInfoList[i].isAssignment + '</td><td>' +
                    '<td class="td-manage">' +
                    '<a title="详细信息" onclick="x_admin_show(\'详细信息\',\'chooseGPStudent-view.jsp?teacherTitleID=\'+ baseInfoList[i].teacherTitleID+\')" href="javascript:;">'+
                    '<i class="layui-icon">&#xe63c;</i></a>'+
                    /*修改完后，审核状态至为0*/
                    '<a title="修改毕设课题"  onclick="x_admin_show(\'修改毕设课题\',\'chooseGPStudent-modifyAssignment.jsp?teacherTitleID=\'+ baseInfoList[i].teacherTitleID+\')" href="javascript:;">'+
                    '<i class="layui-icon">&#xe642;</i></a>'+
                    '</td></tr>';
                $("tbody").append(tr);
            }
            var tr =
                '<td>' +
                + date.titlename + '</td><td>' +
                + date.titleOrigin + '</td><td>' +
                + date.projectType + '</td><td>' +
                + date.majorName + '</td><td>' +
                + date.reqireStudentNum +
                '</td></tr>';
            $("#y_titleBody").append(tr);
        }
    });
}

/*学年*/
layui.use('laydate', function () {
    var laydate = layui.laydate;

    laydate.render({
        elem: '#L_pass' //指定元素
        ,type: 'year'
    });
})

//点击关闭其他，触发事件
function closeOther() {
    var closeTable = $(".layui-tab-title", parent.document).children("li");
    closeTable.each(function () {
        if ($(this).attr("class") == "") {
            $(this).children("i").trigger("click");
        }
    })
}