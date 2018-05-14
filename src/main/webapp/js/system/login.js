/**
 * @author: qlq
 * @time: 11:40 登录相关JS
 * @description:
 */


$(function () {
    // alert("页面加载完成")
})




layui.use(['form','layer'],function () {
    var layer = layui.layer;
    var form = layui.form;


    //1.监听登录表单的提交
    form.on('submit(login)', function(data){
        $.ajax({
            url:contextPath+'/userLogin.do',
            type:"post",
            async:false,
            data:$("#loginForm").serialize(),
            success:function (response) {
                if(response != null && response.loginInfo != "登录成功"){
                    layer.msg(response.loginInfo,{time:2*1000,icon:2,shade: [0.8, '#393D49']});
                }else{
                    window.location.href=contextPath;//登录成功跳转到首页
                }
            },
            dataType:'json'});
    });


})
