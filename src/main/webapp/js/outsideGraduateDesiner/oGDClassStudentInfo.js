var classID = getAddressParameter("classID");
/*按照条件加载校外毕设学生申请信息*/
$(function(){
    $("#classID").val(classID);
    selectOGDStudentInfo();
});
function selectOGDStudentInfo(){
    //alert(classID);
    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        $.ajax({
            url:contextPath+"/count/selectOGDClassStucent.do",
            type:"post",
            data:{"classID":classID,"pagenum":$("[name='pageNum']").val(),"pagesize":$("[name='pageSize']").val()},
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

                    var studentNum = result[i].studentNum;
                    var studentName = result[i].studentName;
                    var major = result[i].majorClass;
                    var receiveUnit = result[i].receiveUnit;
                    var inTeacherName = result[i].inTeacherName;
                    var outTeacherName = result[i].outTeacherName;
                    var applyTime = result[i].applyTime;
                    var title = result[i].finallyName;
                    appendOGDApllyOntTR(outsideApplyId,leaveID,titleID,agreementID,attachmentID,sureID,
                        studentNum,studentName,major,title,inTeacherName,receiveUnit,outTeacherName,applyTime);
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
            elem: 'demo7'
            ,count: total
            ,limit:pageSize
            ,curr:pageNum
            ,limits:[6,4,2,1]
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj,first){
                $("[name='pageNum']").val(obj.curr);
                $("[name='pageSize']").val(obj.limit);
                if(!first){
                    selectOGDStudentInfo();
                }
            }
        });
    });
}

/*增加一条学生校外申请*/
function appendOGDApllyOntTR(outsideApplyId,leaveID,titleID,agreementID,attachmentID,sureID,
                             studentNum,studentName,major,title,inTeacherName,receiveUnit,outTeacherName,applyTime) {
    var str = '';
    str += '<tr>';
    str += '<td>'+studentNum+'</td>';
    str += '<td>'+studentName+'</td>';
    str += '<td>'+major+'</td>';
    str += '<td>'+inTeacherName+'</td>';
    str += '<td>'+title+'</td>';
    str += '<td>'+receiveUnit+'</td>';
    str += '<td>'+outTeacherName+'</td>';
    str += '<td>'+applyTime+'</td>';
    str += '<td class="y_files" title="点击查看审核内容"';
    str += 'onclick="seeOneStuInfo(';
    str += "'相关申请表','outGraduateManage-table.jsp','"+outsideApplyId+"','"+leaveID+"','"+titleID+"','"+agreementID+"','"+attachmentID+"','"+sureID+"'";
    str += ')">相关申请表</td>';
    str += '</tr>';
    var $tr = $(str);
    $tr.data("outsideApplyId",outsideApplyId);
    $tr.data("leaveID",leaveID);
    $tr.data("titleID",titleID);
    $tr.data("agreementID",agreementID);
    $tr.data("attachmentID",attachmentID);
    $tr.data("sureID",sureID);
    $("#thead-tbody").append($tr);
}
function seeOneStuInfo(title,url,outsideApplyId,leaveID,titleID,agreementID,attachmentID,sureID){
    //向地址中传入要传递得参数
    var newurl = "./"+url+"?outsideApplyId="+outsideApplyId+"&leaveID="+leaveID+"&titleID="+titleID+"&agreementID="+agreementID+"&attachmentID="+attachmentID+"&sureID="+sureID;
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
/*导出某班中校外学生的基本信息*/
function extOGDStudentInClass(){
    var layer = null;
    layui.use('layer',function () {
        layer = layui.layer;
    })
    var index = layer.load();
    $.ajax({
        url:contextPath+"/ext/extOGDStudentInClass.do",
        type:"post",
        data:{"classID":classID},
        dataType:"text",
        success:function(result){
            layer.msg(result);
        },
        error:function(){
            layer.msg("导出出错");
        }

    });
    layer.close(index);
}
