/**/


/* layui 监听select*/
layui.use(['form','layer','util'],function () {
    var form = layui.form;
    var layer =layui.layer;
    form.on('select(chooseTeacher)', function(data){
//            console.log(data.elem); //得到select原始DOM对象
        //             console.log(data.value); //得到被选中的值
//            console.log(data.othis); //得到美化后的DOM对象
        // 清空班级信息
        $("#appendGrade").html("");
        $(".layui-form-checkbox").removeClass("layui-form-checked");
        $("#studentList").empty();
        $(".displayNone").attr("selected","selected");
        var teacherID = data.value;
        //   alert(teacherName);
        if(teacherName!=null&&teacherName!=""){
            $.ajax({
                url:contextPath +"/arrangeCourseDesign/getTeacherNum.do",
                type:"post",
                data:{"teacherID":teacherID},
                dataType:"json",
                success:function (teacherNum) {
                    $("#teacherId").attr("value",teacherNum);
                },
                error:function () {
                    layer.msg("获取教师编号失败！");
                }
            });
        }

    });

})


/* layui 监听select*/
//var className;
layui.use(['form','util'],function () {
    var form = layui.form;
    var util = layui.util;

    form.on('select(selectGrade)', function (data) {
//            console.log(data.elem); //得到select原始DOM对象
        //             console.log(data.value); //得到被选中的值
//            console.log(data.othis); //得到美化后的DOM对象
        classID = data.value;
        //   alert(className);
        if(classID==""||classID==null){
            return;
        }
        $.ajax({
            url:contextPath +"/arrangeCourseDesign/getSrudentList.do",
            type:"post",
            data:{"classID":classID},
            dataType:"json",
            success:function (studentList) {
                //  $("#studentList").html("");
                var classID = $("#selectgrade").find("option:selected").val();
                var className = $("#selectgrade").find("option:selected").text();

                // 增加班级重复判断
                var checkMsg = 0;
                $("#appendGrade").find("a").each(function () {
                    if(classID==$(this).attr("value")){
                        checkMsg++;
                    }
                })
                if(checkMsg>0){
                    return;
                }
                // 增加班级重复判断完成

                $("#appendGrade").append(
                 //   "<input name='class' type='hidden' value='"+classID+"'>"+'/'+className+"</input>"
                    "<a name='class' value='"+classID+"'>"+'/'+className+"</a>"
                );
                // 追加选择功能
                $("#studentList").append(
                    "<p style='margin-left: -60px; margin-top: 10px;font-size:20px;'>"+className+"</p><br>"+  // 追加班级名称
                    "<input type='radio' name='"+classID+"' value='"+classID+"' title='选择所有'  lay-filter='selectAll'>" +
                    "<input type='radio' name='"+classID+"' value='"+classID+"' title='选择前半部分'  lay-filter='selectBefore'>" +
                    "<input type='radio' name='"+classID+"' value='"+classID+"' title='选择后半部分' lay-filter='selectAfter'>" +
                    "<input type='radio' name='"+classID+"' value='"+classID+"' title='清除选择' lay-filter='clear'>" +
                    "</div><br>"
                )
                // 追加学生列表
                for (var i=0;i<studentList.length;i++){
                    $("#studentList").append(
                        "<div class='layui-unselect layui-form-checkbox "+classID+"' lay-skin='' name='student'  onclick='changeClass(this);'><a style='display: none;'>"+studentList[i].studentID+"</a><span>"+studentList[i].studentName+"</span><i class='layui-icon'></i></div>"
                    )
                }
                $("#studentList").append("<br><br>")
                form.render();//重新渲染表单
            },
            error:function () {
                layer.msg("获取学生信息失败");
            }
        });
    });
})

function changeClass(obj) {
    if($(obj).hasClass("layui-form-checked")){
        $(obj).removeClass("layui-form-checked");
        //$(obj).attr("name","selected");
    }else {
        $(obj).addClass("layui-form-checked");
        //$(obj).attr("name","none");
    }
}


