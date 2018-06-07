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
    <%--s bzy--%>
    <%@include file="/tag.jsp"%>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script typr="text/javascript" src="../../../js/outsideGraduateDesiner/titleInfo.js"></script>
    <%--e bzy--%>


</head>

<body>

<script>
    //保存
    function basicSave(){
        var outgradesignapplyid = getAddressParameter("id");
        $("#outgradesignapplyid").val(outgradesignapplyid);
        $.ajax({
            url:contextPath+"/title/updateTitle.do",
            type:"post",
            data:$("#form").serialize(),
            datatype:"text",
            success:function(result){
                layer.msg(result);
                window.parent.loadFile();
                $("#applyDate").val(Format(new Date(),"yyyy-MM-dd"));
            },
            error:function(){
                alert("错误！！！");
                x_admin_close();
            }
        })
    }
    //提交
    function basicCommit(){
        var outgradesignapplyid = getAddressParameter("id");
        layer.confirm("您确定要提交此次申请吗？一旦提交将无法进行修改。",{zIndex :1989101466},function(){
            $.ajax({
                url:contextPath+"/title/commit.do",
                type:"post",
                data:{"outgradesignapplyid":outgradesignapplyid},
                datatype:"text",
                success:function(result){
                    //alert(result);
                    $(".saveAndCommit").css("display","none");
                    layer.msg(result);
                    window.parent.loadFile();
                },
                error:function(){
                    alert("出错！！！");
                    x_admin_close();
                }
            });
        })
    }
    //上传签名
    function tutorSign(){
        layer.prompt({
            formType: 1,
            value: '',
            title: '请输入签名密码',
            //area: ['800px', '350px'] //自定义文本域宽高
        }, function(value, index, elem){
            if(value==''){

            }else{
                layer.close(index);
            }
        })
    }

