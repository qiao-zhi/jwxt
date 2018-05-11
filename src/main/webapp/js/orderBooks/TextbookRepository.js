/*****************S   增加教材相关操作*****************/
/**
 * 页面加载完
 */
$(function () {
    findAllCourse();
});

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


