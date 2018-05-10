/**
 * @author: qlq
 * @time: 18:09
 * @description:    培养方案课程类别树和培养方案课程分配JS
 */

/**
 * 自调函数测试JS是否正确
 */
(function () {
    // alert("一次性自调函数");
})();

/********S   几个全局函数************/


/**
 * 获取layui的layer层的函数
 * @returns {*} layer对象
 */
function getLauiLayer(){
    var layer;
    layui.use(['layer'],function () {
        layer = layui.layer;
    })
    return layer;
}

/**
 * 获取页面中的培养方案编号
 * @returns {*|jQuery}  页面中隐藏的培养方案编号
 */
function getTrainSchemeId() {
    return $("#trainSchemeId").val();
}


/**
 * 一个值如果是null或者''返回-
 * @param value 需要处理的值
 * @param length 需要截取的字符的长度的值,未指定的时候返回全部
 * @returns {*} 处理过的值
 */
function replaceNull(value,length) {
    //判断截取的值是否为空
    if(value == null || value == ""){
        return "-";
    }
    //判断长度是否为空
    if(length == null || length == ''){
        return value;
    }
    return value.toString().substr(0,length);
}

/**
 * 判断一个值是否是数字(如果是正数或者负数返回true)
 * @param val   输入的值
 * @returns {boolean}   返回true或者false
 */
function isNumber(val){
    var regPos = /^\d+(\.\d+)?$/; //非负浮点数
    var regNeg = /^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$/; //负浮点数
    if(regPos.test(val) || regNeg.test(val)){
        if(parseInt(val)>8 || parseInt(val)<1){
            return  false;
        }
        return true;
    }else{
        return false;
    }
}




/********E   几个全局函数************/


/**
 * 页面加载完成执行的函数
 */
$(function () {
    // alert("页面加载完成")
    // alert($("#trainSchemeId").val())//获取页面隐藏的培养方案编号
    getTypeTree();//初始化左边的树
    getTrainSchemeInfo();//初始化培养方案基本信息
    queryTrainCourseByCondition();//初始化培养方案课程信息
});

/*******S   layui相关监听函数*********/
layui.use(['form','layer'],function () {
    var layer = layui.layer,form = layui.form;

    //1.监听添加课程类别的表单提交事件
    form.on('submit(addCourseType)', function(data){
        $.post(contextPath+"/courseType/addCourseType.do",$("#addCourseTypeForm").serialize(),function (response) {
            layer.close($("#hidden_addType_index").val());//关闭模态框
            layer.msg(response,{icon:1,shade: [0.8, '#393D49']});//打印信息
            if(response!=null && "添加成功"==response)
                getTypeTree();
        },"text")
    });













});
/*******E   layui相关监听函数*********/



/********S   左边树相关操作**********/
/**
 * 查询课程类别树结构
 */
function getTypeTree(){
    $.getJSON(contextPath + '/courseType/getTypeTree.do',{"trainSchemeId":$("#trainSchemeId").val()},geneTypeTree);
}

/**
 * 生成课程类别树函数
 * @param typeTree  返回的课程类别信息(多一条虚拟的课程类别节点)
 */
function geneTypeTree(typeTree){
    var setting = {
        view : {
            addHoverDom : addHoverDom,//用于当鼠标移动到节点上时，显示用户自定义控件，显示隐藏状态同 zTree 内部的编辑、删除按钮
            removeHoverDom : removeHoverDom,//用于当鼠标移出节点时，隐藏用户自定义控件，显示隐藏状态同 zTree 内部的编辑、删除按钮
            selectedMulti : false //设置是否允许同时选中多个节点。
        },
        edit : {
            enable : true,//设置 zTree 是否处于编辑状态
            editNameSelectAll : true,//节点编辑名称 input 初次显示时,设置 txt 内容是否为全选状态。
            removeTitle : '删除课程类别',
            renameTitle : '重命名课程类别'
        },
        data : {
            simpleData : {
                enable : true,
                idKey : "typenum",
                pIdKey : "uptypenum",
                rootPId : "1"
            },
            key : {
                name : "typename",
            }
        },
        callback : {
            beforeRemove : beforeRemove,//点击删除时触发，用来提示用户是否确定删除
            beforeEditName : beforeEditName,//点击编辑时触发，用来判断该节点是否能编辑
            beforeRename : beforeRename,//编辑结束时触发，用来验证输入的数据是否符合要求
            onRemove : onRemove,//删除节点后触发，用户后台操作
            onRename : onRename,//编辑后触发，用于操作后台
            onClick : clickNode//点击节点触发的事件
        }
    };
    var treeNodes = typeTree;//树节点数据(从后台获取)
    $.fn.zTree.init($("#treeDiv"), setting, treeNodes);//在界面生成一颗树
    openAllTreenode();//展开树的所有节点
}

/**
 * 展开树的所有节点
 */
