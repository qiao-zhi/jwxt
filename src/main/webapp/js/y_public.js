//获取url中的参数
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}

//关闭上层页面
function closePage(){
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
}

//初始化学年下拉框
function initYearNum() {
    $.ajax({
        url: contextPath + "graduateManage/getYearNum.do",
        type:"POST",
        dataType:"json",
        success :function (data) {
            $("#y_yearNum").html("");

            var yearOptions = "";
            for (var i = 0; i < data.length; i ++) {
                yearOptions = yearOptions + '<option value="' + data[i].yearNum + '">' + data[i].year + '</option>';
            }

            $("#y_yearNum").append('<option value="">学年</option>'+ yearOptions);
        }

    })
}