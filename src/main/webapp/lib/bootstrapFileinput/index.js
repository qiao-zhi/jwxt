/**
 * Created by liqiang on 2018/2/4.
 */
/**
 * 页面初始化函数
 */
$(function () {
    //ajax上传单文件函数
    $("#ajaxUploadOneFileBtn").click(function(){
        ajaxUploadOneFile();
    });
    //ajax上传多文件函数
    $("#ajaxUploadMultipeleFileBtn").click(function(){
        ajaxUploadMultipleFile();
    });

});

/**
 * 没有使用插件
 */
/****************S  ajax上传单文件 *******************************************/
function ajaxUploadOneFile() {
    var formData = new FormData($( "#ajaxUpOneForm" )[0]);
    $.ajax({
        url: 'http://localhost/bootstrapFileUpload/upLoadOne.action' ,
        type: 'POST',
        data: formData,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success: function (returndata) {
            alert(returndata);
        },
        error: function (returndata) {
            alert(returndata);
        }
    });
}
/****************E  ajax异步上传单文件 *******************************************/

/****************S  ajax上传多文件 *******************************************/
function  ajaxUploadMultipleFile() {
    var formData = new FormData($( "#ajaxUpMultipleForm" )[0]);
    $.ajax({
        url: 'http://localhost/bootstrapFileUpload/upLoadMultiple.action' ,
        type: 'POST',
        data: formData,
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success: function (returndata) {
            alert(returndata);
        },
        error: function (returndata) {
            alert(returndata);
        }
    });
}
/****************E  ajax上传多文件 *******************************************/


/**
 * 开始使用插件
 */


