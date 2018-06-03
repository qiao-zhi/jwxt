//获取url中的参数
function getUrlParam2() {
    var SearchUrl = location.search; //获取url中"?"符后的字串

    var url = decodeURI(SearchUrl);//解码

    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        var strs = str.split("&");
        for (var i = 0; i < strs.length; i++) {
            theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}

function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

//关闭上层页面，并刷新表格
function closePage() {
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
    window.parent.location.reload();
}

//初始化学年下拉框
function initYearNum() {
    $.ajax({
        url: contextPath + "/graduateManage/getYearNum.do",
        type: "POST",
        dataType: "json",
        async: false,
        success: function (data) {
            $("#y_yearNum").html("");

            var yearOptions = "";
            for (var i = 0; i < data.length; i++) {
                yearOptions = yearOptions + '<option value="' + data[i] + '">' + data[i] + '</option>';
            }

            if (yearOptions == "") {
                yearOptions = "<option>没有数据</option>";
            }

            $("#y_yearNum").append('<option value="">学年</option>' + yearOptions);
        }
    })
}

//初始化专业下拉框
function initMajor() {
    $.ajax({
        url: contextPath + "/graduateManage/getMajor.do",
        type: "POST",
        dataType: "json",
        async: false,
        success: function (data) {
            $("#y_major").html("");

            var yearOptions = "";
            for (var i = 0; i < data.length; i++) {
                yearOptions = yearOptions + '<option value="' + data[i].majorid + '">' + data[i].majorname + '</option>';
            }

            if (yearOptions == "") {
                yearOptions = "<option>没有数据</option>"
            }

            $("#y_major").append('<option value="">专业</option>' + yearOptions);
        }

    })
}

//初始化学院信息
function initCollege() {
    $.ajax({
        url: contextPath + "/project_AC/getCollege.do",
        type: "POST",
        dataType: "json",
        success: function (data) {
            $("#y_college").val(data);
        }

    })
}

//获取当前时间
function getCurrentTime() {
    var myDate = new Date();
    //获取当前年
    var year = myDate.getFullYear();
    //获取当前月
    var month = myDate.getMonth() + 1;
    //获取当前日
    var date = myDate.getDate();
    var h = myDate.getHours();       //获取当前小时数(0-23)
    var m = myDate.getMinutes();     //获取当前分钟数(0-59)
    var s = myDate.getSeconds();

    var now = year + '-' + p(month) + "-" + p(date) + " " + p(h) + ':' + p(m) + ":" + p(s);

    return now;
}