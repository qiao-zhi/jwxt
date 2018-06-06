<%@ page import="java.net.URLDecoder" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>增加课设信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    
    <script type="text/javascript">
        var courseDesignTeacherStudentID;
        $(function () {
            <%
                String courseDesignTeacherStudentID = request.getParameter("courseDesignTeacherStudentID");
            %>
            courseDesignTeacherStudentID = "<%=courseDesignTeacherStudentID%>";
            $.ajax({
                url:"/jwxt/studentCourseDesignFileInfo/toUploadCourseDesignFile.do",
                type:"post",
                data:{"courseDesignTeacherStudentID":courseDesignTeacherStudentID},
                dataType:"json",
                success:function (resultInfo) {
                    var courseDesignName = resultInfo.courseDesignName;
                    var courseDesignNum = resultInfo.courseDesignNum;
                    var teacherName = resultInfo.teacherName;
                    var teacherNum = resultInfo.teacherNum;

                    $("#courseDesignName").text(courseDesignName);
                    $("#courseDesignNum").text(courseDesignNum);
                    $("#teacherName").text(teacherName);
                    $("#teacherNum").text(teacherNum);
                },
                error:function () {
                    layer.alert("加载失败！")
                }
            })
            // 初始化文件上传
            initUploadCourseDesign();

        })


        /**
         * 使用layui的upload模块上传文件
         */
        var studentID = 1;
        function initUploadCourseDesign(){
            layui.use(['upload','layer'], function(){
                var upload = layui.upload,layer = layui.layer;
                //选完文件后不自动上传
                upload.render({
                    elem: "#uploadCourseDesignFile",//对哪个元素进性格式化选择文件
                    url: "/jwxt/studentCourseDesignFileInfo/uploadCourseDesignFile.do",//上传的url
                    auto: false,//是否自动上传
                    accept: "file", //普通文件,
                    multiple:false,//支持多文件上传
                    exts: "doc|docx|pdf", //只允许上传doc,docx和pdf文件
                    bindAction: "#startUploadCourseDesign",//绑定到哪个按钮进行提交(提交按钮进行提交)
                    data:{//另外携带的数据
                        courseDesignTeacherStudentID:courseDesignTeacherStudentID,//携带教师学生课设id
                        studentID:studentID    // 携带学生id
                    },
                    choose:function (obj,file) {//选中文件执行的操作
                        //将每次选择的文件追加到文件队列
                        // var files = obj.pushFile();//会导致传一个文件多次选择传多个文件(不可以用)
                        var file = this.files ; //获取到选择的文件
                        obj.preview(function(index, file, result){
                            // alert(file.name+file.size)//获取文件的名字和大小
                            $("#uploadCourseDesignFile").val(file.name+"("+(file.size/1024)+"kb)")
                        });
                    },
                    before:function (obj) {//文件上传前
                        $("#startUploadCourseDesign").addClass("layui-btn-disabled");//设置按钮不可以点击(增加layui的禁用按钮属性)
                        // layer.msg("文件正在上传...",{time:60000})//弹出一个提示框提示文件正在上传，默认60s之后关闭，上传成功之后直接关闭
                        var index = layer.load(); //开始上传之后打开load层
                        $("#hidden_index").val(index);//隐藏到页面中
                    },
                    done: function(res, index, upload){//请求成功的回调，第一个参数代表返回的信息。必须是JSON格式的对象
                        //如果你想关闭最新弹出的层，直接获取layer.index即可
                        layer.close(layer.index); //它获取的始终是最新弹出的某个层，值是由layer内部动态递增计算的
                        if(res !=null && res.success==true){//上传成功
                            layer.msg(res.msg,{time: 1500},function () {//弹出消息三秒后关闭当前iframe
                                layer.close($("#hidden_index").val());//成功之后获取页面隐藏的load层并且关闭
                                var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                                window.parent.location.reload();  //刷新父窗口
                                parent.layer.close(index); //再执行关闭
                            });
                        }
                    }
                });
            });
        }

    </script>

</head>

<body>
<div class="x-body">
    <table class="layui-table-wang-info">
        <tr>
            <td>课程名称</td>
            <td id="courseDesignName"></td>
            <td>课程编号</td>
            <td id="courseDesignNum"></td>
        </tr>
        <tr>
            <td>教师名称</td>
            <td id="teacherName"></td>
            <td>教师编号</td>
            <td id="teacherNum"></td>
        </tr>
    </table>
    <form class="layui-form">
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
                课设报告
            </label>
            <div class="layui-input-inline">
                <input type="" id="uploadCourseDesignFile" name="" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须上传
            </div>
        </div>

        <!--5-->
        <%--隐藏一个index用于关闭这个index--%>
        <input type="hidden" id="hidden_index" >

        <!---->
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button class="layui-btn" lay-filter="add" type="button"  id="startUploadCourseDesign" lay-submit="">
                确认上传
            </button>
        </div>
        <!---->
    </form>
</div>

<script>
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;


    });
</script>

</body>

</html>