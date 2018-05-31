/*时间*/
layui.use('laydate', function () {
    var laydate = layui.laydate;
    laydate.render({
        elem: '#L_pass' //指定元素
        ,format: 'yyyy年MM月dd日'
    });
});


/**
 * 页面加载完成后执行一些函数
 */
$(function () {
    //初始化时间为当前时间
    var myDate = new Date;
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth()+1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;

    $("#L_pass").val(year + "年" + month + "月" + date + "日");

    initData();//初始化部分数据
});

/***********S              layui相关方法  *******************/
layui.use(['form','layer'], function () {
    var form = layui.form;//获取form模块

    /**
     * 提交按钮的提交事件
     */
    form.on('submit(y_sumit)', function(data){
        //1.询问是否确定提交表单
        layer.confirm("确认提交?提交之后不能更改!!!",function (index) {
            //4.验证通过的话就提交表单，并将隐藏的状态置为已经提交
            $("[name='remark1']").val("提交");//将隐藏的状态设为提交
            $.post(contextPath+"/project_AC/projectManage.do",
                $("#y_from").serialize(),
                function (response) {
                    layer.close(index);//关闭当前询问窗口
                    layer.msg(response,{time:2000},function () {
                        //关闭当前tab
                        if("审核成功"==response)
                            closeNowPage();
                    })
                },'text')
        })
    });
})
/***********E              layui相关方法  *******************/

/**********S 添加培养方案相关JS  *****************/

/**
 * 查询所有的专业名称和专业代码
 */
function initData() {
    //初始化教师信息：teacherID，teacherName，职称positionalTitle，学位degree
    // 学院collegeName
    var teacherTitleID = ""
    $.ajax({
        url : contextPath+'/project_AC/getAddInfo.do',
        data: teacherTitleID,
        type : 'POST',
        dataType : 'json',
        async:true,
        success : function(){

        }
    });
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
