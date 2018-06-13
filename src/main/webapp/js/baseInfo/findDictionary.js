//初始化职称下拉框
function findTeacherPositionaltitleForSelect(form){
    $.ajax({
        url:contextPath+"/teacherInfo/findTeacherPositionaltitle.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入职称</option>";
            $("select[name='positionaltitle']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].dictionaryid+"'>"+response[i].positionaltitle+"</option>";
                $("select[name='positionaltitle']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}