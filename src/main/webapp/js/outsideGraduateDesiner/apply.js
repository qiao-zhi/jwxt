/*页面加载查询学生校外毕设信息得提交情况*/
$(function(){
    loadFile();
});

function loadFile(){
    var userID = 1;   //获取当前学生用户ID
    layui.use(['layer','form'], function(){
        var layer = layui.layer;
        var form = layui.form;
        var index1 = layer.load();
        $.ajax({
            url:contextPath+"/outGraduateDesiner/loadApplyFile.do",
            type:"post",
            data:{"userID":userID},
            dataType:"json",
            success:function (result) {
                var success = result.success;
                if(success==true){
                    $(".thead-tbody").html("");
                    //查询成功，显示结果v
                    var data = result.data;
                    appendTD('1',data.table1Name,'basicInfoApply.jsp',data.table1ID,data.table1Commit,data.table1Result.status1,data.table1Result.result1);
                    appendTD('2',data.table2Name,'outGraduatePractice.jsp',data.table2ID,data.table2Commit,data.table2Result.status1,data.table2Result.result1);
                    appendTD('3',data.table3Name,'leaveApply.jsp',data.table3ID,data.table3Commit,data.table3Result.status1,data.table3Result.result1);
                    appendTD('4',data.table7Name,'graduateStudentManage-addAssignment.jsp',data.table7ID,data.table7Commit,data.table7Result.status1,data.table7Result.result1);
                    appendTD('5',data.table4Name,'selfManageAgreement.jsp',data.table4ID,data.table4Commit,data.table4Result.status1,data.table4Result.result1);
                    appendTD('6',data.table5Name,'guarantee.jsp',data.table5ID,data.table5Commit);
                    appendTD('7',data.table6Name,'accessory.jsp',data.table6ID,data.table6Commit);
                    form.render('select');   //更新渲染
                }
                else {
                    layer.alert('没有毕设分配结果，无法申请',
                        function(index){
                            closeNowPage();
                            layer.close(index);
                        });
                }

            },
            error:function () {
                layer.msg("本次请求失败");
            }
        });
        //关闭家在弹出框
        layer.close(index1);
    });
}

/*增加一条校外文件申请*/
function appendTD(num,title,url,id,applyStatus,checkStatus,result) {
    if(num==null||num=="null"){num="——";}
    if(title==null||title=="null"){title="——";}
    if(id==null||id=="null"){id="——";}
    if(applyStatus==null||applyStatus=="null"){applyStatus="——";}
    if(checkStatus==null||checkStatus=="null"){checkStatus="——";}
    if(result==null||result=="null"){result="——";}
    var str = '';
    str += '<tr><td>';
    str += '<div class="layui-unselect layui-form-checkbox" onclick="checkfile(this);" lay-skin="primary" ';
    str += "data-id='2'><i class=";
    str += '"layui-icon">&#xe605;</i></div>';
    str += '</td><td>'+num+'</td>';
    str += '<td title="点击填写" onclick="clickOne';
    str += "('"+title+"','"+url+"','"+id+"',this);";
    str += '">'+title+'</td>';
    str += "<td>"+applyStatus+"</td><td>"+checkStatus+"</td><td>"+result+"</td>";
    str += "</tr>";
    var $tr = $(str);
    $tr.data("id",id);
    $(".thead-tbody").append($tr);
}
function clickOne(title,url,id,obj){
    //向地址中传入要传递得参数
    var newurl = "./"+url+"?id="+id;
    x_admin_show1(title,newurl,'','',id);
}
function x_admin_show1(title,url,w,h,dataID){
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
function checkfile(obj){
    if($(obj).hasClass("layui-form-checked")){
        $(obj).removeClass("layui-form-checked");
    }
    else {
        $(obj).addClass("layui-form-checked");
    }
}
