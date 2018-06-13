/**
 * @author: qlq
 * @time: 9:31
 * @description:    查看培养方案详情的JS
 */
/**
 * 页面加载完成后执行一些函数
 */
$(function () {
    getTrainSchemeInfo();//根据培养方案编号查询培养方案基本信息
    getTrainSchemeCapacityInfos();//根据培养方案编号查询培养方案能力集合信息
    getTrainPictureByTrainSchemeId();//查询培养方案图片信息
    getTrainSchemeCapacityInfos_for13();//根据培养方案编号查询到培养方案能力，并且填充到表头
    getCreditCoursehourAllocateInfo();//查询培养方案第十一项信息
    getBXCourseNatureAllocateInfo();//查询必修课程信息
    getBXXCourseNatureAllocateInfo();//查询选修课程信息
    getSemesterStatics();//查询学期统计信息
});

/*******************S   公共函数***************/
/**
 * 获取layui的form元素
 * @returns {*}
 */
function getLayuiForm() {
    var form;
    layui.use('form',function () {
        form = layui.form;
    })
    return form;
}
/**
 * 一个值如果是null或者''返回-
 * @param value 需要处理的值
 * @param length 需要截取的字符的长度的值,未指定的时候返回全部
 * @returns {*} 处理过的值
 */
function replaceNull(value,length) {
    //判断截取的值是否为空
    if(value == null || value == ""){
        return "-";
    }
    //判断长度是否为空
    if(length == null || length == ''){
        return value;
    }
    return value.toString().substr(0,length);
}

/**
 * 获取培养方案编号的函数
 * @returns {*|jQuery}  培养方案编号
 */
function getTrainSchemeId() {
    return $("#hidden_trainSchemeId").val();
}
/*******************E   公共函数***************/




/****************S   查询培养方案基本信息相关操作***********************************/
/**
 * 根据培养方案编号查询培养方案基本信息
 * 1.ajax异步查询培养方案基本信息
 * 2.向页面中的表单中赋值
 */
function getTrainSchemeInfo(){
    var trainSchemeId = $("#hidden_trainSchemeId").val();//获取培养方案编号
    $.post(contextPath+"/TrainScheme/getTrainSchemeInfoById.do",{"trainSchemeId":trainSchemeId},initTrainScheme,'json')
}

/**
 * 将返回的数据填充到表单中
 * @param response  ajax异步返回的数据
 */
function initTrainScheme(response) {
    if(response == null){
        return;
    }
    //1.填写基本信息
    var tr = "<tr><td>"+replaceNull(response.trainingSchemaName)+"</td><td>"
        +replaceNull(response.majorName)+"</td><td>"
        +replaceNull(response.majorID)+"</td><td>"
        +replaceNull(response.majorType)+"</td><td>"
        +replaceNull(response.majorManager)+"</td><td>"
        +replaceNull(response.revisePerson)+"</td><td>"
        +replaceNull(response.createTime)+"</td></tr>>";
    $("#trainSchemeBaseInfoTbody").append(tr);

    //2.填充下面的信息
     $("[name='trainingtarget']").val(response.trainingtarget);//培养目标
     $("[name='trainingrequire']").val(response.trainingRequire);//培养要求
     $("[name='trainyears']").val(response.trainYears);//修业年限
     $("[name='traindegree']").val(response.trainDegree);//授予学位
     $("[name='maincourse']").val(response.mainCourse);//主干学科
     $("[name='corecourse']").val(response.coreCourse);//核心课程
     $("[name='majorfeature']").val(response.majorfeature);//专业特色
     $("[name='maintestitem']").val(response.mainTestItem);//主要实践性教学环节
     $("[name='mainmajorexperience']").val(response.mainMajorExperience);//主要专业实验
}



/**
 * 根据培养方案编号查询能力信息
 */
