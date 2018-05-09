/*查询校外申请学生信息*/
var userID = 1;   //获取当前用户ID
$(function(){
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
                "studentNum":studentNum,"checkStatus":checkStatus},
            dataType:"json",
            success:function(result){
                $("#thead-tbody").html("");
            },
            error:function(){
                layer.msg("页面加载出错！！！");
            }
        });

    });
});

/*增加一条校外文件申请*/
function appendTD(num,title,url,id,applyStatus,checkStatus,result) {

}
function seeOneStuInfo(title,url,id,obj){
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