function openAllTreenode(){

    // 获取树对象
    var treeObj = $.fn.zTree.getZTreeObj("treeDiv");
    /* 获取所有树节点 */
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    // 展开除第一级之外的其他节点
    for (var i = 0, length_1 = nodes.length; i < length_1; i++) {
        if(nodes[i].level == 0){
            continue;
        }
        nodes[i].open = true;
    }
    //展开第一级节点
    treeObj.expandNode(nodes[0], true);

}



/******S  删除*******/
/**
 * 删除前的询问(验证是否可以删除)
 * @param treeId
 * @param treeNode  需要删除的树节点
 * @returns {boolean} 是否可以执行删除函数
 */
function beforeRemove(treeId, treeNode) {
    var layer =getLauiLayer();
    if(treeNode.level == 0){
        layer.msg("您不可以删除根节点!请从二级节点开始操作!",{icon:2,shade: [0.8, '#393D49']})
        return false;
    }
    if(treeNode.isParent){
        layer.msg("该目录下面还有子目录，请从最底层目录开始删除!",{icon:2,shade: [0.8, '#393D49']})
        return false;
    }
    //如果表格中有数据就不让删除
    if($("#trainCourseTbody").children("tr").length>0){
        layer.msg("该节点已经排有课程，不允许删除课程类别!先删除培养方案课程!",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
        return false;
    }
    if(confirm("确认删除?")){
        return true;
    }
    return false;
}

/**
 * 删除的操作
 * @param e 事件
 * @param treeId    树的界面中的ID
 * @param treeNode  节点
 */
function onRemove(e, treeId,treeNode) {
    var layer = getLauiLayer();
    var trainSchemeId = getTrainSchemeId();//培养方案编号
    var typeNum = treeNode.typenum;//类别num
    $.post(contextPath+"/courseType/deleteCourseType.do",{"trainSchemeId":trainSchemeId,"typeNum":typeNum},function (response) {
        layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
            if("删除成功" == response){
                getTypeTree();//重新生成树
                //1.清空条件
                var form = $("#queryTrainCourseForm");
                form.find("input").not("#queryTrainCourseTrainshemeId").val("");
                form.find("select").val("");
                //2.重新查询一次
                queryTrainCourseByCondition();
            }
        })
    },'text')
}
/******E  删除*******/



/****S  编辑根节点****/
/**
 * 验证是否可以进入编辑模式
 * @param treeId
 * @param treeNode
 * @returns {boolean}   true|false代表是否进入编辑模式
 */
function beforeEditName(treeId,treeNode) {
    var layer;
    layui.use(['layer'],function () {
        layer = layui.layer;
    });
    //如果是根节点不允许编辑
    if(treeNode.level == 0 ){
        layer.msg("您不能编辑根节点!",{icon:2,shade: [0.8, '#393D49']});
        return false;
    }
    return true;
}

/**
 * 用于捕获节点编辑名称结束（Input 失去焦点 或 按下 Enter 键）之后，更新节点名称数据之前的事件回调函数，并且根据返回值确定是否允许更改名称的操作
 * @param treeId
 * @param treeNode
 * @param newName
 * @param isCancel
 * @returns {boolean}   是否成功
 */
function beforeRename(treeId,treeNode, newName,isCancel) {
    var layer;
    layui.use(['layer'],function () {
        layer = layui.layer;
    })
    if (($.trim(newName)).length < 2) {
        layer.alert("名称不能少于2个字符！")
        return false;
    }
    return true;
}

/**
 * 修改名称的操作(正经的修改传到后台进行操作)
 * @param e
 * @param treeId
 * @param treeNode
 * @param isCancel
 */
function onRename(e, treeId,treeNode, isCancel) {
    //如果选择了取消，重新查一下树
    if(isCancel == true){
        getTypeTree()
        return false;
    }
    if(confirm("您确认修改类别名称?")) {
        $.post(contextPath+"/courseType/updateCourseType.do",
            {
                "trainSchemeId":$("#trainSchemeId").val(),
                "typeNum":treeNode.typenum,
                "typeName":treeNode.typename
            },
            function(response){
                if(response != null){
                    var layer;
                    layui.use("layer",function () {
                        layer = layui.layer;
                    });
                    layer.msg(response,{shade: [0.8, '#393D49'],time:2*1000,icon:1},function () {
                        if("修改成功"==response){
                            getTypeTree();//修改成功之后重新查一下树
                        }
                    })
                }
            }
            ,
            'text');
    }else {//如果选择了取消重新查一下树
        getTypeTree();//取消之后重新查树
    }

}


/****E  编辑根节点****/

/************S   点击事件*********/
/**
 * 点击事件
 * @param e 事件
 * @param treeId    树节点的ID
 * @param treeNode  树节点
 */
