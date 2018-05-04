/*页面加载查询申请的详细信息*/
$(function(){
    var outsideApplyID = getAddressParameter("id");
    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        /*发送ajax请求查询*/
        $.ajax({
            url:"/jwxt/outGraduateDesiner/selectODGApplyInfo.do",
            type:"post",
            data:{"outsideApplyID":outsideApplyID},
            dataType:"json",
            success:function(result){
                //alert(JSON.stringify(result));
                $("#studentname").val(result.studentname);
                $("#sex").val(result.sex);
                $("#majorclass").val(result.majorclass);
                $("#inteachername").val(result.inteachername);
                $("#receiveunit").val(result.receiveunit);
                $("#applyreason").val(result.applyreason);
                $("#stuapplydate").val(result.applydate);
                $("#stusignurl").attr("src",result.stusignurl);
                /*获取审核结果集*/
                var check = result.checkOGDInfo;
                for(var i=0;i<check.length;i++){
                    var checknum = check[i].checkpeople;
                    /*指导员教师*/
                    if(checknum=="指导教师"){
                        addOneSignInfo1(check[i],1);
                    }
                    if(checknum=="主管书记"){
                        addOneSignInfo1(check[i],2);
                    }
                    if(checknum=="教研室主任"){
                        addOneSignInfo1(check[i],3);
                    }
                    if(checknum=="主管院长"){
                        addOneSignInfo1(check[i],4);
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