function getTrainSchemeCapacityInfos(){
    var trainSchemeId = $("#hidden_trainSchemeId").val();//获取培养方案编号
    $.post(contextPath+"/TrainSchemeCapacity/getCapacitysByTrainId.do",{"trainSchemeId":trainSchemeId},initTrainSchemeCapacity,'json')
}

/**
 * 初始化培养方案能力信息
 * @param response  ajax返回的能力信息
 */
function initTrainSchemeCapacity(response) {
    if(response == null ){
        $("#capacityProptDiv").css("display","");//显示提示语
        $("#capacityDiv").css("display","none");//隐藏表格
        return;
    }
    if(response.length == 0){
        $("#capacityProptDiv").css("display","");//显示提示语
        $("#capacityDiv").css("display","none");//隐藏表格
        return;
    }
    $("#capacityProptDiv").css("display","none");//隐藏提示语
    $("#capacityDiv").css("display","");//显示表格
    $("#graduateCapacityTbody").html("");//先清空表格
    for(var i=0,length_1 = response.length;i<length_1;i++){
        var tr ="<tr><td>"+response[i].capacitysort+"</td><td>"+response[i].capacitydescription+"</td></tr>";
        $("#graduateCapacityTbody").append(tr);
    }
}


/**
 * 查询培养方案图片信息
 */
function getTrainPictureByTrainSchemeId() {
    var trainSchemeId = $("#hidden_trainSchemeId").val();//获取培养方案编号
    $.ajax({
        url:contextPath+"/TrainPicture/getTrainpicturesByTrainSchemeId.do",
        type:'post',
        async:true,
        data:{
            "trainSchemeId":trainSchemeId
        },
        dataType:'json',
        success:function (response) {
            // alert(JSON.stringify(response))
            if(response == null){
                return;
            }
            //如果长度为0，证明没有图片
            if(response.length == 0){
                $("#promptDiv").css("display","");//显示提示语
                $("#imgDiv").css("display","none");//隐藏图片框
            }else {//否则就是存在图片
                $("#promptDiv").css("display","none");//隐藏提示语
                $("#imgDiv").css("display","");//显示图片框
                $("#imgPreview").attr("src","/file/trainPicture/"+response[0].picturenowname);//设置图片路径
            }
        }
    });
}



/****************E   查询培养方案基本信息相关操作***********************************/



/******************S    生成培养方案课程能力相关JS(生成第13项表格)****************/
/**
 * 1.  根据培养方案编号查询到培养方案能力，并且填充到表头
 */
function getTrainSchemeCapacityInfos_for13(){
    var trainSchemeId = getTrainSchemeId();//获取培养方案编号
    $.post(contextPath+"/TrainSchemeCapacity/getCapacitysByTrainId.do",{"trainSchemeId":trainSchemeId},initTrainSchemeCapacity2Table,'json')
}

/**
 * 将ajax查到的能力填充到表格
 * @param response  ajax返回的能力信息
 */
function initTrainSchemeCapacity2Table(response) {
    $("#courseCapacityThead").find("th:gt(2)").remove();//先删掉从能力开始的表头
    for(var i=0,length_1 = response.length;i<length_1;i++){
        $("#courseCapacityThead").append("<th title='"+response[i].capacitydescription+"'>"+"<input type='hidden' value='"+response[i].capacityid+"'>"+response[i].capacitysort+"</th>");
    }
    getAllTrainCoursesTrainSchemeId();//查询表体信息
}

/**
 * 2.根据培养方案编号查到培养方案课程信息，并且填充到表体
 */
