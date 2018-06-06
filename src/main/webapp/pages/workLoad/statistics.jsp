<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>工作量管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>

    <script type="text/javascript">
        $(function () {
            $.ajax({
                url:"/jwxt/searchWorkLoad/getYearNumList.do",
                type:"post",
                data:{},
                async:false,
                dataType:"json",
                success:function (yearNumList) {
                    var yearNumList = yearNumList;
                    for ( var i=0;i<yearNumList.length;i++ ){
                        $("#yearNum").append(
                            "<option value='"+yearNumList[i]+"'>"+yearNumList[i]+"</option>"
                        );
                    }
                    layui.use(['form'],function () {
                        var form = layui.form;
                        form.render('select'); //刷新select选择框渲染
                    });
                },
                error:function () {
                    layer.alert("加载学年失败")
                }
            });
            searchAllWorkLoad();

        })

        // 查询点击事件
        var courseType;
        function workLoadSearch(){

            $("#showInfo").html("");
            $("[name='pageNum']").val(1);    //向隐藏域设置当前页的值
            $("[name='pageSize']").val(6); // 向隐藏域设置当前页的大小
            courseType = $("#courseType").find("option:selected").val();
            if(courseType == 1){
                searchCourse();
            }else if (courseType == 2){
                searchCourseDesign();
            } else if (courseType == 3){
                searchGrduateDesign();
            } else{
               searchAllWorkLoad();
            }

        }

        // 课程
        function searchCourse(){
            var yearNum = $("#yearNum").find("option:selected").val();
            var semester = $("#semester").find("option:selected").val();
            var teacherName = $("#teacherName").val();
            $.ajax({
                url:"/jwxt/courseWorkLoad/findCourseWorkLoad.do",
                type:"post",
                async:false,
                data:{"yearNum":yearNum,"semester":semester,"courseType":courseType,"teacherName":teacherName,
                    "pageNum": $("[name='pageNum']").val(),"pageSize": $("[name='pageSize']").val()},
                dataType:"json",
                success:function(pageInfo){
                    var total = pageInfo.total;
                    var pageSize = pageInfo.pageSize;
                    var pageNum = pageInfo.pageNum;
                    var listInfo = pageInfo.list;
                    $("#showInfo").html("");
                    for(var i=0;i<listInfo.length;i++){
                        var index = (pageNum-1)*pageSize + i +1;
                        $("#showInfo").append(
                            " <tr>" +
                            "<td>" +
                            "<div onclick='changeClass(this);' class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                            "</td>" +
                            "<td>"+index+"</td>" +
                            "<td style='display:none;'>"+listInfo[i].teacher_course_id+"</td>" +
                            "<td>"+listInfo[i].teacher_number+"</td>" +
                            "<td>"+listInfo[i].teacher_name+"</td>" +
                            "<td>"+listInfo[i].academic_year+"</td>" +
                            "<td>"+listInfo[i].term+"</td>" +
                            "<td>课程</td>" +
                            "<td>"+listInfo[i].course_name+"</td>" +
                            "<td>"+listInfo[i].classNames+"</td>" +
                            "<td>"+listInfo[i].stuNum+"</td>" +
                            "<td class='td-manage keshe'>" +
                            "<a title='点击查看工作详细信息'   onclick='courseWorkInfo(this)' >" +
                            "<i class='layui-icon'>&#xe63c;</i>" +
                            "</a>" +
                            "</td>" +
                            "</tr>"
                        );
                    }
                    openStartPage(total,pageNum,pageSize);
                },
                error:function(){
                    layer.alert("课程信息加载失败");
                }
            })
        }



        // 查询课设
        function searchCourseDesign() {
            var yearNum = $("#yearNum").find("option:selected").val();
            var semester = $("#semester").find("option:selected").val();
            var teacherName = $("#teacherName").val();
            $.ajax({
                url:"/jwxt/teachingWorkLoad/searchCourseDesignWorkLoad.do",
                type:"post",
                async:false,
                // 默认给定教师id    应从session中获取
                data:{"yearNum":yearNum,"semester":semester,"courseType":courseType,"teacherName":teacherName,
                    "pageNum": $("[name='pageNum']").val(),"pageSize": $("[name='pageSize']").val()},
                dataType:"json",
                success:function (pageInfo) {
                    var total = pageInfo.total;
                    var pageNum = pageInfo.pageNum;
                    var pageSize = pageInfo.pageSize;
                    var courseDesignList = pageInfo.list;
                   $("#showInfo").html("");
                    // 课设
                    for(var i=0;i<courseDesignList.length;i++){
                       var index = (pageNum - 1)*pageSize + i + 1;
                        $("#showInfo").append(
                            "<tr class='courseDesign'>" +
                            "<td>" +
                                "<div onclick='changeClass(this);' class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                            "</td>" +
                            "<td>"+index+"</td>" +
                            "<td style='display:none;'>"+courseDesignList[i].courseDesignTeacherArrangeID+"</td>" +
                            "<td>"+courseDesignList[i].teacherNum+"</td>" +
                            "<td>"+courseDesignList[i].teacherName+"</td>" +
                            "<td>"+courseDesignList[i].yearNum+"</td>" +
                            "<td>"+courseDesignList[i].semester+"</td>" +
                            "<td>课设</td>" +
                            "<td>"+courseDesignList[i].courseDesignName+"</td>" +
                            "<td>"+courseDesignList[i].classNames+"</td>" +
                            "<td>"+courseDesignList[i].stuCount+"</td>" +
                            "<td class='td-manage keshe'>" +
                                "<a title='点击查看课设工作详细信息' onclick='courseDesignWorkInfo(this);'>" +
                                    "<i class='layui-icon'>&#xe63c;</i>" +
                                "</a>" +
                            "</td>" +
                            "</tr>"
                        );
                    }
                    openStartPage(total,pageNum,pageSize);
                },
                error:function () {
                    layer.alert("查询信息失败!")
                }
            })

        }
        
        // 毕设
        function searchGrduateDesign() {
            var yearNum = $("#yearNum").find("option:selected").val();
            var semester = $("#semester").find("option:selected").val();
            var teacherName = $("#teacherName").val();
            $.ajax({
                url:"/jwxt/grduateDesignWorkLoad/searchGrduateDesignWorkLoad.do",
                type:"post",
                async:false,
                // 默认给定教师id    应从session中获取
                data:{"yearNum":yearNum,"semester":semester,"courseType":courseType,"teacherName":teacherName,
                    "pageNum": $("[name='pageNum']").val(),"pageSize": $("[name='pageSize']").val()},
                dataType:"json",
                success:function (pageInfo) {
                    var total = pageInfo.total;
                    var pageSize = pageInfo.pageSize;
                    var pageNum = pageInfo.pageNum;
                    var list = pageInfo.list;
                    $("#showInfo").html("");
                    for(var i=0;i<list.length;i++){
                        var index = (pageNum - 1)*pageSize +i +1;
                        $("#showInfo").append(
                            " <tr>" +
                            "<td>" +
                                "<div onclick='changeClass(this)' class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                            "</td>" +
                            "<td>"+index+"</td>" +
                            "<td style='display:none;'>"+list[i].teacherTitleID+"</td>" +
                            "<td>"+list[i].teacherNum+"</td>" +
                            "<td>"+list[i].teacherName+"</td>" +
                            "<td>"+list[i].yearNum+"</td>" +
                            "<td>"+list[i].semesterNum+"</td>" +
                            "<td>毕设</td>" +
                            "<td>"+list[i].graduateDesignName+"</td>" +
                            "<td>----</td>" +
                            "<td>"+list[i].stuNum+"</td>" +
                            "<td class='td-manage keshe'>" +
                                "<a title='点击查看工作详细信息'   onclick='showOneDetail(this)' >" +
                                    "<i class='layui-icon'>&#xe63c;</i>" +
                                "</a>" +
                            "</td>" +
                            "</tr>"
                        );
                    }
                    openStartPage(total,pageNum,pageSize);
                },
                error:function () {
                    layer.alert("查询毕设信息失败");
                }
            })
        }

        // 所有
        function searchAllWorkLoad() {
            var yearNum = $("#yearNum").find("option:selected").val();
            var semester = $("#semester").find("option:selected").val();
            var teacherName = $("#teacherName").val();

            $.ajax({
                url:"/jwxt/searchWorkLoad/findWorkLoad.do",
                type:"post",
                data:{"yearNum":yearNum,"semester":semester,"courseType":courseType,"teacherName":teacherName,
                    "pageNum": $("[name='pageNum']").val(),"pageSize": $("[name='pageSize']").val()},
                dataType:"json",
                success:function (pageMap) {
                    var total = pageMap.total;
                    var pageSize = pageMap.pageSize;
                    var pageNum = pageMap.pageNum;
                    var infoList = pageMap.infoList;
                    $("#showInfo").html("");
                    for(var i=0;i<infoList.length;i++){
                        var index = (pageNum - 1)*pageSize + i+1;
                        $("#showInfo").append(
                            " <tr>" +
                            "<td>" +
                                "<div class='layui-unselect layui-form-checkbox' onclick='changeClass(this)' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                            "</td>" +
                            "<td>"+index+"</td>" +
                            "<td style='display: none'>"+infoList[i].detailKey+"</td>" +
                            "<td>"+infoList[i].teacherNum+"</td>" +
                            "<td>"+infoList[i].teacherName+"</td>" +
                            "<td>"+infoList[i].yearNum+"</td>" +
                            "<td>"+infoList[i].semester+"</td>" +
                            "<td>"+infoList[i].typeCN+"</td>" +
                            "<td>"+infoList[i].workName+"</td>" +
                            "<td>"+infoList[i].classNames+"</td>" +
                            "<td>"+infoList[i].stuCount+"</td>" +
                            "<td class='td-manage keshe'>" +
                                "<a title='点击查看工作详细信息'   onclick='showOneDetail(this);' >" +
                                    "<i class='layui-icon'>&#xe63c;</i>" +
                                "</a>" +
                            "</td>" +
                            "</tr>"
                        );
                    }
                    openStartPage(total,pageNum,pageSize);
                },
                error:function () {
                    layer.alert("加载all失败")
                }
            })
        }

        function openStartPage(total,pageNum,pageSize) {
            layui.use(['laypage','layer'],function () {
                var laypage = layui.laypage,layer = layui.layer;
                laypage.render({
                    elem:"pageDiv",
                    count:total,
                    curr:pageNum,
                    limit:pageSize,
                    limits:[6],
                    layout:['limit','prev','page','next','skip','count'],
                    jump:function (obj,first) {
                        $("[name='pageNum']").val(obj.curr);    //向隐藏域设置当前页的值
                        $("[name='pageSize']").val(obj.limit); // 向隐藏域设置当前页的大小
                        if(!first){
                            if(courseType == 1){
                                searchCourse();
                            } else if(courseType == 2){
                                searchCourseDesign();
                            }else if(courseType == 3){
                                searchGrduateDesign();
                            }else{
                                searchAllWorkLoad();
                            }

                        }
                    }
                })
            })
        }

        function showOneDetail(obj) {
            var showType = $(obj).parent("td").parent("tr").find("td:eq(7)").text();
          //  alert(showType)
            if(showType == "课程"){
                courseWorkInfo(obj);
            }
            if(showType == "课设"){
                courseDesignWorkInfo(obj);
            }
            if(showType == "毕设"){
                grduateDesignWorkInfo (obj);
            }
        }
        function courseWorkInfo(obj) {
            var teacher_course_id = $(obj).parent("td").parent("tr").find("td:eq(2)").text();
            x_admin_show('工作详细信息','courseWorkLoad-detail.jsp?teacher_course_id='+teacher_course_id);
        }

        function courseDesignWorkInfo (obj) {
            var courseDesignTeacherArrangeID = $(obj).parent("td").parent("tr").find("td:eq(2)").text();
          // alert(courseDesignTeacherArrangeID);
            x_admin_show('工作详细信息','courseDesignWorkLoad-detail.jsp?courseDesignTeacherArrangeID='+courseDesignTeacherArrangeID);
        }

        function grduateDesignWorkInfo (obj) {
            var teacherTitleID = $(obj).parent("td").parent("tr").find("td:eq(2)").text();
            x_admin_show('工作详细信息','grduateDesignWorkLoad-detail.jsp?teacherTitleID='+teacherTitleID);
        }

        function changeClass(obj) {
            if ($(obj).hasClass("layui-form-checked")) {
                $(obj).removeClass("layui-form-checked");
                //$(obj).attr("name","selected");
            } else {
                $(obj).addClass("layui-form-checked");
                //$(obj).attr("name","none");
            }
        }


    </script>

