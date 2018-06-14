$(function(){
    //初始化表格，判断各种表是否填写。若填写了可以下载。若没填写，不显示。
    initFIleInfo();
})

function initFIleInfo(){
    $.ajax({
        url: contextPath + '/studentGPM/initFIleInfo.do',
        type: 'POST',
        async: true,
        success: function (response) {
            var data = ajaxGetStringToJson(response);

            //if data 为空，不显示内容，提示，请选择课题
            $("#y_table").html("");//清空表格中数据并重新填充数据
            if(data == "") {
                $("#y_table").html("当前没有文件信息！");
                return false;
            }
            var tbody =
                '<tr>' +
                '<input type="hidden" id="y_id" value="'+ data.fileID +'"/>' +
                '<td>'+ data.fileName +'</td>' +
                '<td><a href="">下载</a></td>' +
                '</tr>';

            $("#y_table").append(tbody);
        }
    });
}