function getAllTrainCoursesTrainSchemeId() {
     var trainSchemeId = getTrainSchemeId;
    $.post(contextPath+"/TrainCourse/getAllTrainCoursesTrainSchemeId.do",{"trainSchemeId":trainSchemeId},initCourseCapacityTbody,'json')

/*    $(".trainCourseCheckbox:checked").each(function (index) {//遍历选中的多选框
        var trainCourseId = $(this).val();//培养方案课程ID
        var tr = $(this).parent().parent();
        var courseNum = tr.children("td:eq(2)").text();//课程编号
        var courseName = tr.children("td:eq(3)").text();//课程姓名
        var tr = "<tr><td>"+(index+1)+"<input type='hidden' class='trainCourseId4Delete' value='"+trainCourseId+"'/></td><td>"+courseNum+"</td><td>"+courseName+"</td>";
        //获取表头的数据填充到表体中
        var head_tr = $("#capacity2addDr");
        for(var i=3,length_1 = head_tr.children("th").length;i<length_1;i++){
            var value = head_tr.children("th:eq("+i+")").find("input").val();
            tr += "<td><input type='checkbox' class='traincousrse"+trainCourseId+"' value='"+value+"'/></td>";
        }
        tr += "</tr>";
        $("#courseCapacity2AddTbody").append(tr);
    })*/
}

/**
 * 填充表体
 * @param response
 */
function initCourseCapacityTbody(response) {
    // alert(JSON.stringify(response))
    $("#courseCapacityTbody").html("");//先清空表体
    for(var i = 0,length_1 = response.length;i<length_1;i++){
        var tr="<tr>";
        tr += "<td>"+(i+1)+"</td>";
        tr += "<td>"+response[i].courseNameCN+"</td>";
        //获取表头的数据填充到表体中
        var head_tr = $("#courseCapacityThead");
        for(var j=2,length_2 = head_tr.children("th").length;j<length_2;j++){
            var value = head_tr.children("th:eq("+j+")").find("input").val();//获取到头顶的数据
            tr += "<td><input disabled type='checkbox' class='traincousrse"+response[i].trainCourseID+"' value='"+value+"'/></td>";
        }
        tr += "</tr>";
        $("#courseCapacityTbody").append(tr);
    }
    getTrainCourseCapacity();
}

/**
 * 3.判断哪些复选框应该选上(回显多选框)----查询培养方案课程能力
 */
function getTrainCourseCapacity() {
    //1.拼接集合，访问后台进行查询
    var trainSchemeId = getTrainSchemeId();
    $.post(contextPath+"/TrainCourseCapacity/getTrainCourseCapacityByTrainSchemeId.do",{"trainSchemeId":trainSchemeId},function (response) {
        if(response == null || response.length == 0){
            return;
        }
        for(var i=0;i<response.length;i++){
            var tcourseCapacity = response[i];
            $(".traincousrse"+response[i].traincourseid+"[value='"+response[i].capacityid+"']").prop("checked","checked");
        }
    },'json');
}

/******************E    生成培养方案课程能力相关JS(生成13表格)****************/
/*******************************S  生成培养方案第11项数据**********************/
/**
 * 查询培养方案第十一项信息
 */
function getCreditCoursehourAllocateInfo() {
    var trainSchemeId = getTrainSchemeId();
    $.post(contextPath+"/trainSchemeDetail/getCourseCreditAllocate.do",{"trainSchemeId":trainSchemeId},function (response) {
        // alert(JSON.stringify(response));
        $("#11Tbody").html("");//清空表体
        if(response == null || response.length == 0){
            return;
        }
        for(var i=0,length_1 = response.length;i<length_1;i++){
            var tr = "<tr>";
            tr+="<td>"+response[i].typeName+"</td>";
            tr+="<td>"+response[i].courseNature+"</td>";
            tr+="<td>"+response[i].creditSum+"</td>";
            tr+="<td>"+response[i].creditRatio+"</td>";
            tr+="<td>"+response[i].courseHourSum+"</td>";
            tr+="<td>"+response[i].courseHourRatio+"</td>";
            tr += "</tr>";
            $("#11Tbody").append(tr);
        }
        $("#11Tbody").append("<tr><td colspan='2'>毕业总学分（总学时）</td><td>"+response[0].allCredit+"</td><td>1</td><td>"+response[0].allCoursehour+"</td><td>1</td></tr>");
    },'json')

}
/*******************************E  生成培养方案第11项数据**********************/



