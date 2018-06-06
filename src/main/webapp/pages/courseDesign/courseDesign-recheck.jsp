<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>审核课设报告</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>


    <script type="text/javascript">
        var ids;
        $(function () {
            <%
                String ids = request.getParameter("ids");
            %>
            ids = "<%=ids%>";
           // alert(ids)
        })
        
        function saveCheck() {
            var checkAdvice = $("#checkAdvice").val();
            var checkStatus = $("#selecCheck").find("option:selected").val();
            $.ajax({
                url:"/jwxt/checkCourseDesignReport/saveCourseDesignReportCheckResult.do",
                type:"post",
                data:{"courseDesignTeacherStudentIDs":ids,
                        "checkAdvice":checkAdvice,
                        "checkStatus":checkStatus
                },
                dataType:"json",
                success:function () {
                    layer.alert("审核成功");

                    var index = parent.layer.getFrameIndex(window.name);
                    window.parent.findStudentReportStatus();// 调用父窗口方法
                    //关闭当前frame
                    parent.layer.close(index);
                },
                error:function () {
                    layer.alert("审核失败！");
                }
            })
        }
        
        
    </script>
   
</head>

<body>
<div class="x-body">
	
	 <!--<h4 style="text-align: center; font-size: 14px;">计算机学院&nbsp;&nbsp;软件工程专业&nbsp;&nbsp;2016/2017学年&nbsp;&nbsp;第2学期 &nbsp;&nbsp;排课计划表</h4><br />-->
	
    <form class="layui-form">
    	<div class="layui-form-item" >
            <label for="" class="layui-form-label">
              审核人
            </label>
            <div class="layui-input-inline">
                 <input type="text" name="" required  lay-verify="required"   class="layui-input" value="张三" disabled> 
            </div>
        </div>
       
        <!--3-->
        <div class="layui-form-item" >
            <label for="" class="layui-form-label">
              审核结果
            </label>
            <div class="layui-input-inline">
                <select name="" lay-verify="" id="selecCheck" lay-search lay-filter="selectTeacher" >
				        <option value="">点击选择审核结果</option>
				        <option value="1">审核通过</option>
               		    <option value="2">审核不通过</option>
				</select>
				
				
            </div>
            
        </div>
         
        
        <div class="layui-form-item">
            <label for="" class="layui-form-label">
              审核意见
            </label>
            <div class="layui-input-inline">
                <textarea id="checkAdvice" style="height: 250px;" name="" required lay-verify="required" placeholder="请输入审核意见" class="layui-textarea"></textarea>
				 
            </div>
            <!--<div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>必须填写
            </div>-->
        </div>
        <!--4-->
        
        <!---->
        <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button type="button" onclick="saveCheck();" class="layui-btn" lay-filter="add" lay-submit="">
                  确认审核
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
         
//
//        //自定义验证规则
//        form.verify({
//            nikename: function (value) {
//                if (value.length < 5) {
//                    return '昵称至少得5个字符啊';
//                }
//            }
//            , pass: [/(.+){6,12}$/, '密码必须6到12位']
//            , repass: function (value) {
//                if ($('#L_pass').val() != $('#L_repass').val()) {
//                    return '两次密码不一致';
//                }
//            }
//        });
//
//        //监听提交
//        form.on('submit(add)', function (data) {
//            console.log(data);
//            //发异步，把数据提交给
//            layer.alert("审核成功", {icon: 6}, function () {
//                // 获得frame索引
//              var index = parent.layer.getFrameIndex(window.name);
//                //关闭当前frame
//             parent.layer.close(index);
//            });
//            return false;
//        });
       

    });
</script>

</body>

</html>