function clickNode(e, treeId,treeNode) {
    $("#trainCourseTypeNum").val(treeNode.typenum);//向隐藏的课程类别编号赋值(最后添加到表单中传到后台保存)
    $("#trainCourseTypeName").val(treeNode.typename);//
    $("#typeNum_0").val(treeNode.typenum);//向隐藏的课程类别编号赋值
    // queryTrainCourseByCondition();//分页查询培养方案课程信息
    clearConditionAndQueryTrainCourse();
}
/************E   点击事件*********/

/**
 * 增加一个课程类别事件(自定义组件),用于当鼠标移动到节点上时，显示用户自定义控件，显示隐藏状态同 zTree 内部的编辑、删除按钮
 * @param treeId    树节点在界面的编号
 * @param treeNode      树节点
 */
function addHoverDom(treeId,treeNode) {
    //1.初始化layer模块
    var layer;
    layui.use(['layer'],function () {
        layer = layui.layer;
    })
    //2.
    var sObj = $("#"+ treeNode.tId+ "_span");
    if (treeNode.editNameFlag|| $("#addBtn_"+ treeNode.tId).length > 0)
        return;
    var addStr = "<span class='button add' id='addBtn_"+ treeNode.tId+ "' title='添加子节点' onfocus='this.blur();'></span>";
    sObj.after(addStr);
    var btn = $("#addBtn_"+ treeNode.tId);
    if (btn)btn.bind("click",function() {//增加的业务逻辑写在这里
        var name = treeNode.typename ; //获取到当前的节点的名称
        var typenum = treeNode.typenum ; //获取到当前的节点的编号
        var layer = getLauiLayer();
        //如果是叶子节点并且排有课程不允许再添加
        if(!treeNode.isParent &&$("#trainCourseTbody").children("tr").length>0){
            layer.msg("该节点已经排有课程，不允许添加课程类别!",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
            return;
        }
        if(confirm("确认在类别  "+name+"  下添加新的类别?")){
            //1.向隐藏的地方赋值
            $(".clear-input").val("");//清空残留的数据
            $("#addType_uptypenum").val(typenum);//上级编号
            $("#add_trainingschemeid").val($("#trainSchemeId").val());//培养方案编号
            $("#addType_upTypeName").val(name);//上级类别名称
            $("#addType_remark").val("无");//描述默认无
            //2.打开模态框
            var index = layer.open({
                title:'添加课程类别',
                area: [$(window).width()*0.80+'px', $(window).height()*0.70 +'px'],//大小
                fix: true, //不固定
                maxmin: true,
                zIndex:500,
                shadeClose: false,
                shade:0.4,
                type:1,
                content:$('#addTypeModal')
            });
            //向页面隐藏index
            $("#hidden_addType_index").val(index);
        }
    });
}

/**
 *用于当鼠标移出节点时，隐藏用户自定义控件，显示隐藏状态同 zTree 内部的编辑、删除按钮
 * @param treeId
 * @param treeNode
 */
function removeHoverDom(treeId,treeNode) {
    $("#addBtn_" + treeNode.tId).unbind().remove();
}
/********S   左边树相关操作**********/


/**S             初始化培养方案基本信息******/
/**
 * 根据培养方案编号查询培养方案基本信息
 * 1.ajax异步查询培养方案基本信息
 * 2.向页面中的表单中赋值
 */
function getTrainSchemeInfo(){
    var trainSchemeId = getTrainSchemeId();//获取培养方案编号
    $.post(contextPath+"/TrainScheme/getTrainSchemeInfoById.do",{"trainSchemeId":trainSchemeId},initTrainScheme,'json')
}

/**
 * 将返回的数据填充到表单中
 * @param response  ajax异步返回的数据
 */
function initTrainScheme(response) {
    if(response == null){
        return;
    }
    //1.填写基本信息
    var tr = "<tr><td>"+replaceNull(response.trainingSchemaName)+"</td><td>"
        +replaceNull(response.majorName)+"</td><td>"
        +replaceNull(response.majorID)+"</td><td>"
        +replaceNull(response.majorType)+"</td><td>"
        +replaceNull(response.majorManager)+"</td><td>"
        +replaceNull(response.revisePerson)+"</td><td>"
        +replaceNull(response.createTime)+"</td></tr>>";
    $("#trainSchemeBaseInfoTbody").append(tr);

    //2.填充下面的信息
    $("[name='trainingtarget']").val(response.trainingtarget);//培养目标
    $("[name='trainingrequire']").val(response.trainingRequire);//培养要求
    $("[name='trainyears']").val(response.trainYears);//修业年限
    $("[name='traindegree']").val(response.trainDegree);//授予学位
    $("[name='maincourse']").val(response.mainCourse);//主干学科
    $("[name='corecourse']").val(response.coreCourse);//核心课程
    $("[name='majorfeature']").val(response.majorfeature);//专业特色
    $("[name='maintestitem']").val(response.mainTestItem);//主要实践性教学环节
    $("[name='mainmajorexperience']").val(response.mainMajorExperience);//主要专业实验
}

/**S             初始化培养方案基本信息******/



/************S  安排课程相关操作*************/
/**
 * 打开安排课程的模态框
 */
function openArrangeCourseModal(){
    var layer = getLauiLayer();
    //1.判断是否满足打开模态框的条件，返回true则满足条件，返回false不满足条件
    if(!isSelectCourseType()){
        layer.alert("请选择一个叶子节点进行排课!");
        return;
    };
    // alert($("#trainCourseTypeNum").val());
    // alert($("#trainSchemeId_queryCourse").val());
    queryCourseFY();
    //2.如果满足条件打开模态框
    var  width=($(window).width()*0.90);
    var height=($(window).height()*0.90);
    var layer = getLauiLayer();
    var trainCourseTypeName = $("#trainCourseTypeName").val();
    var index = layer.open({
        title:'所有未安排的课程信息--将被安排到课程类别('+trainCourseTypeName+")",
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#arrangeCourseModal')
    });
    //向页面隐藏index
    $("#hidden_arrangeCourse_index").val(index);
}

/**
 * 判断是否选中培养方案课程类别树
 */
function isSelectCourseType() {
    // 获取树对象
    var treeObj = $.fn.zTree.getZTreeObj("treeDiv");
    /* 获取所有树节点 */
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    //当再次点击节点时条件不符合,直接跳出方法
    // 遍历树节点设置树节点为选中
    for (var i = 0, length_1 = nodes.length; i < length_1; i++) {
       if(nodes[i].isHover == true){//isHover判断树节点是否选中(如果选中)
            if(nodes[i].isParent == true){//isParent判断节点是否是叶子节点，如果不是叶子节点返回false
                return false;
            }
            return true;//否则返回true
       }
    }
    return false;
}


/************E  安排课程相关操作*************/



/**********S   分页查询未安排的课程相关JS********/
/**
 * 分页查询未安排的课程相关JS
 */
function queryCourseFY(){
    $.ajax({
        url:contextPath+"/TrainCourse/getCoursesBseInfoByCondition.do",
        data:$("#queryCourseForm").serialize(),
        dataType:'json',
        type:'post',
        async:true,
        success:showCourseInfo
    });
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
        var tr = "<tr><td>"+'<input type="checkbox" class="courseCheckbox" value="'+courses[i].courseid+'"><input type="hidden" value="'+courses[i].courseid+'"/></td>'
            +'<td>'+index+'</td>'
            +'<td>'+courses[i].coursenum+'</td>'
            +'<td>'+courses[i].courseplatform+'</td>'
            +'<td>'+courses[i].coursenature+'</td>'
            +'<td>'+courses[i].coursenamecn+'</td>'
            +'<td>'+courses[i].credit+'/'+courses[i].coursehour+'</td>'
            +'<td>'+courses[i].weeklyhour+courses[i].coursehourmethod+'</td>'
            +'<td>'+courses[i].scoringway+'</td>'
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

                $("#pageNum_1").val(obj.curr);//向隐藏域设置当前页的值
                $("#pageSize_1").val(obj.limit);//向隐藏域设置当前页的大小
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
    form.find("input").not("#trainSchemeId_queryCourse").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryCourseFY();
}


/**
 * 多选框的全选事件
 * @param obj   多选框自己传下来
 */
function selectAllCheckbox(obj) {
    var value = $(obj).prop("checked");//获取当前多选框的状态
    $(".courseCheckbox").each(function (index) {//遍历指定class的多选框设置状态和当前按钮一样
        $(this).prop("checked",value);
    })
}


/**********E   分页查询未安排的课程相关JS********/




/*******************S   最后选中之后点击分配**************************/
/**
 *点击确认分配之后弹出让用户输入学期的界面
 */
function openCourse2addModal() {
    //1.遍历选中的多选框将数据添加到表格
    $("#course2AddTbody").html("");//清空表体
    if($(".courseCheckbox:checked").length == 0){
        layer.msg("没有课程可以分配!");
        return;
    }
    $(".courseCheckbox:checked").each(function (index) {//遍历指定class的多选框设置状态和当前按钮一样
        var sequence = index+1;//序号
        var courseID = $(this).val();//获取课程ID
        var tr = $(this).parent().parent();
        var courseName = tr.children("td:eq(5)").text();//课程名称
        var courseNum = tr.children("td:eq(2)").text();//课程编号
        //隐藏一些表单元素。(隐藏一个课程ID)
        $("#course2AddTbody").append("<tr><td>"+sequence+"<input type='hidden' value='"+courseID+"'/></td><td>"+courseName
            +"</td><td>"+courseNum+"</td><td>"+"<input type='text' class='semesterInput' value=''>"
            +"</td></tr>>")
    })
    //2.打开确认分配的模态框要求选择学期(也就是第几学期上这门课程)
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'确认分配',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:1500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#course2addModal')
    });
    //向页面隐藏index
    $("#hidden_courses_2add").val(index);
}


