
/*查询校外申请学生信息*/
var userID = 1;   //获取当前用户ID
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
    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        $.ajax({
            url:contextPath+"/selectOGDApply/allApplyStudent.do",
            type:"post",
            data:{"userID":userID,"stadyYear":stadyYear,"major":major,
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
                    appendOGDApllyOntTR(outsideApplyId,studentNum,studentName,major,inTeacherName,receiveUnit,outTeacherName,applyTime,checkstatus);
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
function appendOGDApllyOntTR(outsideApplyId,studentNum,studentName,major,inTeacherName,receiveUnit,outTeacherName,applyTime,checkstatus) {
    var str = '';
    str += '<tr>';
    str += '<td>'+studentNum+'</td>';
    str += '<td>'+studentName+'</td>';
    str += '<td>'+major+'</td>';
    str += '<td>'+inTeacherName+'</td>';
    str += '<td>'+receiveUnit+'</td>';
    str += '<td>'+outTeacherName+'</td>';
    str += '<td>'+applyTime+'</td>';
    str += '<td>'+checkstatus+'</td>';
    str += '<td class="y_files" title="点击查看审核内容"';
    str += 'onclick="seeOneStuInfo(';
    str += "'相关申请表','outGraduateManage-table.jsp','"+outsideApplyId+"'";
    str += ')">相关申请表</td>';
    var $tr = $(str);
    $("#thead-tbody").append($tr);
}
function seeOneStuInfo(title,url,id){
    //向地址中传入要传递得参数
    var newurl = "./"+url+"?id="+id;
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