function addToTable() {
//        alert(majorID);
    // 获取输入的值
    //   semester   yearNum   display  CourseArrangeTeacher CourseArrangeTime  isArrange 在控制层控制
    var startTime = $("#startTime").find("option:selected").val();
    var endTime = $("#endTime").find("option:selected").val();
    var CourseArrangeInfo = $("#CourseArrangeInfo").val();
    var teacherName = $("#teacherName").find("option:selected").text();
    var teacherNum = $("#teacherId").val();
    // 添加班级前先删掉没有选择学生的班级
    // 增加空班判断开始
    var classNames = "";
    var classArr = [];
    $("#appendGrade").find("a").each(function () {
        var clasID = $(this).attr("value");
        var clasName = $(this).text();
        var sign = 0;
        $("#studentList").find("."+clasID+"").each(function () {
            if($(this).hasClass("layui-form-checked")){
                sign++;
                return;
            }
        })
        if(sign>0){
            classNames += clasName;
            classArr.push(clasID);
        }
    })
    // 判断空班结束
    //alert(classNames)
    //var classNames = $("#appendGrade").text();
    var teacherID = $("#teacherName").find("option:selected").val();

    // // 获取班级id
    // var classArr = [];
    // $("#appendGrade").find("input[name='class']").each(function () {
    //     classArr.push($(this).val());
    // })
    // alert(classArr);

    //获取学生id
    var stuArr = [];
    $("#studentList").find("div[name='student']").each(function () {
        if($(this).hasClass("layui-form-checked")){
            stuArr.push($(this).find("a").text());
        }
    });

    // 增加非空性判断
    if(startTime==""||endTime==""||teacherName==""||CourseArrangeInfo==""||CourseArrangeInfo==null||classNames==""||classNames==null||stuArr==""||stuArr==null){
        layer.msg("请先完善安排信息再添加");
        return;
    }

    if(parseInt(startTime)>=parseInt(endTime)){
        layer.msg("结束时间应该大于开始时间");
        return;
    }
    //增加非空性判断结束

    //增加学生交叉判断
    var stuCheck = 0;
    $("#filterTeacher").children("tr").each(function (index) {
        var tableStuStr = $(this).children("td:eq(6)").text(); // 表格中已经添加的数据（学生id）
        var tableStuArr = tableStuStr.split(",");
        for(var i=0;i<stuArr.length;i++){
            // if($.inArray(stuArr[i],tableStuArr) > (-1)){
            //     alert(stuArr[i]);
            //     layer.msg("存在学生重复安排，请重新安排");
            //     stuCheck++;
            //     return;
            // }
            for(var j=0;j<tableStuArr.length;j++){
              //  debugger
                if(stuArr[i]==tableStuArr[j]){
                    stuCheck++;
                    layer.msg("存在学生重复安排，请重新安排");
                    return;
                }
            }
        }
    })
   // alert(stuArr)
    if(stuCheck>0){
        //alert("3333")
        stuCheck=0;  // 重置判断条件
        return;
    }
    //学生交叉判断结束


    // alert(stuArr);
    $("#filterTeacher").append(
        "<tr>" +
        "<td class='infoNum'>"+teacherNum+"</td>" +
        "<td class='infoName'>"+teacherName+"</td>" +
        "<td class='infoClass'>"+classNames+"</td>" +
        "<td class='infoStart' style='display:none;'>"+startTime+"</td>" +
        "<td class='infoEnd' style='display:none;'>"+endTime+"</td>" +
        "<td class='infoMessage' style='display:none;'>"+CourseArrangeInfo+"</td>" +
        "<td class='infoStuArr' style='display:none;'>"+stuArr+"</td>" +
        "<td class='trainCourseID' style='display:none;'>"+trainCourseID+"</td>" +
        "<td class='majorID' style='display:none;'>"+majorID+"</td>" +
        "<td class='courseDesignName' style='display:none;'>"+courseDesignName+"</td>" +
        "<td class='year' style='display:none;'>"+year+"</td>" +
        "<td class='semester' style='display:none;'>"+semester+"</td>" +
        "<td class='courseDesignNum' style='display:none;'>"+courseDesignNum+"</td>" +
        "<td class='classArr' style='display:none;'>"+classArr+"</td>" +
        "<td class='teacherID' style='display:none;'>"+teacherID+"</td>" +
        "<td class='td-manage'>"+
        "<a title='删除' onclick='deleteTr(this);'>" +
        "<i class='layui-icon'>&#xe640;</i>" +
        "</a>" +
        "</td>" +
        "</tr>"
    );
}