/**
 * 改变学期下拉列表的时候改变下面的值
 * @param obj   下拉列表自己传下来
 */
function changeSemester(obj) {
    $(".semesterInput").val($(obj).val())
}


/**
 * 确认分配课程相关操作
 */
function allocateCourse() {
    //1.验证学期是否全部写上
    if(!validateSemester()){
        var layer = getLauiLayer();
        layer.msg("请输入合法的学期(1-8)");
        return false;
    }
    //2.如果全部填上就动态封装一个表单，然后提交数据(动态拼装一个表单然后提交)
    var form = $("<form method='post' action='XXX'></form>")
    var tr = $("#course2AddTbody").children("tr");//获取到tbody
    var trainningschemeid = getTrainSchemeId();//培养方案编号
    var typenum = $("#trainCourseTypeNum").val();//类别num
    for(var i=0,length_1 = tr.length;i<length_1;i++){
        var courseid = $(tr[i]).children("td:eq(0)").find("input").val();//课程编号
        var semester = $(tr[i]).children("td:eq(3)").find("input").val();//学期
        form.append("<input type='hidden' name='trainCourse["+i+"].trainningschemeid' value='"+trainningschemeid+"'/>");//培养方案编号
        form.append("<input type='hidden' name='trainCourse["+i+"].typenum' value='"+typenum+"'/>");//课程类别编号
        form.append("<input type='hidden' name='trainCourse["+i+"].courseid' value='"+courseid+"'/>");//课程编号
        form.append("<input type='hidden' name='trainCourse["+i+"].semester' value='"+semester+"'/>");//学期
    }
    //提交
    $.post(contextPath+"/TrainCourse/addTrainCourse.do",form.serialize(),function (response) {
        var layer = getLauiLayer();
        layer.msg(response);
        layer.close($("#hidden_courses_2add").val());//关掉确认分配的窗口
        $("#pageNum_1").val("");//清空页号
        queryCourseFY();//重新查询
    },'text');
}

