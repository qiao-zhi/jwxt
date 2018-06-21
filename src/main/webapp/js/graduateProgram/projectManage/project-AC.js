/*查询*/
layui.use('form', function () {
    var form = layui.form;

    //监听提交
    form.on('submit(sreach)', function (data) {
        //清空当前页和页号
        $("input[name='pageSize']").val('');
        $("input[name='currentPage']").val('');
        //调用查询方法
        findTaskNoticeBaseInfo();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });
});
//毕设基本信息id
var graDesignID = "";

//判断是否有本学期的毕业设计基本信息
function getGraDesignID() {
    $.ajax({
        url: contextPath + '/project_AC/getGraDesignID.do',
        type: 'POST',
        async: false,
        success: function (data) {
            graDesignID = data;
        }
    })
}

//发布课题
function releaseProject() {
    layer.confirm("确认发布课题吗？",function () {
        $.ajax({
            url: contextPath + '/project_AC/releaseProject.do',
            type: 'POST',
            async: false,
            success: function (data) {
                layer.alert(data);
            }
        })
    })
}

//添加课题
function addProject() {
    //添加课题之前，判断是否有添加毕设基本信息
    getGraDesignID();
    if (graDesignID == "") {
        layer.alert("本学期没有毕设任务，请等待下发毕设任务！");
        return false;
    }

    x_admin_show('填写课题申请表', './project-AC-Apply.jsp?graDesignID=' + graDesignID)
}

//教研室审核
function auditFirst() {

    var checkedTr = $('input[name=y_check]:checked');

    if (checkedTr.length == 0) {
        layer.alert('请选择审核课题！');
    } else {
        var teacherTitleIDs = "";

        var isJump = false;

        checkedTr.each(function () {
            var auditStatus = $(this).parents("tr").find(".y_auditStatus").text();
            var isSubmit = $(this).parents("tr").find(".y_isSubmit").text();
            if (auditStatus != "待教研室审核") {
                layer.alert('审核状态只能为，待教研室审核！');
                isJump = false;
                return false;
            }
            if (isSubmit == "未提交") {
                layer.alert('该课题未提交，不能审核！');
                isJump = false;
                return false;
            }

            teacherTitleIDs = teacherTitleIDs + $(this).parents("tr").find(".y_id").val() + ",";
            isJump = true;
        });
        if (teacherTitleIDs != "" && isJump) {
            teacherTitleIDs = teacherTitleIDs.substring(0, teacherTitleIDs.length - 1);
            x_admin_show('教研室审核', './project-AC-checkFirst.jsp?teacherTitleIDs=' + teacherTitleIDs)
        }
    }
}

//院长审核
function auditSecond() {
    var checkedTr = $('input[name=y_check]:checked');
    if (checkedTr.length == 0) {
        layer.alert('请选择审核课题！');
    } else {
        var teacherTitleIDs = "";

        var isJump = false;

        checkedTr.each(function () {
            var auditStatus = $(this).parents("tr").find(".y_auditStatus").text();
            var isSubmit = $(this).parents("tr").find(".y_isSubmit").text();
            if (auditStatus != "待院长审核") {
                layer.alert('审核状态只能为待院长审核！');
                isJump = false;
                return false;
            }
            if (isSubmit == "未提交") {
                layer.alert('该课题未提交，不能审核！');
                isJump = false;
                return false;
            }

            teacherTitleIDs = teacherTitleIDs + $(this).parents("tr").find(".y_id").val() + ",";
            isJump = true;
        });
        if (teacherTitleIDs != "" && isJump) {
            teacherTitleIDs = teacherTitleIDs.substring(0, teacherTitleIDs.length - 1);
            x_admin_show('院长审核', './project-AC-checkSecond.jsp?teacherTitleIDs=' + teacherTitleIDs)
        }
    }
}

$(function () {
    //初始化查询学年
    initYearNum();

    //获取用户权限，显示相应的按钮
    showButtonByAuthority();

    //判断发布状态。如果已已发布。不允许对课题进行增改。
    var isHasRelease = isHasRelease();
    if (isHasRelease) {
        $("#isHasNoRelease").hide();
    } else {
        $("#isHasNoRelease").show();
    }

    findTaskNoticeBaseInfo();//初始化表格
});


