<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
    <%--s      bzy--%>
    <%@include file="/tag.jsp"%>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/surebook.js"></script>

    <%--e      bzy--%>
</head>

<body>
<input type="hidden" value="${id}" id="userID" />
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn saveAndCommit" onclick="basicSave()">保存</button>
    <button class="btn-primary btn saveAndCommit" onclick="basicCommit()">提交</button>

    <form action="" class="layui-form">
        <table class="table table-bordered ">
            <caption style="text-align: center;">
                <h1>保 证 书</h1>
            </caption>
            <tbody>

            <tr>
                <td colspan="6">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label>本人进入四年级本科课程设计、毕业实习、毕业设计期间时，因个人原因向学院提出进行校外实践课程申请，特就如下事项做出承诺：</label><br>
                            1、本人年满18周岁，具备完全行为能力，对于实施校外实践课程自我管理协议书内容有正确之认识，同意双方签字之法律意义。<br>
                            2、本人承诺提交的申请校外实践课程材料的真实性，对于要求家长或或其他与本人具有利益关系之第三人同意之事项，本人已与家长或或其他与本人具有利益关系之第三人充分沟通，并取得其同意，其签字真实有效，可排除家长或或其他与本人具有利益关系之第三人关于虚假签名之主张。<br>
                            3、实施校外实践课程自我管理协议书，本人已与家长及其他与本人具有利益关系之第三人充分沟通，本人认为，家长及其他与本人具有利益关系之第三人已经完全认可协议之内容并愿意一同履行本协议书。

                            <![endif]-->

                        </div>
                    </div>
                </td>

            </tr>


            <tr>
                <td>保证人</td>
                <td colspan="3">
                    <div style="height: 50px; width: 230px;">
                        <img src="../../../images/info.jpg" width="150px" height="50px" id="studentUrl"/>
                        <input onclick="studentSign()" value="签名" type="button" class="layui-btn studentSign" id="test1" ></input>
                    </div>
                    <hr />
                    <input type="datetime" readonly id="studentApplyTime" class="form-control">
                    <!--<textarea name="" cols="100" rows="3" class="form-control"></textarea>-->
                </td>


            </tr>

            </tbody>
        </table>
        <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>
    </form>
</div>
<script>
    //保存
    function basicSave(){
        layer.msg("保存成功");
    }
    //提交
    function basicCommit(){
        var sureBookId = getAddressParameter("id");
        layer.confirm("您确定要提交此次申请吗？一旦提交将无法进行修改。",function(){
            $.ajax({
                url:contextPath+"/oGDAttachment/commitSureBook.do",
                type:"post",
                data:{"sureBookId":sureBookId},
                datatype:"text",
                success:function(result){
                    $(".saveAndCommit").css("display","none");
                    $(".studentSign").css("display","none");
                    layer.msg(result);
                    window.parent.loadFile(${id});
                },
                error:function(){
                    alert("出错！！！");
                    x_admin_close();
                }
            });
        })
    }

</script>
</body>

</html>