</head>
<body>
<!--面包屑-->
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="../../welcome.html">首页</a>
        <a href="">教学工作量</a>
        <a>
          <cite>教学工作量统计</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="iconfont" style="line-height:30px">&#xe6aa;</i>
    </a>
    <a class="layui-btn layui-btn-warm layui-btn-small" style="margin-top:3px;float:right;margin-right:3px;"
       onclick="closeOther()" title="关闭其他">
        <i class="iconfont" style="line-height:30px">&#xe6b7;</i>
    </a>
</div>
<!--主体-->
<div class="x-body">
    <!--查询-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
        	<div class="layui-input-inline">
               <select name="" lay-verify="" id="yearNum">
				  <option value="">请选择学年</option>

				</select>
            </div>
             <div class="layui-input-inline">
               <select name="" lay-verify="" id="semester">
				  <option value="">请选择学期</option>
				  <option value="1">第一学期</option>
				  <option value="2">第二学期</option>
				</select>
            </div>
             
             <div class="layui-input-inline">
               <select name="" lay-verify="" id="courseType">
				  <option value="">请选择类型</option>
				  <option value="1">课程</option>
				  <option value="2">课设</option>
				  <option value="3">毕设</option>
				</select>
            </div>
            <div class="layui-input-inline">
               <input type="text" id="teacherName" value="" name="" placeholder="请输入教师姓名" class="layui-input">
            </div>
            <button type="button" onclick="workLoadSearch();" class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <!--end查询-->
    <!--操作区域-->
    <xblock>
        <button class="layui-btn layui-btn-normal" onclick="courseDesignImport()">导出 </button>
    </xblock>
	<script>
		$(document).ready(function(){
			desideType()
		});
		function desideType(){
			$(".layui-table tr").each(function(){
				var typeValue=$(this).children('td').eq(5).text();
				if(typeValue="课设"){
//					alert("课设")
				}
//				alert(typeValue)
			});
		}
