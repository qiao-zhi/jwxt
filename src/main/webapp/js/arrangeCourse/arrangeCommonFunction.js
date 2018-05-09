/**
 * @author: LL
 * @createtime: 2018/5/7 12:39
 * @description:公共方法排课
 */

/** 公共查询条件 S**/
//设置条件选择框中的学年
layui.use('laydate', function () {
    var laydate = layui.laydate;
    laydate.render({
        elem: '#s_year' //指定元素
        ,type: 'year'
    });
})

//初始化专业下拉框
function findMajorNameAndIdForSelect(form){
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
/** 公共查询条件 **/

//状态码转换
function replaceStatus(status){
    var campus = '';
    switch(status){
        case "1":
            campus = "主校区";
            break;
        case "2":
            campus = "华科学院";
            break;
        case "3":
            campus = "晋城校区";
            break;
    }
    return campus;
}
//将校区转换成相应的状态码
function changeStatus(value){
    var status = '';
    switch(value){
        case "主校区":
            status = "1";
            break;
        case "华科学院":
            status = "2";
            break;
        case "晋城校区":
            status = "3";
            break;
    }
    return status;
}

//点击关闭其他，触发事件
function closeOther() {
    var closeTable = $(".layui-tab-title", parent.document).children("li");
    closeTable.each(function () {
        if ($(this).attr("class") == "") {
            $(this).children("i").trigger("click");
        }
    })
}