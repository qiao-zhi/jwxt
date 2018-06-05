$(function () {
    // alert($(".courseName").length)
})
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
            +'<td>'+'<input type="radio" name="orderIdRadio" value="'+textbookOrders[i].orderid+'">'//隐藏主键到复选按钮中
            + '</td>'
            + '<td>' + textbookOrders[i].roomname + '</td>'//实体类属性名
            + '<td>' + textbookOrders[i].yearnum + '</td>'
            + '<td>' + (textbookOrders[i].semester==1?"第一学期":"第二学期") + '</td>'
            + '<td>' + textbookOrders[i].createperson + '</td>'
            + '<td>' + textbookOrders[i].createtime + '</td>'
            + '<td>' + (textbookOrders[i].isorder>0?"已订购":"未订购")
            +'<input type="hidden" name="orderStatus" value="'+textbookOrders[i].isorder+'">'
            + '</td>'
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


/**
 * 改变总订单的订购状态
 * @param orderid
 */
function updateOrderStatus(orderid) {

    $.post(
        contextPath+'/TextbookOrder/updateOrderStatus.do',
        {"orderid":orderid},
        function () {},
        'json'
    )
}


/*****************E   查询总订单相关操作*****************/


/*****************S   查看排课详细信息相关操作*****************/


/**
 * 打开排课详细信息页面
 * @param obj
 */
