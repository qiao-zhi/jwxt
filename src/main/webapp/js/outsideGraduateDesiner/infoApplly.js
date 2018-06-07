/*页面加载查询申请的详细信息*/

$(function(){
    var outsideApplyID = getAddressParameter("id");
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
                var isCommit = result.iscommit;
                if(isCommit=="01"||isCommit=="21"||isCommit=="11"){
                    $(".saveAndCommit").css("display","none");
                    $(".studentSign").css("display","none");
                }
                //alert(JSON.stringify(result));
                $("#studentname").val(result.studentname);
                $("#sex").val(result.sex);
                $("#majorclass").val(result.majorclass);
                $("#inteachername").val(result.inteachername);
                $("#receiveUnit").val(result.receiveunit);
                $("#applyreason").val(result.applyreason);
                $("#stuapplydate").val(Format(new Date(result.applydate),'yyyy-MM-dd'));
                if(result.stusignurl!=null&&result.stusignurl!=""){
                    $("#stusignurl").attr("src",result.stusignurl);
                }
                /*获取审核结果集*/
                var check = result.checkOGDInfo;
                for(var i=0;i<check.length;i++){
                    var checknum = check[i].checkpeople;
                    /*指导员教师*/
                    if(checknum=="指导教师"){
                        addOneSignInfo1(check[i],1);
                    }
                    if(checknum=="副书记"){
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

//上传签名
function studentSign() {
    var outsideApplyID = getAddressParameter("id");
    layer.prompt({
        formType: 1,
        value: '',
        title: '请输入签名密码',
        //area: ['800px', '350px'] //自定义文本域宽高
    }, function (value, index, elem) {
        //alert(value);
        $.ajax({
            url:contextPath+"/baseInfo/studentSign.do",
            type:"post",
            data:{"userID":userID,
                "signPassword":value,
                "outsideApplyID":outsideApplyID
            },
            dataType:"json",
            success: function(result){
                var status = result.status;
                if(status==1){
                    $("#stusignurl").attr("src",result.signUrl);
                    $("#stuapplydate").val(Format(new Date(),"yyyy-MM-dd"));
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