//		$(document).ready(function(){
//		$(".layui-table tr").each(function(){      //先获得每一行
//			var statu=$(this).children('td').eq(5).text();   //获得特定列的值
//			alert(statu)
//			if(statu='未上传'){      //判断
//			$(this).children('td').eq(5).addClass("warnInfo");  //
//			}
//		});
//    });s

	</script>    
    <!--表格内容-->
    <form>
    <table class="layui-table workLoad">
        <thead>
        <tr>
            <th>
                <div  class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">
                    &#xe605;</i>
                </div>
            </th>
         	<th>序号</th>
            <th>教师编号</th>
            <th>教师名称</th>

            <th>学年</th>
            <th>学期</th>
            <th>教学类型</th>
            <!--<th>上传人</th>
            <th>课程设计安排</th>-->
            <th>课程名称</th>
            <th>任课班级</th>
            <th>任课人数</th>
            <th>详情</th>
        </tr>
        </thead>
        <tbody id="showInfo">

        <!--   拼好的串
        " <tr>" +
            "<td>" +
                "<div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                "</td>" +
            "<td>1</td>" +
            "<td>201700917</td>" +
            "<td>老王</td>" +
            "<td>2014-2015</td>" +
            "<td>2</td>" +
            "<td>课设</td>" +
            "<td>Java</td>" +
            "<td>软件一班</td>" +
            "<td>38</td>" +
            "<td class='td-manage keshe'>" +
                "<a title='点击查看课设工作详细信息'   onclick=\"x_admin_show('课设工作详细信息','courseDesignWorkLoad-detail.jsp')\" >" +
                    "<i class='layui-icon'>&#xe63c;</i>" +
                    "</a>" +
                "</td>" +
            "</tr>"

        -->


        <tr>
            <td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">
                    &#xe605;</i></div>
            </td>
            <td>1</td>
            <td>201700917</td>
            <td>老王</td>
            <td>2014-2015</td>
            <td>2</td>
            <td>课设</td>
            <td>Java</td>
            <td>软件一班</td>
            <td>38</td>
            <td class="td-manage keshe">
                <a title="点击查看课设工作详细信息"   onclick="x_admin_show('课设工作详细信息','courseDesignWorkLoad-detail.jsp')" href="javascript:;">
                    <i class="layui-icon">&#xe63c;</i>
                </a>
            </td>
        </tr>

        </tbody>
    </table>
        <input type="hidden" name="pageNum"><input type="hidden" name="pageSize">
    </form>
    <!--end 表格内容-->

    <!--分页-->
    <div id="pageDiv"></div>
    <!--end 分页-->
</div>

<script>
	//判断选择事件
	var chooseCourse=0;//判断是否选中课程
	function panduan(){
		$(".layui-form-checkbox").each(function() { 
			if ($(this).hasClass("layui-form-checked")) {
				chooseCourse++;
			}
		})
	}
	function courseDesignImport(){
		panduan();//调用判断方法
		if (chooseCourse>0) {
						layer.alert('导出成功');
					}
		else{
			layer.alert('请先选择需要导出的课设信息');
		}
		chooseCourse=0;//清空值
	}

    //点击关闭其他，触发事件
    function closeOther() {
        var closeTable = $(".layui-tab-title", parent.document).children("li");
        closeTable.each(function () {
            if ($(this).attr("class") == "") {
                $(this).children("i").trigger("click");
            }
        })
    }

    /*用户-删除*/
    function member_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }
</script>
</body>

</html>