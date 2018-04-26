/**
 * @author: qlq
 * @time: 15:35
 * @description: 课程库管理JS
 */
/*****************S   增加课程相关操作*****************/

//使用表单模块和弹出层模块。第二个参数是回调函数
layui.use(['form', 'layer'], function () {

    $ = layui.jquery;
    var form = layui.form , layer = layui.layer;//获取所需要的模块

    //监听提交
    form.on('submit(addCourse)', function (data) {
        $.post(contextPath+"/courseLibrary/addCourse.do",data.field,function (response) {
            alert(response);
        },'text')


    });
});
/*****************E   增加课程相关操作*****************/













