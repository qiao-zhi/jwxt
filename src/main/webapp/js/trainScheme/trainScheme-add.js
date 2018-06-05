/**
 * @author: qlq
 * @time: 9:31
 * @description:    添加培养方案的JS
 */

/**
 * 一次性自调函数初始化两个全局变量
 */
var layer;
(function () {
    /*alert(window.location.href)
    alert(window.location.)
    window.location.href = contextPath+"/pages/trainingScheme/trainingScheme.jsp";*/
    layui.use(['layer','form'],function () {
        layer=layui.layer;
    })
})();



/**
 * 页面加载完成后执行一些函数
 */
$(function () {

    // layer.msg("消息框")
    getMajorNameAndCode();//查询所有的专业名称和专业代码
});


/***********S              layui相关方法  *******************/
layui.use(['form','layer'], function () {
    var form = layui.form;//获取form模块

    /**
     * 专业名称下拉列表的监听事件
     */
    form.on('select(majornameSelect)', function (data) {
        var value = data.value;//获取被选中的值
        $.post(contextPath + "/TrainScheme/getMajorInfo.do", {"majorCode": value}, function (response) {
            // alert(JSON.stringify(response))
            $("#majorid").val(response.majorNum);//专业代码赋值
            $("[name='majorname']").val(response.majorName);//想隐藏的专业名称赋值
            $("#add_majormanager").val(response.majorManager);//专业负责人
            $("#majortype option").removeAttr("selected");//清空下拉列表的选中项
            $("#majortype option[value='" + response.majorSort + "']").attr("selected", "selected");//学科门类
            form.render('select');//重新渲染页面
        }, 'json');
    });


    /**
     * 提交按钮的提交事件
     */
    form.on('submit(submitTrainschemeForm)', function(data){
        //1.初始化表单
        initCapacity();

        //2.判断是否填写表单能力,如果验证未通过提示填写能力信息
        if(!validateCapacity()){
            layer.alert("请完成培养方案能力信息!")
            return false;
        }

        //3.询问是否确定提交表单
       /* if(!confirm("确认提交?提交后不可以更改!!!")){
            return false;
        }*/

       layer.confirm("确认提交?提交之后不能更改!!!",function (index) {
           //4.验证通过的话就提交表单，并将隐藏的状态置为已经提交
           $("[name='remark1']").val("提交");//将隐藏的状态设为提交
           $.post(contextPath+"/TrainScheme/addTrainScheme.do",
               $("#addTrainSchemeForm").serialize(),
               function (response) {
                    layer.close(index);//关闭当前询问窗口
                   layer.msg(response,{time:2000},function () {
                       //关闭当前tab
                       if("添加成功"==response)
                           closeNowPage();
                   })
               },
               'text')

       })

    });








})
/***********E              layui相关方法  *******************/


/**********S 添加培养方案相关JS  *****************/

/**
 * 查询所有的专业名称和专业代码
 */
function getMajorNameAndCode() {
    $.post(contextPath + "/TrainScheme/getMajorNameAndCode.do", {}, function (response) {
        if (response == null || response.length == 0) {
            return;
        }
        //动态拼接
        for (var i = 0, length_1 = response.length; i < length_1; i++) {
            $("#majorname").append("<option value='" + response[i].majorId + "'>" + response[i].majorName + "</option>");
        }
        //使用form组件重新渲染页面
        layui.use('form',function () {
            var form = layui.form;
            form.render('select');
        })
    }, 'json')

}




/**
 * 增加一行到培养方案能力表格中
 */
function addTr() {
    // layer.alert("添加一行到表格")
//    1.先获取到表格下面的所有数据的行数判断Gindex
    var tr_length = $("#graduateCapacityTbody").children("tr").length;
    var tr = "";
    var Gindex = "G"+(parseInt(tr_length)+1);//增加的索引，根据当前行数决定

    tr +="<tr><td>"+Gindex+"</td><td><input type='text' class='capacityInput'></td><td><a class='layui-icon' title='点击删除当前行数据' onclick='deleteTr(this)'>&#xe640;</a></td>";
    $("#graduateCapacityTbody").append(tr);

}

/**
 * 删除培养方案能力表格当前行
 * @param obj   将删除按钮自己传下来，删除其父元素tr
 */
function deleteTr(obj) {
    //1.删除此行
    var tr = $(obj).parent().parent();
    tr.remove();//删除当前行
    //2.重新设置Gindex
    var tbody = $("#graduateCapacityTbody");//获取到tbody元素
    tbody.children("tr").each(function (index) {//参数i表示index，索引
        var td_first = $(this).children("td:eq(0)");
        td_first.text("G"+(parseInt(index)+1));
    })


}


/**
 * 保存培养方案信息
 */
function saveTrainschemeInfo(){
    var index = layer.confirm("确认保存信息",function (index) {
        //1.将培养方案能力数据隐藏到表单中
        initCapacity();//将能力数据添加到表单中
        //2.post提交数据
        $.post(contextPath+"/TrainScheme/addTrainScheme.do",
                $("#addTrainSchemeForm").serialize(),
                function (response) {
                    layer.close(index)//关闭当前询问窗口
                    //弹出返回信息
                    layer.msg(response,{time:2*1000},function () {
                        if("添加成功"==response){
                            //关闭当前tab
                            closeNowPage();
                        }
                    })
                },
                'text')

    })
}

/**
 * 将表格中数据添加到表单中
 */
function initCapacity() {
    $("#hidden_capacity_div").html("");//清空表单
    var tbody = $("#graduateCapacityTbody");//获取到tbody
    //遍历下面的每一行
    tbody.children("tr").each(function (index) {
        //1.获取表格中的数据
        var capacitySort = $(this).children("td:eq(0)").text();
        var capacityDescription = $(this).children("td:eq(1)").find("input").val();
        //2.添加表格中的数据到表单中
        var capacitySort_input = "<input type='hidden' name='trainningcapacitybaseinfos["+index+"].capacitysort' value='"+capacitySort+"'/>";
        var capacitydescription_input = "<input type='hidden' name='trainningcapacitybaseinfos["+index+"].capacitydescription' value='"+capacityDescription+"'/>";
        $("#hidden_capacity_div").append(capacitySort_input);
        $("#hidden_capacity_div").append(capacitydescription_input);
    })
}

/**
 * 验证培养方案能力是否已经填写
 */
function validateCapacity(){
    var tbody = $("#graduateCapacityTbody");//获取到tbody
    var length_1 = tbody.children("tr").length;
    //判断是否有数据
    if(length_1 == 0){
        return false;
    }
    var validateInput = true;
    tbody.find("input").each(function (index) {
        if($(this).val()=="" || $.trim($(this).val())==""){
            validateInput =  false;//将验证结果置为false
            return ;
        }
    })
    //如果走到这里返回true即可
    return validateInput;
}



/**********E 添加培养方案相关JS  *****************/




/* S            弹出层相关操作 */
/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    w       弹出层宽度（缺省调默认值）
    h       弹出层高度（缺省调默认值）
*/
function course_tab_show(title,url,w,h){
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
        content: url
    });
}
/* E            弹出层相关操作 */


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




