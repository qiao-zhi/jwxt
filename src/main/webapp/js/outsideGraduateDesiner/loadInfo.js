/*获取选中学生的申请ID*/
var outsideApplyID = getAddressParameter("outsideApplyId");
var leaveID = getAddressParameter("leaveID");
var titleID = getAddressParameter("titleID");
var agreementID = getAddressParameter("agreementID");
var attachmentID = getAddressParameter("attachmentID");
var sureID = getAddressParameter("sureID");
var assignmentID = getAddressParameter("assignmentID");

var layer = null;
var form = null;
/*页面加载查询申请的详细信息*/
$(function (){
    //alert(outsideApplyID+"|||"+leaveID+"|||"+titleID+"|||"+agreementID+"|||"+attachmentID+"|||"+sureID);
    layui.use(['layer','form'], function(){
        layer = layui.layer;
        form = layui.form;
        var index = layer.load();
        /*发送ajax请求查询*/
        loadBaseInfo();
        loadTitle();
        loadLeave();
        loadAggreement();
        loadSureBook();
        loadAttachment();
        loadAssignment();
        layer.close(index);
    });
});

/*增加一条任务书信息*/
function loadAssignment(){
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectOGDassignment.do",
        type:"post",
        data:{"assignmentID":assignmentID},
        dataType:"json",
        success:function(result){
            //alert( JSON.stringify(result));
            $("#assignment .collegename1").html(result.outsidegradesignagreemen.collegename);
            $("#assignment .studentname11").val(result.gradesignleaveapply.studentname);
            $("#assignment .studentnum1").val(result.gradesignleaveapply.studentnum);
            $("#assignment .majorclass1").val(result.outgradesigninfo.majorclass);
            $("#assignment .samegroup").val(result.samegroup);
            $("#assignment .starttime").val(Format(new Date(result.starttime),'yyyy-MM-dd'));
            $("#assignment .endtime").val(Format(new Date(result.endtime),'yyyy-MM-dd'));
            $("#assignment .title1").val(result.title);
            $("#assignment .request").val(result.request);
            $("#assignment .content").val(result.content);
            $("#assignment .submitfile").val(result.submitfile);
            if(result.studentsign!=null&&result.studentsign!=""){
                $("#assignment .studentsign").attr("src",result.studentsign);
            }
            var check = result.checkassignments;
            for(var i=0;i<check.length;i++){
                var checknum = check[i].checkpeople;
                if(checknum=="系主任"){
                    $("#assignment .xizhuren").attr("src",check[i].teachersign);
                }
                if(checknum=="指导教师"){
                    $("#assignment .jiaoshi").attr("src",check[i].teachersign);
                }
                if(checknum=="主管院长"){
                    $("#assignment .yuanzhang").attr("src",check[i].teachersign);
                }
            }
        },
        error:function () {
            layer.msg('查询信息出错',{time:2000}, function(){
                var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                parent.layer.close(index);
            });
        }
    });
}
/*增加一条附件信息（图片）*/
function loadAttachment(){
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectOGDAttachment.do",
        type:"post",
        data:{"attachmentID":attachmentID},
        dataType:"json",
        success:function(result){
            //alert(JSON.stringify(result));
            $("#types").val(result.attachmenttype);
            var iscommit = result.iscommit;
            var contents = result.oGDAttachmentContent;
            for(var i=0;i<contents.length;i++) {
                if (contents[i].contentnum != null) {
                    addOneContent(contents[i].contentid, contents[i].contenturl, contents[i].contentnum);
                }
            }
        },
        error:function () {
            layer.msg('查询信息出错',{time:2000}, function(){
                var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                parent.layer.close(index);
            });
        }
    });
}
function addOneContent(contentID,path,num){
    var sdiv = '';
    sdiv += '</div><dd class="upload-icon-img" >';
    sdiv += '<div class="upload-pre-item" id="'+num+'">';
    sdiv += '<button type="button" onclick="deleteImg($(this))" style="display: none" class="layui-btn">';
    sdiv += '<i class="layui-icon" ></i>';
    sdiv += '</button>';
    sdiv += '<img src="'+path+'" width="900">';
    sdiv += '</div></dd><hr/>';
    var $div = $(sdiv);
    $div.data("contentID",contentID);
    $("#td-content").append($div);
}



/*获取学生保证书信息*/
function loadSureBook(){
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectODGSureBook.do",
        type:"post",
        data:{"sureID":sureID},
        dataType:"json",
        success:function(result){
            //alert(JSON.stringify(result));
            if(result.studentsignurl!=null){
                $("#sureBook .studentUrl").attr("src",result.studentsignurl);
            }
            $("#sureBook .studentApplyTime").val(Format(new Date(result.signtime),'yyyy-MM-dd'));
        },
        error:function () {
            alert("查询保证书内容出错");
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);
        }
    });
}