</script>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn saveAndCommit" onclick="basicSave()">保存</button>
    <button class="btn-primary btn saveAndCommit" onclick="basicCommit()">提交</button>

    <form action="" class="layui-form" id="form" method="post">
        <table class="table table-bordered ">
            <caption style="text-align: center;">
                <h1>太原科技大学计算机科学与技术学院</h1>
                <h3>校外实践课题申请表</h3>
                <div style="float: right">
                    <label for="L_pass" class="layui-form-label">
                        时间：
                    </label>
                    <div class="layui-input-inline" style="width: 135px">
                        <input type="datetime" id="applyDate" readonly  class="form-control">
                    </div>
                </div>

            </caption>
            <tbody>
            <tr>
                <td rowspan="8">课程情况</td>
                <td>课程名称</td>
                <td colspan="6">
                    <input   type="text" id="outgradesignapplyid" name="outgradesignapplyid" style="display: none">
                    <input  class="form-control" type="text" id="courseName" name="coursename">
                </td>
            </tr>
            <tr>
                <td colspan="1">学生姓名 </td>
                <td colspan="2"><input type="text" class="form-control" id="studentName" readonly></td>
                <td colspan="1">专业
                <td colspan="2"><input type="text" class="form-control" id="studentMajor" readonly></td>
                </td>

            </tr>
            <tr>
                <td colspan="1">班级 </td>
                <td colspan="2"><input type="text" class="form-control" id="majorClass" readonly></td>
                <td colspan="1">学号
                <td colspan="2"><input type="text" class="form-control" id="studentNum" readonly></td>
                </td>
            </tr>
            <tr>
                <td>校外单位</td>
                <td colspan="7">
                    <input  class="form-control" type="text" id="outUnitName" name="outunitname">
                </td>
            </tr>
            <tr>
                <td colspan="1">单位地址 </td>
                <td colspan="2"><input type="text" class="form-control" id="outUnitAddr" name="outunitaddr"></td>
                <td colspan="1">联系方式
                <td colspan="2"><input type="text" class="form-control" id="outUnitPhone" name="outunitphone"></td>
                </td>
            </tr>
            <tr>
                <td colspan="1">学生联系方式 </td>
                <td colspan="2"><input type="text" class="form-control" id="studentPhone" name="studentphone"></td>
                <td colspan="1">学生家长联系方式
                <td colspan="2"><input type="text" class="form-control" id="stuParentPhone" name="stuparentphone"></td>
                </td>
            </tr>
            <tr>
                <td colspan="1">校内导师 </td>
                <td colspan="2"><input type="text" class="form-control" id="inTeacherName"  readonly></td>
                <td colspan="1">导师联系方式
                <td colspan="2"><input type="text" class="form-control" id="inTeacherPhone" name="inteacherphone"></td>
                </td>
            </tr>
            <tr>
                <td colspan="1">校外导师 </td>
                <td colspan="2"><input type="text" class="form-control" id="outTeacherName" name="outteachername"></td>
                <td colspan="1">导师联系方式
                <td colspan="2"><input type="text" class="form-control" id="outTeacherPhone" name="outteacherphone"></td>
                </td>
            </tr>
            <tr>
                <td>课题简介</td>
                <td colspan="6">
                    <textarea class="layui-textarea form-control" id="courseDescription" name="coursedescription"></textarea>
                </td>
            </tr>
            <tr>
                <td>实践内容</td>
                <td colspan="6">
                    <textarea  class="layui-textarea form-control" id="testContent" name="testcontent"></textarea>
                </td>
            </tr>
            <tr>
                <td>实践要求</td>
                <td colspan="6">
                    <textarea  class="layui-textarea form-control" id="testStandard" name="teststandard"></textarea>
                </td>
            </tr>
            <tr>
                <td>成果形式</td>
                <td colspan="6">
                    <div class="layui-inline">
                        <label for="L_pass" class="layui-form-label">
                            A
                        </label>
                        <input type="radio" name="resulttype" lay-skin="primary" title="论文" id="radio1" value="论文">
                    </div>
                    <div class="layui-inline">
                        <label for="L_pass" class="layui-form-label">
                            B
                        </label>
                        <input type="radio" name="resulttype" lay-skin="primary" title="软件" id="radio2" value="软件">
                    </div>
                    <div class="layui-inline">
                        <label for="L_pass" class="layui-form-label">
                            C
                        </label>
                        <input type="radio" name="resulttype" lay-skin="primary" title="实物制作" id="radio3" value="实物制作">
                    </div>
                    <div class="layui-inline">
                        <label for="L_pass" class="layui-form-label">
                            D
                        </label>
                        <input type="radio" name="resulttype" lay-skin="primary" title="报告" id="radio4" value="报告">
                    </div>
                    <div class="layui-inline">
                        <label for="L_pass" class="layui-form-label">
                            E
                        </label>
                        <input type="radio" name="resulttype" lay-skin="primary" title="其它" id="radio5" value="其他">
                    </div>
                </td>
            </tr>

            <tr id="1">
                <td>校内导师审批签字</td>
                <td colspan="3">
                    <div>
                        <input type="radio" name="opinion1" class="agree"  title="同意"/>
                        <input type="radio" name="opinion1" class="disagree"  title="不同意"/>
                    </div>
                    <textarea  cols="100" rows="3" class="form-control advice" ></textarea>
                </td>
                <td><div style="height: 50px;">导师签名</div>
                    <hr />
                    <div>签字时间</div>

                </td>

                <td colspan="3" >
                    <div style="height: 50px; width: 230px;">
                        <img src="../../../images/info.jpg" width="150px" height="50px" class="url"/>
                        <%--<input onclick="tutorSign()" value="签名" type="button" class="layui-btn" style="float: right;"></input>--%>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>

            </tr>
            <tr id="2">
                <td>教研室主任审批签字</td>
                <td colspan="3" >
                    <div>
                        <input type="radio" name="opinion2" class="agree" value="" title="同意"/>
                        <input type="radio" name="opinion2" class="disagree" value="" title="不同意"/>
                    </div>
                    <textarea  cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td><div style="height: 50px;">主任签名</div>
                    <hr />
                    <div>签字时间</div>
                </td>
                <td colspan="3">
                    <div style="height: 50px; width=230px;">
                        <img src="../../../images/info.jpg" width="150px" height="50px" class="url"/>
                       <%-- <input type="button" value="签字" class="layui-btn" id="test1" style="float: right;"></input>--%>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>
            </tbody>
        </table>
        <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>
    </form>
</div>

</body>

</html>