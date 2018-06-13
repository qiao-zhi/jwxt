<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>毕业设计（包括实习）申请表</title>
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

    <%--s   bzy--%>
    <%@include file="/tag.jsp"%>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/assignment.js"></script>
    <script>
        //获取当前用户id
        var userID = ${id};
    </script>
    <%--E   bzy--%>
</head>

<body>
<input type="hidden" value="${id}" id="userID"/>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn saveAndCommit" onclick="basicSave()">保存</button>
    <button class="btn-primary btn saveAndCommit" onclick="basicCommit()">提交</button>
    <script>
        //保存
        function basicSave(){
            $.ajax({
                url:contextPath+"/assignment/saveAssignment.do",
                type:"post",
                data:$("#form").serialize(),
                dataType:"text",
                success:function(result){
                    layer.msg(result);
                },
                error:function () {
                    x_admin_close();
                    layer.msg("保存出错！！！")
                }
            });


        }
        //提交
        function basicCommit(){
            layer.confirm("您确定要提交此次申请吗？一旦提交将无法进行修改。",function(){
                $.ajax({
                    url:contextPath+"/assignment/commitAssignment.do",
                    type:"post",
                    data:$("#form").serialize(),
                    datatype:"text",
                    success:function(result){
                        $(".saveAndCommit").css("display","none");
                        $(".studentSign").css("display","none");
                        layer.msg(result);
                        window.parent.loadFile("${id}");
                    },
                    error:function(){
                        alert("出错！！！");
                        x_admin_close();
                    }
                });
            })
        }
    </script>

    <form action="" class="layui-form" disabled="true" id="form">
        <table class="table table-bordered ">
            <input type="text" id="id" name="assignmentID" style="display: none">
            <caption style="text-align: center;">
                <h1>任务书</h1>
            </caption>
            <caption>
                <p>学院：<span id="collegename"></span></p>
            </caption>
            <tbody>

            <tr>
                <td>学生姓名</td>
                <td>
                    <input type="text" class="form-control" readonly="true" id="studentname">
                </td>
                <td>学号</td>
                <td>
                    <input type="text" class="form-control" readonly="true" id="studentnum">
                </td>
            </tr>
            <tr>
                <td>专业班级</td>
                <td>
                    <input type="text" class="form-control" readonly="true" id="majorclass">
                </td>
                <td>同组人</td>
                <td>
                    <input type="text" class="form-control" id="samegroup" name="samegroup">
                </td>
            </tr>
            <tr>
                <td>任务下发时间</td>
                <td>
                    <input type="text" class="form-control" id="starttime" name="starttime"/>
                </td>
                <td>任务完成时间</td>
                <td>
                    <input type="text" class="form-control" id="endtime" name="endtime"/>
                </td>
            </tr>
            <tr>
                <td>设计论文题目</td>
                <td colspan="3">
                    <input type="text" class="form-control" id="title" name="title">
                </td>
            </tr>
            <tr>
                <td>设计目的和要求</td>
                <td colspan="3">
                    <textarea name="request" cols="100" rows="4" class="form-control" id="request"></textarea>
                </td>
            </tr>
            <tr>
                <td>设计主要内容</td>
                <td colspan="3">
                    <textarea name="content" cols="100" rows="4" class="form-control" id="content" ></textarea>
                </td>
            </tr>
            <tr>
                <td>设计提交资料</td>
                <td colspan="3">
                    <textarea cols="100" rows="4" class="form-control" id="submitfile" name="submitfile"></textarea>
                </td>
            </tr>

            <tr>
                <td>学生签名</td>
                <td>
                    <div style="height: 40px;">
                        <img src="../../../images/info.jpg" width="170px" height="50px" id="studentsign"/>
                        <input onclick="studentSign()" type="button" class="layui-btn studentSign"  style="float: right; width: 65px;" value="签名"></input>
                    </div>
                </td>

                <td>指导教师签名</td>
                <td>
                    <div style="height: 40px;">
                        <img src="../../../images/info.jpg" width="170px" height="50px" id="jiaoshi"/>
                    </div>
                </td>
            </tr>

            <tr>
                <td>系主任签名</td>
                <td>
                    <div style="height: 40px;">
                        <img src="../../../images/info.jpg" width="170px" height="50px" id="xizhuren"/>

                    </div>
                </td>

                <td>主管院长签名</td>
                <td>
                    <div style="height: 40px;">
                        <img src="../../../images/info.jpg" width="170 px" height="50px" id="yuanzhang"/>
                    </div>
                </td>
            </tr>

            </tbody>
        </table>
        <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>
    </form>
</div>
<script>
    layui.use('laydate',function(){
        var laydate=layui.laydate;

        laydate.render({
            elem:'#starttime'
        });
        laydate.render({
            elem:'#endtime'
        });
    });
</script>
</body>

</html>