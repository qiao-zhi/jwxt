/**
 * @author: qlq
 * @time: 15:35
 * @description: 课程库管理JS
 */
/*****************S   增加课程相关操作*****************/
//页面初始化的时候执行一些函数
$(function(){
    // test1();
    //当你在iframe页面关闭自身时

});
function test1(){
    //确认框的使用使用方法
    layui.use(['layer'],function () {
        var layer = layui.layer;
        layer.confirm("确认?",{},function(index) {
            alert("您点的是确认")
            layer.close(index);
        },function(index){
            alert("您点的是取消")
            layer.close(index);
        })

    })
}


//使用表单模块和弹出层模块。第二个参数是回调函数
layui.use(['form', 'layer'], function () {
    $ = layui.jquery;
    var form = layui.form , layer = layui.layer;//获取所需要的模块

    //监听提交
    form.on('submit(addCourse)', function (data) {
        //1.验证课程编号是否存在数据库，不能重复添加
        if(!checkoutCourseNum()){
            //layui的弹出层提示消息
            layer.msg("课程编号已经存在，请勿重复添加!");
            return false;

        }
        //第一种($.ajax提交)
        $.ajax({
           url: contextPath+"/courseLibrary/addCourse.do",
            data:data.field,
            type:"POST",
            async:false,
            dataType:'text',
            success:function (response) {
               alert(response);
                if(response == "添加成功"){
                    //增加成功之后关闭当前弹出层并且重新执行一次查询
                    window.parent.location.reload();//刷新父窗口
                    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                    parent.layer.close(index); //再执行关闭
                }
            },

        });

        //第二种($.post提交)
/*        $.post(contextPath+"/courseLibrary/addCourse.do",data.field,function (response) {
            alert(response);
        },'text')*/


    });
});

//验证课程编号是否重复
function checkoutCourseNum(){
    var value = $("[name='coursenum']").val();
    var result = true;
    //同步加载数据(判断返回结果)
    $.ajax({url:contextPath+"/courseLibrary/getCountByCourseNum.do",
            async:false,
            type:"POST",
            data:{"courseNum":value},
            success:function (response) {
                if(parseInt(response)> 0){
                    result=false;
                }
            },
            dataType:'text'})
    return result;
}

/*****************E   增加课程相关操作*****************/


/*****************S   查询课程相关操作*****************/
/**
 * 分页查询课程信息
 */
function queryCourseFY(){
    $.post(contextPath+'/courseLibrary/getCourseBaseInfosByCondition.do',$("#queryCourseForm").serialize(),showCourseInfo,'json');
}
/**
 * 填充表格
 * @param response  从后台返回的PageInfo对象
 */
function showCourseInfo(pageInfo){
    // alert(JSON.stringify(pageInfo))//打印返回的数据，将JSON转为字符串
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var courses = pageInfo.list;
    $("#courseTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = courses.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr><td>"+'<input type="radio" name="courseRadio" value="'+courses[i].courseId+'"><input type="hidden" value="'+courses[i].courseId+'"/></td>'
            +'<td>'+index+'</td>'
            +'<td>'+courses[i].courseNum+'</td>'
            +'<td>'+courses[i].coursePlatform+'</td>'
            +'<td>'+courses[i].courseNature+'</td>'
            +'<td>'+courses[i].courseNameCN+'</td>'
            +'<td>'+courses[i].credit+'/'+courses[i].courseHour+'</td>'
            +'<td>'+courses[i].weeklyHour+courses[i].courseHourMethod+'</td>'
            +'<td>'+courses[i].scoringWay+'</td>'
            +'<td>'
            +'<a title="点击查看课程详细信息" onclick="openDetailLayer(this)" href=javascript:void(0)><i class="layui-icon">&#xe615;</i></a>'
            +'<a href=javascript:void(0) title="点击修改课程基本信息" onclick="openUpdateLayer(this)"><i class="layui-icon">&#xe642;</i></a>'
            +'<a href=javascript:void(0) title="点击删除课程" onclick="deleteCourseByCourseId(this)"><i class="layui-icon">&#xe640;</i></a>'
            +'</td></tr>'
        $("#courseTbody").append(tr);
    }

    //开启分页组件
    coursesPage(total,pageNum,pageSize);
}


