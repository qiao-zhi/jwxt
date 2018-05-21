/*页面加载查询申请的详细信息*/
$(function () {
    loadAttachment();
});

function loadAttachment(){
    var attachmentID = getAddressParameter("id");
    //alert(attachmentID);
    /*发送ajax请求查询*/
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
            for(var i=0;i<contents.length;i++){
                if(contents[i].contentnum != null){
                    addOneContent(contents[i].contentid,contents[i].contenturl,contents[i].contentnum);
                }
            }
            //如查询出来的数据是已经提交的，则不允许修改，隐藏所有的框
            if(iscommit==0||iscommit==null){
                $("#types").removeAttr("readonly");
                $(".hidden1").css("display","");
                $("#input_div").css("display","");
                $("#promt_p").css("display","none");
                $(".layui-btn").css("display","");
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

/*删除一条附件信息*/
function deleteImg(obj){
    //删除页面信息
    var contentID = obj.parent().parent('dd').data('contentID');
    //alert(contentID);
    $.ajax({
        url:contextPath+"/oGDAttachment/deleteOGDAttachmentContent.do",
        type:"post",
        data:{"contentID":contentID},
        dataType:"text",
        success:function (result) {
            obj.parent().parent('dd').remove();
        },
        error:function(){
            alert("删除失败！！！")
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);
        }
    });

}


/*增加一条附件信息（图片）*/
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