function openArrageCourseLayer(obj) {
    var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    var copyOrderID = tr_s.children("td").eq(0).children(":radio").val();//定位到表格中的订单ID
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
            + '<a href=javascript:void(0) title="点击查看订单详细信息" onclick="openOrderDetailInfoLayer(this)"><i class="layui-icon">&#xe63c;</i></a>'
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
            + '<a href=javascript:void(0) title="点击查看订单详细信息" onclick="openOrderDetailInfoLayer(this)"><i class="layui-icon">&#xe63c;</i></a>'
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
 * 打开订单详细信息页面
 * @param obj
 */
function openOrderDetailInfoLayer(obj) {
    var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    var copyOrderDetailID = tr_s.children("td").eq(0).children("input").val();//定位到表格中的订单详细ID
    orderDetailInfo_tab_show('查看订单详细信息','./orderTextbook-orderInfo.jsp?orderDetailId='+copyOrderDetailID);//将copyOrderDetailID传到orderTextbook-orderInfo.jsp界面，打开查看订单详细信息层
    //findOrderDetailInfo(copyOrderDetailID);不能放在这，执行顺序不对，放在对应界面
}


//按照主键查找订单详细信息
function findOrderDetailInfo(orderDetailId){
    $.post(contextPath+'/TextbookOrder/findOrderDetailInfo.do',{"orderDetailId":orderDetailId},function (response) {
        // $("[name='coursename'] option[value='"+textbookInfoBack.courseid+"']").attr("selected","true");//写死的下拉列表才使用这个，动态查询的下拉列表使用见75行selected
        $("[name='courseName']").text(response[0].course_name);//response[0]因为后台Controller返回类型为List,如果是Map,则直接response.course_name
        $("[name='courseCode']").text(response[0].course_code);
        $("[name='teacherName']").text(response[0].teacher_name);
        $("[name='teacherCode']").text(response[0].teacher_number);
        $("[name='className']").text(response[0].class_name);
        $("[name='personNum']").text(response[0].major_students_number);
        $("[name='total']").text(response[0].orderNum);
        $("[name='isOrder']").text(response[0].isOrder>0?"已订购":"未订购");
        $("[name='isConfirm']").text(response[0].isConfirm>0?"已确认":"未确认");
        if(response[0].textbookID!=null&&response[0].textbookID!=''){
            $.post(
                contextPath + '/TextbookRepository/findTextbookByTextbookId.do',
                {"textbookId": response[0].textbookID},
                function (response) {
                    $("[name='textbookNameCN']").text(response.textbookname);
                    $("[name='publishingHouse']").text(response.publishinghouse);
                    $("[name='author']").text(response.author);
                    $("[name='isbn']").text(response.isbn);
                    $("[name='price']").text(response.price);
                },
                'json'
            )
        }
        //最后必须重新更新渲染(使用layui的form模块),对表单里的下拉列表，单选框，复选框进行渲染
        layui.use(['form'], function () {
            $ = layui.jquery;
            var form = layui.form;//获取layui的form模块
            form.render(); //刷新select选择框渲染
        });

        //回调函数
        calOrderNum();
        findAllHistoryTextbook();
        findAllNewTextbook();
        updateHistoryTextbookInfo();
        updateTextbookInfo();


    },'json')
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


/*****************S   订购相关操作*****************/

/**
 * 打开订购页面
 *
 */
function openOrderLayer() {
    $.post(
        contextPath+'/TextbookOrder/findOrderDetailInfo.do',
        {"orderDetailId":$("#orderDetailId").val()},
        function (response) {
            if(response[0].remark!=null){
                layui.layer.msg("您已提交，不能再次订购")
            }
            else{
                //var tr_s = $(obj).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
                var copyOrderDetailID = $("[name='orderDetailId']").val();//定位到表格中的订单详细ID
                orderDetailInfo_tab_show('订购教材','./orderTextBook-order.jsp?orderDetailId='+copyOrderDetailID);//将copyOrderDetailID传到orderTextbook-order.jsp界面，打开订购层
                //findOrderDetailInfo(copyOrderDetailID);不能放在这，执行顺序不对，放在对应界面
            }
        },
        'json'
    )
}

//默认订购数量为上课人数加2
function calOrderNum() {
    var before = $("[name='personNum']").text();//用.personNum说明是class属性
    var beforeNum = parseInt(before);
    var orderNum = beforeNum + 2;
    $("#textbook_number").val(orderNum);
}

//选择订购新教材的下拉列表
function findAllNewTextbook() {
    //post请求
    $.post(
        contextPath + '/TextbookOrder/findAllNewTextbook.do',
        {},
        function (response) {
            // alert(response)
            for (var i = 0; i < response.length; i++)
                $("#textbookName").append('<option value="' + response[i].textbookID + '">'
                    + response[i].textbookName + '</option>')
            //layui渲染
            layui.use('form', function () {
                layui.form.render('select');
            });
        },
        'json'
    )
}
function updateTextbookInfo() {
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form;
        //var layer=layui.layer;
    //监听教材下拉框事件
    form.on('select(selectTextbookName)', function (data) {
        var textbookID = data.value;
        $("#textbookId").val(textbookID);
        //var textbookName = data.elem[data.elem.selectedIndex].text;
        form.render('select');
        if(""!=textbookID){
            // $("#teacherName").val(teacherName);
            // $("#teacherNumber").val(teacherNumber);
            $.post(
                contextPath + '/TextbookRepository/findTextbookByTextbookId.do',
                {"textbookId": textbookID},
                function (response) {
                    $("[name='publishingHouse']").val(response.publishinghouse);
                    $("[name='author']").val(response.author);
                    $("[name='isbn']").val(response.isbn);
                    $("[name='price']").val(response.price);
                    form.on('submit(order)', function () {
                    $("#textbookNum").val($("#textbook_number").val());
                    $.post(
                        contextPath + '/TextbookOrder/updateOrderDetailStatus.do',
                        $("#orderForm").serialize(),
                        function (response) {
                            alert(response);
                            if(response == "订购成功"){
                                //检查订单明细是否全部订购，是的话修改总订单状态
                                $.post(
                                    contextPath+'/TextbookOrder/findOrderDetailInfo.do',
                                    {"orderDetailId":$("#orderDetailId").val()},
                                    function(response)
                                    {
                                        //alert(response[0].orderid)
                                        updateOrderStatus(response[0].orderid);
                                    },
                                    'json'
                                )
                                //订购成功之后关闭当前弹出层并且重新执行一次查询
                                window.parent.location.reload();//刷新父窗口
                                var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                                parent.layer.close(index); //再执行关闭
                            }
                        },
                        'text'
                    )
                    })
                },
                'json'
            )
        }
    });
 })
}

