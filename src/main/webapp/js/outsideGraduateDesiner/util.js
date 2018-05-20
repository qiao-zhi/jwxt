/* 输入参数的名称，获取地址中得参数得值*/
function getAddressParameter(name) {
    var url = window.location.href;
    var p = -1;
    var value = undefined;
    if (((p = Math.max(url.indexOf("&" + name + "="), url.indexOf("?" + name
            + "="))) > -1)) {
        value = url.substring(p + name.length + 2);
        if (value.indexOf("&") > -1) {
            value = value.substring(0, value.indexOf("&"));
        } else if (value.indexOf("#") > -1) {
            value = value.substring(0, value.indexOf("#"));
        }
    }
    return value;
}

function addOneSignInfo(check,collnum){
    var result1 = check.checkresult;
    if(result1==1){
        $("#"+collnum+" .agree").attr("checked","checked");
    } else if(result1==0){
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+collnum+" .advice").text(check.checkopinion);
    $("#"+collnum+" .url").attr("src",check.teachersign);
    $("#"+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}


function addOneSignInfo1(check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+collnum+" .agree").attr("checked","checked");
    } else if(result1==0){
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+collnum+" .advice").text(check.checkadvice);
    $("#"+collnum+" .url").attr("src",check.teachersign);
    $("#"+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}

function addOneSignInfo2(check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+collnum+" .agree").attr("checked","checked");
    } else if(result1==0){
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+collnum+" .advice").text(check.checkopinion);
    $("#"+collnum+" .url").attr("src",check.teachersign);
    $("#"+collnum+" .applydate").val(Format(new Date(check.applytime),'yyyy-MM-dd'));
}

/**
 * 关闭当前页的函数
 */
function closeNowPage() {
    var closeTable = $(".layui-tab-title", parent.document).children("li");
    closeTable.each(function () {
        if ($(this).attr("class") == "layui-this") {
            $(this).children("i").trigger("click");//触发其点击事件(关闭当前tab)--trigger用于触发一个元素的指定事件
        }
    })
}