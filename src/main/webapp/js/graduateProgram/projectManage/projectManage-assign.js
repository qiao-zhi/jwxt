$(function () {
    //初始化课题信息
    initTitleInfo();
});

var teacherTitleID = "";

//初始化课题基本信息
function initTitleInfo() {
    teacherTitleID = getUrlParam("teacherTitleID");
    var teacherName = getUrlParam("teacherName");
    var titlename = getUrlParam("titlename");
    var reqireStudentNum = getUrlParam("reqireStudentNum");
    var applyStudentNum = getUrlParam("applyStudentNum");

    //初始化课题信息
    var tr =
        '<tr><td>' +
        teacherName + '</td><td>' +
        titlename + '</td><td>' +
        reqireStudentNum + '</td><td>' +
        applyStudentNum + '</td>' +
        '<td class="y_student"></td></tr>';
    $("#titleTable").append(tr);

    //初始化学生信息
    $.ajax({
        url : contextPath+'/projectManage/getStudentInfo.do',
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
    $("#studentTable").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = baseInfoList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr =
            '<td>' +
            '    <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id=\'2\'><i class="layui-icon">' +
            '        &#xe605;</i></div>' +
            '<input type="hidden" class="studentID" value="' + baseInfoList[i].studentID + '"/>' +
            '</td>' +
            '<td>' + baseInfoList[i].studentName + '</td>' +
            '<td>' + baseInfoList[i].studentSex + '</td>' +
            '<td>' + baseInfoList[i].className + '</td>' +
            '<td>' + baseInfoList[i].teacherName1 + '|' +  baseInfoList[i].titlename1 + '</td>' +  /*通过，firstTeacherTitleId 查询课题名称和教师*/
            '<td>' + baseInfoList[i].teacherName2 + '|' +  baseInfoList[i].titlename2 + '</td>' +  /*通过，secondTeacherTitleId 查询课题名称和教师*/

        $("#studentTable").append(tr);
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

//获取选择的学生
$(".layui-form-checkbox").on("click",function () {
    var index = $(this).parents("tr").index();
    if($(this).hasClass("layui-form-checked")) { //true为已经选中
        layer.confirm('确认取消选择？', {
            btn: ['确认','取消'] //按钮
        }, function(){ //删除左侧表格中对应内容
            $(".y_addStudent"+index).remove();
            layer.msg('取消成功', {icon: 1});
        })
    } else { //添加到左侧表格中
        //？？？没有添加学生人数上限判断，因为怕有不够的学生
        var studentName = $(this).parent().next().text();
        var studentID = $(this).parent().find(".studentID").val();
        $(".y_student").append("<span value='" + studentID + "' class='y_addStudent y_addStudent"+index+"'>"+studentName+" </span>")
    }
});

//提交
function y_submit() {

    layer.confirm("提交之后将不能更改,确认提交?",function (index) {
        var studentIDs = "";
        $(".y_addStudent").each(function () {
            studentIDs = studentIDs + $(this).attr("value") + ",";
        });
        studentIDs = studentIDs.substring(0,studentIDs.length-1);

        $.ajax({
            url : contextPath+'/projectManage/saveAllocate.do',
            data : {"teacherTitleID":teacherTitleID, "studentIDs":studentIDs},
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