//选择订购历史教材的下拉列表
function findAllHistoryTextbook() {
    //post请求
    $.post(
        contextPath + '/TextbookOrder/findAllHistoryTextbook.do',
        {"courseCode":$("#courseCode").text()},
        function (response) {
            for (var i = 0; i < response.length; i++)
                $("#historyTextbookName").append('<option value="' + response[i].textbookID + '">'
                    + response[i].textbookName + '</option>')
            //layui渲染
            layui.use('form', function () {
                layui.form.render('select');
            });
        },
        'json'
    )
}
function updateHistoryTextbookInfo() {
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form;
        //监听教材下拉框事件
        form.on('select(selectHistoryTextbookName)', function (data) {
            var textbookID = data.value;
            $("#textbookId").val(textbookID);
            //var textbookName = data.elem[data.elem.selectedIndex].text;
            form.render('select');
            if(""!=textbookID){
                // $("#teacherName").val(teacherName);
                // $("#teacherNumber").val(teacherNumber);
                $.post(
                    contextPath + '/TextbookRepository/findTextbookByTextbookId.do',
                    {"textbookId": textbookID},
                    function (response) {
                        $("[name='publishingHouse']").val(response.publishinghouse);
                        $("[name='author']").val(response.author);
                        $("[name='isbn']").val(response.isbn);
                        $("[name='price']").val(response.price);
                        form.on('submit(order)', function () {
                        $("#textbookNum").val($("#textbook_number").val());
                        $.post(
                            contextPath + '/TextbookOrder/updateOrderDetailStatus.do',
                            $("#orderForm").serialize(),
                            function (response) {
                                alert(response);
                                if (response == "订购成功") {
                                    //检查订单明细是否全部订购，是的话修改总订单状态
                                    $.post(
                                        contextPath+'/TextbookOrder/findOrderDetailInfo.do',
                                        {"orderDetailId":$("#orderDetailId").val()},
                                        function(response)
                                        {
                                            //alert(response[0].orderid)
                                            updateOrderStatus(response[0].orderid);
                                        },
                                        'json'
                                    )
                                    //订购成功之后关闭当前弹出层并且重新执行一次查询
                                    window.parent.location.reload();//刷新父窗口
                                    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                                    parent.layer.close(index); //再执行关闭
                                }
                            },
                            'text'
                        )
                    })
                    },
                    'json'
                )
            }
        });
    })
}
/*****************E   订购相关操作*****************/


/*****************S   使用历史教材订购信息相关操作*****************/

/********S  打开模态框*******/

/**
* 全选和全部选的操作
* @param obj   表头的按钮自己传下来
*/
function selectAllCheck(obj) {
    var value = $(obj).prop("checked")//获取当前复选框的选中状态;
    $("#historyTextbookOrderTbody").find(":checkbox").prop("checked",value);//设置表格中的与这个的属性一样

}

/**
 * 打开模态框
 */
