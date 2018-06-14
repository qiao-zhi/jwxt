$(function () {
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            ,format: 'yyyy-MM-dd'
        });
    });

    $("#L_pass").val(getCurrentTime());
});

layui.use(['form', 'layer'], function () {
    var form = layui.form
        , layer = layui.layer;

    //监听提交
    form.on('submit(add)', function (data) {

        layer.confirm("提交之后将不能更改,确认审核?",function (index) {
            //获取url参数值
            var teacherTitleIDs = getUrlParam("teacherTitleIDs");
            var checkResult = $("input[name='checkResult']:checked").val();
            var checkDesc = $("#checkDesc").val();
            var checkTime = $("#L_pass").val();
            //验证通过的话就提交表单
            $.post(
                contextPath+"/project_AC/addAuditFirst.do",
                {"teacherTitleID":teacherTitleIDs,"checkResult":checkResult,
                    "checkDesc":checkDesc,"checkTime":checkTime},
                function (response) {
                    layer.alert(response,function(){
                        closePage();
                    })
                },
                'text')
        });
        return false;
    });
});