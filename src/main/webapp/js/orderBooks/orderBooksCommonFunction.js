
/** 公共查询条件 S**/
//日期控件
layui.use('laydate', function () {
    var laydate = layui.laydate;
    //设置条件选择框中的学年
    laydate.render({
        elem: '#year' //指定元素id
        ,type: 'year'
    });
    // //审核时间
    // laydate.render({
    //     elem:"#checkTime"
    // })
})

//初始化专业下拉框
function findMajorNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/TrainScheme/getMajorNameAndCode.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response);
            var optionStr = "<option value=''>请选择专业</option>";
            $("select[name='major']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].majorId+"'>"+response[i].majorName+"</option>";
                $("select[name='major']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}
/** 公共查询条件 **/


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


//查找课程定义到课程名称下拉列表
function findAllCourseByCourseCode() {
    $.post(
        contextPath+"/TextbookOrder/findAllCourseByCourseCode.do",
        {},
        function (response) {
            // alert(response)
            for (var i=0;i<response.length;i++){
                    $("#course").append('<option value="' + response[i].course_code
                        + '">' + response[i].course_name + '</option>')
            }
            //layui渲染
            layui.use('form',function () {
                layui.form.render('select');
            });

        },
        'json'
    )
}