function openModal() {
    //1.做判断
    var checked_radio = $("#textbookOrderTbody").find(":radio:checked");
    if(checked_radio.length == 0){
        layer.msg("请先选择订购教材总订单"/*,{icon:2,time:2*1000,shade: [0.8, '#393D49']}*/)
        return;
    }
    if($(checked_radio).parents("tr").children("td").eq(6).children("input").val()=='1'){
        layer.msg("订单已提交，不能重复订购")
        return;
    }
    //2.获取选择的复选框
    // var orderids = [];
    // checked_checkbox.each(function (index) {//index从0...
    //     orderids[index] = $(this).val();
    // })
    // alert(orderids.toString())
    //3.传后台查数据
    // $.post(contextPath+'/TextbookOrder/xxxxx.do',{"orderids":orderids.toString()},function (response) {
    //     //4.1填充表格
    //     alert(JSON.stringify(response));
    //     //4.2显示分页
    //
    // },'json')
    //4..打开模态框
    findHistoryTextbookOrder(checked_radio);
    $("#nowOrderid").val($(checked_radio).val());
    var width=($(window).width()*0.90);
    var height=($(window).height()*0.90);
    var index = layer.open({
        title:'选择使用历史教材订购信息',
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
}

/**
 * 显示历史教材订购信息
 * @param obj
 */
function findHistoryTextbookOrder(object) {
    var tr_s = $(object).parents("tr");//obj是当前对象，$(obj).parents("tr")是当前行
    var copyMajor = tr_s.children("td").eq(1).text();
    var copyYear = tr_s.children("td").eq(2).text();
    var copyTerm = tr_s.children("td").eq(3).text();
    // var myDate = new Date();//获取系统当前时间
    // var year = myDate.getFullYear();//获取当前年
    var regex= [];
    regex=copyYear.split("-");
    var setYear=regex[0]-1+"-"+regex[0]+"学年";
    $("#roomname").val(copyMajor);
    $("#setyear").val(setYear);
    $("#semester").val(copyTerm=='第一学期'?1:2);
    $.post(
        contextPath+'/TextbookOrder/findHistoryTextbookOrder.do',
        $("#findTextbookOrderForm").serialize(),
        function(response){
            showHistoryTextbookOrder(response,object)
        },
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showHistoryTextbookOrder(pageInfo,object) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var historyTextbookOrder = pageInfo.list;
    console.log(historyTextbookOrder)
    $("#historyTextbookOrderTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = historyTextbookOrder.length; i < length; i++) {
        // var index = (pageNum - 1) * pageSize + i + 1;
        var tr = '<tr>'
            + '<td>'
            +"<input type='checkbox' name='orderIdCheckbox' value='"+historyTextbookOrder[i].orderDetailID+"'>"//隐藏主键到复选框中
            +'</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].course_name)+ '</td>'//数据库属性名
            + '<td>' + replaceNull(historyTextbookOrder[i].course_code) + '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].teacher_name)+ '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].teacher_number)+ '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].class_name)+ '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].textbookName)
            +"<input type='hidden' name='TextbookID' value='"+historyTextbookOrder[i].textbookID+"'>"
            + '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].publishingHouse)+ '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].isbn)+ '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].price)+ '</td>'
            + '<td>' + replaceNull(historyTextbookOrder[i].orderNum)+ '</td>'
            + '</tr>'
        $("#historyTextbookOrderTbody").append(tr);
    }

    FindHistoryTextbookOrderPage(total,pageNum,pageSize,object)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function FindHistoryTextbookOrderPage(total,pageNum,pageSize,object){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'demo7111', //注意，这里的 test1 是 ID，不用加 # 号
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
                    findHistoryTextbookOrder(object);//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/********E  打开模态框*******/


function useHistoryTextbook() {
    //1.做判断
    var checked_checkbox = $("#historyTextbookOrderTbody").find(":checkbox:checked");
    if(checked_checkbox.length == 0){
        layer.msg("请先选择课程使用的历史教材"/*,{icon:2,time:2*1000,shade: [0.8, '#393D49']}*/)
        return;
    }
    // //2.获取选择的复选框
    // var orderids = [];
    // checked_checkbox.each(function (index) {//index从0...
    //     orderids[index] = $(this).val();
    // })
    // alert(orderids.toString())
    var course_code = [];
    var textbookid= [];
    var ordernum= [];
    var form=[];
    checked_checkbox.each(function (index) {//index从0...
        course_code[index] = $(this).parents("tr").children("td").eq(2).text();
        textbookid[index]=$(this).parents("tr").children("td").eq(6).children("input").val();
        ordernum[index] = $(this).parents("tr").children("td").eq(10).text();
    })
    // alert($("#nowOrderid").val())
    //3.传后台查数据
    // $.post(contextPath+'/TextbookOrder/xxxxx.do',{"orderids":orderids.toString()},function (response) {
    //     //4.1填充表格
    //     alert(JSON.stringify(response));
    //     //4.2显示分页
    //
    // },'json')
    $.post(
        contextPath+"/TextbookOrder/useHistoryTextbook.do",
        {"nowOrderid":$("#nowOrderid").val(),
        "course_code":course_code.toString(),
        "textbookid":textbookid.toString(),
        "ordernum":ordernum.toString()},
        function () {
            layer.msg("使用成功");
        },
        'text')

    //判断该总订单是否全部订购，如果是，改变状态
    updateOrderStatus($("#nowOrderid").val());
    //刷新
    findTextbookOrderFY();

}

/*****************S   使用历史教材订购信息相关操作*****************/



