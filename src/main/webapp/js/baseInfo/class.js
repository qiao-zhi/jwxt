/*********S   全局函数*******/
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
/*********E   全局函数*******/


//初始化加载需要使用的layui模块
layui.use(['layer', 'form', 'element'], function(){
    $ = layui.jquery;
    var layer = layui.layer
        ,form = layui.form
        ,element = layui.element;
    //初始化表格
    findCollegeNameAndIdForSelect(form);
    findMajorNameAndIdForSelect(form);
    findClassBaseInfo();


    //查询按钮事件过滤器
    form.on('submit(search)', function(data){
        //清空当前页和页号
        $("input[name='pagesize']").val('');
        $("input[name='currentpage']").val('');
        //调用查询方法
        findClassBaseInfo();
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });

});
//查询任务通知书基本信息
function findClassBaseInfo(){
    $.ajax({
        url : contextPath+'/classInfo/findClassInfoList.action',
        data : $("#selectClassInfoForm").serialize(),
        type : 'POST',
        dataType : 'json',
        async:true,
        success : showClassBaseInfo
    });
}
function showClassBaseInfo(pageInfo){
    // console.log(pageInfo) //测试是否有值
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var baseInfoList = pageInfo.list;
    $("#classInfoList").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_l = baseInfoList.length;i<length_l;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr ="<tr><td>"
            +replaceNull(baseInfoList[i].classNum)+"</td><td>"
            +replaceNull(baseInfoList[i].className)+"</td><td>"
            +replaceNull(baseInfoList[i].majorName)+"</td><td>"
            +replaceNull(baseInfoList[i].collegeName)+"</td><td>"
            +replaceNull(baseInfoList[i].classPeopleNum)+"</td><td>"
            +replaceNull(baseInfoList[i].grade)+"</td>"
            +"<td class='td-manage'><a title='点击查看班级详细信息' onclick=notice_tab_show('班级详细信息','clazz-view.jsp?cId="+baseInfoList[i].classID+"') href='javascript:void(0);')><i class='layui-icon'>&#xe63c;</i></a>"
            +"<a title='点击修改班级信息'  onclick=notice_tab_show('修改班级','clazz-modify.jsp?cId="+baseInfoList[i].classID+"') href='javascript:void(0);'><i class='layui-icon'>&#xe642;</i></a>"
            +" <a title='删除' onclick=deleteClassInfo('"+baseInfoList[i].classid+"') href='javascript:void(0);'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
        $("#classInfoList").append(tr);
    }

    //开启分页组件
    noticeInfoListPage(total,pageNum,pageSize);

}

//分页函数
function noticeInfoListPage(total,pageNum,pageSize){
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //完整功能
        laypage.render({
            elem: 'demo7', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='currentpage']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pagesize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    findClassBaseInfo();//执行查询分页函数(这个函数必须写在这里)
                }
            }
        });
    });
}

/*删除教学任务通知书基本信息*/
function deleteClassInfo(id) {
    layer.confirm('确认要删除吗？', function (index) {
        $.ajax({
            url:contextPath+"/classInfo/deleteClassInfo.action",
            type:"post",
            dataType:"text",
            data:{"classId":id},
            success:function (response) {
                layer.msg(response, {icon: 1, time: 1000},function (){
                    //刷新父页面
                    window.location.reload();
                })
            }
        })
    });
}



//新增任务
function addClass(){
    notice_tab_show('新增班级','./clazz-add.jsp')
}





/* S            弹出层相关操作 */
/*
    参数解释：
    title   标题
    url     请求的url
    id      需要操作的数据id
    w       弹出层宽度（缺省调默认值）
    h       弹出层高度（缺省调默认值）
*/
function notice_tab_show(title,url,w,h){
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

//初始化学院下拉框
function findCollegeNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/collegeInfo/findCollegeNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入学院</option>";
            $("select[name='collegeid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].collegeid+"'>"+response[i].collegename+"</option>";
                $("select[name='collegeid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}

//初始化专业下拉框
function findMajorNameAndIdForSelect(form){
    $.ajax({
        url:contextPath+"/majorInfo/findMajorNameAndId.action",
        dataType:"json",
        type:"post",
        success:function (response) {
            //console.log(response)
            var optionStr = "<option value=''>请输入专业</option>";
            $("select[name='majorid']").append(optionStr)
            for(var i=0;i<response.length;i++){
                optionStr = "<option value='" + response[i].majorid+"'>"+response[i].majorname+"</option>";
                $("select[name='majorid']").append(optionStr)
            }
            //更新渲染
            form.render('select');
        }
    })
}


/**********************S  QLQ树相关操作****************/

$(function(){
    getClassTree();
});


/**
 * 查询树的函数
 */
function getClassTree(){
    $.ajax({
        url : contextPath + '/classInfo/getClassTree.do',
        async : true,
        dataType : 'json',
        success : geneClassTree,
        error : function() {
            alert("查询树失败！！！")
        }
    });
}
//生成树函数


function geneClassTree(classTreeNodes) {
    var setting = {
        view : {
            selectedMulti : false
        },
        check : {
            enable : false
        },
        data : {
            simpleData : {
                enable : true,
                idKey : "departNum",
                pIdKey : "updepartNum",
                rootPId : "000"
            },
            key : {
                name : "departName",
            }
        },
        callback : {
            onClick : zTreeOnClick
        }
    };
    $.fn.zTree.init($("#treeDemo"), setting, classTreeNodes);//在界面生成一颗树
    openFirstTreenode();//打开一级节点
}

/**
 * 点击树的事件
 * @param event 事件
 * @param treeId    树的ID
 * @param treeNode  节点
 */

function zTreeOnClick(event, treeId, treeNode) {
     //如果是二级节点，设置隐藏的添加文本框的值，否则清空值
    if(treeNode.level == 1){
        $("#add_majorid").val(treeNode.departNum);
        $("#add_majorName").val(treeNode.departName);
    }else {
        $("#add_majorid").val("");
        $("#add_majorName").val("");
    }
}

/**
 * 展开树节点的第一层
 */
function openFirstTreenode(){
    // 获取树对象
    var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
    /* 获取所有树节点 */
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    //展开第一级树
    treeObj.expandNode(nodes[0], true);
}
/**********************E  QLQ树相关操作****************/

/*******************S   QLQ修改了添加班级相关操作************/
/**
 * 打开添加班级的模态框
 */
function openAddClassModel() {
    if($("#add_majorid").val()==""||$("#add_majorName").val()==""){
        alert("请先选择专业!")
        return;
    }
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.90);
    var index = layer.open({
        title:'添加班级',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#addClassModal')
    });
    //向页面隐藏index
    $("#hidden_add_class_index").val(index);
}
/*******************E   QLQ修改了添加班级相关操作************/



