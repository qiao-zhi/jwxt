/**
 * @author: qlq
 * @time: 21:36
 * @description:
 */

/**
 * 自调函数
 */
/*(function () {
    alert(contextPath)
})();*/

/*********S     几个工具函数******************/
/**
 * 一个值如果是null或者''返回-
 * @param value 需要处理的值
 * @param length 需要截取的字符的长度的值,未指定的时候返回全部
 * @returns {*} 处理过的值
 */
function replaceNull(value,length) {
    //判断截取的值是否为空
    if(value == null || value == ""){
        return "-";
    }
    //判断长度是否为空
    if(length == null || length == ''){
        return value;
    }
    return value.toString().substr(0,length);
}
/*********E     几个工具函数******************/


/**
 * 页面加载完成执行一些函数
 */
$(function () {
    queryTrainSchemeFY();//分页查询课程信息
})

/*****S 分页查询相关方法**********/
function queryTrainSchemeFY(){
    $.ajax({
       url:contextPath+"/TrainScheme/getTrainSchemeFY.do",
       data:$("#queryTrainschemeForm").serialize(),
       dataType:'json',
        type:'post',
        async:true,
        success:showTrainSchemeTable
    });
}

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showTrainSchemeTable(pageInfo){
    // alert(JSON.stringify(pageInfo))
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var trainschemes = pageInfo.list;
    $("#trainSchemeTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = trainschemes.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;//序号
        //动态拼接后面的操作按钮
        var operate = "";
        operate += '<a title="点击查看课程详细信息" onclick="viewTrainschemeDetail(this)" href=javascript:void(0)><i class="layui-icon">&#xe615;</i></a>';
        if(replaceNull(trainschemes[i].remark1) == "保存"){
            operate += '<a title="点击修改培养方案信息" onclick="updateTrainscheme(this)" href=javascript:void(0)><i class="layui-icon">&#xe642;</i></a>';
        }
        operate += '<a title="点击删除培养方案" onclick="deleteTrainscheme(this)" href=javascript:void(0)><i class="layui-icon">&#xe640;</i></a>';




        var tr = "<tr><td>"+'<input type="radio" name="trainshemeRadio" value="'+trainschemes[i].trainingSchemeID+'"><input type="hidden" value="'+trainschemes[i].trainingSchemeID+'"/></td>'
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(trainschemes[i].trainingSchemaName)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorName)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorID)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorType)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorManager)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].trainYears)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].revisePerson)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].createTime,7)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].remark1)+'</td>'
            +'<td>'
            +operate
            +'</td></tr>'
        $("#trainSchemeTbody").append(tr);
    }


    //开启分页组件
    trainschemesPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function trainschemesPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageDiv', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    queryTrainSchemeFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/**
 * 点击查询放大镜的事件
 */
function queryTrainSchemeFYBtn() {
    $("[name='pageNum']").val("");//清空页号
    queryTrainSchemeFY();//分页查询课程信息
}

/**
 * 清空查询条件的按钮
 * 1.清空所有的条件，包括隐藏域的条件，2.重新查询一次
 * @param obj   将清空条件按钮自己传下来
 */
function clearQueryCondition(obj) {
    //1.清空条件
    var form = $(obj).parents("form:eq(0)");
    form.find("input").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryTrainSchemeFY();
}



/*****E 分页查询相关方法**********/


/************S        修改按钮相关操作******************/
/**
 * 修改培养方案
 * @param obj   按钮自己传下来
 */
function updateTrainscheme(obj){
    var tr = $(obj).parent().parent();//获取到tr元素
    var  value = tr.find("input:hidden").val();//获取到培养方案ID
    window.location.href=contextPath+'/pages/trainingScheme/trainingScheme-modify.jsp?trainSchemeId='+value;//带着培养方案编号跳到修改页面
}
/************E        修改按钮相关操作******************/



/************S        删除培养方案相关操作******************/
/**
 * 删除培养方案
 * @param obj   按钮自己传下来
 */
function deleteTrainscheme(obj){
    var tr = $(obj).parent().parent();//获取到tr元素
    var value = tr.find("input:hidden").val();//获取到培养方案ID
    layui.use('layer',function () {
        var layer = layui.layer;
        layer.confirm("确认删除培养方案信息?删除后不可以修复！！！",function (index) {
            //1.开始删除
            $.post(contextPath+"/TrainScheme/deleteTrainSchemeById.do",{"trainSchemeId":value},function (response) {
                layer.close(index);
                layer.msg(response,{time:2*1000},function () {
                    if("删除成功"==response){
                        queryTrainSchemeFY();//重新执行一次查询函数
                    }
                })
            },'text');
        })
    })

}
/************E        删除培养方案相关操作******************/


