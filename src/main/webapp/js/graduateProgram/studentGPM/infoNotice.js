$(function () {
    $("tbody").html("");

    //1、课题选择通知。
    var url1 = 'getProjectChooseState';
    if(getNotice(url1)) {

        //2、任务书签字通知
        var url2 = 'getTaskbookSignState';
        if (getNotice(url2)) {

            //3、判断是否填写计划进程表
            var url3 = 'getProgramTableState';
            if (getNotice(url3)) {

                //4、中期检查提示
                var url4 = 'getMiddleCheckState';
                if (getNotice(url4)) {

                    //5、毕业答辩提示
                    var url5 = 'getGraduateCheckState';
                    getNotice(url5);
                }
            }
        }

    }


    //6、论文上传提示


});

function getNotice(geturl) {
    var url = contextPath + '/studentGPM/' + geturl + '.do';

    $.ajax({
        url:url,
        type: 'POST',
        // dataType: 'json',
        async: true,
        success: function (data) {
            if (data == "") {
                return true;
            } else {
                $("tbody").append("<tr><td>" + data + "</td></tr>");
                return false;
            }
        }
    });
}