function findTaskNoticeBaseInfo() {
    $.ajax({
        url: contextPath + '/project_AC/getProject_ACInfo.do',
        data: $("#y_form").serialize(),
        type: 'POST',
        dataType: 'json',
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
            '<tr><td><input type="checkbox" name="y_check" class="y_check"/></td>' +
            '<input type="hidden" class="y_id" value="' + baseInfoList[i].teacherTitleID + '">' +
            '<td>' + checkNull(baseInfoList[i].yearNum) + '</td>' +
            '<td>' + checkNull(baseInfoList[i].semesterNum) + '</td>' +
            '<td>' + checkNull(baseInfoList[i].teacherName) + '</td>' +
            '<td>' + checkNull(baseInfoList[i].titlename) + '</td>' +
            '<td>' + checkNull(baseInfoList[i].titleOrigin) + '</td>' +
            '<td>' + checkNull(baseInfoList[i].majorName) + '</td>' +
            '<td>' + checkNull(baseInfoList[i].reqireStudentNum) + '</td>' +
            '<td class="y_isSubmit">' + ((baseInfoList[i].isSubmit == "0") ? "未提交" : "已提交") + '</td>' +
            '<td class="y_auditStatus">' + getAuditStatusName(baseInfoList[i].checkStatus) + '</td>' +
            '<td class="td-manage">' +
            '<a title="详细信息" onclick="x_admin_show(\'详细信息\',\'project-AC-view.jsp?teacherTitleID=' + baseInfoList[i].teacherTitleID + '\')" href="javascript:;">' +
            '<i class="layui-icon">&#xe63c;</i></a>';
        if (baseInfoList[i].checkStatus == "3" || baseInfoList[i].isSubmit == "0") {
            tr = tr +
                '<a title="修改毕设课题"  class="isHasNoRelease" onclick="x_admin_show(\'修改毕设课题\',\'project-AC-modify.jsp?teacherTitleID=' + baseInfoList[i].teacherTitleID + '\')" href="javascript:;">' +
                '<i class="layui-icon">&#xe642;</i></a>' +
                '<a title="删除" onclick="member_del(this)" href="javascript:;">' +
                '<i class="layui-icon">&#xe640;</i></a>' +
                '</td>' +
                '</tr>';
        } else {
            tr = tr + '</td></tr>';
        }

        $("tbody").append(tr);

    }

    //开启分页组件
    noticeInfoListPage(total, pageNum, pageSize);
}

//根据审核代码，获取审核结果。
function getAuditStatusName(AuditStatusCode) {
    var AuditStatusNamme = "";
    if (AuditStatusCode == 0) {
        AuditStatusNamme = "待教研室审核"
    } else if (AuditStatusCode == 1) {
        AuditStatusNamme = "待院长审核"
    } else if (AuditStatusCode == 2) {
        AuditStatusNamme = "审核通过"
    } else if (AuditStatusCode == 3) {
        AuditStatusNamme = "审核不通过"
    }
    return AuditStatusNamme;
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

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if (!first) {//首次不执行(点击的时候才执行)
                    findTaskNoticeBaseInfo();//执行查询分页函数(这个函数必须写在这里)
                }
            }
        });
    });
}

/*删除*/
function member_del(obj) {
    layer.confirm('确认要删除吗？', function (index) {

        var id = $(obj).parents("tr").find(".y_id").val();
        var isSubmit = $(obj).parents("tr").find(".y_isSubmit").text();

        $.ajax({
            url: contextPath + "/project_AC/removeProjectInfo.do",
            type: "post",
            dataType: "text",
            data: {"teacherTitleID": id, "isSubmit": isSubmit},
            success: function (response) {
                layer.msg(response, {icon: 1, time: 1000}, function () {
                    window.location.reload();
                })
            }
        })
    });
}

function showButtonByAuthority() {
    var authority = getAuthority();
    if (authority == "1") {
        $("#jiaoyanshi").show();
        $("#releaseProject").show();
        $("#yuanzhang").hide();
    } else if (authority == "2") {
        $("#jiaoyanshi").hide();
        $("#releaseProject").hide();
        $("#yuanzhang").show();
    } else {
        $("#jiaoyanshi").hide();
        $("#releaseProject").hide();
        $("#yuanzhang").hide();
    }
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