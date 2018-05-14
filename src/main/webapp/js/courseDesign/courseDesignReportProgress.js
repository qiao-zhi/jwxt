/**/

$(function () {
    $.ajax({
        url:"/jwxt/findcourseDesign/yearAndMajor.do",
        type:"post",
        data:{},
        dataType:"json",
        success:function (resultMap) {
            var gradeList = resultMap.yearList;
            var majorList = resultMap.majorList;
            for (var i = 0; i < majorList.length; i++) {
                $("#majorSelect").append("<option value='" + majorList[i].majorID + "'>" + majorList[i].majorName + " </option>")
            }
            for (var i = 0; i < gradeList.length; i++) {
                $("#gradeSelect").append("<option value=" + gradeList[i] + ">" + gradeList[i] + "</option>")
            }
            for(var i=0; i<gradeList.length;i++){
                var nextYear = parseInt(gradeList[i])+1;
                var yearNum = gradeList[i]+"-"+nextYear;
                $("#yearNum").append("<option value=" + yearNum + ">" + yearNum + "</option>")
            }
            layui.use(['form'], function () {
                var form = layui.form;
                form.render('select'); //刷新select选择框渲染
            });
        },
        error:function () {
            layer.alert("加载失败")
        }
    });
    //  无参  查询
    courseDesignNames();   // 加载列表信息
    findStudentReportStatus();

})


layui.use('form',function () {
    var form = layui.form;
    form.on('select(filter)', function(data){
        // console.log(data.value); //得到被选中的值

        courseDesignNames();
    });
})
// 查询课设列表
function courseDesignNames() {
    var majorID = $("#majorSelect").find("option:selected").val();
    var grade = $("#gradeSelect").find("option:selected").val();
    var yearNum = $("#yearNum").find("option:selected").val();
    var semester = $("#semester").find("option:selected").val();
    // alert("弹出"+majorID+grade+yearNum+semester)
    $.ajax({
        url:"/jwxt/checkCourseDesignReport/getClassinfoAndCourseDesigninfo.do",
        type:"post",
        data:{"majorID":majorID,"grade":grade,"yearNum":yearNum,"semester":semester},
        dataType:"json",
        success:function (infoMap) {
            //  清空班级信息select除第一行的内容
            $("#classInfo").find("option").not(":first").remove();
            var classInfoList = infoMap.classInfoList;
            for(var i=0;i<classInfoList.length;i++){
                $("#classInfo").append(
                    " <option value='"+classInfoList[i].classID+"'>"+classInfoList[i].className+"</option>"
                )
            }
            //清空课设信息select除第一行的内容
            $("#courseDesignInfo").find("option").not(":first").remove();
            var courseDesignList = infoMap.courseDesignList;
            for(var i=0;i<courseDesignList.length;i++){
                $("#courseDesignInfo").append(
                    "<option value='"+courseDesignList[i].courseDesignNum+"'>"+courseDesignList[i].courseDesignName+"</option>"
                )
            }
            layui.use(['form'], function () {
                var form = layui.form;
                form.render('select'); //刷新select选择框渲染
            });
        },
        error:function () {
            layer.alert("加载课设信息失败")
        }
    });

}