/*******************************S  生成培养方案第14项数据**********************/
/**
 * 查询必修课程信息
 */
function getBXCourseNatureAllocateInfo() {
    var trainSchemeId = getTrainSchemeId();
    $.post(contextPath+"//trainSchemeDetail/getCourseNatureAllocateInfoByTrainSchemeId.do",{"courseNature":"必修","trainSchemeId":trainSchemeId},function (response) {
        // alert(JSON.stringify(response));
        $("#BXTbody").html("");//清空表体
        if(response == null || response.length == 0){
            return;
        }
        var allCredit = allCourseHour = typeCredit = typeCourseHour = 0;
        var arr = [0,0,0,0,0,0,0,0];//一个数组用于记录0-8学期的学时和
        for(var i=0,length_1=response.length;i<length_1;i++){
            allCredit += parseInt(response[i].credit);//总的学分
            allCourseHour += parseInt(response[i].courseHour);//总的学时
            //首先生成一个统计信息(对一个类别的统计)
            typeCredit += parseInt(response[i].credit);
            typeCourseHour += parseInt(response[i].courseHour);
            if(i !=0 && response[i].coursePlatform != response[i-1].coursePlatform){
                typeCredit -= parseInt(response[i].credit);
                typeCourseHour -= parseInt(response[i].courseHour);
                $("#BXTbody").append("<tr><td colspan='17'>"+response[i].coursePlatform+"课程平台合计:"+typeCredit+"学分;"+typeCourseHour+"学时</td></tr>");
                typeCredit = typeCourseHour = 0;//置为0重新增加
                typeCredit += parseInt(response[i].credit);
                typeCourseHour += parseInt(response[i].courseHour);
            }
            var tr= "<tr>";
            tr += "<td>"+response[i].coursePlatform+"课程平台"+"</td>";
            tr += "<td>"+response[i].courseNum+"</td>";
            tr += "<td>"+response[i].courseNameCN+"<br/>"+response[i].courseNameEN+"</td>";
            tr += "<td>"+response[i].credit+"</td>";
            tr += "<td>"+response[i].courseHour+"</td>";
            tr += "<td>"+response[i].teachHour+"</td>";
            tr += "<td>"+response[i].experimentHour+"</td>";
            tr += "<td>"+response[i].computerHour+"</td>";
            //根据学期与学时动态设置周学时分配
            for(var j=1;j<9;j++){
                if(j == response[i].semester){
                    tr += "<td>"+response[i].weeklyHour+"</td>";
                    arr[j-1] += parseInt(response[i].weeklyHour);//记录第几学期上多长学时
                    continue;
                }else {
                    tr += "<td></td>";
                }
            }
            tr += "<td>"+response[i].scoringWay+"</td>";
            tr += "</tr>";
            $("#BXTbody").append(tr);
            //最后一行之后也需要加入一列统计信息
            if(i == length_1-1 ){
                $("#BXTbody").append("<tr><td colspan='17'>"+response[i].coursePlatform+"课程平台合计:"+typeCredit+"学分;"+typeCourseHour+"学时</td></tr>");
            }
        }
        //最后添加一行总的统计信息
        var lastTr = "<tr>";
        lastTr += "<td colspan='3'>必修课合计："+allCredit+"学分;"+allCourseHour+"学时"+"</td><td colspan='5'>必修课各学期周学时</td>";
        for ( index in arr){
            lastTr += "<td>"+arr[index]+"</td>";
        }
        lastTr += "<td></td>";
        lastTr+="</tr>";
        $("#BXTbody").append(lastTr);

        //完成之后合并单元格
        mergeCell("BXTable",0,0,0);
    },'json')
}




/**
 * 查询选修课程信息
 */
