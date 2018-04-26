/**
 * @author: qlq
 * @time: 15:35
 * @description: 课程库管理JS
 */

//页面初始化的时候执行一些JS函数
$(function () {
    queryCourseFY();//分页查询课程信息
});




/*****************S   增加课程相关操作*****************/

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
            +'<td>'+'<a href=javascript:void(0) title="点击修改课程基本信息" onclick="openUpdateLayer(this)"><i class="layui-icon">&#xe63c;</i></a><a href=""></a><a href=""></a>'+'</td></tr>'
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
        $("[name='courseplatform'] option[value='"+courseInfoBack.courseplatform+"']").attr("selected","selected");
        $("[name='coursenamecn']").val(courseInfoBack.coursenamecn);
        $("[name='coursenameen']").val(courseInfoBack.coursenameen);
        $("[name='coursenature'] option[value='"+courseInfoBack.coursenature+"']").attr("selected","selected");
        $("[name='credit']").val(courseInfoBack.credit);
        $("[name='coursehour']").val(courseInfoBack.coursehour);
        $("[name='teachhour']").val(courseInfoBack.teachhour);
        $("[name='experimenthour']").val(courseInfoBack.experimenthour);
        $("[name='computerhour']").val(courseInfoBack.computerhour);
        $("[name='practicehour']").val(courseInfoBack.practicehour);
        $("[name='weeklyhour']").val(courseInfoBack.weeklyhour);
        $("[name='coursehourmethod'] option[value='"+courseInfoBack.coursehourmethod+"']").attr("selected","selected");
        $("[name='scoringway'] option[value='"+courseInfoBack.scoringway+"']").attr("selected","selected");
    },'json')
}


/***************E       查询课程详情操作*******************/




/*S    修改课程基本信息相关操作*/
/**
 * 打开修改页面
 * @param obj
 */
function openUpdateLayer(obj) {
    var tr_s = $(obj).parent().parent();//获取到td元素
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
 * 拦截修改表单的提交
 */
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
                alert(response);
                if(response == "修改成功"){
                    //增加成功之后关闭当前弹出层并且重新执行一次查询
                    window.parent.location.reload();//刷新父窗口
                    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                    parent.layer.close(index); //再执行关闭
                }
            },

        });
    });
});

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






/***************E  上传培训资料相关操作*********/











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













