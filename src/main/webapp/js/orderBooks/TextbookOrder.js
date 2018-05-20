
/*****************S   查询总订单相关操作*****************/

//判断是否接受新任务
function openNewTaskDialog() {
    $.post(
        contextPath + '/TextbookOrder/findNewOrderTask.do',
        {},//$('#arrageCourseDetailInfoForm').serialize(),//将jsp文件中的id为arrageCourseDetailInfoForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台
        function (response) {
            if(response.length>0){
                    layer.open({
                        title: '教材订购新任务提示信息',
                        content: '有新的教材订购任务！确定接收？',
                        btn: ['确定', '取消'],
                        yes: function () {//确定按钮的事件
                            //post请求
                            $.post(
                                contextPath + '/TextbookOrder/generateOrderDetail.do',
                                {},
                                layer.msg("接收成功!", {time: 0.5 * 1000}, function () {
                                    //初始化订单明细表字段isOrder和isConfirm为0（未订购）
                                    initIsOrderAndIsConfirm();
                                    //初始化表格
                                    findTextbookOrderFY();
                                    for(var i=0;i<response.length;i++){
                                        updateNewOrderTasktoOld(response[i].orderid);
                                    }
                                }),
                                'json'
                            )
                        }
                    });
                }
                else{
                //初始化表格
                findTextbookOrderFY();
                }
        },
        'json'
    )
}

//初始化订单明细表字段isOrder和isConfirm为0（未订购）
function initIsOrderAndIsConfirm(){
    $.post(
        contextPath+'/TextbookOrder/initIsOrderAndIsConfirm.do',
        //{"orderid":orderID},//orderid是后台Controller形参，orderID是值//$("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        //此处回调函数为空
        'json'
    )
}



//把新任务改成旧任务
function updateNewOrderTasktoOld(orderID) {

    $.post(
        contextPath+'/TextbookOrder/updateNewOrderTasktoOld.do',
        {"orderid":orderID},//orderid是后台Controller形参，orderID是值//$("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        //此处回调函数为空
        'json'
    )
}



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
        // var index = (pageNum - 1) * pageSize + i + 1;
        var tr = '<tr>'
            // + '<td>' + index
            +'<td>'+'<input type="checkbox" name="orderIdCheckbox" value="'+textbookOrders[i].orderid+'">'//隐藏主键到复选按钮中
            + '</td>'
            + '<td>' + textbookOrders[i].roomname + '</td>'//实体类属性名
            + '<td>' + textbookOrders[i].yearnum + '</td>'
            + '<td>' + (textbookOrders[i].semester==1?"第一学期":"第二学期") + '</td>'
            + '<td>' + textbookOrders[i].createperson + '</td>'
            + '<td>' + textbookOrders[i].createtime + '</td>'
            + '<td>' + (textbookOrders[i].isorder>0?"已订购":"未订购") + '</td>'
            + '<td>'
            + '<a href=javascript:void(0) title="点击查看排课详细信息" onclick="openArrageCourseLayer(this)"><i class="layui-icon">&#xe63c;</i></a>'
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
            elem: 'textbookOrder', //注意，这里的 test1 是 ID，不用加 # 号
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


/*****************E   查询总订单相关操作*****************/


/*****************S   查看排课详细信息相关操作*****************/


/**
 * 打开排课详细信息页面
 * @param obj
 */
function openArrageCourseLayer(obj) {
    var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    var copyOrderID = tr_s.children("td").eq(0).children(":checkbox").val();//定位到表格中的订单ID
    //alert(copyOrderID)
    arrageCourseDetailInfo_tab_show('查看排课详细信息','./orderTextbook-info.jsp?orderID='+copyOrderID);//将copyOrderID传到orderTextbook-info.jsp界面，打开查看排课详细信息层
}


/**
 * 分页查找排课详细信息
 */