/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function coursesPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageDiv', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    queryCourseFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}


/**
 * 点击查询搜索按钮的点击事件
 */
function queryCourseFYBtn() {
    $("[name='pageNum']").val("");//清空当前页
    queryCourseFY();//执行查询分页函数
}


/**
 * 清空查询条件的按钮
 * 1.清空所有的条件，包括隐藏域的条件，2.重新查询一次
 * @param obj   将清空条件按钮自己传下来
 */
function clearQueryCondition(obj) {
    //1.清空条件
    var form = $(obj).parents("form");
    form.find("input").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryCourseFY();
}


/*****************E   查询课程相关操作*****************/



/*****************S   复制性新增课程相关操作*****************/
function copyAndUpdateAdd(){

    var checked = $("[name='courseRadio']:checked").length>0?true:false;
    if(!checked){
        layer.alert('请先选择需要复制的课程');
        return;
    }

    var copyCourseId = $("[name='courseRadio']:checked").val();//获取到复制课程的编号

    course_tab_show('复制性新增课程','./copyAddCourse.jsp?courseId='+copyCourseId);//打开复制增加的窗口

}

function copAddFun() {
    if(copyOk){//满足复制性新增条件进行复制性新增
         queryCourseBaseInfo(courseId);//获取页面的全局变量
    }
}



/*****************E   复制性新增课程相关操作*****************/

/***************S       查询课程详情操作*******************/
//根据课程编号查看课程基本信息
function queryCourseBaseInfo(courseId){
    $.post(contextPath+'/courseLibrary/getCourseBaseInfoById.do',{"courseId":courseId},function (courseInfoBack) {
        $("[name='courseid']").val(courseInfoBack.courseid);//向隐藏的课程主键赋值
        $("[name='coursenum']").val(courseInfoBack.coursenum);
        $("[name='courseplatform'] option[value='"+courseInfoBack.courseplatform+"']").attr("selected","true");
        $("[name='coursenamecn']").val(courseInfoBack.coursenamecn);
        $("[name='coursenameen']").val(courseInfoBack.coursenameen);
        $("[name='coursenature'] option[value='"+courseInfoBack.coursenature+"']").attr("selected","true");
        $("[name='credit']").val(courseInfoBack.credit);
        $("[name='coursehour']").val(courseInfoBack.coursehour);
        $("[name='teachhour']").val(courseInfoBack.teachhour);
        $("[name='experimenthour']").val(courseInfoBack.experimenthour);
        $("[name='computerhour']").val(courseInfoBack.computerhour);
        $("[name='practicehour']").val(courseInfoBack.practicehour);
        $("[name='weeklyhour']").val(courseInfoBack.weeklyhour);
        $("[name='coursehourmethod'] option[value='"+courseInfoBack.coursehourmethod+"']").attr("selected","true");
        $("[name='scoringway'] option[value='"+courseInfoBack.scoringway+"']").attr("selected","true");
        //最后必须重新更新渲染(使用layui的form模块)
        layui.use(['form'], function () {
            $ = layui.jquery;
            var form = layui.form;//获取layui的form模块
            form.render(); //刷新select选择框渲染
        });

    },'json')
}


function queryCourseFiles(courseId){

}


/***************E       查询课程详情操作*******************/


/*S    修改课程基本信息相关操作*/
/**
 * 打开修改页面
 * @param obj
 */
function openUpdateLayer(obj) {
    var tr_s = $(obj).parent().parent();//获取到tr元素
    var copyCourseId = tr_s.find("td:eq(0)").children(":radio").val();//定位到第一个radio的元素获取隐藏的主键
    course_tab_show('修改课程基本信息','./course-edit.jsp?courseId='+copyCourseId);//打开修改课程基本信息层
}

/**
 * 判断是否满足修改条件，满足就赋予旧值
 */
function updateCourseBaseInfo(){
    if(updateOk){//满足修改课程条件进行修改
        queryCourseBaseInfo(courseId);//获取页面的全局变量
    }

}

/**
 * 初始化layui的修改的提交表单
 */
