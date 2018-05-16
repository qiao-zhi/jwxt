/**
 * @author: LL
 * @createtime: 2018/5/16 21:41
 * @description:手动排课的js
 */
layui.use([],function(){
    //第一次执行
    findTaskArrangeCourseAndTeacherInfo();
});
//查询任务课程信息
function findTaskArrangeCourseAndTeacherInfo(currentPage,pageSize){
    $.ajax({
        url : contextPath+'/arrangeCourse/findTaskArrangeCourseAndTeacherList.action',
        data : {"arrangeTaskId":arrangeTaskId_all,"currentPage":currentPage,"pageSize":pageSize},
        type : 'POST',
        dataType : 'json',
        success : showTaskArrangeCourseAndTeacherInfo
    });
}
function showTaskArrangeCourseAndTeacherInfo(pageInfo){
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var taskArrangeCourseList = pageInfo.list;
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = taskArrangeCourseList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr ="<tr><td><input type='radio' name='courseRadio' value='"+taskArrangeCourseList[i].arrangeCourseId+"'/>"
            +"<input type='hidden' name='sel_teacherNames' value='"+taskArrangeCourseList[i].teacherNames+"'/></td><td>"
            +index+"</td><td>"
            +taskArrangeCourseList[i].courseCode+"</td><td>"
            +taskArrangeCourseList[i].courseName+"</td><td>"
            +replaceStatus(taskArrangeCourseList[i].campusCode)+"</td><td>"
            +taskArrangeCourseList[i].majorName+"</td><td>"
            +taskArrangeCourseList[i].className+"</td><td>"
            +taskArrangeCourseList[i].majorStudentsNumber+"</td><td>"
            +taskArrangeCourseList[i].totalPeriod+"</td>"
        if(taskArrangeCourseList[i].teacherNames==null){
            tr +="<td>--</td><td>--</td></tr>" ;
        }else{
            tr += "<td>"+taskArrangeCourseList[i].teacherNames+"</td>"
                +"<td class='td-manage'><a title='点击查看排课详细信息' onclick=x_admin_show('详细信息','scheduleArrange-view.jsp?arrangeCourseId="+taskArrangeCourseList[i].arrangeCourseId+"') href='javascript:void(0);')><i class='layui-icon'>&#xe63c;</i></a>"
                +"<a title='修改'  onclick=x_admin_show('修改','scheduleArrange-edit.jsp?arrangeCourseId="+taskArrangeCourseList[i].arrangeCourseId+"') href='javascript:void(0);'><i class='layui-icon'>&#xe642;</i></a></td></tr>";
        }
        $("tbody").append(tr);
    }
    //开启分页组件
    teacherCourseInfoPage(total,pageNum,pageSize);
}
//分页函数
function teacherCourseInfoPage(total,pageNum,pageSize){
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'coursePage', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                if(!first){//首次不执行(点击的时候才执行)
                    findTaskArrangeCourseAndTeacherInfo(obj.curr,obj.limit);//执行查询分页函数(这个函数必须写在这里)
                }
            }
        });
    });
}
//排课
function arrangeCourse(){
    var checked = $("[name='courseRadio']:checked").length>0?true:false;
    if(!checked){
        layer.alert('请先选择需要排课的课程！');
        return;
    }
    var teacherNames = $("[name='courseRadio']:checked + input[name='sel_teacherNames']").val();
    if(teacherNames!="null"){
        layer.alert('该课程已经安排了教师，可以查看详情和修改！');
        return;
    }
    var arrangeCourseId = $("[name='courseRadio']:checked").val();//获取单选框的值
    x_admin_show_big('新增排课','./scheduleArranage-add.jsp?arrangeCourseId='+arrangeCourseId)
}