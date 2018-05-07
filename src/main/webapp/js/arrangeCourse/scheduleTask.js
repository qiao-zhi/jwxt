/**
 * @author: LL
 * @createtime: 2018/5/4 19:13
 * @description:排课任务管理的js
 */

//初始化加载需要使用的layui模块
layui.use(['layer', 'form', 'element'], function(){
    $ = layui.jquery;
    var layer = layui.layer
        ,form = layui.form
        ,element = layui.element;
    //初始化表格
    findArrangeCourseTaskInfo();
    //初始化专业下拉框
    findMajorNameAndId(form);
    //查询按钮事件过滤器
    form.on('submit(search)', function(data){
        //清空当前页和页号
        $("input[name='pageSize']").val('');
        $("input[name='currentPage']").val('');
        //调用查询方法
        findArrangeCourseTaskInfo();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });

});
//查询排课任务基本信息
function findArrangeCourseTaskInfo(){
    $.ajax({
        url : contextPath+'/arrangeCourse/findArrangeCourseTaskList.action',
        data : $("form").serialize(),
        type : 'POST',
        dataType : 'json',
        async:true,
        success : showArrangeCourseTaskInfo
    });
}

function showArrangeCourseTaskInfo(pageInfo){
    //console.log(pageInfo) //测试是否有值
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var arrangeCourseTaskList = pageInfo.list;
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = arrangeCourseTaskList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr ="<tr><td><input type='radio' name='taskRadio' value='"+arrangeCourseTaskList[i].arrangeTaskId+"'/>"
            +"<input type='hidden' name='noticeBookId' value='"+arrangeCourseTaskList[i].noticeBookId+"'>"
            +"<input type='hidden' name='sel_taskStatus' value='"+arrangeCourseTaskList[i].taskStatus+"'></td><td>"
            +index+"</td><td>"
            +arrangeCourseTaskList[i].noticeBookName+"</td><td>"
            +arrangeCourseTaskList[i].majorName+"</td><td>"
            +arrangeCourseTaskList[i].academicYear+"</td><td>"
            +(arrangeCourseTaskList[i].term>1?'第二学期':'第一学期')+"</td><td>"
            +arrangeCourseTaskList[i].taskCreateTime+"</td><td>"
            +arrangeCourseTaskList[i].taskReceiptName+"</td><td>"
            +(arrangeCourseTaskList[i].taskReceiptTime==null?'--':arrangeCourseTaskList[i].taskReceiptTime)+"</td><td>"
            +arrangeCourseTaskList[i].taskStatus+"</td>"
            +"<td class='td-manage'><a title='点击查看任务分配详细信息' onclick=x_admin_show('教学任务分配详细信息','scheduleTask-view.jsp?arrangeTaskId="+arrangeCourseTaskList[i].arrangeTaskId+"') href='javascript:void(0);')><i class='layui-icon'>&#xe63c;</i></a>"
            if(arrangeCourseTaskList[i].taskStatus=='未分配'){
                tr += "<a title='点击修改任务信息'  onclick=x_admin_show('修改任务','scheduleTask-edit.jsp?arrangeTaskId="+arrangeCourseTaskList[i].arrangeTaskId+"') href='javascript:void(0);'><i class='layui-icon'>&#xe642;</i></a>";
            }
            tr +=" <a title='删除' onclick=deleteArrangeTaskInfo('"+arrangeCourseTaskList[i].arrangeTaskId+"') href='javascript:void(0);'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
        $("tbody").append(tr);
    }
    //开启分页组件
    arrangeCourseTaskInfoListPage(total,pageNum,pageSize);
}

//分页函数
function arrangeCourseTaskInfoListPage(total,pageNum,pageSize){
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'taskPage', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                $("[name='currentPage']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    findArrangeCourseTaskInfo();//执行查询分页函数(这个函数必须写在这里)
                }
            }
        });
    });
}


//设置条件选择框中的学年
layui.use('laydate', function () {
    var laydate = layui.laydate;
    laydate.render({
        elem: '#y_year' //指定元素
        ,type: 'year'
    });
})

/*删除*/
function deleteArrangeTaskInfo(id) {
    layer.confirm('确认要删除吗？', function (index) {
        $.ajax({
            url:contextPath+"/arrangeCourse/deleteArrangeCourseTaskInfo.action",
            type:"post",
            dataType:"text",
            data:{"arrangeTaskId":id},
            success:function (response) {
                layer.msg(response, {icon: 1, time: 1000},function (){
                    //刷新父页面
                    window.location.reload();
                })
            }
        })
    });
}

//分配课程按钮
function allotCourse(){
    var checked = $("[name='taskRadio']:checked").length>0?true:false;
    if(!checked){
        layer.alert('请先选择需要分配课程的任务！');
        return;
    }
    var sel_taskStatus = $("[name='taskRadio']:checked ~ input[name='sel_taskStatus']").val();
    if (!(sel_taskStatus == "待发送" || sel_taskStatus == "未分配")) {
        layer.alert('该排课任务已经发送，不能在分配课程！');
        return;
    }
    var arrangeTaskId = $("[name='taskRadio']:checked").val();//获取需要上传资料的课程主键
    x_admin_show('分配课程','./scheduleTask-allot.jsp?arrangeTaskId='+arrangeTaskId);
}

//初始化专业下拉框
function findMajorNameAndId(form){
    $.ajax({
        url:contextPath+"/TrainScheme/getMajorNameAndCode.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response);
            var optionStr = "<option value=''>请输入专业</option>";
            $("select[name='majorId']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].majorId+"'>"+response[i].majorName+"</option>";
                $("select[name='majorId']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}