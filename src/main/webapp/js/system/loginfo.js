/**
 * @author: qlq
 * @time: 13:16 日志相关JS
 * @description:
 */

$(function () {
    queryLogFY();//分页查询日志信息
})



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


/*****S 分页查询相关方法**********/
/**
 * 分页查询日志信息
 */
function queryLogFY(){
    $.ajax({
        url:contextPath+"/log/getLogsFY.do",
        data:$("#queryLogForm").serialize(),
        dataType:'json',
        type:'post',
        async:true,
        success:showLogTable
    });
}

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showLogTable(pageInfo){
    // alert(JSON.stringify(pageInfo))
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var logs = pageInfo.list;
    $("#logTbody").html("");//清空表格中数据并重新填充数据
    for(var i = 0,length_1 = logs.length;i<length_1;i++){
        var index = (pageNum-1)*pageSize + (i+1);
        var tr = "<tr>";
        tr += "<td>"+index+"<input type='hidden' value='"+logs[i].operatemethod+"'><input type='hidden' value='"+logs[i].operateclass+"'></td>";
        tr += "<td>"+replaceNull(logs[i].operatorname)+"</td>";
        tr += "<td>"+Format(new Date(logs[i].operatedate),"yyyy-MM-dd hh:mm:ss")+"</td>";
        tr += "<td>"+replaceNull(logs[i].operatedescription)+"</td>";
        tr += "<td>"+replaceNull(logs[i].operateresult)+"</td>";
        tr += "<td>"+replaceNull(logs[i].operateip)+"</td>";
        tr += "<td>"+replaceNull(logs[i].operatortype)+"</td>";
        tr += "<td>"+replaceNull(logs[i].operatorid)+"</td>";
        tr += "<td>"+replaceNull(logs[i].operatorunitname)+"</td>";
        tr += "<td>"+"<a href='javascript:void(0)' title='点击查看日志详细信息' onclick='queryLogDetail(this)'><i class='layui-icon'>&#xe615;</i></a>"+"</td>";
        tr+= "</tr>";
        $("#logTbody").append(tr);//清空表格中数据并重新填充数据
    }
    //开启分页组件
    logsPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function logsPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'logPageDiv', //注意，这里的 test1 是 ID，不用加 # 号
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
                    queryLogFY();//执行查询分页函数(这个函数必须写在这里)
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
    queryLogFY();
}



/*****E 分页查询相关方法**********/


/***********S             查看日志详情相关操作***************/

/**
 * 点击查看日志详情
 * 1.填充数据
 * 2.打开模态框
 * @param obj
 */
function queryLogDetail(obj) {
    //1.填充数据
    var tr = $(obj).parent().parent();//获取其tr父元素
    $("#operatorName").val(tr.children("td:eq(1)").text());
    $("#operateDate").val(tr.children("td:eq(2)").text());
    $("#operateDescription").val(tr.children("td:eq(3)").text());
    $("#operateResult").val(tr.children("td:eq(4)").text());
    $("#operateIP").val(tr.children("td:eq(5)").text());
    $("#operatorType").val(tr.children("td:eq(6)").text());
    $("#operatorId").val(tr.children("td:eq(7)").text());
    $("#operatorUnitName").val(tr.children("td:eq(8)").text());
    $("#operateClass").val(tr.children("td:eq(0)").find("input:eq(1)").val());
    $("#operateMethod").val(tr.children("td:eq(0)").find("input:eq(0)").val());
    //2.打开模态框
    var  width=($(window).width()*0.80);
    var index = layer.open({
        title:'日志详情信息',
        area: width+'px',//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#detailModal')
    });
    //向页面隐藏index
    $("#hidden_log_detail_index").val(index);
}


/***********E             查看日志详情相关操作***************/
