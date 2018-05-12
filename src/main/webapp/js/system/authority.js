/**
 * @author: qlq
 * @time: 15:35
 * @description:    权限JS
 */

/**
 * 一次性自调函数验证环境
 */
/*
!function () {
 alert("一次性自调函数")
}();
*/

/**
 * 页面加载完成执行的函数
 */
$(function () {
   // alert("页面加载完成")
    getPermissionTree();//生成左边的权限树
    queryPermissionFY();//分页查询权限信息
});

/***************************S   全局函数***/
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
/*****************************E   全局函数***/

/**********************S   左边相关操作*************************/
/**
 * 查询权限树的函数
 */
function getPermissionTree(){
    $.ajax({
        url : contextPath + '/permission/getPermissionTree.do',
        async : true,
        dataType : 'json',
        success : genePermissionTree,
        error : function() {
            alert("查询字典树失败！！！")
        }
    });
}
//生成树函数


function genePermissionTree(permissionTreeNodes) {
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
                idKey : "permissionID",
                pIdKey : "parentId",
                rootPId : "0"
            },
            key : {
                name : "permissionName",
            }
        },
        callback : {
            onClick : zTreeOnClick
        }
    };
    var treeNodes = permissionTreeNodes;
    $.fn.zTree.init($("#treeDemo"), setting, treeNodes);//在界面生成一颗树
    openFirstTreenode();
}

/**
 * 点击树的事件
 * @param event 事件
 * @param treeId    树的ID
 * @param treeNode  节点
 */

function zTreeOnClick(event, treeId, treeNode) {
    // alert("您点击了....."+treeNode.dictionaryId + ", " + treeNode.dictionaryName);
    $("#parentid").val(treeNode.permissionID);//隐藏ID
    queryPermissionFY();//重新查询
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
/**********************E   左边相关操作*************************/


/*****S 分页查询相关方法**********/
function queryPermissionFY(){
    $.ajax({
        url:contextPath+"/permission/getPermissionByCondition.do",
        data:$("#queryPermissionForm").serialize(),
        dataType:'json',
        type:'post',
        async:true,
        success:showPermissionTable
    });
}

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showPermissionTable(pageInfo){
    // alert(JSON.stringify(pageInfo))
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var permissions = pageInfo.list;
    $("#permissionTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = permissions.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var permissionstatus = "";
        var operating = "";
        if("1" == permissions[i].permissionstatus){
            operating = "关闭";
            permissionstatus = "启用";
        }else {
            operating = "开启";
            permissionstatus = "<span style='color: red;'>禁用</span>";
        }

        var tr = "<tr><td>"+'<input type="hidden" value="'+permissions[i].permissionid+'"/>'+index+'</td>'
            +'<td>'+replaceNull(permissions[i].permissionname)+'</td>'
            +'<td>'+replaceNull(permissions[i].description)+'</td>'
            +'<td>'+permissionstatus+'</td>'
            +'<td><a href="javascript:void(0)" onclick="updatePermission(this)">'+operating+'</a></td></tr>';
        $("#permissionTbody").append(tr);
    }

    //开启分页组件
    permissionsPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function permissionsPage(total,pageNum,pageSize){
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
                    queryPermissionFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/**
 * 点击查询放大镜的事件
 */
function queryTrainSchemeFYBtn() {
    $("[name='pageNum']").val("");//清空页号
    queryTrainSchemeFY();//分页查询课程信息
}

/**
 * 清空查询条件的按钮
 * 1.清空所有的条件，包括隐藏域的条件，2.重新查询一次
 * @param obj   将清空条件按钮自己传下来
 */
function clearQueryCondition(obj) {
    //0.清空背景色
    $(".curSelectedNode").removeClass("curSelectedNode");
    //1.清空条件
    var form = $(obj).parents("form");
    form.find("input").val("");
    form.find("select").val("");
    //2.重新查询一次
    queryPermissionFY();
}



/*****E 分页查询相关方法**********/

/***********S       修改权限状态******/
function updatePermission(obj) {
    var text = $(obj).text();
    var newStatus = "";
    newStatus = "开启"==text?"1":"0";
    var permissionId = $(obj).parent().parent().children("td:eq(0)").children("input").val();
    $.post(contextPath+"/permission/updatePermission.do",{"permissionId":permissionId,"newStatus":newStatus},function (response) {
        var layer = getLauiLayer();
        layer.msg(response,function () {
            if("修改成功"==response)
                queryPermissionFY();
        })
    },'text');
}
/***********E       修改权限状态******/