/************S        查看详情培养方案******************/
/**
 * 查看详情培养方案(新开一个页面查看，先去后台转一下。隐藏JSP地址)
 * @param obj   按钮自己传下来
 */
function viewTrainschemeDetail(obj){
    var tr = $(obj).parent().parent();//获取到tr元素
    var value = tr.find("input:hidden").val();//获取到培养方案ID
    window.open(contextPath+"/forward/2TrainSchemeDatail.do?trainSchemeId="+value);
}
/************E        查看详情培养方案******************/


/*************S  上传培养方案课程结构图相关操作***************/
/**
 * 打开上传培养方案模态框系那个管操作
 */
function openAddPictureModal(){

    //1.验证是否选中元素
    var layer;
    layui.use(['layer'],function () {
        layer = layui.layer;
    })
    var selectRadio = $("[name='trainshemeRadio']:checked");//获取到选中的单选框
    if(selectRadio==null || selectRadio.length==0){
        // layer.msg("请先选择培养方案然后进行上传!");
        layer.msg("请先选择培养方案然后进行上传!",  {icon: 7,shade: [0.8, '#393D49'],time:2*1000});
        return;
    }
    //2.如果选中就打开模态框
    initPictueModal();
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'编辑主要课程关系结构图',
        area: [width+'px', height +'px'],//大小
        fix: false, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#pictureModal')
    });
    //向页面隐藏index
    $("#hidden_picture_index").val(index);

}

/**
 * 初始化图片模态框的相关信息
 */
function initPictueModal(){
    $("#hidden_trainSchemeId").val($("[name='trainshemeRadio']:checked:eq(0)").val());//想隐藏的培养方案编号赋值
    $.ajax({
        url:contextPath+"/TrainPicture/getTrainpicturesByTrainSchemeId.do",
        type:'post',
        async:false,
        data:{
            "trainSchemeId":$("[name='trainshemeRadio']:checked:eq(0)").val()
        },
        dataType:'json',
        success:function (response) {
            // alert(JSON.stringify(response))
            if(response == null){
                return;
            }
            //如果长度为0，证明没有图片
            if(response.length == 0){
                $("#structurePicture").text("上传主要课程关系结构图");//按钮标题置为上传图片
                $("#promptDiv").css("display","");//显示提示语
                $("#imgDiv").css("display","none");//隐藏图片框
            }else {//否则就是存在图片
                $("#structurePicture").text("更换主要课程关系结构图");//按钮标题置为上传图片
                $("#promptDiv").css("display","none");//隐藏提示语
                $("#imgDiv").css("display","");//显示图片框
                $("#imgPreview").attr("src","/file/trainPicture/"+response[0].picturenowname);//设置图片路径
            }
        }
    });
}




layui.use(['upload','layer'],function () {
    var upload = layui.upload,layer = layui.layer;
    //普通图片上传
    var uploadInst = upload.render({
        elem: '#structurePicture',//绑定的元素
        url: contextPath+'/TrainPicture/uploadTrainPicture.do',//提交的url
        auto:true,//是否自动上传
        accept:"images",//指定允许上传的文件类型
        multiple:false,//支持多文件上传
        acceptMime:"image/*",//规定打开文件选择框时，筛选出的文件类型
/*        data:{
            trainningschemeid:  $("#hidden_trainSchemeId").val()
        },//额外携带的培养方案编号*/
        before: function(obj){
            this.data={"trainningschemeid": $("#hidden_trainSchemeId").val()}//携带额外的数据
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#imgPreview').attr('src', result); //图片链接（base64）
            });
            var index = layer.load(); //开始上传之后打开load层
            $("#hidden_tmp_index").val(index);//将load层的index隐藏到页面中
        },
        done: function(res, index, upload){ //假设code=0代表上传成功
            layer.close(layer.index); //它获取的始终是最新弹出的某个层，值是由layer内部动态递增计算的
            if(res.msg=="上传成功"){
                //提示上传成功(关闭之后将按钮的内容变为更换图片)
                layer.msg(res.msg, {icon: 1,time:2*1000},function () {
                    $("#structurePicture").text("更换主要课程关系结构图");//按钮标题置为上传图片
                    $("#promptDiv").css("display","none");//隐藏提示语
                    $("#imgDiv").css("display","");//显示图片框
                });
            }

        }
    });
})




/*************E  上传培养方案课程结构图相关操作***************/




