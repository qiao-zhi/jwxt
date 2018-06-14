/**
 * @author: LL
 * @createtime: 2018/5/7 12:39
 * @description:排课公共方法
 */

/** 公共查询条件 S**/
//日期控件
layui.use('laydate', function () {
    var laydate = layui.laydate;
    //设置条件选择框中的学年
    laydate.render({
        elem: '#s_year' //指定元素
        ,type: 'year'
    });
    //当前时间
    laydate.render({
        elem:"#nowTime"
    })
    //添加信息时学年的操作
    laydate.render({
        elem: '#y_year' //指定元素
        ,type: 'year'
        ,done:function(date){
            //判断date是否有值
            if(date != null && date !=""){
                date = parseInt(date)
                $("#end_year").val(date+1)
                $("input[name='academicYear']").val(date+'-'+(date+1)+"学年")
            }else{
                $("#end_year").val('')
                $("input[name='academicYear']").val('')
            }
        }
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

//状态码转换校区
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

//学期状态码转换
function termStatusReplace(status){
    var termStr = '';
    switch(status){
        case "1":
            termStr = "第一学期";
            break;
        case "2":
            termStr = "第二学期";
            break;
        default:
            termStr = "--";
    }
    return termStr;
}
//判断是否为空，为空显示--，否则显示传入的数据
function checkNull(value){
    if(value==null || value==''){
        return '--';
    }else{
        return value;
    }
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

//初始化在职教师下拉框
function findTeacherBaseInfoForSelect(form,collegeId_all){
    $.ajax({
        url:contextPath+"/arrangeCourse/findTeacherBaseInfo.action",
        dataType:"json",
        data:{"academicId":collegeId_all},
        type:"post",
        success:function (response) {
            var optionStr = "<option value=''>请输入教师姓名</option>";
            $("select[name='allTeacherInfo']").append(optionStr);
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].teachernum+"'>"+response[i].teachername+"</option>";
                $("select[name='allTeacherInfo']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//初始化历史教师下拉框
function findHistoryTeacherInfoForSelect(courseNumber,form){
    $.ajax({
        url:contextPath+"/arrangeCourse/findHistoryTeacherInfo.action",
        dataType:"json",
        data:{"courseNumber":courseNumber},
        type:"post",
        success:function (response) {
            var optionStr = "<option value=''>请输入教师姓名</option>";
            $("select[name='historyTeacherInfo']").append(optionStr);
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].teacher_number+"'>"+response[i].teacher_name+"</option>";
                $("select[name='historyTeacherInfo']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//修改排课任务状态
function changeTaskStatus(arrangeTaskId,status){
    $.ajax({
        url:contextPath+"/arrangeCourse/updateArrangeCourseTaskStatus.action",
        type:"post",
        dataType:"text",
        async:false,
        data:{"arrangeTaskId":arrangeTaskId,"status":status},
        success:function(response){
            layer.alert(response,function () {
                //实现父页面的刷新
                window.location.reload();
            })
        }
    })
}

//获取学院ID
function getCollegeId(){
    $.ajax({
        url:contextPath+"/arrangeCourse/getCollegeIdByNum.action",
        data:{"teacherNum":teacherNum_all},
        type:"POST",
        async:false,
        datatype:"text",
        success:function(response){
            collegeId_all = response;
        }
    })
}

//获取当前时间设置到相应字段
function getNowTime(){
    var myDate = new Date();//获取系统当前时间
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth()+1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;
    var nowTime = year + "-" + month + "-" + date;
    $("#nowTime").val(nowTime);
}

/* S            弹出层相关操作 */
/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    w       弹出层宽度（缺省调默认值）
    h       弹出层高度（缺省调默认值）
*/
function x_admin_show(title,url,w,h){
    if (title == null || title == '') {
        title=false;
    };
    if (url == null || url == '') {
        url="404.html";
    };
    if (w == null || w == '') {
        w=($(window).width()*0.90);
    };
    if (h == null || h == '') {
        h=($(window).height()-50);
    };
    layer.open({
        type: 2,
        area: [w+'px', h +'px'],
        fix: false, //不固定
        maxmin: true,
        shadeClose: true,
        shade:0.4,
        title: title,
        content: url
    });
}
/* E            弹出层相关操作 */