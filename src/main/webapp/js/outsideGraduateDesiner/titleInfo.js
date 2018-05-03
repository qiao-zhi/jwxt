/*页面加载查询申请的详细信息*/
$(function(){
    var outGraApplyID = getAddressParameter("id");
    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        var index = layer.load();
        /*发送ajax请求查询*/
        $.ajax({
            url:"/jwxt/outGraduateDesiner/selectOGDTitleInfo.do",
            type:"post",
            data:{"outGraApplyID":outGraApplyID},
            dataType:"json",
            success:function(result){
                //alert(JSON.stringify(result));
                $("#studentName").val(result.outGradesignInfo.studentname);
                var studentSex = result.outGradesignInfo.sex;
                var studentNum = result.graDesignLeaveApply.stucentnum;
                $("#majorClass").val(result.outGradesignInfo.majorclass);
                $("#studentMajor").val(result.graDesignLeaveApply.major);
                $("#studentNum").val(result.graDesignLeaveApply.studentnum);
                $("#applyDate").val(result.remark1);
                $("#courseName").val(result.coursename);
                $("#outUnitName").val(result.outunitname);
                $("#outUnitAddr").val(result.outunitaddr);
                $("#outUnitPhone").val(result.outunitphone);
                $("#studentPhone").val(result.studentphone);
                $("#stuParentPhone").val(result.stuparentphone);
                $("#inTeacherName").val(result.inteachername);
                $("#inTeacherPhone").val(result.inteacherphone);
                $("#outTeacherName").val(result.outteachername);
                $("#outTeacherPhone").val(result.outteacherphone);
                $("#courseDescription").val(result.coursedescription);
                $("#testContent").val(result.testcontent);
                $("#testStandard").val(result.teststandard);
                var resultType = result.resulttype;
                if(resultType=="论文"){
                    $("#radio1").attr("checked","checked");
                }if(resultType=="软件"){
                    $("#radio2").attr("checked","checked");
                }if(resultType=="实物制作"){
                    $("#radio3").attr("checked","checked");
                }if(resultType=="报告"){
                    $("#radio4").attr("checked","checked");
                }if(resultType=="其他"){
                    $("#radio5").attr("checked","checked");
                }
                var check = result.projectChecks;
                for(var i=0;i<check.length;i++){
                    var checknum = check[i].checkpeople;
                    /*指导员教师*/
                    if(checknum=="指导教师"){
                        addOneSignInfo(check[i],1);
                    }
                    if(checknum=="教研室主任"){
                        addOneSignInfo(check[i],2);
                    }
                }
                form.render();   //更新渲染
                layer.close(index);
            },
            error:function () {
                layer.msg('查询信息出错',{time:2000}, function(){
                    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                    parent.layer.close(index);
                });
            }
        });
    });
});
