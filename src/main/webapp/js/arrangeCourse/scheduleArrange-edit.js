/**
 * @author: LL
 * @createtime: 2018/5/16 9:13
 * @description:安排课程修改的js
 */
//layui
layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form;
    //查询任务课程信息
    getTaskArrangeCourseAndTeacherClassInfo(form);
    //初始化在职教师下拉框
    findTeacherBaseInfoForSelect(form);
    //监听教师下拉框事件
    form.on('select(selectTeacher)', function (data) {
        var teacherNumber = data.value;
        var teacherName = data.elem[data.elem.selectedIndex].text;
        form.render('select');
        if(""!=teacherNumber){
            $("#teacherName").val(teacherName);
            $("#teacherNumber").val(teacherNumber);
        }
    });
    //监听提交
    form.on('submit(addTeacher)', function (data) {
        //添加一条教师班级信息
        addTeacherAndClassInfo(form);
        //阻止表单跳转
        return false;
    });
    //监听提交
    form.on('submit(updateArrange)', function (data) {
        //判断班级是否全部分配
        if(!hasArrangedClass()){
            layer.alert("班级尚未全部分配，不能提交！");
        }else{
            getAllTeacherAndClassInfo();
            saveTaskArrangeCourseInfo();
        }
        //阻止表单跳转
        return false;
    });
});

//查询任务课程信息
function getTaskArrangeCourseAndTeacherClassInfo(form){
    $.ajax({
        url : contextPath+'/arrangeCourse/getTaskArrangeCourseAndTeacherClassInfo.action',
        data : {"arrangeCourseId":arrangeCourseId_all},
        type : 'POST',
        dataType : 'json',
        success : function(response){
            showTaskArrangeCourseAndTeacherInfo(response,form);
        }
    });
}
function showTaskArrangeCourseAndTeacherInfo(response,form){
    var courseAndTeacherInfo = response;
    var teacherClassInfoList = response.teachers;
    $("#v_courseName").text(courseAndTeacherInfo.courseName);
    $("#v_courseCode").text(courseAndTeacherInfo.courseCode);
    $("#v_academicYear").text(teacherClassInfoList[0].academicYear);
    $("#v_term").text(teacherClassInfoList[0].term);
    $("#v_campus").text(replaceStatus(courseAndTeacherInfo.campusCode));
    $("#v_totalPeriod").text(courseAndTeacherInfo.totalPeriod);
    $("#v_majorName").text(courseAndTeacherInfo.majorName);
    $("#v_majorStudentsNumber").text(courseAndTeacherInfo.majorStudentsNumber);

    $("#addTeacherAndClass").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = teacherClassInfoList.length; i<length_l; i++){
        var tr ="<tr><td>"
            +teacherClassInfoList[i].teacherName+"</td><td>"
            +teacherClassInfoList[i].teacherNumber+"</td><td>"
            +teacherClassInfoList[i].classNames+"</td><td>"
            +"<a title='删除' onclick='delTeacherClass(this)'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
        $("#addTeacherAndClass").append(tr);
    }
    var classNames = courseAndTeacherInfo.className;
    var classNameArr = classNames.split(",");
    $("#classNames").empty();//清空复选框数据
    for(var i=0,length_l = classNameArr.length; i<length_l; i++){
        var inputCheck = "<input type='checkbox' name='className' disabled value='"+classNameArr[i]+"' lay-skin='primary' title='"+classNameArr[i]+"'>";
        $("#classNames").append(inputCheck);
    }
    form.render('checkbox');
    //初始化历史教师下拉框
    findHistoryTeacherInfoForSelect(courseAndTeacherInfo.courseCode,form);
}

/*删除*/
function delTeacherClass(obj) {
    layer.confirm('确认要删除吗？', function (index) {
        var classNames = $(obj).parents("tr").children("td").eq(2).text();
        var classNameArr = classNames.split(",");
        var $checkBox = $("input[name='className']");
        $checkBox.each(function () {
            var className = $(this).val();
            for(var i=0, length_l = classNameArr.length; i<length_l; i++){
                if(className==classNameArr[i]){
                    $(this).prop("disabled",false);
                    break;
                }
            }
        })
        layui.use(['form', 'layer'], function () {
            var form = layui.form;
            form.render('checkbox');
        })
        //删除行
        $(obj).parents("tr").remove();
        layer.msg('已删除!', {icon: 1, time: 1000});
    });
}

