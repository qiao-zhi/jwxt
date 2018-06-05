/**
 * @author: LL
 * @createtime: 2018/5/16 21:46
 * @description:根据历史记录排课的js
 */
layui.use(['layer', 'form', 'element'], function(){
    $ = layui.jquery;
    var layer = layui.layer
        ,form = layui.form
        ,element = layui.element;
    //第一次执行
    findCourseAndHistoryTeacherInfo(form);
    // 全选和全不选操作
    $("#el_checkQuanxuan").change(function() {
        if ($(this).prop("checked") == true) {
            $(".el_checks").prop("checked", true);
        } else {
            $(".el_checks").prop("checked", false);
        }
    })
});
//查询任务课程信息
function findCourseAndHistoryTeacherInfo(form){
    $.ajax({
        url : contextPath+'/arrangeCourse/findHistroyTeacherCourse.action',
        data : {"arrangeTaskId":arrangeTaskId_all,"academicYear":academicYear_all,"term":term_all},
        type : 'POST',
        dataType : 'json',
        success : showCourseAndHistoryTeacherInfo
    });
}
function showCourseAndHistoryTeacherInfo(response){
    var taskArrangeCourseList = response;
    $("tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = taskArrangeCourseList.length;i<length_l;i++){
        var index = i + 1;
        var tr ="<tr><td><input type='checkbox' class='el_checks' name='courseCheckbox' value='"+taskArrangeCourseList[i].arrangeCourseId+"'/>"
            +"<input type='hidden' name='sel_teacherNames' value='"+taskArrangeCourseList[i].teacherNames+"'/></td><td>"
            +index+"</td><td>"
            +taskArrangeCourseList[i].courseCode+"</td><td>"
            +taskArrangeCourseList[i].courseName+"</td><td>"
            +replaceStatus(taskArrangeCourseList[i].campusCode)+"</td><td>"
            +taskArrangeCourseList[i].majorName+"</td><td>"
            +taskArrangeCourseList[i].className+"</td><td>"
            +taskArrangeCourseList[i].majorStudentsNumber+"</td><td>"
            +taskArrangeCourseList[i].totalPeriod+"</td><td>"
            +taskArrangeCourseList[i].teacherNumber+"</td><td>"
            +taskArrangeCourseList[i].teacherName+"</td></tr>";
        $("tbody").append(tr);
    }
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
        layer.confirm("您确定使用选中的历史排课记录至当前的排课任务中？",function(){
            getAllCheckedCourse();
            saveTaskArrangeCourseInfo();
        });
    }
    else{
        layer.alert('请先选择需要使用的历史排课记录');
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
        arrangeCourse = "<input name='taskArrangeCourseCustoms["+i+"].arrangeCourseId' type='hidden' value='" + $(this).val()+ "'/>"
            + "<input name='taskArrangeCourseCustoms["+i+"].teachers[0].term' type='hidden' value='" + term_all + "'/>"
            + "<input name='taskArrangeCourseCustoms["+i+"].teachers[0].academicYear' type='hidden' value='" + academicYear_all + "'/>"
            + "<input name='taskArrangeCourseCustoms["+i+"].teachers[0].courseCode' type='hidden' value='" + $tds.eq(2).html() + "'/>"
            + "<input name='taskArrangeCourseCustoms["+i+"].teachers[0].teacherNumber' type='hidden' value='" + $tds.eq(9).html() + "'/>"
            + "<input name='taskArrangeCourseCustoms["+i+"].teachers[0].teacherName' type='hidden' value='" + $tds.eq(10).html() + "'/>";

        //获取班级名称
        var classNames = $tds.eq(6).html();
        var classNameArr = classNames.split(",");
        for(var j=0,length_l = classNameArr.length; j<length_l; j++){
            arrangeCourse += "<input name='taskArrangeCourseCustoms["+i+"].teachers[0].classTeachers["+j+"].className' type='hidden' value='" + classNameArr[j] + "'/>";
        }
        $("#saveArrangeCourseForm").append(arrangeCourse);
    })
}

//将需要分配的课程信息提交到后台
function saveTaskArrangeCourseInfo(){
    $.ajax({
        url:contextPath+"/arrangeCourse/saveTeacherCourseInfoListFromHistory.action",
        data:$("#saveArrangeCourseForm").serialize(),
        type:"POST",
        async:false,
        dataType:"text",
        success:function(response){
            layer.alert(response, function(index){
                //实现父页面的刷新
                window.parent.location.reload();
            });
        }
    })
}