/**
 * 验证学期输入是否合法
 */
function validateSemester() {
    var input = $(".semesterInput");
    for(var i=0,length_1 = input.length;i<length_1;i++){
        if(!isNumber($(input[i]).val())){
            return false;
        }
    }
    return true;
}





/*******************E   最后选中之后点击分配**************************/

/****************S   分页查询培养方案课程信息相关操作********************/

function clearConditionAndQueryTrainCourse(){
    //1.清空条件
    var form = $("#queryTrainCourseForm");
    form.find("input").not("#queryTrainCourseTrainshemeId").not("#typeNum_0").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryTrainCourseByCondition();
}
/**
 * 分页查询培养方案课程信息
 */
function queryTrainCourseByCondition() {
    $.post(contextPath+"/TrainCourse/getTrainCoursesByCondition.do",$("#queryTrainCourseForm").serialize(),showTraincourseTable,'json')
}


/**
 *将ajax返回的数据显示到表格
 * @param pageInfo ajax返回的分页信息
 */
function showTraincourseTable(pageInfo) {
    if(pageInfo == null){
        return;
    }
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var traincourses = pageInfo.list;
    $("#trainCourseTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = traincourses.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr><td><input type='hidden' value='"+traincourses[i].courseId+"'/>"+'<input type="checkbox" name="trainCourseCheckbox" class="trainCourseCheckbox" value="'+traincourses[i].trainCourseID+'"></td>'
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(traincourses[i].courseNum)+'</td>'
            +'<td>'+replaceNull(traincourses[i].courseNameCN)+'</td>'
            +'<td>'+replaceNull(traincourses[i].typeName)+'</td>'
            +'<td>'+"<a title='点击修改学期' onclick='openUpdateModal(this)'>"+replaceNull(traincourses[i].semester)+"</a>"+'</td>'
            +'<td>'+replaceNull(traincourses[i].coursePlatform)+'</td>'
            +'<td>'+replaceNull(traincourses[i].courseNature)+'</td>'
            +'<td>'+replaceNull(traincourses[i].credit)+"/"+replaceNull(traincourses[i].courseHour)+'</td>'
            +'<td>'
            +'<a title="点击查看课培养方案课程详细信息" onclick="openTrainCourseDetailModal(this)" href=javascript:void(0)><i class="layui-icon">&#xe615;</i></a>'
            +'</td></tr>'
        $("#trainCourseTbody").append(tr);
    }

    //开启分页组件
    trainscoursePage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function trainscoursePage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'trainCoursePage', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("#pageNum_0").val(obj.curr);//向隐藏域设置当前页的值
                $("#pageSize_0").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    queryTrainCourseByCondition();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/**
 * 清空查询条件并且查询已经安排的课程信息
 * @param obj   按钮自己传下来
 */
function clearConAndQueryTrainCourse(obj) {
    //1.清空条件
    var form = $(obj).parents("form");
    form.find("input").not("#queryTrainCourseTrainshemeId").val("");
    form.find("select").val("");
    //清空树的背景色
    $(".curSelectedNode").removeClass("curSelectedNode");
    // 遍历树节点设置树节点为选中都为false
    var treeObj = $.fn.zTree.getZTreeObj("treeDiv");
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    for (var i = 0, length_1 = nodes.length; i < length_1; i++) {
        nodes[i].isHover = false;//isHover判断树节点是否选中(如果选中)
    }
    //2.重新查询一次
    queryTrainCourseByCondition();
}



/****************E   分页查询培养方案课程信息相关操作********************/

/*************************S   修改培养方案学期相关操作***************************/
/**
 * 点击的时候修改上课学期
 * @param obj
 */
function openUpdateModal(obj) {
    //1.向模态框赋值
    var tr = $(obj).parent().parent();//获取到tr元素
    var trainCourseId = tr.children("td:eq(0)").find(":checkbox").val();//培养方案课程编号
    var courseNum = tr.children("td:eq(2)").text();//课程编号
    var courseName = tr.children("td:eq(3)").text();//课程名称
    var courseSeester = tr.children("td:eq(5)").text();//课程学期
    $("#update_traincourseid").val(trainCourseId);
    $("#updateCourseNum").val(courseNum);
    $("#updateCourseName").val(courseName);
    $("#updatesemester").val(courseSeester);

    //2.打开模态框
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'修改课程学期',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#hidden_update_semester_modal')
    });
    //向页面隐藏index
    $("#hidden_update_semester_index").val(index);
}

