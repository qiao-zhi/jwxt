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

    <%--s    bzy--%>
    <%@include file="/tag.jsp"%>
    <script type="text/javascript" src="../../../js/public/dateUtil.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/selfManage.js"></script>
    <%--e    bzy--%>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn" onclick="basicSave()">保存</button>
    <button class="btn-primary btn" onclick="basicCommit()">提交</button>
   
    <form action="" class="layui-form">
    <table class="table table-bordered ">
        <caption style="text-align: center;">
        	<h1>计算机科学与技术学院</h1>
            <h3>学生实施校外实践课程自我管理协议书</h3>
        </caption>
         <tbody>
            <tr>
                <td>甲方：</td>
                <td colspan="5">
                    <input  class="form-control" type="text" id="collegeName" name="collegeName" disabled="">
                </td>
            </tr>
            <tr>
                <td colspan="1">乙方：学生： </td>
                <td colspan="2">
                	<input type="text" class="form-control" id="studentName1" name="studentName" value="" disabled="">
                </td>
                <td colspan="1">身份证号</td>
            	<td colspan="2"><input type="text" class="form-control" id="studentIdCard" name="studentIdCard" disabled=""></td>
                
                
            </tr>
             <tr>
             	<td colspan="6">
             		<div class="layui-form-item">
		            	<div class="layui-inline">
		            		学生&nbsp;&nbsp;&nbsp;<span id="studentName2" style="color: red"></span>&nbsp;&nbsp;&nbsp;
                            （以下称乙方）为我院&nbsp;&nbsp;&nbsp;<span id="majorClass" style="color: red"></span>&nbsp;&nbsp;&nbsp;
                            班学生，学业进入本科毕业实习、毕业设计期间时，
		            		因个人原因向甲方提出实施校外实践课程申请，
		            		现将乙方实施校外实践课程期间甲乙双方相关权利义务协议如下：
					   
					  </div>
					  </div>
             		
             		
             	</td>
                <!--<td colspan="1">班级 </td>
                <td colspan="2"><input type="text" class="form-control"></td>
                <td colspan="1">学号
                	<td colspan="2"><input type="text" class="form-control"></td>
                </td>-->
            </tr>
            <tr>
            	<td>一、共识</td>
                <td colspan="5">
                	甲乙双方就以下事项达成共识：<br>
                	1、乙方自行从事校外实践课程期间，已脱离甲方之管理。<br>
                	2、乙方实施校外实践课程，应当审慎提出申请，确信在此期间能够在实施校外实践课程指导教师指导下完成相关教学环节的任务。<br>
                	3、在此期间，甲方应当尽可能对乙方的学习、生活进行积极干预，乙方亦应当给予充分之尊重，然而出于现实考虑，此项干预不应当视为甲方的管理行为。
                </td>
            </tr>
            <tr>
            	<td>二、甲方权利义务</td>
                <td colspan="5">
                	1、甲方应当认真审核乙方的实施校外实践课程申请，做到规范审批。<br>
                	2、甲方做好对乙方的安全教育工作，但甲方不对乙方有单独进行教育之义务。<br>
                	3、甲方应当抽查乙方学习、生活情况，同时，每次抽查仅对该次抽查时间点负责。<br>
                	4、若乙方违反本协议所规定之义务或其他校规校纪，甲方有权决定取消其实施校外实践课程的资格，相关各项损失由乙方个人承担。
                </td>
            </tr>
            <tr>
            	<td>三、乙方权利义务</td>
                <td colspan="5">
                	1、本协议履行期间，乙方可自行决定住宿地点，但应将住宿地点及联系电话的及时告知甲方；如住宿地点及联系电话发生变动，应在一个工作日内向甲方说明；联系电话做到24小时开通。<br>
                	2、本协议履行期间，乙方应自觉遵守国家法律法规、学校规章制度，任何情况下，乙方在住宿地点均不得私接电源、乱拉电线，不使用危险电器（压力锅、热得快等），不酗酒、抽烟，保持室内外卫生。<br>
                	3、乙方应当及时完成各项学习任务，按照甲方要求积极参加学校、学院、班级组织的集体活动，不从事有损于学校、学院、班级形象的行为。<br>
                	4、乙方保证所提交实施校外实践课程申请材料的真实性，申请材料为本协议及其他甲方要求乙方提供之材料。其中，涉及到家长或其他与乙方具有利益关系之第三人之签名，乙方应以书面保证其真实，并作为本协议必须之附件，排除家长或其他与乙方具有利益关系之第三人认为虚假签名之主张。<br>
                	5、本协议履行期间，除因甲方故意及重大过失外，乙方人身、财产安全由乙方自行负责。本条所称重大过失，仅指学校设施、设备存在之安全隐患造成的乙方人身、财产损失。<br>
                	6、任何情况下，甲方对乙方自杀、自残行为不负任何责任。<br>
                	7、乙方有权享受甲方提供给其他学生的教育和其他待遇。
                </td>
            </tr>
            <tr>
            	<td>四、其他说明</td>
                <td colspan="5">
                	1、此协议一式二份，签字成立生效。甲、乙各执一份。<br>
                	2、本协议已由甲方详细向乙方进行说明，乙方对于协议内容已有完全之认识并同意。<br>
                	3、其他未尽事宜，双方以书面形式另行协商约定。<br>
                </td>
            </tr>
            <tr>
            <td>甲方签章</td>
            <td colspan="3">
            	<div style="height: 50px; width: 230px;">
            		<img src="../../../images/info.jpg"  width="150px" height="50px" id="schoolUrl"/>
            		<%--<input onclick="tutorSign()" value="签名" type="button" class="layui-btn"  ></input>--%>
            	</div>
                <hr />
                <input type="datetime" readonly class="form-control" id="schoolSignDate">
                <!--<textarea name="" cols="100" rows="3" class="form-control"></textarea>-->
            </td>
            <td width="100px">乙方签章  </td>
            <td colspan="3" >
            	<div style="height: 50px; width: 230px;">
            		<img src="../../../images/info.jpg" width="150px" height="50px" id="stusignUrl"/>
            		<input onclick="studentSign()" value="签名" type="button" class="layui-btn"></input>
            	</div>
                <hr />
                <input type="datetime"  class="form-control" id="studentSignDate" readonly>
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
            var aggID = getAddressParameter("id");
            layer.confirm("您确定要提交此次申请吗？一旦提交将无法进行修改。",function(){
                $.ajax({
                    url:contextPath+"/aggreement/commitAgg.do",
                    type:"post",
                    data:{"aggID":aggID},
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
            })
    	}
    
</script>
</body>

</html>