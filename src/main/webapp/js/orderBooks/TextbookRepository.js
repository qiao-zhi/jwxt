/**
 * 页面加载完
 */
$(function () {
    findAllCourse();
    findTextbookFY();
});

/*****************S   增加教材相关操作*****************/

//使用表单模块和弹出层模块。第二个参数是回调函数
layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form , layer = layui.layer;//获取所需要的模块

    //监听提交
    form.on('submit(addTextbook)', function (data) {
        //1.验证教材编号是否存在数据库，不能重复添加
        if(!checkoutTextbookNum()){
            //layui的弹出层提示消息
            layer.msg("教材编号已经存在，请勿重复添加!");
            return false;

        }

        //第一种($.ajax提交
        $.ajax({
            url: contextPath+"/TextbookRepository/addTextbook.do",
            data:data.field,
            type:"POST",
            async:false,
            dataType:'text',
            success:function (response) {
                alert(response);
                if(response == "添加成功"){
                    //增加成功之后关闭当前弹出层并且重新执行一次查询
                    window.parent.location.reload();//刷新父窗口
                    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                    parent.layer.close(index); //再执行关闭
                }
            }

        });

    });
});

//验证教材编号是否重复
function checkoutTextbookNum(){
    var value = $("[name='textbooknum']").val();
    var result = true;
    //同步加载数据(判断返回结果)
    $.ajax({
        url:contextPath+"/TextbookRepository/getCountByTextbookNum.do",
        async:false,
        type:"POST",
        data:{"textbookNum":value},
        success:function (response) {
            if(parseInt(response)> 0){
                result=false;
            }
        },
        dataType:'text'})
    return result;
}

//查找所有教材定义到课程名称下拉列表
function findAllCourse() {
    $.post(
        contextPath+"/TextbookRepository/findAllCourse.do",
        {},
    function (response) {
        // alert(response)
        for (var i=0;i<response.length;i++){
            $("#allCourse").append('<option value="'+response[i].courseId
                +'">'+response[i].courseNameCN+'</option>')
        }
        //layui渲染
        layui.use('form',function () {
            layui.form.render('select');
        });

    },
    'json'
    )
}

/*****************E   增加教材相关操作*****************/


/*****************S   查找教材相关操作*****************/

/**
 * 分页查找教材信息
 */
function findTextbookFY() {
    $.post(
        contextPath+'/TextbookRepository/findTextbook.do',
        $("#findTextbookForm").serialize(),/*将jsp文件中的id为findTextbookForm的表单里的查询条件传回到后台，serialize()序列化，转化为二进制流传回后台*/
        showTextbookInfo,
        'json'
    )
}

/**
 * 填充表格
 * @param pageInfo 从后台返回的PageInfo对象
 */
function showTextbookInfo(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var textbooks = pageInfo.list;
    console.log(textbooks)
    $("#textbookTbody").html("");//清空表格中数据并重新填充数据
    for (var i = 0, length = textbooks.length; i < length; i++) {
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = '<tr>'
            + '<td>' + index + '</td>'
            + '<td>' + textbooks[i].textbookNUM + '</td>'
            + '<td>' + textbooks[i].textbookName + '</td>'
            + '<td>' + textbooks[i].publishingHouse + '</td>'
            + '<td>' + textbooks[i].author + '</td>'
            + '<td>' + textbooks[i].isbn + '</td>'
            + '<td>' + textbooks[i].price + '</td>'
            + '<td>' + textbooks[i].courseID + '</td>'
            + '<td>'
            + '<a href=javascript:void(0) title="点击修改教材基本信息" onclick="openUpdateLayer(this)"><i class="layui-icon">&#xe642;</i></a>'
            + '<a href=javascript:void(0) title="点击删除教材" onclick="deleteCourseByCourseId(this)"><i class="layui-icon">&#xe640;</i></a>'
            + '</td></tr>'
        $("#textbookTbody").append(tr);
    }

    textbooksPage(total,pageNum,pageSize)
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
    function textbooksPage(total,pageNum,pageSize){
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
                        findTextbookFY();//执行查询分页函数(这个函数必须写在这里)
                    }
                }

            });
        });
    }


    /**
     * 点击查询搜索按钮的点击事件
     */
    function findTextbookFYBtn() {
        $("[name='pageNum']").val("");//清空当前页
        findTextbookFY();//执行查询分页函数
    }






/*****************E   查找教材相关操作*****************/

