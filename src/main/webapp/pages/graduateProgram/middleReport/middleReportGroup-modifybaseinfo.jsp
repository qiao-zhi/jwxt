<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改中期答辩小组</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>

    <%--引入公共的标签--%>
    <%@ include file="/tag.jsp" %>
</head>
<body>
<div class="x-body">
    <c:set var="tTeacherInfoVo" value="${tTeacherInfoVo}"/>
    <c:set var="checkgrouppersonLeaderList" value="${checkgrouppersonLeaderList}"/>

    <form class="layui-form">
        <!--2-->
        <input type="hidden" name="groupid" value="${tTeacherInfoVo.groupid}"/>
        <input type="hidden" name="cencheckinfoid" value="${tTeacherInfoVo.cencheckinfoid}"/>
        <div class="layui-form-item">
            <label for="titlename" class="layui-form-label">
                小组名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="titlename" name="groupname" required="" lay-verify="required"
                       value="${tTeacherInfoVo.groupname}"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--3-->
        <div class="layui-form-item">
            <label for="teacherName" class="layui-form-label">
                答辩地点
            </label>
            <div class="layui-input-inline">
                <input type="text" id="teacherName" name="replyaddress" required="" lay-verify="required"
                       value="${tTeacherInfoVo.replyaddress}"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须填写
            </div>
        </div>
        <!--4-->
        <div class="layui-form-item">
            <label class="layui-form-label">
                检查时间
            </label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="arrangetime" value="${tTeacherInfoVo.arrangetime}" id="L_pass" placeholder="yyyy-MM-dd HH:mm:ss"/>
            </div>
        </div>
        <!--5-->
        <div class="layui-form-item">
            <label for="teacherid" class="layui-form-label">
                小组组长
            </label>
            <div class="layui-input-inline">
                <div class="layui-input-inline">
                    <select name="teacherid" id="teacherid">
                        <option>请选择</option>
                        <c:forEach var="checkgrouppersonLeader" items="${checkgrouppersonLeaderList}">
                            <c:if test="${checkgrouppersonLeader.teachername == groupLeader}">
                                <option value="${checkgrouppersonLeader.teacherid}" selected>${checkgrouppersonLeader.teachername}</option>
                            </c:if>
                            <c:if test="${checkgrouppersonLeader.teachername != groupLeader}">
                                <option value="${checkgrouppersonLeader.teacherid}">${checkgrouppersonLeader.teachername}</option>
                            </c:if>
                        </c:forEach>
                    </select>

                </div>
            </div>
            <div class="layui-form-mid layui-word-aux">
                必须选择
            </div>
        </div>

        <!--10-->
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button class="layui-btn" lay-submit="" lay-filter="update">保存</button>
        </div>
    </form>
</div>
<script>
    //答辩时间
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        laydate.render({
            elem: '#L_pass' //指定元素
            ,type: 'datetime'
        });
    });

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

        //自定义验证规则
        form.verify({
            nikename: function (value) {
                if (value.length < 5) {
                    return '昵称至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , repass: function (value) {
                if ($('#L_pass').val() != $('#L_repass').val()) {
                    return '两次密码不一致';
                }
            }
        });

        //监听更新
        form.on('submit(update)', function (data) {
            $.ajax({
                type:'POST',
                url:"${pageContext.request.contextPath}/gradesigncheckgroup/update.action?gradesigncheckgrouopInfo="+JSON.stringify(data.field),
                dataType:'JSON',
                success:function(msg){
                    if(msg == "0"){
                        layer.alert("修改成功", {icon: 6}, function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                        });
                    }else if (msg == "1"){
                        layer.alert("修改失败", {icon: 7}, function () {
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        });
                    }else{
                        layer.alert("未知的错误，请联系管理员", {icon: 7}, function () {
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        });
                    }
                }
            })
            return false;
        });


    });
</script>
</body>

</html>