/**
 * 修改培养方案课程信息(主要是修改学期)
 */
function updateTrainCourse(){
    //1.验证输入是否合法
    var value = $("#updatesemester").val();
    var layer = getLauiLayer();
    if(!isNumber(value)){
        layer.msg("请输入合法的学期(1-8)",{icon:2,shade: [0.8, '#393D49']})
        return ;
    }
    //2.提交后台进行修改
    $.post(contextPath+"/TrainCourse/updateTrainCourse.do",$("#updateSemesterForm").serialize(),function (response) {
        layer.msg(response,function () {
            if("修改成功" == response){
                layer.close($("#hidden_update_semester_index").val());//关闭修改模态框
                queryTrainCourseByCondition();//重新执行查询
            }
        })
    },'text')
}

/*************************E   修改培养方案学期相关操作***************************/

/** *****************S 显示与隐藏培养方案基本信息******************** */
/**
 * 显示与隐藏培养方案基本信息
 * @param obj
 */
function toggleTrainSchemeBaseInfoDiv(obj) {
    // 点击显示查询条件与分割符
    if ($("#trainSchemeBaseInfo").css("display") == "none") {
        $("#trainSchemeBaseInfo").show(
            "slow",
            function() {
              $(obj).attr("title","点击隐藏培养方案基本信息");
            });
    } else {//隱藏条件与分割符
        $("#trainSchemeBaseInfo").hide(
            "slow",
            function() {
                $(obj).attr("title","点击显示培养方案基本信息");
            });
    }
}
/*******************E 显示与隐藏查询条件*********************/
/********S   批量删除培养方案课程**********/
/**
 * 点击培养方案课程的全选与全部选操作
 * @param obj
 */
function toggleSelectAndNotSelect(obj) {
    var value = $(obj).prop("checked");
    $(obj).parents("table").find(":checkbox").not(":eq(0)").prop("checked",value);
}
/**
 * 1.获取复选框
 * 2.传入后台进行删除
 */
function deleteTrainCourseBatch() {
    // alert("批量删除")
    var layer = getLauiLayer();
    var trainCourseCheckbox = $(".trainCourseCheckbox:checked");
    if(trainCourseCheckbox.length == 0){
        layer.msg("请选择需要删除的培养方案课程信息",{shade: [0.8, '#393D49']})
        return;
    }
    layer.confirm("确认删除?",function (index) {
        var trainCourseIds = [];
        for(var i=0,length_1 = trainCourseCheckbox.length;i<length_1;i++){
            trainCourseIds[i] = $(trainCourseCheckbox[i]).val();
        }
        // alert(trainCourseIds.toString())
        $.post(contextPath+"/TrainCourse/deleteTrainCourseBatch.do",{"trainCourseIds":trainCourseIds.toString()},function (response) {
            layer.close(index);
            layer.msg(response,function () {
                if(response == '删除成功'){
                    queryTrainCourseByCondition();
                }
            })
        },'text')
    })
   /* var trainCourseIds = [];
    for(var i=0,length_1 = trainCourseCheckbox.length;i<length_1;i++){
        trainCourseIds[i] = $(trainCourseCheckbox[i]).val();
    }
    // alert(trainCourseIds.toString())
    $.post(contextPath+"/TrainCourse/deleteTrainCourseBatch.do",{"trainCourseIds":trainCourseIds.toString()},function (response) {
        var layer = getLauiLayer();
        layer.msg(response,function () {
            if(response == '删除成功'){
                queryTrainCourseByCondition();
            }
        })
    },'text')*/
}
/********S   批量删除培养方案课程**********/

