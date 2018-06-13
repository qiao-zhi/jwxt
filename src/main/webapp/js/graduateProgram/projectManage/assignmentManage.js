/*查询*/
layui.use('form', function () {
    var form = layui.form;

    //监听提交
    form.on('submit(sreach)', function (data) {
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

//填写任务书
function fillAssignment() {
    var checkedTr = $("td").children(".layui-form-checked");
    if (checkedTr.length == 0) {
        layer.alert('请选择一位学生！');
    } else if (checkedTr.length > 1) {
        layer.alert('只能选择一位学生！');
    } else {
        //判断是否已经填写了任务书
        var fillStatus = checkedTr.parents("tr").find(".fillStatus").attr("value");
        if (fillStatus == "1" || fillStatus == "0") {
            layer.alert("该学生已经添加任务书！");
            return false;
        }

        var teacherTitleID = checkedTr.parent().find(".y_teacherTitleID").val();
        var studentID = checkedTr.parent().find(".y_studentID").val();
        x_admin_show('填写任务书', './assignmentManage-add.jsp?teacherTitleID=' + teacherTitleID + "&studentID=" + studentID);
    }
}

$(function () {
    //初始化查询学年
    initYearNum();

    //初始化表格
    findTaskNoticeBaseInfo();
});

function findTaskNoticeBaseInfo() {
    $.ajax({
        url: contextPath + '/assignmentManage/getStudentInfo.do',
        data: $("#y_form").serialize(),
        type: 'POST',
        dataType: 'json',
        async: true,
        success: showTaskNoticeBaseInfo
    });
}

//查询成功后执行
function showTaskNoticeBaseInfo(pageInfo) {
    // console.log(pageInfo) //测试是否有值
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var baseInfoList = pageInfo.list;
    $("tbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length_l = baseInfoList.length; i < length_l; i++) {
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr =
            '<tr>' +
            '    <td>' +
            '        <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id=\\\'2\\\'><i class="layui-icon">&#xe605;</i></div>' +
            '        <input type="hidden" class="y_teacherTitleID" value="' + baseInfoList[i].teacherTitleID + '"/>   ' +
            '        <input type="hidden" class="y_studentID" value="' + baseInfoList[i].studentID + '"/>   ' +
            '        <input type="hidden" class="y_bookID" value="' + baseInfoList[i].bookID + '"/>   ' +
            '    </td>' +
            '    <td>' + baseInfoList[i].yearnum + '</td>' +
            '    <td>' + baseInfoList[i].semesternum + '</td>' +
            '    <td>' + baseInfoList[i].studentName + '</td>' +
            '    <td>' + baseInfoList[i].majorName + '</td>' +
            '    <td>' + baseInfoList[i].teacherName + '</td>' +
            '    <td>' + baseInfoList[i].titlename + '</td>';
        if (baseInfoList[i].fillStatus == "-1") {
            tr = tr + '<td class="fillStatus" value="' + baseInfoList[i].fillStatus + '">未填写</td>';
        } else if (baseInfoList[i].fillStatus == "0") {
            tr = tr + '<td class="fillStatus" value="' + baseInfoList[i].fillStatus + '">未完成</td>';
        } else if (baseInfoList[i].fillStatus == "1") {
            tr = tr + '<td class="fillStatus" value="' + baseInfoList[i].fillStatus + '">已完成</td>';
        }

        tr = tr +
            '<td class="td-manage">' +
            '<a title="详细信息" onclick="x_admin_show(\'详细信息\',\'assignmentManage-view.jsp?studentID=\'+ baseInfoList[i].studentID+\')" href="javascript:;">' +
            '<i class="layui-icon">&#xe63c;</i></a>';
        if (baseInfoList[i].checkStatus == "3" || baseInfoList[i].checkStatus == "0") {
            tr = tr +
                '<a title="修改任务书"  ' +
                'onclick="x_admin_show(\'修改任务书\',\'assignmentManage-modify.jsp?teacherTitleID=\'+ baseInfoList[i].teacherTitleID + \'&studentID=\' + baseInfoList[i].studentID+\')"' +
                ' href="javascript:;">' +
                '<i class="layui-icon">&#xe642;</i></a>' +
                '</td>' +
                '</tr>';

            $("tbody").append(tr);
        }
    }
    //开启分页组件
    noticeInfoListPage(total, pageNum, pageSize);

}


//分页函数
function noticeInfoListPage(total, pageNum, pageSize) {
    /*分页js*/
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage, layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'y_page', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit: pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr: pageNum,//当前页号
            limits: [6, 10, 15, 20],
            layout: ['limit', 'prev', 'page', 'next', 'skip', 'count'],//显示哪些分页组件
            jump: function (obj, first) {//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='currentPage']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if (!first) {//首次不执行(点击的时候才执行)
                    findTaskNoticeBaseInfo();//执行查询分页函数(这个函数必须写在这里)
                }
            }
        });
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
