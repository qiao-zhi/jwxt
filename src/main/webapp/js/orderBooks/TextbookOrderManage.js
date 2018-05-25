/*****************S   查询总订单信息相关操作*****************/

/**
 * 分页查找总订单信息
 */
function findTextbookOrderFY() {
    $.post(
        contextPath+'/TextbookOrder/findTextbookOrder.do',
        $("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        showTextbookOrderInfo,
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showTextbookOrderInfo(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var textbookOrders = pageInfo.list;
    console.log(textbookOrders)
    $("#textbookOrderTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = textbookOrders.length; i < length; i++) {
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = '<tr>'
            +'<td>'+'<input type="radio" name="orderIdRadio" value="'+textbookOrders[i].orderid+'">'//隐藏主键到复选按钮中
            + '</td>'
            + '<td>' + index+ '</td>'
            + '<td>' + textbookOrders[i].roomname + '</td>'//实体类属性名
            + '<td>' + textbookOrders[i].yearnum + '</td>'
            + '<td>' + (textbookOrders[i].semester==1?"第一学期":"第二学期") + '</td>'
            + '<td>' + textbookOrders[i].createperson + '</td>'
            + '<td>' + textbookOrders[i].createtime + '</td>'
            + '<td>' + (textbookOrders[i].ischeck>0?"已审核":"未审核")
            +'<input type="hidden" name="checkStatus" value="'+textbookOrders[i].ischeck+'">'
            + '</td>'
            + '<td>'
            + '<a href=javascript:void(0) title="点击查看订单详细信息" onclick="openOrderInfoLayer(this)"><i class="layui-icon">&#xe63c;</i></a>'
            + '</td></tr>'
        $("#textbookOrderTbody").append(tr);
    }

    textbookOrdersPage(total,pageNum,pageSize)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function textbookOrdersPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'demo7000000', //注意，这里的 test1 是 ID，不用加 # 号
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
                    findTextbookOrderFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/*****************E   查询总订单信息相关操作*****************/



/*****************S   审核相关操作**************************/

//审核
function checkOrder(){
    //1.做判断
    var checked_radio = $("#textbookOrderTbody").find(":radio:checked");
    if(checked_radio.length == 0){
        layer.msg("请先选择订购教材总订单"/*,{icon:2,time:2*1000,shade: [0.8, '#393D49']}*/)
        return;
    }
    if($(checked_radio).parents("tr").children("td").eq(7).children("input").val()=='1'){
        layer.msg("订单已审核，请勿重复审核")
        return;
    }
    //判断是否全部确认
    $.post(
        contextPath+'/TextbookOrderManage/isALLConfirm.do',
        {"orderid":$(checked_radio).parents("tr").children("td").eq(0).children(":radio").val()},
        function (response) {
            //alert(response[0].num)
            if(response[0].num>0){
                layer.msg("订单未全部确认，无法审核");
            }
            else{
                openCheckLayer(checked_radio);
            }
        },
         'json'
    )
    //openCheckLayer(checked_radio);
}

/**
 * 打开订单详细信息页面
 * @param obj
 */
function openCheckLayer(obj) {
    var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    var copyOrderID = tr_s.children("td").eq(0).children(":radio").val();//定位到表格中的订单ID
    x_tab_show('审核订单','./orderInfo-deanCheck.jsp?orderId='+copyOrderID);//将copyOrderID传到orderInfo-deanCheck.jsp界面，打开查看审核订单层
}


/* S            弹出层相关操作 */
/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    // w       弹出层宽度（缺省调默认值）
    // h       弹出层高度（缺省调默认值）
*/
function x_tab_show(title,url,w,h){
    if (title == null || title == '') {
        title=false;
    };
    if (url == null || url == '') {
        url="404.html";
    };
    if (w == null || w == '') {
        w=($(window).width()*0.9);
    };
    if (h == null || h == '') {
        h=($(window).height()*0.9);
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

//填充信息
function displayOrderInfo(orderid) {
    $.post(
        contextPath+'/TextbookOrderManage/displayOrderInfo.do',
        {"orderid":orderid},//$("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        function(response){
            $("#year").text(response[0].yearNum)
            $("#term").text(response[0].semester)
            $("#roomName").text(response[0].roomName)
            $("#createPerson").text(response[0].createPerson)
            $("#orderid").val(response[0].orderid)
        },
        'json'
    )
}

//审核按钮
function checkButton() {
    layui.use(['form', 'layer'], function(){
        var form = layui.form,layer = layui.layer;
        form.on('submit(check)',function (date) {
            // alert($("#orderid").val())
            // alert($("#checkProposal").val())
            // alert($("#proposalNote").val())
            $.post(
                contextPath+'/TextbookOrderManage/updateCheckProposal.do',
                $("#checkForm").serialize(),
                function(response){
                    alert("审核成功")
                    if(response=='更新成功'){
                        //审核成功之后关闭当前弹出层并且重新执行一次查询
                        window.parent.location.reload();//刷新当前窗口
                        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index); //再执行关闭
                    }
                },
                'text'
            )
        })
})
}

//查看审核信息
function checkInfo() {
    //1.做判断
    var checked_radio = $("#textbookOrderTbody").find(":radio:checked");
    if (checked_radio.length == 0) {
        layer.msg("请先选择订购教材总订单"/*,{icon:2,time:2*1000,shade: [0.8, '#393D49']}*/)
        return;
    }
    if ($(checked_radio).parents("tr").children("td").eq(7).children("input").val() == '0') {
        layer.msg("订单未审核，无法查看")
        return;
    }
    openCheckInfoLayer(checked_radio);
}

/**
 * 打开查看审核信息层
 * @param obj
 */
function openCheckInfoLayer(obj){
    var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    var copyOrderID = tr_s.children("td").eq(0).children(":radio").val();//定位到表格中的订单ID
    x_tab_show('查看审核信息','./orderInfo-viewCheckInfo.jsp?orderId='+copyOrderID);//将copyOrderID传到orderInfo-deanCheck.jsp界面，打开查看审核订单层

}

//填充信息
function displayCheckInfo(orderid) {
    $.post(
        contextPath+'/TextbookOrderManage/displayOrderInfo.do',
        {"orderid":orderid},//$("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        function(response){
            $("#year").text(response[0].yearNum)
            $("#term").text(response[0].semester)
            $("#roomName").text(response[0].roomName)
            $("#createPerson").text(response[0].createPerson)
            $("#checkProposal").val(response[0].checkProposal==0?"不同意":"同意")
            $("#proposalNote").val(response[0].proposalNote)
        },
        'json'
    )
}
/*****************E   审核相关操作**************************/


/*****************S   查看详细信息相关操作*******************/


function openOrderInfoLayer(obj) {
     var tr_s=$(obj).parents("tr");
     var copyOrderId=tr_s.children("td").eq(0).children(":radio").val();
     $("#OrderID").val(copyOrderId)

    var width=($(window).width()*0.90);
    var height=($(window).height()*0.90);
    var index = layer.open({
        title:'查看订单详细信息',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#updateModal')
    });
    //5.向页面隐藏index
    $("#hidden_update_index").val(index);
    // 关闭
    // layer.close($("#hidden_update_index").val());

    displayTextbookOrderInfoFY();
}



/**
 * 分页查找总订单信息
 */
function displayTextbookOrderInfoFY() {
    $.post(
        contextPath+'/TextbookOrderManage/displayOrderDetailInfo.do',
        $("#orderDetailInfoForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        showOrderDetailInfo,
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showOrderDetailInfo(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var textbookOrders = pageInfo.list;
    console.log(textbookOrders)
    $("#orderTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = textbookOrders.length; i < length; i++) {
        var index = (pageNum - 1) * pageSize + i + 1;
            var tr = '<tr>'
                + '<td>' + index + '</td>'
                + '<td>' + textbookOrders[i].textbookName + '</td>'
                + '<td>' + textbookOrders[i].publishingHouse + '</td>'
                + '<td>' + textbookOrders[i].author + '</td>'
                + '<td>' + textbookOrders[i].price + '</td>'
                + '<td>' + textbookOrders[i].orderDetailID + '</td>'
                + '<td>' + textbookOrders[i].course_name + '</td>'
                + '<td>' + textbookOrders[i].teacher_name + '</td>'
                + '<td>' + textbookOrders[i].class_name + '</td>'
                + '<td>' + textbookOrders[i].orderNum + '</td>'
                + '<td>' + (textbookOrders[i].isConfirm > 0 ? "已确认" : "未确认")
                + '<input type="hidden" name="confirmStatus" value="' + textbookOrders[i].isConfirm + '">'
                + '</td>'
                + '</tr>'

        $("#orderTbody").append(tr);
    }

    orderInfosPage(total,pageNum,pageSize)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function orderInfosPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'demo788855447', //注意，这里的 test1 是 ID，不用加 # 号
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
                    displayTextbookOrderInfoFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}
/*****************E   查看详细信息相关操作*******************/