function initUpdateForm(){
    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form , layer = layui.layer;//获取所需要的模块

        //监听提交
        form.on('submit(updateCourse)', function (data) {
            //第一种($.ajax提交)
            $.ajax({
                url: contextPath+"/courseLibrary/updateCourseBaseInfo.do",
                data:data.field,
                type:"POST",
                async:false,
                dataType:'text',
                success:function (response) {
                    alert(response)
                     window.parent.location.reload();//刷新父窗口
                     var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                     parent.layer.close(index); //再执行关闭
                },

            });
            //修改成功之后关闭当前弹出层并且重新执行一次查询


        });
    });
}



/**
 * 查询课程教学资料信息用于删除教学资料
 */
function queryCourseFileInfoForDeleteFile(){
    var courseId = $("[name='courseid']").val();//获取页面隐藏的课程主键
    $.post(contextPath+'/teachingFile/getTeachingFile.do',{"courseId":courseId},function (teachingProgramInfos) {
        if(teachingProgramInfos == null){//如果为null就结束方法
            return;
        }
        if(teachingProgramInfos.length>0 ){
            // alert(JSON.stringify(teachingProgramInfos));//打印字符串信息
            $("#courseFileTbody").html("");//清空表格
            for(var i=0,length_1 =teachingProgramInfos.length;i<length_1;i++ ){
                var tr = "<tr>"
                    +"<td><input type='hidden' value='"+teachingProgramInfos[i].coursefileid+"'>"+teachingProgramInfos[i].filetype +"</td>"
                    +"<td>"+"<a href='/file/teachingFile/"+teachingProgramInfos[i].filenowname+"' target='_blank'>"+teachingProgramInfos[i].fileoriname+"</a></td>"
                    +"<td>"+"<a href=javascript:void(0) onclick='deleteTeachingFileById(this)'><i class='layui-icon'>&#xe640;</i> </a>"+"</td>"
                    +"</tr>";
                $("#courseFileTbody").append(tr);
            }
            $("#promptLabel").css("display","none");//设置提示语不可见
            $("#courseFileTable").css("display","");//设置表格可见

        }else{
            $("#courseFileTable").css("display","none");//设置表格不可见
            $("#promptLabel").css("display","");//长度为0提示没有课程资料(设置提示语可见)
        }
    },'json')
}

/**
 * 根据课程资料编号删除资料
 * @param obj   将按钮自己传下来，获取其所在行隐藏的资料编号
 */
function deleteTeachingFileById(obj){
    var tr = $(obj).parent().parent();//获取tr元素
    var value = tr.children("td:eq(0)").children("input").val();//获取资料编号
    layui.use(['layer'],function () {
        var layer = layui.layer;
        layer.confirm("您确认删除该资料",function () {//确认之后的操作
            //进行删除文件操作
            $.post(contextPath+'/teachingFile/deleteTeachingFile.do',{"fileId":value},function (response) {
                layer.msg(response,{time:1500},function(){
                    if(response != null && "删除成功"==response){
                        //删除成功之后再次查询一次文件
                        queryCourseFileInfoForDeleteFile();
                    }
                });//弹出1.5s后关闭,关闭之后重新加载教学资料

            },'text')
        })
    })
}

/*E    修改课程基本信息相关操作*/




/***************S  上传培训资料相关操作*********/
function openUploadLayer(){
    var checked = $("[name='courseRadio']:checked").length>0?true:false;
    if(!checked){
        layer.alert('请先选择需要上传资料的课程！');
        return;
    }
    var copyCourseId = $("[name='courseRadio']:checked").val();//获取需要上传资料的课程主键
    course_tab_show('上传课程附件','./courseMaterial-add.jsp?courseId='+copyCourseId);//打开修改课程基本信息层
}

/**
 * 使用layui的upload模块上传文件
 */