/****************S    安排课程能力对应的模态框****************/
/**
 * 打开课程能力对应的模态框
 */
function openAddCourseCapacityModal() {
    var layer = getLauiLayer();
    //1.验证是否选中培养方案课程
    var length = $(".trainCourseCheckbox:checked").length;
    if(length==0){
        layer.msg("请选择培养方案课程",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
        return;
    }
    //2.填充表格数据(1.填充表头，2填充表体，3.判断哪些复选框该选上)
    getTrainSchemeCapacityInfos();
    //3.开启模态框
    var layer = getLauiLayer();
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'安排课程能力信息',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#courses_capacity_add_modal')
    });
    //向页面隐藏index
    $("#hidden_courses_capacity_index").val(index);
}


/**
 * 1.  根据培养方案编号查询到培养方案能力，并且填充到表头
 */
function getTrainSchemeCapacityInfos(){
    var trainSchemeId = getTrainSchemeId();//获取培养方案编号
    $.post(contextPath+"/TrainSchemeCapacity/getCapacitysByTrainId.do",{"trainSchemeId":trainSchemeId},initTrainSchemeCapacity2Table,'json')
}

/**
 * 将ajax查到的能力填充到表格
 * @param response  ajax返回的能力信息
 */
function initTrainSchemeCapacity2Table(response) {
    if(response == null ){
        $("#capacityProptDiv").css("display","");//显示提示语
        $("#capacityDiv").css("display","none");//隐藏表格
        return;
    }
    // alert(JSON.stringify(response))
    $("#capacity2addDr").find("th:gt(2)").remove();//先删掉从能力开始的表头
    for(var i=0,length_1 = response.length;i<length_1;i++){
        $("#capacity2addDr").append("<th title='"+response[i].capacitydescription+"'>"+"<input type='hidden' value='"+response[i].capacityid+"'>"+response[i].capacitysort+"</th>");
    }
    initTrainCourseCapacityTbody();
}

/**
 * 2.初始化表体
 */
function initTrainCourseCapacityTbody() {
    $("#courseCapacity2AddTbody").html("");//先清空表体
    $(".trainCourseCheckbox:checked").each(function (index) {//遍历选中的多选框
        var trainCourseId = $(this).val();//培养方案课程ID
        var tr = $(this).parent().parent();
        var courseNum = tr.children("td:eq(2)").text();//课程编号
        var courseName = tr.children("td:eq(3)").text();//课程姓名
        var tr = "<tr><td>"+(index+1)+"<input type='hidden' class='trainCourseId4Delete' value='"+trainCourseId+"'/></td><td>"+courseNum+"</td><td>"+courseName+"</td>";
        //获取表头的数据填充到表体中
        var head_tr = $("#capacity2addDr");
        for(var i=3,length_1 = head_tr.children("th").length;i<length_1;i++){
            var value = head_tr.children("th:eq("+i+")").find("input").val();
            tr += "<td><input type='checkbox' class='traincousrse"+trainCourseId+"' value='"+value+"'/></td>";
        }
        tr += "</tr>";
        $("#courseCapacity2AddTbody").append(tr);
    })
    getTrainCourseCapacity();
}


/**
 * 3.根据选中的培养方案课程编号查询培养方案课程能力集合
 */
function getTrainCourseCapacity() {
    //1.拼接集合，访问后台进行查询
    var ids = [];
    $(".trainCourseCheckbox:checked").each(function (index) {//遍历选中的多选框
        ids[index] = $(this).val();
    });
    $.post(contextPath+"/TrainCourseCapacity/getTrainCourseByTrainCourseIds.do",{"ids":ids.toString()},selectTraincapacity,'json');
}


/**
 * 根据查到的结果将已经选择的打上对勾
 * @param response  数据集合
 */
function selectTraincapacity(response) {
    if(response == null || response.length == 0){
        return;
    }
    for(var i=0;i<response.length;i++){
        var tcourseCapacity = response[i];
        $(".traincousrse"+response[i].traincourseid+"[value='"+response[i].capacityid+"']").prop("checked","checked");
    }
}

/**
 * 4.批量添加培养方案课程能力
 * (1)遍历多选框
 * (2)动态创建一表单进行提交
 */
