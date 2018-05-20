/*页面加载查询申请的详细信息*/
$(function(){
    var leaveID = getAddressParameter("id");
    layui.use(['layer','form'], function(){
        //alert(leaveID);
        var layer = layui.layer;
        var form = layui.form;
        var index = layer.load();
        /*发送ajax请求查询*/
        $.ajax({
            url:contextPath+"/outGraduateDesiner/selectOGDLeaveInfo.do",
            type:"post",
            data:{"leaveID":leaveID},
            dataType:"json",
            success:function(result){
                //alert( JSON.stringify(result));
                $("#studentName").val(result.studentname);
                $("#studentNum").val(result.studentnum);
                $("#studentMajor").val(result.major);
                /*拼接请假起始日期*/
                var leaveStart = result.startdate;
                var leaveEnd = result.enddate;
                $("#applytimeRange").val(Format(new Date(leaveStart),'yyyy-MM-dd')+" - "+Format(new Date(leaveEnd),'yyyy-MM-dd'));
                $("#leaveDays").val(result.leavedays);
                $("#leaveAddress").val(result.leaveaddress);
                $("#studentTel").val(result.studenttel);
                $("#homeAddress").val(result.homeaddress);
                $("#homeTel").val(result.hometel);
                $("#leaveReason").val(result.leavereason);
                $("#applytimeCancel").val(Format(new Date(result.cancelLeave.canceltime),'yyyy-MM-dd'));
                var passStartTime = result.cancelLeave.passstarttime;
                var passEndTime = result.cancelLeave.passendtime;
                $("#applytimeOut").val(Format(new Date(passStartTime),'yyyy-MM-dd')+" - "+Format(new Date(passEndTime),'yyyy-MM-dd'));
                /*获取审核结果集*/
                var check = result.checkLeaves;
                for(var i=0;i<check.length;i++){
                    var checknum = check[i].checkpeople;
                    if(checknum=="辅导员"){
                        addOneSignInfo2(check[i],1);
                    }
                    if(checknum=="指导教师"){
                        addOneSignInfo2(check[i],2);
                    }
                    if(checknum=="教研室主任"){
                        addOneSignInfo2(check[i],3);
                    }
                    if(checknum=="系主任"){
                        addOneSignInfo2(check[i],4);
                    }
                    if(checknum=="副书记"){
                        addOneSignInfo2(check[i],5);
                    }
                    if(checknum=="主管院长"){
                        addOneSignInfo2(check[i],6);
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
