<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>毕业设计（包括实习）申请表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../lib/bootstrap/bootstrap.min.css">
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
    <%--s  bzy--%>
    <%@include file="/tag.jsp"%>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/leaveApply.js"></script>
    <%--e  bzy--%>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn" onclick="basicSave()" type="button">保存</button>
    <button class="btn-primary btn" onclick="basicCommit()" type="button">提交</button>
    <script>
        //保存
        function basicSave(){
            var leaveid = getAddressParameter("id");
            var startAndEndTime = $("#applytimeRange").val().trim();
            var startdate = startAndEndTime.substr(0,10).trim();
            var enddate = startAndEndTime.substr(13,10).trim();
            var leavedays = $("#leaveDays").val();
            var leaveaddress = $("#leaveAddress").val();
            var studenttel = $("#studentTel").val();
            var homeaddress = $("#homeAddress").val();
            var hometel = $("#homeTel").val();
            var leavereason = $("#leaveReason").val();
            $.ajax({
                url:contextPath+"/leave/updateLeaveApply.do",
                type:"post",
                data:{"leaveid":leaveid,"startdate":startdate,"enddate":enddate,
                    "leavedays":leavedays,"leaveaddress":leaveaddress,"studenttel":studenttel
                    ,"homeaddress":homeaddress,"hometel":hometel,"leavereason":leavereason
                },
                datatype:"text",
                success:function(result){
                    layer.msg(result);
                },
                error:function(){
                    alert("错误！！！")
                    x_admin_close();
                }
            })
        }
        //提交
        function basicCommit(){
            var leaveid = getAddressParameter("id");
            layer.confirm("您确定要提交此次申请吗？一旦提交将无法进行修改。",function(){
                $.ajax({
                    url:contextPath+"/leave/commitLeave.do",
                    type:"post",
                    data:{"leaveid":leaveid},
                    datatype:"text",
                    success:function(result){
                        layer.msg(result);
                        window.parent.loadFile();
                    },
                    error:function(){
                        alert("出错！！！");
                        x_admin_close();
                    }
                });
            });
        }
    </script>

    <form action="" class="layui-form">
        <table class="table table-bordered ">
            <caption style="text-align: center;">
                <h1>计算机科学与技术学院毕业生请假申请表</h1>
            </caption>
            <tbody>
            <tr>
                <td width="115px">学生姓名</td>
                <td width="300px">
                    <input type="text" class="form-control" id="studentName" readonly>
                </td>
                <td width="120px">学号</td>
                <td>
                    <input type="text" class="form-control" id="studentNum" readonly>
                </td>
                <td>专业</td>
                <td>
                    <input type="text" class="form-control" id="studentMajor" readonlys readonly>
                </td>
            </tr>
            <tr>
                <td>请假起止日期</td>
                <td>
                    <input id="applytimeRange" type="text" name="startAndEndTime" placeholder="点击选择请假日期" autocomplete="off" class="form-control" >
                </td>
                <td>请假天数</td>
                <td colspan="3">
                    <input type="text"  class="form-control" id="leaveDays" name="leavedays" readonly/>
                </td>
            </tr>


            <tr>
                <td>请假去向</td>
                <td >
                    <input type="text" class="form-control" id="leaveAddress" name="leaveaddress">
                </td>
                <td>个人联系电话</td>
                <td colspan="3">
                    <input type="text" class="form-control" value="" id="studentTel" name="studenttel">
                </td>

            </tr>
            <!--家长意见-->
            <tr>
                <td>家庭地址</td>
                <td >
                    <input type="text" class="form-control" id="homeAddress" name="homeaddress">
                </td>
                <td>家庭联系电话</td>
                <td colspan="3">
                    <input type="text" class="form-control" id="homeTel" name="hometel">

                </td>
            </tr>
            <tr>
                <td>请假事由</td>
                <td colspan="5" >
                    <textarea name="" cols="100" rows="3" class="form-control" id="leaveReason" name="leavereason"></textarea>
                </td>

            </tr>

            <tr id="1">
                <td width="50px">辅导员意见</td>
                <td colspan="2" width="700px">
                    <div>
                        <input type="radio" name="opinion1" class="agree" value="1" title="同意"/>
                        <input type="radio" name="opinion1" class="disagree" value="0" title="不同意"/>
                    </div>
                    <textarea name="" cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td width="100px" >
                    <div style="height: 50px; width: 100px;">辅导员签名</div>
                    <hr />
                    <div>签字时间</div>

                </td>

                <td colspan="2">
                    <div style="height: 50px;">
                        <img src="../../../images/info.jpg" width="160px" height="50px" class="url"/>
                        <button type="button" class="layui-btn"  style="float: right;">签名</button>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>

            </tr>
            <tr id="2">
                <td width="50px">指导教师意见</td>
                <td colspan="2" width="700px">
                    <div>
                        <input type="radio" name="opinion2" class="agree" value="1" title="同意"/>
                        <input type="radio" name="opinion2" class="disagree" value="0" title="不同意"/>
                    </div>
                    <textarea name="" cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td colspan="1">
                    <div style="height: 50px;">指导教师签名</div>
                    <hr />
                    <div>签字时间</div>

                </td>

                <td colspan="2">
                    <div style="height: 50px;">
                        <img src="../../../images/info.jpg" width="160px" height="50px" class="url"/>
                        <button type="button" class="layui-btn"  style="float: right;">签名</button>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>

            </tr>

            <!--教研室意见-->
            <tr id="3">
                <td width="50px">教研室意见</td>
                <td colspan="2" width="700px">
                    <div>
                        <input type="radio" name="opinion3" class="agree" value="1" title="同意"/>
                        <input type="radio" name="opinion3" class="disagree" value="0" title="不同意"/>
                    </div>
                    <textarea  cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td colspan="1">
                    <div style="height: 50px;">指导教师签名</div>
                    <hr />
                    <div>签字时间</div>

                </td>

                <td colspan="2">
                    <div style="height: 50px;">
                        <img src="../../../images/info.jpg" width="160px" height="50px" class="url"/>
                        <button type="button" class="layui-btn"  style="float: right;">签名</button>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>

            </tr>
            <!--系意见-->
            <tr id="4">
                <td width="50px">系主任意见</td>
                <td colspan="2" width="700px">
                    <div>
                        <input type="radio" name="opinion4" class="agree" value="1" title="同意"/>
                        <input type="radio" name="opinion4" class="disagree" value="0" title="不同意"/>
                    </div>
                    <textarea name="" cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td colspan="1">
                    <div style="height: 50px;">系主任签名</div>
                    <hr />
                    <div>签字时间</div>

                </td>

                <td colspan="2">
                    <div style="height: 50px;">
                        <img src="../../../images/info.jpg" width="160px" height="50px" alt="待签字" class="url"/>
                        <button type="button" class="layui-btn"  style="float: right;">签名</button>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>

            </tr>
            <!--学生工作副书记-->
            <tr id="5">
                <td width="50px">学生工作副书记意见</td>
                <td colspan="2" width="700px">
                    <div>
                        <input type="radio" name="opinion5" class="agree" value="1" title="同意"/>
                        <input type="radio" name="opinion5" class="disagree" value="0" title="不同意"/>
                    </div>
                    <textarea name="" cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td colspan="1">
                    <div style="height: 50px;">签名</div>
                    <hr />
                    <div>签字时间</div>

                </td>

                <td colspan="2">
                    <div style="height: 50px;">
                        <img src="../../../images/info.jpg" width="160px" height="50px" class="url"/>
                        <button type="button" class="layui-btn" style="float: right;">签名</button>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>

            </tr>
            <!--主管院长-->
            <tr id="6">
                <td width="50px">主管院长意见</td>
                <td colspan="2" width="700px">
                    <div>
                        <input type="radio" name="opinion6" class="agree" value="1" title="同意"/>
                        <input type="radio" name="opinion6" class="disagree" value="0" title="不同意"/>
                    </div>
                    <textarea name="" cols="100" rows="3" class="form-control advice"></textarea>
                </td>
                <td colspan="1">
                    <div style="height: 50px;">主管院长签名</div>
                    <hr />
                    <div>签字时间</div>
                </td>

                <td colspan="2">
                    <div style="height: 50px; width: 170px;">
                        <img src="../../../images/info.jpg" width="160px" height="50px" class="url"/>
                        <button type="button" class="layui-btn"  style="float: right;margin-right: -59px;">签名</button>
                    </div>
                    <hr />
                    <input type="datetime"  placeholder="2018-04-25" class="form-control applydate">
                </td>
            </tr>
            <tr>
                <td>销假日期</td>
                <td  width="100px">
                    <input type="text" id="applytimeCancel" class="form-control" id="cancelLeaveDate" name="cancelLeaveDate"/>
                </td>
                <td width="100px">超假时间</td>
                <td width="450px" colspan="3">
                    <input type="text"  id="applytimeOut" name="" placeholder="选择超假时间日期范围" autocomplete="off" class="form-control">
                </td>
            </tr>
            </tbody>
        </table>
        <span>说明：一式两份，一份装订入学生毕业设计（论文）内，一份交学院（直属系）。</span>
    </form>
</div>
<script>

    //日期范围
    layui.use('laydate',function(){
        var laydate=layui.laydate;
        laydate.render({
            elem:'#applytimeRange'
            ,range:true
            ,done: function(value, date, endDate){

                var t1 = (date.year+'/'+date.month+'/'+date.date)
                var dateBegin=new Date(t1)
                var t2 = (endDate.year+'/'+endDate.month+'/'+endDate.date)
                var dateEnd = new Date(t2)
                var dateDiff = dateEnd.getTime() - dateBegin.getTime();//时间差的毫秒数
                var dayDiff = Math.floor(dateDiff / (24 * 3600 * 1000));//计算出相差天数
                $("#leaveDays").val(dayDiff+1)
            }
        });

        laydate.render({
            elem:'#applytimeOut'
            ,range:true
        });
        laydate.render({
            elem:'#applytimeCancel',
        });
    });
</script>
</body>

</html>