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
</head>

<body>
<div class="x-body" style="margin:20px auto 50px auto; width:90%;">
    <button class="btn-primary btn" onclick="basicSave()">保存</button>
    <button class="btn-primary btn" onclick="basicCommit()">提交</button>
   
    <form action="" class="layui-form">
    <table class="table table-bordered ">
        <caption style="text-align: center;">
        	<h1>附件上传</h1>
        </caption>
         <tbody>
           
             <tr>
             	<td colspan="6">
             		<div class="layui-form-item">
		            	<div class="layui-inline">
					   <button type="button" class="layui-btn " id="upload_img_icon">上传图片</button>
					  </div>
					  </div>
             	</td>
               
            </tr>
             
            <tr>
            
            <td colspan="6">
             		<div class="layui-form-item">
		            	<div class="layui-inline">
		            		<div class="upload-img-box">
		            			<!--<img src="test.png" height="700px" width="900px"/>-->
		            			<dd class="upload-icon-img" >
		            				<div class="upload-pre-item" style="">
		            				<button onclick="deleteImg($(this))" class="layui-btn">
		            				<i    class="layui-icon" ></i>
		            				<button>
		            				<img src="test.png" width="600px" height="800px"  >
		            				
		            				</div>
		            			</dd>
		            			<br />
		            			<dd class="upload-icon-img" >
		            				<div class="upload-pre-item">
		            				<button onclick="deleteImg($(this))" class="layui-btn">
		            				<i    class="layui-icon" ></i>
		            				<button>
		            				<img src="test1.png"  >
		            				
		            				</div>
		            			</dd>
       						 </div>
					  </div>
					  </div>
             	</td>
            
      	 	 </tr>
       
            </tbody>
    </table>
</form>
</div>
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
	
	
	//上传图片
      var upurl = ""; //上传图片地址
    layui.use(['layer','upload'], function(){
        var layer = layui.layer;
        var upload = layui.upload;
        upload.render({ //上传图片
            elem: '#upload_img_icon',
            url: upurl,
            multiple: true, //是否允许多文件上传。设置 true即可开启。不支持ie8/9
            auto:true,//自动上传
            before: function(obj) {
                layer.msg('图片上传中...', {
                    icon: 16,
                    shade: 0.01,
                    time: 0
                })
            },
            done: function(res) {
                layer.close(layer.msg('上传成功！'));
                $('.upload-img-box').append('<dd class="upload-icon-img" ><div class="upload-pre-item"><i onclick="deleteImg($(this))"   class="layui-icon"></i><img src="' + res.data + '" class="img" ><input type="hidden" name="case_images[]" value="' + res.data + '" /></div></dd>');
            }
            ,error: function(){
                layer.msg('上传错误！');
            }
        });

    });
    function deleteImg(obj){
        //删除页面信息
        obj.parent().parent('.upload-icon-img').remove();
        //删除本地图片（ajax)
        //删除数据库图片
    }
</script>
</body>

</html>