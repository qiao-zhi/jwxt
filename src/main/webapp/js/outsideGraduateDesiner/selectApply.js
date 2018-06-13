/*查询校外申请学生信息*/
$(function(){
    loadStudentApplyInfo();
});
/*按照制定条件查询校外毕设学生信息*/
function serachStudentInfoByValue(){
    //alert("!23");
    loadStudentApplyInfo();
}
/*按照条件加载校外毕设学生申请信息*/
function loadStudentApplyInfo(){
    var stadyYear = $("#y_year").val();
    var major = $("#major").val();
    var studentNum = $("#studentNum").val();
    var checkStatus = $("#checkStatus").val();
    var identity = $("#identity").val();
    var name = $("#inteachername").val();
    var userId = $("#userID").val();

    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        $.ajax({
            url:contextPath+"/selectOGDApply/allApplyStudent.do",
            type:"post",
            data:{"userID":userId,"stadyYear":stadyYear,"major":major,"identity":identity,"name":name,
                "studentNum":studentNum,"checkStatus":checkStatus,"pagenum":$("[name='pageNum']").val(),"pagesize":$("[name='pageSize']").val()},
            dataType:"json",
            success:function(pageInfo){
                //结果list
                var result = pageInfo.list;
                var total = pageInfo.total;
                var pageNum = pageInfo.pageNum;
                var pageSize = pageInfo.pageSize;
                $("#thead-tbody").children("tr").remove();
                for(var i=0;i<result.length;i++){
                    var outsideApplyId = result[i].outsideApplyID;
                    var leaveID = result[i].leaveID;
                    var titleID = result[i].titleID;
                    var agreementID = result[i].agreementID;
                    var attachmentID = result[i].attachmentID;
                    var sureID = result[i].sureID;
                    var assignmentID = result[i].assignmentID;

                    var studentNum = result[i].studentNum;
                    var studentName = result[i].studentName;
                    var major = result[i].majorClass;
                    var receiveUnit = result[i].receiveUnit;
                    var inTeacherName = result[i].inTeacherName;
                    var outTeacherName = result[i].outTeacherName;
                    var applyTime = result[i].applyTime;
                    var checkstatus = result[i].checkstatus;
                    if(checkstatus!=null&&checkstatus=="11"){
                        checkstatus = "未审核";
                    }
                    if(checkstatus!=null&&checkstatus=="21"){
                        checkstatus = "已审核";
                    }
                    appendOGDApllyOntTR(outsideApplyId,leaveID,titleID,agreementID,attachmentID,sureID,assignmentID,
                        studentNum,studentName,major,inTeacherName,receiveUnit,outTeacherName,applyTime,checkstatus);
                }
                //开启分页组建
                OnePageStudentApplyInfo(total,pageNum,pageSize);
            },
            error:function(){
                layer.msg("页面加载出错！！！");
            }
        });

    });
}

//分页组建函数
function OnePageStudentApplyInfo(total,pageNum,pageSize){
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;
        //完整功能
        laypage.render({
            elem: 'pagediv'
            ,count: total
            ,limit:pageSize
            ,curr:pageNum
            ,limits:[6,4,2]
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj,first){
                $("[name='pageNum']").val(obj.curr);
                $("[name='pageSize']").val(obj.limit);
                if(!first){
                    serachStudentInfoByValue();
                }
            }
        });
    });
}

