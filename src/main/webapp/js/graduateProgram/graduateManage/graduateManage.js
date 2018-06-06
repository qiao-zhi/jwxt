function y_formSearch() {
    //清空当前页和页号
    $("input[name='pageSize']").val('');
    $("input[name='currentPage']").val('');
    //调用查询方法
    findTaskNoticeBaseInfo();
}

//修改毕设信息
function modifyGraduate(obj) {
    var tr = $(obj).parents("tr");
    var gradesignid = tr.find(".y_id").val();
    var yearnum = tr.children("td").eq(0).text();
    var semesternum = tr.children("td").eq(1).text();
    var graduatedesignname = tr.children("td").eq(2).text();
    var majorname = tr.children("td").eq(3).text();
    var graduatedesc = tr.children("td").eq(4).text();

    var url = './graduateManage-modify.jsp?' +
        'gradesignid=' + gradesignid + '&yearnum=' + yearnum +
        '&semesternum=' + semesternum + '&graduatedesignname=' + graduatedesignname +
        '&majorname=' + majorname + '&graduatedesc=' + graduatedesc;
    var searchUrl =encodeURI(url);//编码
    x_admin_show('修改毕设基本信息',searchUrl);
}

$(function () {
    //初始化查询学年
    initYearNum();
    //初始化专业
    initMajor();
    findTaskNoticeBaseInfo();//初始化表格

    addGraduate();
});

function findTaskNoticeBaseInfo(){
    $.ajax({
        url : contextPath+'/graduateManage/getGraduateInfoByCondition.do',
        data : $("#y_form").serialize(),
        type : 'POST',
        //dataType : json,
        async:true,
        success : showTaskNoticeBaseInfo
    });
}

//查询成功后执行
function showTaskNoticeBaseInfo(pageInfoStr){
    var pageInfo = ajaxGetStringToJson(pageInfoStr);

    // console.log(pageInfo) //测试是否有值
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var baseInfoList = pageInfo.list;
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = baseInfoList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr =
            '<tr><input type="hidden" class="y_id" value="'+ baseInfoList[i].graDesignID + '"/>' +
            '<td>'+ baseInfoList[i].yearNum +'</td>' +
            '<td>'+ baseInfoList[i].semesterNum +'</td>' +
            '<td>'+ baseInfoList[i].graduateDesignName +'</td>' +
            '<td>'+ baseInfoList[i].majorName +'</td>' +
            '<td>'+ baseInfoList[i].graduateDesc +'</td>' +
            '<td class="td-manage">'+
                '<a title="修改毕设基本信息"  onclick="modifyGraduate(this)" href="javascript:;">'+
                '<i class="layui-icon">&#xe642;</i></a>&nbsp;&nbsp;'+
                '<a title="删除" onclick="member_del(this)" href="javascript:;">'+
                '<i class="layui-icon">&#xe640;</i></a>'+
            '</td>'+
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

/*删除*/
function member_del(obj) {
    layer.confirm('确认要删除吗？', function (index) {

        var id = $(obj).parents("tr").find(".y_id").val();

        //删除前，判断该毕设下边有没有课题。若有，不能删除。
        $.ajax({
            url:contextPath + "/graduateManage/removeGraduateInfo.do",
            type:"post",
            dataType:"text",
            data:{"graDesignID":id},
            success:function (response) {
                layer.msg(response, {icon: 1, time: 1000},function (){
                    window.location.reload();
                })
            }
        })

    });
}

//添加按钮控制
function addGraduate() {
    //同一个专业本学期只能添加一条
    //查询数据库
    $.ajax({
        url : contextPath+'/graduateManage/getMajorGraduateNum.do',
        type : 'POST',
        async:true,
        success : function (data) {
            if (parseInt(data) == 1) {
                $("#addProjectBtn").attr("disabled","true");
            } else {
                $('#addProjectBtn').removeAttr("disabled");
            }
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