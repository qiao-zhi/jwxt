layui.use('laydate', function () {
    var laydate = layui.laydate;
    laydate.render({
        elem: '#L_pass' //指定元素
        ,format: 'yyyy年MM月dd日'
    });
});

$(function () {
    //初始化时间为当前时间
    var myDate = new Date;
    var year = myDate.getFullYear();//获取当前年
    var month = myDate.getMonth()+1;//获取当前月
    var date = myDate.getDate();
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;

    $("#L_pass").val(year + "年" + month + "月" + date + "日");
});

layui.use(['form', 'layer'], function () {
    var form = layui.form
        , layer = layui.layer;

    //监听提交
    form.on('submit(add)', function (data) {

        layer.confirm("提交之后将不能更改,确认提交?",function (index) {
            //获取url参数值
            var StudentTitleresultID = getUrlParam('resultIDs');
            var auditResult = $("input[name='auditResult']:checked").val();
            var auditContent = $("#auditContent").val();
            var auditTime = $("#L_pass").val();
            $.post(
                contextPath+"/gdfilemanage/addAuditInfo.do",
                {"StudentTitleresultID":StudentTitleresultID,"auditResult":auditResult,
                    "auditContent":auditContent,"auditTime":auditTime},
                function (response) {
                    layui.alert(response);
                    closePage();
                },
                'text')
        });
        return false;
    });
});