function initUploadTeachingProgram(){
    layui.use(['upload','layer'], function(){
        var upload = layui.upload,layer = layui.layer;
        //选完文件后不自动上传
        upload.render({
            elem: '#uploadCourseMaterial',//对哪个元素进性格式化选择文件
            url: contextPath+'/teachingFile/upload.do',//上传的url
            auto: false,//是否自动上传
            accept: 'file', //普通文件,
            multiple:false,//支持多文件上传
            exts: 'doc|docx|pdf', //只允许上传doc,docx和pdf文件
            bindAction: '#uploadTeachingFile',//绑定到哪个按钮进行提交(提交按钮进行提交)
            data:{//另外携带的数据
                courseid: $("[name='courseid']").val(),//携带课程编号
                filetype:$("[name='filetype']").val()//携带文件类型
            },
            choose:function (obj,file) {//选中文件执行的操作
                //将每次选择的文件追加到文件队列
                // var files = obj.pushFile();//会导致传一个文件多次选择传多个文件(不可以用)
                var file = this.files ; //获取到选择的文件
                obj.preview(function(index, file, result){
                    // alert(file.name+file.size)//获取文件的名字和大小
                    $("#uploadCourseMaterial").val(file.name+"("+(file.size/1024)+"kb)")
                });
            },
            before:function (obj) {//文件上传前
                $("#uploadTeachingFile").addClass("layui-btn-disabled");//设置按钮不可以点击(增加layui的禁用按钮属性)
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
                        parent.layer.close(index); //再执行关闭
                    });

                    /* layer.confirm("确认继续上传文件?",{},function(index) {
                         //这里是确认上传的逻辑
                         layer.close(index);//关闭当前询问框
                         $("#uploadCourseMaterial").val("");//清空表单
                     },function(index){
                         //这里是取消上传的逻辑
                         layer.close(index);//关闭当前询问框
                     })*/


                }


            }
        });
    });
}

function close(){

}
/***************E  上传培训资料相关操作*********/

/****************S 查看课程详细资料相关操作********************************/
/**
 * 打开查看课程详情页面
 * @param obj   将a标签自己传下来获取隐藏的课程编号
 */
var openDetailLayer = function(obj){
    var tr_s = $(obj).parent().parent();//获取到td元素
    var courseId = tr_s.find("td:eq(0)").children(":radio").val();//定位到第一个radio的元素获取隐藏的主键
    course_tab_show('查看课程详细信息','./course-view.jsp?courseId='+courseId);//打开修改课程基本信息层
}

/**
 * 根据课程编号查看课程基本信息(前提是页面隐藏课程主键)
 */
function queryCourseBaseInfoByCourseId(){
    var courseId = $("[name='courseid']").val();//获取页面隐藏的课程主键
    $.post(contextPath+'/courseLibrary/getCourseBaseInfoById.do',{"courseId":courseId},function (courseInfoBack) {
        $("#coursenum").text(courseInfoBack.coursenum);//课程编号
        $("#courseplatform").text(courseInfoBack.courseplatform);//课程平台
        $("#coursenamecn").text(courseInfoBack.coursenamecn);//中文名称
        $("#coursenameen").text(courseInfoBack.coursenameen);//英文名称
        $("#coursenature").text(courseInfoBack.coursenature);//课程性质
        $("#credit").text(courseInfoBack.credit+"/"+courseInfoBack.coursehour);//学分/学时
        $("#teachhour").text(courseInfoBack.teachhour);//讲课时长
        $("#experimenthour").text(courseInfoBack.experimenthour);//实验时长
        $("#computerhour").text(courseInfoBack.computerhour);//上机时长
        $("#practicehour").text(courseInfoBack.practicehour);//实践时长
        $("#weeklyhour").text(courseInfoBack.weeklyhour);//周学时
        $("#scoringway").text(courseInfoBack.scoringway);//积分方式
    },'json')
}

/**
 * 查询课程教学资料信息(前提是页面隐藏课程主键)
 */
function queryCourseFileInfo(){
    var courseId = $("[name='courseid']").val();//获取页面隐藏的课程主键
    $.post(contextPath+'/teachingFile/getTeachingFile.do',{"courseId":courseId},function (teachingProgramInfos) {
        if(teachingProgramInfos == null){//如果为null就结束方法
            return;
        }

        if(teachingProgramInfos.length>0 ){
             // alert(JSON.stringify(teachingProgramInfos));//打印字符串信息
            $("#courseFileTbody").html("");//清空表格
            for(var i=0,length_1 =teachingProgramInfos.length;i<length_1;i++ ){
                var tr = "<tr><td>"+teachingProgramInfos[i].filetype
                    +"</td><td>"+"<a href='/file/teachingFile/"+teachingProgramInfos[i].filenowname+"' target='_blank'>"+teachingProgramInfos[i].fileoriname
                    +"</a></td></tr>";
                $("#courseFileTbody").append(tr);
            }
            $("#courseFileTable").css("display","");//设置表格可见
        }else{
            $("#promptLabel").css("display","");//长度为0提示没有课程资料(设置提示语可见)
        }
    },'json')
}





