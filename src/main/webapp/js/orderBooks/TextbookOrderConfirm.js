/*****************S   查询订单信息相关操作*****************/

function getUserCode() {
    $.post(
        contextPath+'/TextbookOrderConfirm/getUsercode.do',
        {},//$("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        function (response) {
            //alert(response)
            $("#userCode").val(response);
            displayTextbookOrderFY();
        }
       // 'json'此处回调函数类型应该无，否则错误
    )
}

/**
 * 分页查找总订单信息
 */
function displayTextbookOrderFY() {
    $.post(
        contextPath+'/TextbookOrderConfirm/displayTextbookOrder.do',
        $("#findTextbookOrderForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        showOrderInfo,
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showOrderInfo(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var textbookOrders = pageInfo.list;
    console.log(textbookOrders)
    $("#textbookOrderTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = textbookOrders.length; i < length; i++) {
            var index = (pageNum - 1) * pageSize + i + 1;
            if(textbookOrders[i].isConfirm=='0') {
                var tr = '<tr>'
                    + '<td>' + '<input type="checkbox" name="orderDetailIdCheckbox" value="' + textbookOrders[i].orderDetailID + '">'//隐藏主键到复选按钮中
                    + '</td>'
                    + '<td>' + index + '</td>'
                    + '<td>' + textbookOrders[i].textbookName + '</td>'//实体类属性名
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
                    + '<td>'
                    + '<a href=javascript:void(0) title="点击修改教材订购信息" onclick="openUpdateTextbookModal(this)"><i class="layui-icon">&#xe642;</i></a>'
                    + '</td></tr>'
            }
            else{
                var tr = '<tr>'
                    + '<td>' + '<input type="checkbox" name="orderDetailIdCheckbox" value="' + textbookOrders[i].orderDetailID + '">'//隐藏主键到复选按钮中
                    + '</td>'
                    + '<td>' + index + '</td>'
                    + '<td>' + textbookOrders[i].textbookName + '</td>'//实体类属性名
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
                    +'</td>'
                    + '<td></td></tr>'
            }
        $("#textbookOrderTbody").append(tr);
    }

    ordersPage(total,pageNum,pageSize)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function ordersPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'demo785444', //注意，这里的 test1 是 ID，不用加 # 号
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
                    displayTextbookOrderFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}


/*****************E   查询订单信息相关操作*****************/



/*****************S   确认相关操作************************/


/**
 * 全选和全部选的操作
 * @param obj   表头的按钮自己传下来
 */
function selectAllCheck(obj) {
    var value = $(obj).prop("checked")//获取当前复选框的选中状态;
    $("#textbookOrderTbody").find(":checkbox").prop("checked",value);//设置表格中的与这个的属性一样

}

/**
 *确认
 */
function confirmOrder() {
    var checked_checkbox = $("#textbookOrderTbody").find(":checkbox:checked");
    if(checked_checkbox.length == 0){
        layer.msg("请先选择订单信息"/*,{icon:2,time:2*1000,shade: [0.8, '#393D49']}*/)
        return;
    }
    for(i=0;i<checked_checkbox.length;i++) {//index从0...
        if($(checked_checkbox[i]).parents("tr").children("td").eq(11).text()=='已确认'){
            layer.msg("订单已确认，请选择没有确认的订单进行确认")
            break;
        }
        else{
            var orderDetailIds = [];
            checked_checkbox.each(function (index) {//index从0...
                orderDetailIds[index] = $(this).val();
            })
            //alert(orderDetailIds.toString())
            $.post(
                contextPath+'/TextbookOrderConfirm/updateConfirmStatus.do',
                {"orderDetailId":orderDetailIds.toString()},
                function(){
                    layer.msg("确认成功")
                    //刷新
                    getUserCode();
                }
            )
        }
    }

}

/*****************E   确认相关操作************************/




/*****************S   修改相关操作************************/


/**
 * 打开模态框
 */
function openUpdateTextbookModal(obj) {

    var tr_s=$(obj).parents("tr");
    var copyOrderDetailId=tr_s.children("td").eq(0).children(":checkbox").val();
    $("#orderDetailId").val(copyOrderDetailId)

    var width=($(window).width()*0.90);
    var height=($(window).height()*0.90);
    var index = layer.open({
        title:'修改教材订购信息',
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

    findOrderDetailInfo(copyOrderDetailId);

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
        if(response[0].textbookID!=null&&response[0].textbookID!=''){
            $.post(
                contextPath + '/TextbookRepository/findTextbookByTextbookId.do',
                {"textbookId": response[0].textbookID},
                function (response) {
                    //$("[name='textbookNameCN']").text(response.textbookname);
                    // $("[name='publishingHouse']").val(response.publishinghouse);
                    // $("[name='author']").val(response.author);
                    // $("[name='isbn']").val(response.isbn);
                    // $("[name='price']").val(response.price);
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
                        form.on('submit(update)', function () {
                            $("#textbookNum").val($("#textbook_number").val());
                            $.post(
                                contextPath + '/TextbookOrder/updateOrderDetailStatus.do',
                                $("#orderForm").serialize(),
                                function (response) {
                                    alert("修改成功")
                                    if(response == "订购成功"){
                                        //订购成功之后关闭当前弹出层并且重新执行一次查询
                                        window.location.reload();//刷新当前窗口
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
                        form.on('submit(update)', function () {
                            $("#textbookNum").val($("#textbook_number").val());
                            $.post(
                                contextPath + '/TextbookOrder/updateOrderDetailStatus.do',
                                $("#orderForm").serialize(),
                                function (response) {
                                    alert("修改成功");
                                    if (response == "订购成功") {
                                        //订购成功之后关闭当前弹出层并且重新执行一次查询
                                        window.location.reload();//刷新当前窗口
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

/*****************E   修改相关操作************************/