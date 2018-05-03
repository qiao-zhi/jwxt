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
    } else{
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+collnum+" .advice").text(check.checkopinion);
    $("#"+collnum+" .url").attr("src",check.teachersign);
    $("#"+collnum+" .applydate").val(check.applytime);
}


function addOneSignInfo1(check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+collnum+" .agree").attr("checked","checked");
    } else{
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+collnum+" .advice").text(check.checkadvice);
    $("#"+collnum+" .url").attr("src",check.teachersign);
    $("#"+collnum+" .applydate").val(check.applytime);
}

function addOneSignInfo2(check,collnum){
    var result1 = check.result;
    if(result1==1){
        $("#"+collnum+" .agree").attr("checked","checked");
    } else{
        $("#"+collnum+" .disagree").attr("checked","checked");
    }
    $("#"+collnum+" .advice").text(check.checkopinion);
    $("#"+collnum+" .url").attr("src",check.teachersign);
    $("#"+collnum+" .applydate").val(check.applytime);
}
