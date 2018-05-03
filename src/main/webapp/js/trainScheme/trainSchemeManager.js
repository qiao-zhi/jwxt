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
 * @returns {*} 处理过的值
 */
function replaceNull(value) {
    if(value == null || value == ""){
        return "-";
    }
    return value;
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
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr><td>"+'<input type="radio" name="trainshemeRadio" value="'+trainschemes[i].trainingSchemeID+'"><input type="hidden" value="'+trainschemes[i].trainingSchemeID+'"/></td>'
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(trainschemes[i].trainingSchemaName)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorName)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorID)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorType)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].majorManager)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].trainYears)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].revisePerson)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].createTime)+'</td>'
            +'<td>'+replaceNull(trainschemes[i].remark1)+'</td>'
            +'<td>'
            +'<a title="点击查看课程详细信息" onclick="openDetailLayer(this)" href=javascript:void(0)><i class="layui-icon">&#xe615;</i></a>'
            +'<a href=javascript:void(0) title="点击修改课程基本信息" onclick="openUpdateLayer(this)"><i class="layui-icon">&#xe642;</i></a>'
            +'<a href=javascript:void(0) title="点击删除课程" onclick="deleteCourseByCourseId(this)"><i class="layui-icon">&#xe640;</i></a>'
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
    var form = $(obj).parents("form");
    form.find("input").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryTrainSchemeFY();
}



/*****E 分页查询相关方法**********/