//添加一条教师班级信息
function addTeacherAndClassInfo(form){
    var teacherName = $("#teacherName").val();
    var teacherNumber = $("#teacherNumber").val();
    //判断教师是否已经分配
    var hasArrange = checkTeacherInfo(teacherNumber);
    if(hasArrange){
        layer.alert("该教师已经分配班级，请重新选择教师！");
        return;
    }
    //判断是否已经选择班级
    if(!hasCheckClass()){
        layer.alert("请选择班级！")
        return;
    }
    //获取复选框的值
    var checkBoxValue = getCheckBoxValue(form);
    var tr ="<tr><td>"
        +teacherName+"</td><td>"
        +teacherNumber+"</td><td>"
        +checkBoxValue+"</td><td>"
        +"<a title='删除' onclick='delTeacherClass(this)'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
    $("#addTeacherAndClass").append(tr);
    //清空教师信息
    clearTeacherInfo();
}
//清空教师信息
function clearTeacherInfo(){
    $("#teacherName").val("");
    $("#teacherNumber").val("");
}
//判断教师是否存在
function checkTeacherInfo(teacherNumber){
    var hasArrange = false;
    var $trs = $("#addTeacherAndClass").children("tr");
    $trs.each(function(){
        var number = $(this).children("td").eq(1).text();
        if(teacherNumber == number){
            hasArrange = true;
            return false;
        }
    })
    return hasArrange;
}
//判断是否有选中的班级
function hasCheckClass(){
    return $("input[name='className']:checked").length>0;
}
//判断班级是否全部分配
function hasArrangedClass(){
    return $("input[name='className']:disabled").length==$("input[name='className']").length;
}
//获取复选框选中的值
function getCheckBoxValue(form){
    var test = $("input[name='className']:checked");
    var checkBoxValue = "";
    test.each(function(){
        checkBoxValue += $(this).val()+",";
        $(this).prop("checked", false);
        $(this).prop("disabled",true);
        form.render('checkbox');
    })
    //将最后一个逗号删除掉
    checkBoxValue = checkBoxValue.substring(0,checkBoxValue.length-1);
    return checkBoxValue;
}
//获取排课教师课程信息设置到提交表单中
function getAllTeacherAndClassInfo(){
    var courseCode = $("#v_courseCode").text();
    var academicYear = $("#v_academicYear").text();
    var term = $("#v_term").text();
    var $trs = $("#addTeacherAndClass").children("tr");
    $trs.each(function(i){
        var $tds = $(this).children("td");
        var teacherAndClassInfo = "<input name='teacherCourseCustoms["+i+"].courseCode' type='hidden' value='" +courseCode+ "'/>"
            + "<input name='teacherCourseCustoms["+i+"].academicYear' type='hidden' value='" + academicYear + "'/>"
            + "<input name='teacherCourseCustoms["+i+"].term' type='hidden' value='" + term + "'/>"
            + "<input name='teacherCourseCustoms["+i+"].teacherName' type='hidden' value='" + $tds.eq(0).html() + "'/>"
            + "<input name='teacherCourseCustoms["+i+"].teacherNumber' type='hidden' value='" + $tds.eq(1).html() + "'/>";
        //获取班级名称
        var classNames = $tds.eq(2).html();
        var classNameArr = classNames.split(",");
        for(var j=0,length_l = classNameArr.length; j<length_l; j++){
            teacherAndClassInfo += "<input name='teacherCourseCustoms["+i+"].classTeachers["+j+"].className' type='hidden' value='" + classNameArr[j] + "'/>";
        }
        $("#saveTeacherCourseClassForm").append(teacherAndClassInfo);
    })
}

//将排课教师课程信息提交到后台
function saveTaskArrangeCourseInfo(){
    $.ajax({
        url:contextPath+"/arrangeCourse/saveTeacherCourseCustomInfoList.action",
        data:$("#saveTeacherCourseClassForm").serialize(),
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