function getBXXCourseNatureAllocateInfo() {
    var trainSchemeId = getTrainSchemeId();
    $.post(contextPath+"//trainSchemeDetail/getCourseNatureAllocateInfoByTrainSchemeId.do",{"courseNature":"选修","trainSchemeId":trainSchemeId},function (response) {
        // alert(JSON.stringify(response));
        $("#XXTbody").html("");//清空表体
        if(response == null || response.length == 0){
            return;
        }
        var allCredit = allCourseHour = typeCredit = typeCourseHour = 0;
        var arr = [0,0,0,0,0,0,0,0];//一个数组用于记录0-8学期的学时和
        for(var i=0,length_1=response.length;i<length_1;i++){
            allCredit += parseInt(response[i].credit);//总的学分
            allCourseHour += parseInt(response[i].courseHour);//总的学时
            //首先生成一个统计信息(对一个类别的统计)
            typeCredit += parseInt(response[i].credit);
            typeCourseHour += parseInt(response[i].courseHour);
            if(i !=0 && response[i].coursePlatform != response[i-1].coursePlatform){
                typeCredit -= parseInt(response[i].credit);
                typeCourseHour -= parseInt(response[i].courseHour);
                $("#XXTbody").append("<tr><td colspan='17'>"+response[i].coursePlatform+"课程平台合计:"+typeCredit+"学分;"+typeCourseHour+"学时</td></tr>");
                typeCredit = typeCourseHour = 0;//置为0重新增加
                typeCredit += parseInt(response[i].credit);
                typeCourseHour += parseInt(response[i].courseHour);
            }
            var tr= "<tr>";
            tr += "<td>"+response[i].coursePlatform+"课程平台"+"</td>";
            tr += "<td>"+response[i].courseNum+"</td>";
            tr += "<td>"+response[i].courseNameCN+"<br/>"+response[i].courseNameEN+"</td>";
            tr += "<td>"+response[i].credit+"</td>";
            tr += "<td>"+response[i].courseHour+"</td>";
            tr += "<td>"+response[i].teachHour+"</td>";
            tr += "<td>"+response[i].experimentHour+"</td>";
            tr += "<td>"+response[i].computerHour+"</td>";
            //根据学期与学时动态设置周学时分配
            for(var j=1;j<9;j++){
                if(j == response[i].semester){
                    tr += "<td>"+response[i].weeklyHour+"</td>";
                    arr[j-1] += parseInt(response[i].weeklyHour);//记录第几学期上多长学时
                    continue;
                }else {
                    tr += "<td></td>";
                }
            }
            tr += "<td>"+response[i].scoringWay+"</td>";
            tr += "</tr>";
            $("#XXTbody").append(tr);
            //最后一行之后也需要加入一列统计信息
            if(i == length_1-1 ){
                $("#XXTbody").append("<tr><td colspan='17'>"+response[i].coursePlatform+"课程平台合计:"+typeCredit+"学分;"+typeCourseHour+"学时</td></tr>");
            }
        }
        //最后添加一行总的统计信息
        var lastTr = "<tr>";
        lastTr += "<td colspan='3'>选修课合计："+allCredit+"学分;"+allCourseHour+"学时"+"</td><td colspan='5'>选修课各学期周学时</td>";
        for ( index in arr){
            lastTr += "<td>"+arr[index]+"</td>";
        }
        lastTr += "<td></td>";
        lastTr+="</tr>";
        $("#XXTbody").append(lastTr);

        //完成之后合并单元格
        mergeCell("XXTable",0,0,0);
    },'json')
}



/**
 * 合并单元格
 * @param table1    表格的ID
 * @param startRow  起始行
 * @param endRow    结束行
 * @param col   合并的列号，对第几列进行合并(从0开始)。如果传下来为0就是从第一列开头到结束合并
 */
