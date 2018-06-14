$(function () {
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#L_pass' //指定元素
            ,format: 'yyyy-MM-dd'
        });
    });

    $("#L_pass").val(getCurrentTime());

    //初始化教研室审核信息
    initData()
});

function initData() {
    var teacherTitleIDs = getUrlParam("teacherTitleIDs");
    $.ajax({
        url : contextPath+'/project_AC/getAuditFirstInfo.do',
        data: {"teacherTitleID":teacherTitleIDs},
        type : 'POST',
        async:true,
        success : function(response){
            var data = ajaxGetStringToJson(response);

            $("#firstCheckInfo").html("");

            var tbodyContent = "";
            for(var i=0; i<data.length;i++) {
                tbodyContent = tbodyContent +
                    '<tr>' +
                    '<td>' + checkNull(data[i].titlename) + '</td>' +
                    '<td>' + checkNull(data[i].teacherName) + '</td>' +
                    '<td>' + checkNull(data[i].checkResult) + '</td>' +
                    '<td>' + checkNull(data[i].checkDesc) + '</td>' +
                    '<td>' + getLocalTime(data[i].checkTime) + '</td>' +
                    // '<td>' + checkNull(data[i].checkPerson) + '</td>' +
                    '</tr>'
            }

            $("#firstCheckInfo").append(tbodyContent);
        }
    });
}

layui.use(['form', 'layer'], function () {
    var form = layui.form
        , layer = layui.layer;

    //审核人为当前用户。到controller获取
    //监听提交
    form.on('submit(add)', function (data) {

        layer.confirm("提交之后将不能更改,确认提交?",function (index) {
            //获取url参数值
            var teacherTitleIDs = getUrlParam("teacherTitleIDs");
            var checkResult = $("input[name='checkResult']:checked").val();
            var checkDesc = $("#checkDesc").val();
            var checkTime = $("#L_pass").val();
            //验证通过的话就提交表单
            $.post(
                contextPath+"/project_AC/addAuditSecondInfo.do",
                {"teacherTitleID":teacherTitleIDs,"checkResult":checkResult,
                    "checkDesc":checkDesc,"checkTime":checkTime},
                function (response) {
                    layer.alert(response,function(){
                        closePage();
                    })
                },
                'text')
        });
    });
});