/*获取学生自我管理协议书信息*/
function loadAggreement(){
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectODGSelfAggreement.do",
        type:"post",
        data:{"selfManageId":agreementID},
        dataType:"json",
        success:function(result){
            //alert(JSON.stringify(result));
            $("#aggreement .collegeName").val(result.collegename);
            $("#aggreement .studentName1").val(result.oGDInfo.studentname);
            $("#aggreement .studentName2").html(result.oGDInfo.studentname);
            $("#aggreement .studentIdCard").val(result.studentidcard);
            $("#aggreement .majorClass").html(result.oGDInfo.majorclass);
            if(result.schoolsign!=null&&result.schoolsign!=""){
                $("#aggreement .schoolUrl").attr("src",result.schoolsign);
            }
            $("#aggreement .schoolSignDate").val(Format(new Date(result.schoolsigndate),'yyyy-MM-dd'));
            if(result.studentsign!=null&&result.studentsign!=""){
                $("#aggreement .stusignUrl").attr("src",result.studentsign);
            }
            $("#aggreement .studentSignDate").val(Format(new Date(result.studentsigndate),'yyyy-MM-dd'));
            form.render();   //更新渲染
        },
        error:function () {
            alert("加载页面出错");
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);
        }
    });
}



/*获取学生请假申请信息*/
function loadLeave() {
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectOGDLeaveInfo.do",
        type:"post",
        data:{"leaveID":leaveID},
        dataType:"json",
        success:function(result){
            //alert( JSON.stringify(result));
            $("#leave .studentName").val(result.studentname);
            $("#leave .studentNum").val(result.studentnum);
            $("#leave .studentMajor").val(result.major);
            /*拼接请假起始日期*/
            var leaveStart = result.startdate;
            var leaveEnd = result.enddate;
            $("#leave .applytimeRange").val(Format(new Date(leaveStart),'yyyy-MM-dd')+" - "+Format(new Date(leaveEnd),'yyyy-MM-dd'));
            $("#leave .leaveDays").val(result.leavedays);
            $("#leave .leaveAddress").val(result.leaveaddress);
            $("#leave .studentTel").val(result.studenttel);
            $("#leave .homeAddress").val(result.homeaddress);
            $("#leave .homeTel").val(result.hometel);
            $("#leave .leaveReason").val(result.leavereason);
            $("#leave .applytimeCancel").val(Format(new Date(result.cancelLeave.canceltime),'yyyy-MM-dd'));
            var passStartTime = result.cancelLeave.passstarttime;
            var passEndTime = result.cancelLeave.passendtime;
            $("#leave .applytimeOut").val(Format(new Date(passStartTime),'yyyy-MM-dd')+" - "+Format(new Date(passEndTime),'yyyy-MM-dd'));
            /*获取审核结果集*/
            var check = result.checkLeaves;
            for(var i=0;i<check.length;i++){
                var checknum = check[i].checkpeople;
                if(checknum=="辅导员"){
                    loadSign2("leave",check[i],1);
                }
                if(checknum=="指导教师"){
                    loadSign2("leave",check[i],2);
                }
                if(checknum=="教研室主任"){
                    loadSign2("leave",check[i],3);
                }
                if(checknum=="系主任"){
                    loadSign2("leave",check[i],4);
                }
                if(checknum=="副书记"){
                    loadSign2("leave",check[i],5);
                }
                if(checknum=="主管院长"){
                    loadSign2("leave",check[i],6);
                }
            }
            form.render();   //更新渲染
        },
        error:function () {
            alert("加载页面出错");
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);
        }
    });
}
function loadSign2(fileID,check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+fileID+" ."+collnum+" .agree").attr("checked","checked");
    } else if(result1==0){
        $("#"+fileID+" ."+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+fileID+" ."+collnum+" .advice").text(check.checkopinion);
    $("#"+fileID+" ."+collnum+" .url").attr("src",check.teachersign);
    $("#"+fileID+" ."+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}



/*获取当前学生的课题申请信息*/
function loadTitle(){
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectOGDTitleInfo.do",
        type:"post",
        data:{"outGraApplyID":titleID},
        dataType:"json",
        success:function(result){
            //alert(JSON.stringify(result));
            $("#title .studentName").val(result.outGradesignInfo.studentname);
            var studentSex = result.outGradesignInfo.sex;
            var studentNum = result.graDesignLeaveApply.stucentnum;
            $("#title .majorClass").val(result.outGradesignInfo.majorclass);
            $("#title .studentMajor").val(result.graDesignLeaveApply.major);
            $("#title .studentNum").val(result.graDesignLeaveApply.studentnum);
            $("#title .applyDate").val(result.remark1);
            $("#title .courseName").val(result.coursename);
            $("#title .outUnitName").val(result.outunitname);
            $("#title .outUnitAddr").val(result.outunitaddr);
            $("#title .outUnitPhone").val(result.outunitphone);
            $("#title .studentPhone").val(result.studentphone);
            $("#title .stuParentPhone").val(result.stuparentphone);
            $("#title .inTeacherName").val(result.inteachername);
            $("#title .inTeacherPhone").val(result.inteacherphone);
            $("#title .outTeacherName").val(result.outteachername);
            $("#title .outTeacherPhone").val(result.outteacherphone);
            $("#title .courseDescription").val(result.coursedescription);
            $("#title .testContent").val(result.testcontent);
            $("#title .testStandard").val(result.teststandard);
            var resultType = result.resulttype;
            if(resultType=="论文"){
                $("#title .radio1").attr("checked","checked");
            }if(resultType=="软件"){
                $("#title .radio2").attr("checked","checked");
            }if(resultType=="实物制作"){
                $("#title .radio3").attr("checked","checked");
            }if(resultType=="报告"){
                $("#title .radio4").attr("checked","checked");
            }if(resultType=="其他"){
                $("#title .radio5").attr("checked","checked");
            }
            var check = result.projectChecks;
            for(var i=0;i<check.length;i++){
                var checknum = check[i].checkpeople;
                /*指导员教师*/
                if(checknum=="指导教师"){
                    loadSign1("title",check[i],1);
                }
                if(checknum=="教研室主任"){
                    loadSign1("title",check[i],2);
                }
            }
            form.render();   //更新渲染
        },
        error:function () {
            alert("查询课题申请信息出错");
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);
        }
    });
}
function loadSign1(fileID,check,collnum){
    var result1 = check.checkresult;
    if(result1==1){
        $("#"+fileID+" ."+collnum+" .agree").attr("checked","checked");
    } else if(result1==0){
        $("#"+fileID+" ."+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+fileID+" ."+collnum+" .advice").text(check.checkopinion);
    $("#"+fileID+" ."+collnum+" .url").attr("src",check.teachersign);
    $("#"+fileID+" ."+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}



/*获取当前学生的基本申请信息表*/
function loadBaseInfo(){
    $.ajax({
        url:contextPath+"/outGraduateDesiner/selectODGApplyInfo.do",
        type:"post",
        data:{"outsideApplyID":outsideApplyID},
        dataType:"json",
        success:function(result){
            //alert(JSON.stringify(result));
            $("#Applyinfo .studentname").val(result.studentname);
            $("#Applyinfo .sex").val(result.sex);
            $("#Applyinfo .majorclass").val(result.majorclass);
            $("#Applyinfo .inteachername").val(result.inteachername);
            $("#Applyinfo .receiveUnit").val(result.receiveunit);
            $("#Applyinfo .applyreason").val(result.applyreason);
            $("#Applyinfo .stuapplydate").val(Format(new Date(result.applydate),'yyyy-MM-dd'));
            if(result.stusignurl!=""){
                $("#Applyinfo .stusignurl").attr("src",result.stusignurl);
            }
            /*获取审核结果集*/
            var check = result.checkOGDInfo;
            for(var i=0;i<check.length;i++){
                var checknum = check[i].checkpeople;
                /*指导员教师*/
                if(checknum=="指导教师"){
                    loadSign("Applyinfo",check[i],1);
                }
                if(checknum=="副书记"){
                    loadSign("Applyinfo",check[i],2);
                }
                if(checknum=="教研室主任"){
                    loadSign("Applyinfo",check[i],3);
                }
                if(checknum=="主管院长"){
                    loadSign("Applyinfo",check[i],4);
                }

            }
            form.render();   //更新渲染
        },
        error:function () {
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);
            alert("查询学生校外申请信息出错");
        }
    });
}
function loadSign(fileID,check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+fileID+" ."+collnum+" .agree").attr("checked","checked");
    } else if(result1==0){
        $("#"+fileID+" ."+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+fileID+" ."+collnum+" .advice").text(check.checkadvice);
    $("#"+fileID+" ."+collnum+" .url").attr("src",check.teachersign);
    $("#"+fileID+" ."+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}

