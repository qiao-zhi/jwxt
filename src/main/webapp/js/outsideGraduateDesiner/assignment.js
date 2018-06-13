/*页面加载查询申请的详细信息*/
$(function(){
    var assignmentID = getAddressParameter("id");
    $("#id").val(assignmentID);
    layui.use(['layer','form'], function(){
        //alert(assignmentID);
        var layer = layui.layer;
        var form = layui.form;
        var index = layer.load();
        /*发送ajax请求查询*/
        $.ajax({
            url:contextPath+"/outGraduateDesiner/selectOGDassignment.do",
            type:"post",
            data:{"assignmentID":assignmentID},
            dataType:"json",
            success:function(result){
                var isCommit = result.isok;
                if(isCommit=="01"||isCommit=="21"){
                    $(".saveAndCommit").css("display","none");
                    $(".studentSign").css("display","none");
                }
                //alert( JSON.stringify(result));
                $("#collegename").html(result.outsidegradesignagreemen.collegename);
                $("#studentname").val(result.gradesignleaveapply.studentname);
                $("#studentnum").val(result.gradesignleaveapply.studentnum);
                $("#majorclass").val(result.outgradesigninfo.majorclass);
                $("#samegroup").val(result.samegroup);
                $("#starttime").val(Format(new Date(result.starttime),'yyyy-MM-dd'));
                $("#endtime").val(Format(new Date(result.endtime),'yyyy-MM-dd'));
                $("#title").val(result.title);
                $("#request").val(result.request);
                $("#content").val(result.content);
                $("#submitfile").val(result.submitfile);
                if(result.studentsign!=null&&result.studentsign!=""){
                    $("#studentsign").attr("src",result.studentsign);
                }
                var check = result.checkassignments;
                for(var i=0;i<check.length;i++){
                    var checknum = check[i].checkpeople;
                    if(checknum=="系主任"){
                        $("#xizhuren").attr("src",check[i].teachersign);
                    }
                    if(checknum=="指导教师"){
                        $("#jiaoshi").attr("src",check[i].teachersign);
                    }
                    if(checknum=="主管院长"){
                        $("#yuanzhang").attr("src",check[i].teachersign);
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
function studentSign() {
    var assignmentID = getAddressParameter("id");
    var userId = $("#userID").val();
    layer.prompt({
        formType: 1,
        value: '',
        title: '请输入签名密码',
        //area: ['800px', '350px'] //自定义文本域宽高
    }, function (value, index, elem) {
        //alert(value);
        $.ajax({
            url:contextPath+"/assignment/studentSign.do",
            type:"post",
            data:{"userID":userId,
                "signPassword":value,
                "assignmentID":assignmentID
            },
            dataType:"json",
            success: function(result){
                var status = result.status;
                if(status==1){
                    $("#studentsign").attr("src",result.signUrl);
                    layer.close(index);
                }
                if(status==0){
                    layer.close(index);
                    layer.msg(result.signUrl);
                }
                if(status==2){
                    layer.close(index);
                    layer.msg(result.signUrl);
                }
            },
            error:function () {
                alert("签字失败");
            }
        });
    });
}
