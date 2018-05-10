/*获取当前用户校外申请ID*/
var outsideApplyID = getAddressParameter("id");
/*页面加载查询申请的详细信息*/
$(function(){
    alert(outsideApplyID);
    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        /*发送ajax请求查询*/
        $.ajax({
            url:contextPath+"/outGraduateDesiner/selectODGApplyInfo.do",
            type:"post",
            data:{"outsideApplyID":outsideApplyID},
            dataType:"json",
            success:function(result){
                //alert(JSON.stringify(result));
                $("#studentname").val(result.studentname);
                $("#sex").val(result.sex);
                $("#majorclass").val(result.majorclass);
                $("#inteachername").val(result.inteachername);
                $("#receiveUnit").val(result.receiveunit);
                $("#applyreason").val(result.applyreason);
                $("#stuapplydate").val(Format(new Date(result.applydate),'yyyy-MM-dd'));
                if(result.stusignurl!=""){
                    $("#stusignurl").attr("src",result.stusignurl);
                }
                /*获取审核结果集*/
                var check = result.checkOGDInfo;
                for(var i=0;i<check.length;i++){
                    var checknum = check[i].checkpeople;
                    /*指导员教师*/
                    if(checknum=="指导教师"){
                        loadSign(check[i],1);
                    }
                    if(checknum=="主管书记"){
                        loadSign(check[i],2);
                    }
                    if(checknum=="教研室主任"){
                        loadSign(check[i],3);
                    }
                    if(checknum=="主管院长"){
                        loadSign(check[i],4);
                    }

                }
                form.render();   //更新渲染
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

function loadSign(check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+collnum+" .agree").attr("checked","checked");
    } else{
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#Applyinfo #"+collnum+" .advice").text(check.checkadvice);
    $("#Applyinfo #"+collnum+" .url").attr("src",check.teachersign);
    $("#Applyinfo #"+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}