//  查询学生课设报告上传情况
function findStudentReportStatus() {
    var majorID = $("#majorSelect").find("option:selected").val();
    var grade = $("#gradeSelect").find("option:selected").val();
    var yearNum = $("#yearNum").find("option:selected").val();
    var semester = $("#semester").find("option:selected").val();
    var courseDesignNum = $("#courseDesignInfo").find("option:selected").val();
    var classID = $("#classInfo").find("option:selected").val();
    var uploadStatus = $("#uploadStatus").find("option:selected").val();
    //  alert("majorID="+majorID+",grade="+grade+",yearNum="+yearNum+",semester="+semester+",courseDesignNum="+courseDesignNum+",classID="+classID+",uploadStatus="+uploadStatus);
    $.ajax({
        url:"/jwxt/checkCourseDesignReport/findStudentReportUploadStatus.do",
        type:"post",
        // 此处也应传入  教师id  从session中获取  暂取  张三 1
        data:{"majorID":majorID,"grade":grade,"yearNum":yearNum,"semester":semester,
            "courseDesignNum":courseDesignNum,"classID":classID,"uploadStatus":uploadStatus,"teacherID":"1",
            "pageNum":$("[name='pageNum']").val(),"pageSize":$("[name='pageSize']").val()
        },
        dataType:"json",
        success:function (pageInfo) {
            // 分页参数
            var pageSize = pageInfo.pageSize;
            var pageNum = pageInfo.pageNum;
            var total = pageInfo.total;
            // 学生报告上传情况
            $("#studentReportStatus").html("");
            var list = pageInfo.list;
            for(var i=0;i<list.length;i++){
                var uploadInfo = "";
                var uploadStatus = list[i].uploadStatus;
                if(uploadStatus == 1){
                    uploadInfo = "已上传"
                }else{
                    uploadInfo = "未上传"
                }
                var checkInfo = "";
                var checkStatus = list[i].checkStatus;
                if(checkStatus == 1){
                    checkInfo = "已审核"
                }else if(checkStatus == 0){
                    checkInfo = "未审核"
                }else if(checkStatus == 2){
                    checkInfo = "审核未通过"
                }
                var index = (pageNum-1)*pageSize+i+1;
                $("#studentReportStatus").append(
                    "<tr>"+
                    "<td>" +
                    "<div class='checkdiv layui-unselect layui-form-checkbox' onclick='changeClass(this);' lay-skin='primary' data-id='2'>" +
                    "<i class='layui-icon'>&#xe605;</i>" +
                    "</div>" +
                    "</td>" +
                    "<td>"+index+"</td>" +
                    "<td style='display:none;'>"+list[i].courseDesignTeacherStudentID+"</td>" +
                    "<td>"+list[i].studentName+"</td>" +
                    "<td>"+list[i].studentNum+"</td>" +
                    "<td>"+list[i].courseDesignName+"</td>" +
                    "<td>"+list[i].teacherName+"</td>" +
                    "<td>"+uploadInfo+"</td>"+
                    "<td>"+checkInfo+"</td>" +
                    "<td class='td-manage'>" +
                    "<a title='点击查看课设报告' onclick='checkReport(this);' >" +
                    "<i class='layui-icon'>&#xe63c;</i>" +
                    "</a>" +
                    "</td>" +
                    "</tr>"
                );
            }
            startPageDisplay(total,pageNum,pageSize);
        },
        error:function () {
            layer.alert("查询情况信息加载失败")
        }
    })
}

function startPageDisplay(total,pageNum,pageSize){
    // 使用layui的分页插件
    layui.use(['laypage','layer'],function () {
        var laypage = layui.laypage,layer = layui.layer;
        laypage.render({
            elem:'pageDiv',
            count:total,
            limit:pageSize,
            curr:pageNum,
            limits:[6,8,10],
            layout:['limit','prev','page','next','skip','count'],
            jump:function (obj,first) {
                $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                if(!first){
                    findStudentReportStatus();
                }
            }
        })
    })

}

// 报告预览
function checkReport(obj) {

    var upload =  $(obj).parent("td").parent("tr").find("td:eq(7)").text();
    //  alert(upload)
    if(upload=="未上传"){
        layer.alert("请选择已上传报告的课设进行查看");
        return;
    }

    var courseDesignTeacherStudentID = $(obj).parent("td").parent("tr").find("td").eq(2).text();
    // alert(courseDesignTeacherStudentID);
    $.ajax({
        url:"/jwxt/checkCourseDesignReport/checkCourseDesignReport.do",
        type:"post",
        data:{"courseDesignTeacherStudentID":courseDesignTeacherStudentID},
        dataType:"json",
        success:function (mapInfo) {
            var fileName = mapInfo.courseDesignReportStore;
            var studentName = mapInfo.studentName;
            x_admin_show(""+studentName+" 的课设报告","/file/courseDesignFile/"+fileName);
        },
        error:function () {
            layer.alert("预览报告失败")
        }
    })

}

function changeClass(obj) {
    if ($(obj).hasClass("layui-form-checked")) {
        $(obj).removeClass("layui-form-checked");
        //$(obj).attr("name","selected");
    } else {
        $(obj).addClass("layui-form-checked");
        //$(obj).attr("name","none");
    }
}


//

var chooseCourse=0;//判断是否选中课程
var ids = [];   // 储存courseDesignTeacherStudentID
var index = 0;
function checkCDReport(){

    $(".checkdiv").each(function() {
        if ($(this).hasClass("layui-form-checked")) {
            ids.push($(this).parents("tr").find("td").eq(2).text());
            var uploadInfo = $(this).parents("tr").find("td").eq(7).text();
            if(uploadInfo=="未上传"){
                index++;
                return;
            }
            chooseCourse++;
        }
    })
    if(index>0){
        layer.alert("请选择已上传报告进行审核");
        index=0;
        ids=[];
        return;
    }
    //   alert(chooseCourse+":"+ids)
    var courseDesignTeacherStudentID = $(".layui-form-checkbox").parent("td").parent("tr").find("td").eq(2).text();

    if (chooseCourse>0) {
        x_admin_show('课设审核','courseDesign-recheck.jsp?ids='+ids+'')
    }
    else{
        layer.alert('请先选择需要审核的课设报告');
    }
    chooseCourse=0;//清空值
    ids = [];
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