/****************E 查看课程详细资料相关操作********************************/


/****S           删除课程相关操作********************/
/**
 * 根据课程编号删除课程信息
 * @param obj   将需要删除的按钮自己传下来用于删除课程编号
 */
function deleteCourseByCourseId(obj){
    var tr = $(obj).parent().parent();//获取到tr元素
    var courseid = tr.children("td:eq(0)").children("input").val();//获取到当前行的课程主键

/*    layer.open({
        title: '确认删除课程信息',
        content: '确定要删除课程信息?删除后不可以恢复!',
        btn: ['确定', '取消'],
        yes: function(index, layero){//确定按钮的事件
            //post请求删除
            $.post(contextPath+"/courseLibrary/deleteCourseById.do",{"courseid":courseid},function(response) {
                //如果你想关闭最新弹出的层，直接获取layer.index即可
            },'json')
            layer.close(layer.index);
            layer.msg("删除成功!",{time:1.5*1000},function () {
                queryCourseFY();//消息框淡出之后重新加载
            });
        }
    });   */

    layer.open({
        title: '确认删除课程信息',
        content: '确定要删除课程信息?删除后不可以恢复!',
        btn: ['确定', '取消'],
        yes: function(index, layero){//确定按钮的事件
            //post请求删除
            $.ajax({
                url:contextPath+"/courseLibrary/deleteCourseById.do",
                type:'POST',
                async:true,
                data:{"courseid":courseid},
                success:function(response) {
                //如果你想关闭最新弹出的层，直接获取layer.index即可
                    layer.close(layer.index);
                },
                dataType:'json'
            });
            layer.msg("删除成功!",{time:1.5*1000},function () {
                queryCourseFY();//消息框淡出之后重新加载
            });
        }
    });
}
/****E           删除课程相关操作********************/

/******S          导出课程相关操作*****************/
/**
 * 点击导出按钮的时候导出课程信息
 */
function downloadCourses(){
    layui.use(['layer'],function () {
        var layer = layui.layer;
        //询问是否确认下载
        layer.confirm('确认下载课程信息?',function (index) {
             $("#queryCourseForm").attr("action",contextPath+"/downCourses.do");//改变表单的提交地址为下载的地址
             $("#queryCourseForm").submit();//提交表单
            layer.close(index);
        });
    });
}
/******E          导出课程相关操作*****************/


/********S       导入课程相关操作******/
layui.use(['layer','upload'],function () {//使用文件上传和layer模块
    var layer =layui.layer,upload = layui.upload;
    var index;
    var uploadInst = upload.render({
        elem: '#importCoursesBtn',//绑定的元素
        url: contextPath+'/uploadCourseExcel.do',//提交的url
        auto:true,//是否自动上传
        accept:"file",//指定允许上传的文件类型
        multiple:false,//支持多文件上传
        exts:'xls|xlsx',
        before:function (obj) {
            index = layer.load(); //上传的时候打开load层
        },
        done: function(res){ //假设code=0代表上传成功
            layer.close(index);//关闭load层
            layer.close(layer.index); //它获取的始终是最新弹出的某个层，值是由layer内部动态递增计算的
            layer.alert(res.msg);
        }
    });


})
/********E       导入课程相关操作******/












/* S            弹出层相关操作 */
/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    w       弹出层宽度（缺省调默认值）
    h       弹出层高度（缺省调默认值）
*/
function course_tab_show(title,url,w,h){
    if (title == null || title == '') {
        title=false;
    };
    if (url == null || url == '') {
        url="404.html";
    };
    if (w == null || w == '') {
        w=($(window).width()*0.90);
    };
    if (h == null || h == '') {
        h=($(window).height()-50);
    };
    layer.open({
        type: 2,
        area: [w+'px', h +'px'],
        fix: false, //不固定
        maxmin: true,
        shadeClose: true,
        shade:0.4,
        title: title,
        content: url
    });
}
/* E            弹出层相关操作 */