function addTrainCourseCapacityBatch() {
    //1.验证是否可以分
    var layer = getLauiLayer();
    var checkedCheckbox = $("[class^='traincousrse']:checkbox:checked");//选择到已经选择的多选框
    if(checkedCheckbox==null || checkedCheckbox.length ==0){
        layer.msg("没有可以分配的课程能力",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
        return;
    }
    //2.动态添加一个表单提交信息
    var form = $("<form></form>");//动态创建一个form元素
    //2.1遍历所有选中的元素多选框添加元素
    $("[class^='traincousrse']:checkbox:checked").each(function (index) {
        var trainCourseId = $(this).parent().parent().children("td:eq(0)").find("input").val();//培养方案课程编号
        var trainSchemeId = getTrainSchemeId();//培养方案课程编号
        var capacityId = $(this).val();//能力编号
        form.append("<input type='hidden' name='coursecapacityrequireinfos["+index+"].traincourseid' value='"+trainCourseId+"'/>");
        form.append("<input type='hidden' name='coursecapacityrequireinfos["+index+"].trainningschemeid' value='"+trainSchemeId+"'/>");
        form.append("<input type='hidden' name='coursecapacityrequireinfos["+index+"].capacityid' value='"+capacityId+"'/>");
    })
    //2.2遍历表格中的第一列创建一个集合，用于先根据培养方案课程编号删除
    var trainCourseIds=[];
    $(".trainCourseId4Delete").each(function(index){
        trainCourseIds[index] = $(this).val();
    });
    form.append("<input type='hidden' name='trainCourseIds' value='"+trainCourseIds.toString()+"'/>")
    //3.提交数据进行先删除后添加
    $.post(contextPath+"/TrainCourseCapacity/addTrainCapacityBatch.do",form.serialize(),function (response) {
        layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
            if("添加成功" == response){
                layer.close($("#hidden_courses_capacity_index").val());
            }
        })
    },'text');
}
/****************E    安排课程能力对应的模态框****************/

/********** S 查看培养方案课程详情的相关操作***/
/**
 * 打开培养方案课程详情的模态框
 * 1.查询数据
 * 2.打开模态框
 * @param obj 将按钮自己传下来
 */
function openTrainCourseDetailModal(obj){
    var tr = $(obj).parent().parent();
    var courseId = tr.children("td:eq(0)").find("input:eq(0)").val();//课程编号
    var trainCourseId = tr.children("td:eq(0)").find(":checkbox").val();//培养方案课程编号
    //1.查询数据
    //1.1查询课程基本信息
    $("#courseTypeName").text(tr.children("td:eq(4)").text());//所属课程类别
    $("#courseSemester").text(tr.children("td:eq(5)").text());//上课学期
    queryCourseBaseInfoByCourseId(courseId);
    //1.2查询课程资料信息
    queryCourseFileInfo(courseId);
    //1.3查询课程培养方案能力信息
    queryCourseCapacityByTrainCourseId(trainCourseId);

    //2.开启模态框
    var width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'课程详细信息',
        area: [width+'px', height +'px'],//大小
        fix: false, //不固定
        maxmin: false,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#hidden_course_detail_modal')
    });
    //向页面隐藏index
    $("#hidden_course_detail_index").val(index);
}


/**
 * 根据课程编号查看课程基本信息(前提是页面隐藏课程主键)
 * @param courseId  课程编号
 */
function queryCourseBaseInfoByCourseId(courseId){
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
 * @param courseId  课程编号
 */
function queryCourseFileInfo(courseId){
    $.post(contextPath+'/teachingFile/getTeachingFile.do',{"courseId":courseId},function (teachingProgramInfos) {
        if(teachingProgramInfos == null){//如果为null就结束方法
            return;
        }

        if(teachingProgramInfos.length>0 ){
            // alert(JSON.stringify(teachingProgramInfos));//打印字符串信息
            $("#courseFileTbody").html("");//清空表格
            for(var i=0,length_1 =teachingProgramInfos.length;i<length_1;i++ ){
                var tr = "<tr><td>"+teachingProgramInfos[i].filetype
                    +"</td><td>"+"<a title='点击预览课程资料' href='/file/teachingFile/"+teachingProgramInfos[i].filenowname+"' target='_blank'>"+teachingProgramInfos[i].fileoriname
                    +"</a></td></tr>";
                $("#courseFileTbody").append(tr);
            }
            $("#courseFileTable").css("display","");//设置表格可见
            $("#promptLabel").css("display","none");//长度为0提示没有课程资料(设置提示语可见)
        }else{
            $("#promptLabel").css("display","");
            $("#courseFileTable").css("display","none");
        }
    },'json')
}

/**
 * 根据培养方案课程编号查询培养方案课程能力
 * @param trainCourseId 培养方案课程能力
 */
function queryCourseCapacityByTrainCourseId(trainCourseId) {
    $.post(contextPath+"/TrainCourseCapacity/getTrainCourseCapacityByTrainCourseId.do",{"trainCourseID":trainCourseId},function (response) {
        if(response == null ||response.length == 0){
            return;
        }
        // alert(JSON.stringify(response))
        $("#courseCapacityTbody").html("");
        for(var i=0,length_1 =response.length;i<length_1;i++){
            $("#courseCapacityTbody").append("<tr><td>"+(i+1)+"</td><td>"+response[i].capacitySort+"</td><td>"+response[i].capacityDescription+"</td></tr>")
        }
    },'json')
}

/********** E 查看培养方案课程详情的相关操作***/
