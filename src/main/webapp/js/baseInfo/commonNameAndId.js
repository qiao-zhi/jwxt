//初始化专业下拉框
function findMajorNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/majorInfo/findMajorNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入专业</option>";
            $("select[name='majorid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].majorid+"'>"+response[i].majorname+"</option>";
                $("select[name='majorid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//初始化班级下拉框
function findClassNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/classInfo/findClassNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入班级</option>";
            $("select[name='classid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].classid+"'>"+response[i].classname+"</option>";
                $("select[name='classid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//初始化学生下拉框
function findStudentNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/studentInfo/findStudentNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入学生</option>";
            $("select[name='studentid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].studentid+"'>"+response[i].studentname+"</option>";
                $("select[name='studentid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//初始化班级下拉框
function findTeacherNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/teacherInfo/findTeacherNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入老师</option>";
            $("select[name='teacherid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].teacherid+"'>"+response[i].teachername+"</option>";
                $("select[name='teacherid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//初始化学院下拉框
function findCollegeNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/collegeInfo/findCollegeNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入学院</option>";
            $("select[name='collegeid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].collegeid+"'>"+response[i].collegename+"</option>";
                $("select[name='collegeid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}