function deleteTr(obj){
    $(obj).parents("tr").remove();
}

// 将表格中的数据添加到表单中
function addToForm() {
    $("#infoForm").html(""); // 清空表单
    // 遍历表格中每一行
    $("#filterTeacher").children("tr").each(function (index) {
        // 获取表格中的数据
        var teacherNum = $(this).children("td:eq(0)").text();
        var teacherName = $(this).children("td:eq(1)").text();
        var classNames = $(this).children("td:eq(2)").text();
        var startTime = $(this).children("td:eq(3)").text();
        var endTime = $(this).children("td:eq(4)").text();
        var CourseArrangeInfo = $(this).children("td:eq(5)").text();
        var stuArr = $(this).children("td:eq(6)").text();
        var trainCourseID = $(this).children("td:eq(7)").text();
        var majorID = $(this).children("td:eq(8)").text();
        var courseDesignName = $(this).children("td:eq(9)").text();
        var year = $(this).children("td:eq(10)").text();
        var semester = $(this).children("td:eq(11)").text();
        var courseDesignNum = $(this).children("td:eq(12)").text();
        var classArr = $(this).children("td:eq(13)").text();
        var teacherID =  $(this).children("td:eq(14)").text();
        // 添加数据到表单中
        $("#infoForm").append(
            "<input type='hidden' name='TCourseDesignVos["+index+"].teacherNum' value='"+teacherNum+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].teacherName' value='"+teacherName+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].classNames' value='"+classNames+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].startTime' value='"+startTime+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].endTime' value='"+endTime+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].CourseArrangeInfo' value='"+CourseArrangeInfo+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].stuArr' value='"+stuArr+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].trainCourseID' value='"+trainCourseID+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].majorID' value='"+majorID+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].courseDesignName' value='"+courseDesignName+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].year' value='"+year+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].semester' value='"+semester+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].courseDesignNum' value='"+courseDesignNum+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].classArr' value='"+classArr+"'/>"+
            "<input type='hidden' name='TCourseDesignVos["+index+"].teacherID' value='"+teacherID+"'/>"
        );
    });

}

function submitInfo() {
    layer.confirm("确定要保存此次的课设安排么？",function () {
        addToForm();
        $.ajax({
            url:contextPath +"/arrangeCourseDesign/arrangeCourseDesignInfo.do",
            type:"post",
            async:false,
            data:$("#infoForm").serialize(),
            dataType:"json",
            success:function () {
                //发异步，把数据提交
                layer.msg("保存成功", {icon: 6}, function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    // 关闭窗口前，先重新执行一次父窗口查询
                    window.parent.findNeedArrangeCD();
                    //  window.parent.location.reload();  //刷新父窗口
                    //关闭当前frame
                    parent.layer.close(index);
                });
            },
            error:function () {
                layer.msg("保存失败！")
            }
        });
    })

}


layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form
        , layer = layui.layer;


    form.on('checkbox(stus)', function(data){
      //  alert(data.value); //得到checkbox原始DOM对象
    });


    //监听选择所有单选按钮事件
    form.on('radio(selectAll)',function(data){
        var classID = data.value;
        $("."+classID).addClass("layui-form-checked");
//            console.log(date)
//        alert($(this).value());
//        alert(date.elem.getElementsByClassName("name"));

    });


    //监听选择前半部分单选按钮事件
    form.on("radio(selectBefore)",function(data){
        var classID = data.value;
        var students=$("."+classID).length;
        var before=Math.round(students/2);
//       	alert(before)
        $("."+classID).removeClass("layui-form-checked");
        $("."+classID).slice(0,before).addClass("layui-form-checked");
//       	alert(students)
//			layer.alert("选择前半部分学生成功");

    });


    //监听选择后半部分单选按钮事件
    form.on('radio(selectAfter)',function(data){
        var classID = data.value;
        var students=$("."+classID).length;
        var before=Math.round(students/2);
//       	alert(before)
        $("."+classID).removeClass("layui-form-checked");
        $("."+classID).slice(before,students).addClass("layui-form-checked");
//			layer.alert("选择后半部分学生成功");

    });
    //监听清除单选按钮事件
    form.on('radio(clear)',function(data){
        var classID = data.value;
        $("."+classID).removeClass("layui-form-checked");
//			layer.alert("清除选择学生成功");

    });

});