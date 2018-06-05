/**
 * @author: LL
 * @createtime: 2018/5/16 20:59
 * @description: 分配课程的js
 */
layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form
        , layer = layui.layer;
    //查询未分配的课程信息
    findUnDistributeCourse();

    // 全选和全不选操作
    $("#el_checkQuanxuan").change(function() {
        if ($(this).prop("checked") == true) {
            $(".el_checks").prop("checked", true);
        } else {
            $(".el_checks").prop("checked", false);
            //form.render("checkbox");
        }
    })
    //查询按钮事件过滤器
    form.on('submit(search)', function(data){
        //调用查询方法
        findUnDistributeCourse();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });
})
//查询未分配的课程信息
function findUnDistributeCourse(){
    $.ajax({
        url:contextPath+"/arrangeCourse/findUnArrangeCourseInfo.action",
        type:"post",
        dataType:"json",
        data:$("#searchCourseForm").serialize(),
        success:showUnDistributeCourse
    })
}
function showUnDistributeCourse(response){
    var unDistributeCourseList = response;
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = unDistributeCourseList.length;i<length_l;i++){
        var index = i + 1;
        var tr ="<tr><td><input type='checkbox' class='el_checks' name='courseCheckbox' value='"+unDistributeCourseList[i].courseName+"' >"
            +"<input type='hidden' name='sel_majorName' value='"+unDistributeCourseList[i].majorName+"'>"+"</td><td>"
            +index+"</td><td>"
            +unDistributeCourseList[i].courseCode+"</td><td>"
            +unDistributeCourseList[i].courseName+"</td><td>"
            +replaceStatus(unDistributeCourseList[i].campusCode)+"</td><td>"
            +unDistributeCourseList[i].majorName+"</td><td>"
            +unDistributeCourseList[i].classNames+"</td><td>"
            +unDistributeCourseList[i].majorStudentsNumber+"</td><td>"
            +unDistributeCourseList[i].totalPeriod+"</td></tr>";
        $("tbody").append(tr);
    }
    //检查是否有选中的值,回显设置
    checkInHasChecked();
}
//查询当前排课任务已经分配的课程
function findNowDistributeCourseInfo(){
    var nowDistributeCourse;
    $.ajax({
        url:contextPath+"/arrangeCourse/findTaskArrangeCourseInfoList.action",
        type:"post",
        dataType:"json",
        async:false,
        data:{"arrangeTaskId":arrangeTaskId_all},
        success:function(response){
            nowDistributeCourse = response;
        }
    })
    return nowDistributeCourse;
}

//检查是否有选中的值,回显设置
function checkInHasChecked(){
    var $el_checks = $(".el_checks");
    $el_checks.each(function(i){
        var courseName = $(this).val();
        var majorName = $(this).next("input[name='sel_majorName']").val();
        var nowDistributeCourse = findNowDistributeCourseInfo();
        for(var j=0,length_l = nowDistributeCourse.length; j<length_l; j++){
            var bool = (courseName == nowDistributeCourse[j].courseName) &&(majorName == nowDistributeCourse[j].majorName)
            if(bool){
                $(this).prop("checked",true);
                break;
            }
        }
    })
}

//判断是否有选中的值
function checkHasSelect(){
    if($("input[name='courseCheckbox']:checked").length>0){
        return true;
    }else{
        return false;
    }
}
//分配课程
function arrangeCourse(){
    var status = checkHasSelect();//调用判断方法
    if (status) {
        layer.confirm("您确认要为当前的教学任务分配选中的课程吗？",function(){
            getAllCheckedCourse();
            saveTaskArrangeCourseInfo();
        });
    }
    else{
        layer.alert('请先选择需要分配的课程');
    }
}

//获取选中的复选框并将值设置到隐藏的form表单中
function getAllCheckedCourse(){
    var $courseList = $("[name='courseCheckbox']:checked");
    var $tds;
    var arrangeCourse = '';
    //遍历选中的集合
    $courseList.each(function(i){
        //console.log($(this).val())
        //获取选中的行的所有td
        $tds = $(this).parents("tr").children("td");
        arrangeCourse = "<input name='taskArrangeCourses["+ i + "].courseName' type='hidden' value='" + $tds.eq(3).html()+ "'/>"
            + "<input name='taskArrangeCourses[" + i+ "].courseCode' type='hidden' value='" + $tds.eq(2).html() + "'/>"
            + "<input name='taskArrangeCourses[" + i+ "].majorName' type='hidden' value='" + $tds.eq(5).html() + "'/>"
            + "<input name='taskArrangeCourses[" + i+ "].className' type='hidden' value='" + $tds.eq(6).html() + "'/>"
            + "<input name='taskArrangeCourses[" + i+ "].majorStudentsNumber' type='hidden' value='" + $tds.eq(7).html() + "'/>"
            + "<input name='taskArrangeCourses[" + i+ "].totalPeriod' type='hidden' value='" + $tds.eq(8).html() + "'/>"
            + "<input name='taskArrangeCourses[" + i+ "].campusCode' type='hidden' value='" + changeStatus($tds.eq(4).html()) + "'/>";
        $("#saveArrangeCourseForm").append(arrangeCourse);
    })
}

//将需要分配的课程信息提交到后台
function saveTaskArrangeCourseInfo(){
    $.ajax({
        url:contextPath+"/arrangeCourse/updateTaskArrangeCourseInfoList.action",
        data:$("#saveArrangeCourseForm").serialize(),
        type:"POST",
        async:false,
        dataType:"text",
        success:function(response){
            layer.alert(response, function(index){
                //实现父页面的刷新
                window.parent.location.reload();
                //x_admin_close()
            });
        }
    })
}
/**
 * 清空查询条件的按钮
 */
function clearQueryCondition(){
    //1.清空条件
    $("input[name='courseName']").val('');
    $("input[name='majorName']").val('');
    $("select[name='campusCode'] option:selected").prop("selected",false);
    layui.use(['form'], function () {
        var form = layui.form;
        form.render("select")
    })
    //2.重新查询一次
    findUnDistributeCourse();
}
