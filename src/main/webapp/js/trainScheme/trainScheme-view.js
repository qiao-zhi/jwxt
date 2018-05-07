/**
 * @author: qlq
 * @time: 9:31
 * @description:    查看培养方案详情的JS
 */

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
 * 页面加载完成后执行一些函数
 */
$(function () {
    getTrainSchemeInfo();//根据培养方案编号查询培养方案基本信息
    getTrainSchemeCapacityInfos();//根据培养方案编号查询培养方案能力集合信息
    getTrainPictureByTrainSchemeId();//查询培养方案图片信息
});



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