function mergeCell(table1, startRow, endRow, col) {
    var tb = document.getElementById(table1);
    if (col >= tb.rows[0].cells.length) {
        return;
    }
    if (col == 0) { endRow = tb.rows.length-1; }
    for (var i = startRow; i < endRow; i++) {
        if (tb.rows[startRow].cells[col].innerHTML == tb.rows[i + 1].cells[0].innerHTML) {
            tb.rows[i + 1].removeChild(tb.rows[i + 1].cells[0]);
            tb.rows[startRow].cells[col].rowSpan = (tb.rows[startRow].cells[col].rowSpan | 0) + 1;
            if (i == endRow - 1 && startRow != endRow) {
                mergeCell(table1, startRow, endRow, col + 1);
            }
        } else {
            mergeCell(table1, startRow, i + 0, col + 1);
            startRow = i + 1;
        }
    }
}
/*******************************E  生成培养方案第14项数据**********************/


/***********************S   生成第十五项表格***********/
/**
 * 获取学期统计信息
 */
function getSemesterStatics() {
    var trainSchemeId = getTrainSchemeId();
    $.post(contextPath+"/trainSchemeDetail/getSemesterStaticsInfo.do",{"trainSchemeId":trainSchemeId},function (response) {
        // alert(JSON.stringify(response))
        $("[calss^='semester']").html("");//清空1到8学期的表格
        if(response == null || response.length == 0){
            return;
        }
        var semesterCredit = 0;
        //遍历返回的集合
        for(index in response){
            var semester =response[index].semester;//获取学期
            var semester_str = replaceSmester(semester);//字符串学期
            //判断生成统计信息(每个学期表格最后一行)
            semesterCredit += parseInt(response[index].credit);
            if(index != 0 && response[index].semester != response[index-1].semester){
                semesterCredit -= parseInt(response[index].credit);
                $(".semester"+response[index-1].semester+"th").append("<tr><td colspan='11'>"+replaceSmester(response[index-1].semester)+"合计信息:"+semesterCredit+"学分</td></td></tr>");//往对应的学期添加数据
                semesterCredit = 0;
                semesterCredit += parseInt(response[index].credit);
            }

            var tr = "<tr>";
            tr += "<td>"+semester_str+"</td>";
            tr += "<td>"+response[index].courseNum+"</td>";
            tr += "<td>"+response[index].courseNameCN+"</td>";
            tr += "<td>"+response[index].credit+"</td>";
            tr += "<td>"+response[index].courseHour+"</td>";
            tr += "<td>"+response[index].teachHour+"</td>";
            tr += "<td>"+response[index].experimentHour+"</td>";
            tr += "<td>"+response[index].computerHour+"</td>";
            tr += "<td>"+response[index].practiceHour+"</td>";
            tr += "<td>"+response[index].weeklyHour+"</td>";
            tr += "<td>"+response[index].scoringWay+"</td>";
            tr += "</tr>";
            $(".semester"+semester+"th").append(tr);//往对应的学期添加数据

            //最后一个表格添加统计信息
            if(index == response.length-1){
                $(".semester"+semester+"th").append("<tr><td colspan='11'>"+semester_str+"合计信息:"+semesterCredit+"学分</td></td></tr>");//往对应的学期添加数据
            }

        }
        //遍历表格，合并单元格
        $("[id^='semestertable']").each(function (index) {
            mergeCell("semestertable"+(parseInt(index)+1),0,0,0);
        })

    },'json')
}

/**
 * 替换学期(例如 1  返回 第一学期)
 * @param semester
 * @returns {*}
 */
function replaceSmester(semester) {
    var semester_str="";
    switch(semester){
        case 1:
            semester_str = "第一学期";
            break;
        case 2:
            semester_str = "第二学期";
            break;
        case 3:
            semester_str = "第三学期";
            break;
        case 4:
            semester_str = "第四学期";
            break;
        case 5:
            semester_str = "第五学期";
            break;
        case 6:
            semester_str = "第六学期";
            break;
        case 7:
            semester_str = "第七学期";
            break;
        case 8:
            semester_str = "第八学期";
            break;
    }
    return semester_str;
}
/***********************E   生成第十五项表格***********/