/*增加一条学生校外申请*/
function appendOGDApllyOntTR(outsideApplyId,leaveID,titleID,agreementID,attachmentID,sureID,assignmentID,
                             studentNum,studentName,major,inTeacherName,receiveUnit,outTeacherName,applyTime,checkstatus) {
    var str = '';
    str += '<tr>';
    str += '<td>'+studentNum+'</td>';
    str += '<td>'+studentName+'</td>';
    str += '<td>'+major+'</td>';
    str += '<td>'+inTeacherName+'</td>';
    str += '<td>'+receiveUnit+'</td>';
    str += '<td>'+outTeacherName+'</td>';
    str += '<td>'+applyTime+'</td>';
    str += '<td class="y_files" title="点击查看审核内容"';
    str += 'onclick="seeOneStuInfo(';
    str += "'相关申请表','outGraduateManage-table.jsp','"+outsideApplyId+"','"+leaveID+"','"+titleID+"','"+agreementID+"','"+attachmentID+"','"+sureID+"','"+assignmentID+"'";
    str += ')">相关申请表</td>';
    str += '<td><input onclick="sign($(this))" type="button" class="layui-btn layui-btn-sm"  style="padding-left: 0px;width: 65px;" value="签名"></input></td></tr>';
    var $tr = $(str);
    $tr.data("outsideApplyId",outsideApplyId);
    $tr.data("leaveID",leaveID);
    $tr.data("titleID",titleID);
    $tr.data("agreementID",agreementID);
    $tr.data("attachmentID",attachmentID);
    $tr.data("sureID",sureID);
    $tr.data("assignmentID",assignmentID);

    $("#thead-tbody").append($tr);
}
function seeOneStuInfo(title,url,outsideApplyId,leaveID,titleID,agreementID,attachmentID,sureID,assignmentID){
    //向地址中传入要传递得参数
    var newurl = "./"+url+"?outsideApplyId="+outsideApplyId+"&leaveID="+leaveID+"&titleID="+titleID+"&agreementID="+agreementID+"&attachmentID="+attachmentID+"&sureID="+sureID+"&assignmentID="+assignmentID;
    x_admin_show1(title,newurl,'','');
}
function x_admin_show1(title,url,w,h){
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
        content: url,
    });
}

/*点击签字发出*/
function sign(obj){
    //获取当前点击的行
    var $tr = obj.parent("td").parent("tr");
    var outsideApplyId = $tr.data("outsideApplyId");
    var leaveID = $tr.data("leaveID");
    var titleID = $tr.data("titleID");
    var agreementID = $tr.data("agreementID");
    var attachmentID = $tr.data("attachmentID");
    var sureID = $tr.data("sureID");
    var assignmentID = $tr.data("assignmentID");
    var userId = $("#userID").val();

    //获取当前用户所选取的身份
    var identity = $("#identity").val();
    var name = $("#inteachername").val();
    //alert(identity+name);
    /*隐藏id*/
    $("#hidden_identify").val(identity);
    $("#hidden_name").val(name);
    $("#hidden_userId").val(userId);
    $("#hidden_outsideApplyId").val(outsideApplyId);
    $("#hidden_leaveID").val(leaveID);
    $("#hidden_titleID").val(titleID);
    $("#hidden_agreementID").val(agreementID);
    $("#hidden_assignmentID").val(assignmentID);
    $("#hidden_attachmentID").val(attachmentID);
    $("#hidden_sureID").val(sureID);
    var layer;
    layui.use('layer',function(){
        layer = layui.layer;
    });
    if(identity!=null&&identity!=""){
        var  width=($(window).width()*0.33);
        var height=($(window).height()*0.45);
        var index = layer.open({
            title:'确认签字',
            area: [width+'px', height +'px'],//大小
            fix: true, //不固定
            maxmin: true,
            zIndex:500,
            shadeClose: false,
            shade:0.4,
            type:1,
            content:$('#sureSign')
        });
        //向页面隐藏index
        $("#hidden_update_index").val(index);
    }else{
        layer.msg("请先选择签字身份");
    }

}
/*确认签字*/
function sureSign(){
    //获取当前用户选择的身份以及获取学生申请表的信息id
    var identity = $("#identity").val();
    var name = $("#inteachername").val();
    var sureId = $("#hidden_sureID").val();
    var layer;
    layui.use('layer',function(){
        layer = layui.layer;
    });
    /*获取当前打开页面的index*/
    var index = $("#hidden_update_index").val();
    /*发送ajax请求进行查询并签字*/
    /*对用户所选择的签字身份进行判断*/
    //if(identity=="辅导员"){
        $.ajax({
            url:contextPath+"/sign/fudaoyuanSign.do",
            type:"post",
            data:$("#signInfo").serialize(),
            dataType:"json",
            success:function (result) {
                $("#signPassword").val("");
                $("#advice").val("");
                var status = result.status;
                var info = result.info;
                //debugger;
                if(status=="0"||status=="2"){
                    layer.msg(info);
                }
                if(status=="1"||status=="3"||status=="4"){
                    var trs = $("#thead-tbody").find("tr");
                    for(var i=0;i<trs.length;i++){
                       // alert($(trs[i]).data("sureID"));
                        if(($(trs[i]).data("sureID"))==sureId){
                            $(trs[i]).remove();
                        }
                    }
                    layer.msg(info);
                    layer.close(index);
                }
            },
            error:function () {
                layer.msg("签字出错");
                layer.close(index);
            }

        });
   // }
}