function findArrageCourseDetailInfoFY() {
    $.post(
        contextPath+'/TextbookOrder/findArrageCourseDetailInfo.do',
        $('#arrageCourseDetailInfoForm').serialize(),//将jsp文件中的id为arrageCourseDetailInfoForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台
        showArrageCourseDetailInfo,
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showArrageCourseDetailInfo(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var arrageCourseDetailInfo = pageInfo.list;
    console.log(arrageCourseDetailInfo)
    $("#ArrageCourseDetailInfoTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = arrageCourseDetailInfo.length; i < length; i++) {
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = '<tr>'
            + '<td>' + index
            +"<input type='hidden' name='orderDetailId' value='"+arrageCourseDetailInfo[i].arrange_course_id+"'>"//隐藏主键到序号中
            +'</td>'
            + '<td>' + replaceNull(arrageCourseDetailInfo[i].course_name)+ '</td>'//数据库属性名
            + '<td>' + replaceNull(arrageCourseDetailInfo[i].course_code) + '</td>'
            + '<td>' + replaceNull(arrageCourseDetailInfo[i].teacher_name)+ '</td>'
            + '<td>' + replaceNull(arrageCourseDetailInfo[i].teacher_number)+ '</td>'
            + '<td>' + replaceNull(arrageCourseDetailInfo[i].class_name)+ '</td>'
            + '<td>' + replaceNull(arrageCourseDetailInfo[i].major_students_number)+ '</td>'
            + '<td>'
            + '<a href=javascript:void(0) title="点击查看订单详细信息" onclick="openOrderDetailInfoLayer()"><i class="layui-icon">&#xe63c;</i></a>'
            + '</td></tr>'
        $("#ArrageCourseDetailInfoTbody").append(tr);
    }

    ArrageCourseDetailInfoPage(total,pageNum,pageSize)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function ArrageCourseDetailInfoPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'arrageCourseDetailInfo', //注意，这里的 test1 是 ID，不用加 # 号
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
                    findArrageCourseDetailInfoFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/* S            在排课详细信息页面查询相关操作 **********/


/**
 * 分页查找排课详细信息
 */
function findOperationInArrgeCoursePageFY() {
    $.post(
        contextPath+'/TextbookOrder/findOperationInArrgeCoursePage.do',
        $('#arrageCourseDetailInfoForm').serialize(),//将jsp文件中的id为arrageCourseDetailInfoForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台
        showFindOperationInArrgeCoursePage,
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showFindOperationInArrgeCoursePage(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var findOperationInArrgeCoursePage = pageInfo.list;
    console.log(findOperationInArrgeCoursePage)
    $("#ArrageCourseDetailInfoTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = findOperationInArrgeCoursePage.length; i < length; i++) {
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = '<tr>'
            + '<td>' + index
            +"<input type='hidden' name='orderDetailId' value='"+findOperationInArrgeCoursePage[i].arrange_course_id+"'>"//隐藏主键到序号中
            +'</td>'
            + '<td>' + replaceNull(findOperationInArrgeCoursePage[i].course_name)+ '</td>'//数据库属性名
            + '<td>' + replaceNull(findOperationInArrgeCoursePage[i].course_code) + '</td>'
            + '<td>' + replaceNull(findOperationInArrgeCoursePage[i].teacher_name)+ '</td>'
            + '<td>' + replaceNull(findOperationInArrgeCoursePage[i].teacher_number)+ '</td>'
            + '<td>' + replaceNull(findOperationInArrgeCoursePage[i].class_name)+ '</td>'
            + '<td>' + replaceNull(findOperationInArrgeCoursePage[i].major_students_number)+ '</td>'
            + '<td>'
            + '<a href=javascript:void(0) title="点击查看订单详细信息" onclick="openOrderDetailInfoLayer()"><i class="layui-icon">&#xe63c;</i></a>'
            + '</td></tr>'
        $("#ArrageCourseDetailInfoTbody").append(tr);
    }

    FindOperationInArrgeCoursePage(total,pageNum,pageSize)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function FindOperationInArrgeCoursePage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'arrageCourseDetailInfo', //注意，这里的 test1 是 ID，不用加 # 号
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
                    findOperationInArrgeCoursePageFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}
/* E            在排课详细信息页面查询相关操作 **********/



/* S            弹出层相关操作 */
/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    // w       弹出层宽度（缺省调默认值）
    // h       弹出层高度（缺省调默认值）
*/
function arrageCourseDetailInfo_tab_show(title,url,w,h){
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


/*****************E   查看排课详细信息相关操作*****************/


/*****************S   查看订单详细信息相关操作*****************/


/**
 * 打开排课详细信息页面
 * @param obj
 */
function openOrderDetailInfoLayer() {
    // var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    // var copyOrderID = tr_s.children("td").eq(0).children(":checkbox").val();//定位到表格中的订单ID
    //alert(copyOrderID)
    orderDetailInfo_tab_show('查看订单详细信息','./orderTextbook-orderInfo.jsp');//将copyOrderID传到orderTextbook-info.jsp界面，打开查看排课详细信息层
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
function orderDetailInfo_tab_show(title,url,w,h){
    if (title == null || title == '') {
        title=false;
    };
    if (url == null || url == '') {
        url="404.html";
    };
    if (w == null || w == '') {
        w=($(window).width()*1);
    };
    if (h == null || h == '') {
        h=($(window).height());
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

/*****************E   查看订单详细信息相关操作*****************/
