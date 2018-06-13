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
        async: false,
        success: function (response) {
            var data = ajaxGetStringToJson(response);

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
        async: false,
        success: function (response) {

            var data = ajaxGetStringToJson(response);

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
        dataType:"text",
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

    if(month < 10) {
        month = "0" + month;
    }
    if(date < 10) {
        date = "0" + date;
    }

    return year + '-' + month + "-" + date;
}

/**
 * 解决SpringMVC返回null，ajax用json接收数据，success接收不到的问题
 * 要求：注释dataType 属性
 * @param response  controller 返回数据
 * @returns {string} 转化后的json对象
 */
function ajaxGetStringToJson(response) {
    var data = "";
    if (!response == "") {
        data = eval("(" + response + ")");
    }
    return data;
}

//判断是否为空，为空显示横岗：--，否则显示传入的数据
function checkNull(value){
    if(value==null || value==''){
        return '--';
    }else{
        return value;
    }
}
//判断是否为空，为空返回 0
function checkNullRetrueZore(value){
    if(value==null || value==''){
        return '0';
    }else{
        return value;
    }
}


//判断用户权限的（普通教师返回0，教研室，返回1，院长返回2）
function getAuthority(){
    var authority = "0";
    $.ajax({
        url: contextPath + "/project_AC/getAuthority.do",
        type: "POST",
        dataType:"text",
        async : false,
        success: function (data) {
            authority = data;
        }
    });

    return authority;
}

/**
 * 复选框，全选，返回。header触发事件
 */
function checkHeader(obj) {

    var y_check = $("tbody").find(".y_check");

    if ($(obj).prop("checked") == true){
        y_check.each(function(){
            $(this).prop("checked", true);
        });
    } else {
        y_check.each(function() {
            $(this).prop("checked", false);
        });
    }
}

//后台传过来的字符串。转化为日期格式
function getLocalTime(jsondate) {
    if (jsondate == null || jsondate == "") {
        return "";
    }

    var date = new Date(parseInt(jsondate, 10));
    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    return date.getFullYear() + "-" + month + "-" + currentDate;
}