$(function () {
    findNeedUploadFile();
});

function findNeedUploadFile() {
    // 该数据应该从seesion中获取
    var studentID = 1;
    $.ajax({
        url:"/jwxt/studentCourseDesignFileInfo/findNeedUploadCourseDesignFile.do",
        type:"post",
        data:{"studentID":studentID,"pageNum":$("[name='pageNum']").val(),"pageSize":$("[name='pageSize']").val()},
        dataType:"json",
        success:function (pageInfo) {
            var total = pageInfo.total;
            var pageNum = pageInfo.pageNum;
            var pageSize = pageInfo.pageSize;
            var list = pageInfo.list;

            $("#tbodyInfo").html("");
            for(var i=0;i<list.length;i++){
                var index =(pageNum - 1)*pageSize+i+1; //编号
                var uploadInfo = "";
                if(list[i].uploadStatus==1){
                    uploadInfo = "已上传";
                }else{
                    uploadInfo = "未上传";
                }
                var checkInfo = "";
                if(list[i].checkStatus==1){
                    checkInfo = "已审核";
                }else if(list[i].checkStatus==2){
                    checkInfo="审核未通过";
                }else if(list[i].checkStatus==0){
                    checkInfo = "未审核";
                }
                $("#tbodyInfo").append(
                    "<tr>" +
                    "<td>" +
                        "<div class='layui-unselect layui-form-checkbox' onclick='changeClass(this);' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                    "</td>" +
                    "<td>"+index+"</td>" +
                    "<td style='display:none;'>"+list[i].courseDesignTeacherStudentID+"</td>" +
                    "<td>"+list[i].courseDesignName+"</td>" +
                    "<td>"+list[i].courseDesignNum+"</td>" +
                    "<td>"+list[i].teacherName+"</td>" +
                    "<td>"+list[i].teacherNum+"</td>" +
                    "<td>"+uploadInfo+"</td>" +
                    "<td>"+checkInfo+"</td>" +
                    "<td class='td-manage'>" +
                    "<a title='点击查看课设报告' onclick='checkCourseDesignFile(this)'>" +
                    "<i class='layui-icon'>&#xe63c;</i>" +
                    "</a>" +
                    "</td>" +
                    "</tr>"
                );
            }
            // 开启分页查询组件
            needUploadCourseDesignFile(total,pageNum,pageSize);
        },
        error:function () {
            alert("加载信息失败！");
        }
    });
}
function needUploadCourseDesignFile(total,pageNum,pageSize) {
    // 使用layui的分页插件
    layui.use(['laypage','layer'],function () {
        var laypage = layui.laypage,layer = layui.layer;
        // 执行一个laypage实例
        laypage.render({
            elem:'pageDiv', // 此处时id，但不用加#
            count:total,    // 数据总数（服务端获取）
            limit:pageSize, // 每页显示条数
            curr:pageNum,   //当前页号
            limits:[6,8,10],
            layout:['limit','prev','page','next','skip','count'],//显示哪些分页组件
            jump:function (obj,first) { // 点击页号时执行的函数
                // obj包含了当前分页的所有参数，例如：
                //     console.log(obj.curr);  //得到当前页，以便向服务器请求对应的数据
                //    console.log(obj.limit);   //得到每页显示的条数
                $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                if(!first){ //首次不执行（点击的时候才执行）
                    // alert(obj.curr)
                    findNeedUploadFile(); //执行查询分页函数（这个函数必须写在这）

                }
            }
        });
    });
}

function checkCourseDesignFile(obj) {
    var upload =  $(obj).parent("td").parent("tr").find("td:eq(7)").text();
      //  alert(upload)
    if(upload=="未上传"){
        layer.alert("请选择已上传报告的课设进行查看");
        return;
    }
    var courseDesignTeacherStudentID = $(obj).parent("td").parent("tr").find("td:eq(2)").text();
    //  alert(courseDesignTeacherStudentID);
    $.ajax({
        url:"/jwxt/studentCourseDesignFileInfo/checkCourseDesignFile.do",
        type:"post",
        data:{"courseDesignTeacherStudentID":courseDesignTeacherStudentID},
        dataType:"json",
        success:function (fileInfo) {
            fileName = fileInfo.courseDesignReportStore;
            studentName = fileInfo.studentName;
            x_admin_show(""+studentName+" 的课设报告","/file/courseDesignFile/"+fileName);

        },
        error:function () {
            layer.alert("加载信息失败")
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


var chooseCourse=0;//判断是否选中课程
function panduan(){
    $(".layui-form-checkbox").each(function() {
        if ($(this).hasClass("layui-form-checked")) {
            chooseCourse++;
        }
    })
}
function uoloadCourseDesignFile(){
    panduan();//调用判断方法
    var checkInfo = $(".layui-form-checked").parent("td").parent("tr").find("td").eq(8).text();
    var courseDesignTeacherStudentID =  $(".layui-form-checked").parent("td").parent("tr").find("td").eq(2).text();
    // alert(courseDesignTeacherStudentID);
    if (chooseCourse==1) {
        if(checkInfo=="未审核"||checkInfo=="审核未通过"){
            x_admin_show('上传课设报告','./courseDesignReport-add.jsp?courseDesignTeacherStudentID='+courseDesignTeacherStudentID+'')
        }else{
            layer.alert("该课设报告已上传成功！");
        }

    }
    else{
        layer.alert('请选择一门需要上传文件的课设');
    }
    chooseCourse=0;//清空值
}
function checkResult(){
    panduan();//调用判断方法
    var courseDesignTeacherStudentID =  $(".layui-form-checked").parent("td").parent("tr").find("td").eq(2).text();
    var checkInfo = $(".layui-form-checked").parent("td").parent("tr").find("td").eq(8).text();
    if (chooseCourse>0) {
        if(chooseCourse==1){
            if(checkInfo=="已审核"||checkInfo=="审核未通过"){
                x_admin_show('查看审核结果','./courseDesign-checkOpinion.jsp?courseDesignTeacherStudentID='+courseDesignTeacherStudentID+'')
            }else{
                layer.alert("正在审核中")
            }

        }
        else{
            layer.alert('每次只可查看一门课设的审核信息')
        }
    }
    else{
        layer.alert('请先选择需要查看审核结果的课设');
    }
    chooseCourse=0;//清空值
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

/*用户-删除*/
function member_del(obj, id) {
    layer.confirm('确认要删除吗？', function (index) {
        //发异步删除数据
        $(obj).parents("tr").remove();
        layer.msg('已删除!', {icon: 1, time: 1000});
    });
}