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


//审核
function audit() {
    var checkedTr = $("td").children(".layui-form-checked");
    if (checkedTr.length == 0) {
        layer.alert('请选择审核学生！');
    } else {
        var resultIDs = "";
        checkedTr.each(function () {
            var auditResult = $(this).parents("tr").find(".auditResult").text();
            if ($.trim(auditResult) == "审核通过") {
                layer.alert('所选择的学生中，包含审核通过的学生！审核通过的学生，不能再次审核。');
                return false;
            } else {
                resultIDs = resultIDs + $(this).parent().find(".y_id").val() + ",";
            }
        });
        if (resultIDs != "") {
            resultIDs = resultIDs.substring(0, resultIDs.Length - 1);
            x_admin_show('提交资料审核', './file-check.jsp?resultIDs=' + resultIDs);
        }
    }
}

$(function () {
    //初始化表格
    findTaskNoticeBaseInfo();
})

function findTaskNoticeBaseInfo(){
    $.ajax({
        url : contextPath+'/gdfilemanage/getFileCheckInfo.do',
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
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = baseInfoList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr =
            '<tr>' +
            '<td>' +
            '<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id=\'2\'>' +
            '<i class="layui-icon">&#xe605;</i></div>' +
            '<input type="hidden" class="y_id" value="'+ baseInfoList[i].StudentTitleresultID + '">' +
            '</td>' +
            '<td>'+ baseInfoList[i].studentName +'</td>' +
            '<td>'+ baseInfoList[i].studentNum +'</td>' +
            '<td>'+ baseInfoList[i].className +'</td>' +
            '<td>'+ baseInfoList[i].gdTitle +'</td>' +
            '<td>'+ baseInfoList[i].teacherName +'</td>' +
            '<td class="auditResult">'+ baseInfoList[i].auditResult +'</td>' +
            '<td>'+ baseInfoList[i].auditContent +'</td>' +
            '<td>'+ baseInfoList[i].auditTime +'</td>' +
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
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='currentPage']").val(obj.curr);//向隐藏域设置当前页的值
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