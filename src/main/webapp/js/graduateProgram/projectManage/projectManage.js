/*查询*/
layui.use('form', function(){
    var form = layui.form;

    //监听提交
    form.on('submit(sreach)', function(data){
        //清空当前页和页号
        $("input[name='pageSize']").val('');
        $("input[name='currentPage']").val('');
        //调用查询方法
        findTaskNoticeBaseInfo();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });
});

//发布课题选择
function releaseProjectChoose() {
    layer.confirm("发布后学生不能选择课题，确认发布课题选择吗？",function () {
        $.ajax({
            url: contextPath + '/projectManage/releaseProjectChoose.do',
            type: 'POST',
            async: false,
            success: function (data) {
                layer.alert(data);
            }
        })
    })
}

//分配学生
function allocateStudent() {
    var checkedTr = $('input[name=y_check]:checked');
    if (checkedTr.length == 0) {
        layer.alert('请选择一条数据！');
    }else if (checkedTr.length > 1) {
        layer.alert('只能选择一条数据！');
    } else {
        //判断该课题是否需要添加学生
        var reqireStudentNum = checkedTr.parents("tr").find(".reqireStudentNum").text();
        var applyStudentNum = checkedTr.parents("tr").find(".applyStudentNum").text();

        if(parseInt(reqireStudentNum) <= parseInt(applyStudentNum)) {
            layer.alert('人数已经符合需要人数，无需分配！');
            return false;
        }
        //获取课题id，指导教师，课题题目，需要人数，确认人数
        var tr = checkedTr.parents("tr");
        var teacherTitleID =  tr.find(".y_id").val();
        var teacherName = tr.find(".teacherName").text();
        var titlename = tr.find(".titlename").text();
        x_admin_show('分配学生','./projectManage-assign.jsp?'+
            'teacherTitleID='+teacherTitleID +
            '&teacherName='+teacherName +
            '&titlename='+titlename +
            '&reqireStudentNum='+reqireStudentNum +
            '&applyStudentNum='+applyStudentNum
        );
    }
}

//确认学生
function confirmChooose() {
    var checkedTr = $('input[name=y_check]:checked');

    if (checkedTr.length == 0) {
        layer.alert('请选择一条数据！');
    }else if (checkedTr.length > 1) {
        layer.alert('只能选择一条数据！');
    } else {
        //判断该课题是否需要添加学生
        var reqireStudentNum = checkedTr.parents("tr").find(".reqireStudentNum").text();
        var applyStudentNum = checkedTr.parents("tr").find(".applyStudentNum").text();



        if(parseInt(reqireStudentNum) > parseInt(applyStudentNum)) {
            layer.alert('选择学生人数没有超过需要人数，等待教研室分配！');
            return false;
        }
        if(parseInt(reqireStudentNum) == parseInt(applyStudentNum)) {
            layer.alert('学生人数已经符合需要人数，无需确认！');
            return false;
        }
        //获取课题id，指导教师，课题题目，需要人数，确认人数
        var tr = checkedTr.parents("tr");
        var teacherTitleID =  tr.find(".y_id").val();
        var teacherName = tr.find(".teacherName").text();
        var titlename = tr.find(".titlename").text();
        x_admin_show('分配学生','./projectManage-confirm.jsp?teacherTitleID='+teacherTitleID);
    }
}

$(function () {
    initYearNum();
    //判断用户类型
    showButtonByAuthority();

    //初始化表格
    findTaskNoticeBaseInfo();
});
//初始化权限
function showButtonByAuthority() {
    var authority = getAuthority();
    if (authority == "1") {
        $("#allocateStudent").show();
    }  else {
        $("#allocateStudent").hide();
    }
}
//初始化表格
function findTaskNoticeBaseInfo(){
    $.ajax({
        url : contextPath+'/projectManage/getProjectInfo.do',
        data : $("#y_form").serialize(),
        type : 'POST',
        dataType : 'json',
        async:true,
        success : showTaskNoticeBaseInfo
    });
}

//查询成功后执行
function showTaskNoticeBaseInfo(pageInfo){
    // console.log(pageInfo) //测试是否有值
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var baseInfoList = pageInfo.list;
    if (baseInfoList[0].applyStudentNum == "0") {
        return false;
    }
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = baseInfoList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr =
          ' <tr>' +
            '<td>' +
            '<input type="checkbox" name="y_check" class="y_check"/>' +
            '<input type="hidden" class="y_id" value="'+ baseInfoList[i].teacherTitleID +'"/>' +
            '</td>' +
            '<td>'+ checkNull(baseInfoList[i].yearNum) +'</td>' +
            '<td>'+ checkNull(baseInfoList[i].semesterNum) +'</td>' +
            '<td class="titlename">'+ checkNull(baseInfoList[i].titlename) +'</td>' +
            '<td class="teacherName">'+ checkNull(baseInfoList[i].teacherName) +'</td>' +
            '<td>'+ checkNull(baseInfoList[i].majorName) +'</td>' +
            '<td class="reqireStudentNum">'+ checkNull(baseInfoList[i].reqireStudentNum) +'</td>' +
            '<td class="applyStudentNum">'+ checkNullRetrueZore(baseInfoList[i].applyStudentNum) +'</td>' +
            '<td class="td-manage">' +
            '    <a title="详细信息" onclick="x_admin_show(\'详细信息\',\'projectManage-view.jsp?teacherTitleID='+ baseInfoList[i].teacherTitleID+ '\')">' +
            '        <i class="layui-icon">&#xe63c;</i>' +
            '    </a>' +
            '</td>' +
            '</tr>';
            
        $("tbody").append(tr);
    }

    //开启分页组件
    noticeInfoListPage(total,pageNum,pageSize);
}

//分页函数
function noticeInfoListPage(total,pageNum,pageSize){
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'y_page', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
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