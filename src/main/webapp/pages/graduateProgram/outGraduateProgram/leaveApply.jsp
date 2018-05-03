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
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/util.js"></script>
    <script type="text/javascript" src="../../../js/outsideGraduateDesiner/leaveApply.js"></script>
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn" onclick="basicSave()">保存</button>
    <button class="btn-primary btn" onclick="basicCommit()">提交</button>
    <script>
    	//保存
    	function basicSave(){
    		layer.alert("保存成功",function(){
    			x_admin_close()
    		})
    	}
    	//提交
    	function basicCommit(){
    		layer.confirm("您确定要提交此次申请吗？",function(){
    			x_admin_close()
    		})
    	}
    </script>
    		
    <form action="" class="layui-form">
    <table class="table table-bordered ">
        <caption style="text-align: center;">
        	<h1>计算机科学与技术学院毕业生请假申请表</h1>
        </caption>
        <tbody>
        <tr>
            <td width="100px">学生姓名</td>
            <td width="200px">
                <input type="text" class="form-control" id="studentName" name="studentName">
            </td>
            <td width="100px" >学号</td>
            <td width="300px">
         	           <input type="text" class="form-control" id="studentNum" name="studentNum">
            </td>
            <td width="100px">专业</td>
            <td width="200px">
                <input type="text" class="form-control" id="studentMajor" name="studentMajor">
            </td>
        </tr>
        <tr>
            <td width="100px">请假起止日期</td>
            <td width="450px">
            	<input id="applytimeRange" type="text" name="applytimeRange" placeholder="点击选择请假日期" autocomplete="off" class="form-control" >
            </td>
            <td>请假天数</td>
            <td colspan="3">
            	<input type="text"  class="form-control" id="leaveDays" name="leaveDays"/>
            </td>
        </tr>
        
        
        <tr>
            <td>请假去向</td>
            <td >
                <input type="text" class="form-control" id="leaveAddress" name="leaveAddress">
            </td>
            <td>个人联系电话</td>
            <td colspan="3">
                <input type="text" class="form-control" value="" id="studentTel" name="studentTel">
            </td>
            
        </tr>
        <!--家长意见-->
        <tr>
           <td>家庭地址</td>
            <td >
                <input type="text" class="form-control" id="homeAddress" name="homeAddress">
            </td>
            <td>家庭联系电话</td>
            <td colspan="3">
         	           <input type="text" class="form-control" id="homeTel" name="homeTel">
                
            </td>
        </tr>
        <tr>
           <td>请假事由</td>
            <td colspan="5" >
                <textarea name="" cols="100" rows="3" class="form-control" id="leaveReason" name="leaveReason"></textarea>
            </td>
            
        </tr>

         <tr id="1">
            <td width="50px">辅导员意见</td>
            <td colspan="2" width="700px">
            	<div>
            		<input type="radio" name="opinion1" class="agree" value="1" title="同意"/>
            		<input type="radio" name="opinion1" id="disagree" value="0" title="不同意"/>
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
            		<img src="" width="160px" height="50px" class="url"/>
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
            		<img src="" width="160px" height="50px" class="url"/>
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
            		<img src="" width="160px" height="50px" class="url"/>
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
            		<img src="" width="160px" height="50px" alt="待签字" class="url"/>
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
            		<img src="" width="160px" height="50px" class="url"/>
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
                    <input type="radio" name="opinion4" class="agree" value="1" title="同意"/>
                    <input type="radio" name="opinion4" class="disagree" value="0" title="不同意"/>
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
            		<img src="" width="160px" height="50px" class="url"/>
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
	
	
	//上传签名
	function studentSign(){
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

	
    //照片上传
    layui.use('upload', function () {
        var $ = layui.jquery, upload = layui.upload;
        var uploadInst = upload.render({
            elem: '#test1'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
    })//end 照片上传
</script>
</body>

</html>