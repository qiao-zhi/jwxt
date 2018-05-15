/**
 * @author: qlq
 * @time: 22:41
 * @description:    角色JS
 */

/**
 * 页面加载完成执行一些函数
 */
$(function () {
    // alert("页面加载完成")
    queryRoleFY();//分页查询角色信息
    getPermissionTree();//生成给角色分配权限的权限树
});

/**********S   layui相关函数******/
layui.use(['layer','form'],function () {
    var layer = layui.layer,form=layui.form;

    //1.监听添加角色事件
    form.on('submit(addRole)', function(data){
        //1.1开始提交后台
        $.ajax({
            url:contextPath+'/role/addRole.do',
            type:'post',
            data:data.field,
            success:function (response) {
                layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                    //1.2如果添加成功关闭添加模态框
                    layer.close($("#hidden_add_index").val());
                    queryRoleFY();//重新执行查询
                })
            },
            dataType:'text'
        })
    });

    //2.监听修改角色事件
    form.on('submit(updateRole)', function(data){
        //1.1开始提交后台
        $.ajax({
            url:contextPath+'/role/updateRole.do',
            type:'post',
            data:data.field,
            success:function (response) {
                layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                    //1.2如果添加成功关闭添加模态框
                    layer.close($("#hidden_updateRole_index").val());
                    queryRoleFY();//重新执行查询
                })
            },
            dataType:'text'
        })
    });



})
/**********E   layui相关函数******/



/*****S              一些公共函数**/
/**
 * 获取layer层的函数
 * @returns {*}
 */
function getLayuiLayer() {
    var layer;
    layui.use('layer',function () {
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
/*****E              一些公共函数**/


/**************S  添加角色相关操作****/
/**
 * 打开角色添加模态框
 */
function openAddModal() {
    $(".add_clear").val("");//清空里面的内容
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'添加角色',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#addRoleModal')
    });
    //向页面隐藏index
    $("#hidden_add_index").val(index);
}
/**************E  添加角色相关操作****/



/*************************S   分页查询角色相关操作*****************/
/**
 * 分页查询角色信息
 */
function queryRoleFY(){
    $.ajax({
        url:contextPath+"/role/getRoleFY.do",
        data:$("#queryRoleForm").serialize(),
        dataType:'json',
        type:'post',
        async:true,
        success:showRoleTable
    });
}

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showRoleTable(pageInfo){
    // alert(JSON.stringify(pageInfo))
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var roles = pageInfo.list;
    $("#roleTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1=roles.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var status="",hasPermission="";
        //禁用启用
        if(roles[i].roleStatus=="0"){
            status = "<span style='color:red;'>禁用</span>"
        }else{
            status = "启用";
        }
        //未配置和已经配置
        if(roles[i].hasPermission=="未配置"){
            hasPermission = "<span style='color:red;'>未配置</span>"
        }else{
            hasPermission = "<a title='点击查看具体的权限信息' href='javascript:void(0)' onclick='queryPermission(this)'>"+roles[i].hasPermission+"</a>";
        }
        var tr = "<tr>";
        tr += "<td><input type='checkbox' class='releIdCheckbox' value='"+roles[i].roleID+"'></td>"
        tr += "<td>"+index+"</td>"
        tr += "<td>"+replaceNull(roles[i].roleName)+"</td>"
        tr += "<td>"+status+"</td>"
        tr += "<td>"+hasPermission+"</td>"
        tr += "<td>"+replaceNull(roles[i].description)+"</td>"
        tr += "<td>"
            +"<a href='javascript:void(0)' title='点击修改角色信息' onclick='updateRole(this)'><i class='layui-icon'>&#xe642;</i></a>"
            +"&nbsp;&nbsp;&nbsp;&nbsp;"
            +"<a href='javascript:void(0)' title='点击配置角色权限信息' onclick='setRolePermission(this)'><i class='layui-icon'>&#xe620;</i></a>"
            +"</td>"
        tr+="</tr>";
        $("#roleTbody").append(tr);
    }

    //开启分页组件
    rolesPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function rolesPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageDiv_role', //注意，这里的 test1 是 ID，不用加 # 号
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
                    queryRoleFY();//执行查询分页函数(这个函数必须写在这里)
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
    queryRoleFY();//分页查询课程信息
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
    queryRoleFY();
}


/*************************E   分页查询角色相关操作*****************/


/*************************S   查看具体的权限信息*****************/
/***
 * 查看具体的权限信息
 * @param obj
 */
function queryPermission(obj) {
    //1.查询数据
    var roleId = $(obj).parents("tr").find(":checkbox").val();
    $.post(contextPath+"/role/getRolepermission.do",{"roleId":roleId},function (response) {
        // alert(JSON.stringify(response))
        if(response == null || response.length == 0){
            return;
        }
        //2.填充表格
        $("#rolePermissionTbody").html("");
        for(var i = 0,length_1 = response.length;i<length_1;i++){
            var permissionStatus = response[i].permissionStatus == "1"?"启用":"禁用";
            $("#rolePermissionTbody").append("<tr><td>"+(i+1)+"</td><td>"+response[i].permissionName+"</td><td>"+permissionStatus+"</td></tr>");
        }
    },'json')
    //3.开启模态框
    // rolePermissionModal
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'权限信息',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#rolePermissionModal')
    });
    //向页面隐藏index
    $("#hidden_rolePermission_index").val(index);
}
/*************************S   查看具体的权限信息*****************/

/*****************S   批量删除相关操作************/
/**
 * 全选与全部选操作
 * @param obj
 */
function selectAllRole(obj) {
    var cheched = $(obj).prop("checked");
    $(".releIdCheckbox").prop("checked",cheched);
}

/**
 * 批量删除
 */
function deleteRoleBatch() {
    //1判断是否可以删除
    var layer =getLayuiLayer();
    var checkboxes = $(".releIdCheckbox:checked");
    if(checkboxes.length == 0){
        layer.msg("请先选择角色",{icon: 2,shade: [0.8, '#393D49']});
        return;
    }
    //2进行删除
    var roleIds = [];
    $(".releIdCheckbox:checked").each(function (index) {
        roleIds[index] = $(this).val();
    })
    layer.confirm("您确认删除角色?删除后不可以恢复!",function (index) {
        $.ajax({
            url:contextPath+"/role/deleteRoleBatch.do",
            data:{"roleIds":roleIds.toString()},
            type:'post',
            success:function (response) {
                layer.close(index);
                layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                    queryRoleFY();
                })
            },
            dataType:'text'});
    })

}

/*****************E   批量删除相关操作************/



/*****************S   修改角色信息相关操作************/
/**
 * 修改角色信息
 * @param obj
 */
function updateRole(obj) {
    var tr = $(obj).parent().parent();//获取到tr元素
   //1.初始化模态框的值
    var roleId = tr.find(":checkbox").val();//角色ID
    var roleName = tr.children("td:eq(2)").text();//角色名称
    var roleStatus = tr.children("td:eq(3)").text();//角色状态
    var roleDescription = tr.children("td:eq(5)").text();//角色描述
    $("#update_roleid").val(roleId);
    $("#update_rolename").val(roleName);
    $("#update_description").val(roleDescription);
    //设置状态
    $(".update_rolestatus").removeProp("checked");
    if("启用"==roleStatus){
        $(".update_rolestatus[value='1']").prop("checked","checked");
    }else{
        $(".update_rolestatus[value='0']").prop("checked","checked");
    }
    layui.use('form',function () {
        layui.form.render('radio');
    })

    //2.打开模态框
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'修改角色信息',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#updateRoleModal')
    });
    //向页面隐藏index
    $("#hidden_updateRole_index").val(index);
}
/*****************E   修改角色信息相关操作************/


/***********S  生成权限树相关操作*******************/
/**
 * 查询权限树的函数
 */
function getPermissionTree(){
    $.ajax({
        url : contextPath + '/permission/getPermissionTree4Role.do',
        async : true,
        dataType : 'json',
        success : genePermissionTree,
        error : function() {
            alert("查询权限树失败！！！")
        }
    });
}
//生成树函数


function genePermissionTree(permissionTreeNodes) {
    var setting = {
        view : {
            selectedMulti : true
        },
        check : {
            enable : true, //显示多选框
            chkboxType: { "Y": "ps", "N": "ps" }//勾选的时候影响子节点也影响父节点，取消勾选影响子节点也影响父节点
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
        }
    };
    var treeNodes = permissionTreeNodes;
    $.fn.zTree.init($("#treeDemo"), setting, treeNodes);//在界面生成一颗树
}


/**
 * 展开树节点的第一层且关闭其他节点
 */
function openFirstTreenode(){
    // 获取树对象
    var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
    /* 获取所有树节点 */
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    // 关闭所有节点
    for (var i = 0, length_1 = nodes.length; i < length_1; i++) {
        treeObj.expandNode(nodes[i], false);//第二个参数为false证明是折叠
    }
    //展开第一级节点
    treeObj.expandNode(nodes[0], true);//第二个参数为true证明是展开
}

/***********E  生成权限树相关操作*******************/

/***************S  配置角色权限相关操作****************/

/**
 * 设置角色权限
 * @param obj
 */
function setRolePermission(obj) {

    //0.将所有节点的多选框置为未选
    // 获取树对象
    var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
    /** 获取所有树节点 */
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    // 遍历树节点设置树节点为未选中
    for (var k = 0, length_3 = nodes.length; k < length_3; k++) {
        nodes[k].checked = false;
        treeObj.updateNode(nodes[k],true);
    }

    //1.展开一级节点
    openFirstTreenode();
    //2.到后台获取权限集合。将对应的多选框打构
    var roleId = $(obj).parents("tr").find(":checkbox").val();//角色编号
    $("#hidden_role_id_4_permission").val(roleId);//隐藏角色编号
    $.post(contextPath+"/role/getRolepermission.do",{"roleId":roleId},function (response) {
        if(response == null || response.length == 0){
            return;
        }
        //1.1遍历取回的数据结果，然后设置节点选中
        for(var i=0,length_1 = response.length;i<length_1;i++){
            var permissionID = response[i].permissionID;//获取到权限ID
            // 遍历树节点设置树节点为选中
            for (var j = 0, length_2 = nodes.length; j < length_2; j++) {
                if(permissionID == nodes[j].permissionID){
                    nodes[j].checked = true;
                    treeObj.updateNode(nodes[j],false);//更新节点(第二个设置为true表示可以与自定义的上下级关系同步)
                    break;
                }
            }
        }
    },'json')

    //2.打开模态框
    var  width=($(window).width()*0.60);
    var  top =($(window).height()*0.10);
    var index = layer.open({
        title:'配置权限',
        area: width+'px',//大小定宽，高度自适应
        fixed: false, //不固定
        maxmin: false,//显示最大最小化按钮
        zIndex:1500,//层
        offset:top+'px',//定义坐标
        scrollbar:true,//显示滚动条
        shadeClose: false,//点击外部不关闭
        shade:0.4,//阴影
        type:1,
        content:$('#setPermissionModal')
    });
    //向页面隐藏index
    $("#hidden_setPermission_index").val(index);
}

/**
 * 批量添加角色相关JS
 */
function addRolePermissionBatch() {
    //1.构造权限ID和验证是否可以提交
    // 获取树对象
    var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
    /** 获取所有树节点 */
    var nodes = treeObj.transformToArray(treeObj.getNodes());
    var permissionIds = [];
    var index = 0;
    // 遍历树节点设置树节点为未选中
    for (var i = 0, length_3 = nodes.length; i < length_3; i++) {
        //如果节点选中，就讲节点的编号添加到数组中，且自增索引
        if(nodes[i].checked){
            permissionIds[index] = nodes[i].permissionID;
            index++;
        }
    }
    var layer = getLayuiLayer();
    if(permissionIds.length == 0) {
        layer.msg("请先选择需要分配的权限",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
        return;
    }
    //2.开始提交
    $.ajax({
        url:contextPath+'/role/addRolePermissionByRoleId.do',
        type:'post',
        dataType:'text',
        data:{
            "roleId":$("#hidden_role_id_4_permission").val(),
            "permissionIds":permissionIds.toString()
        },
        success:function (response) {
            layer.msg(response,{time:2*1000},function () {
                if("添加成功" == response){
                    layer.close($("#hidden_setPermission_index").val());
                    queryRoleFY();//重新执行查询
                }
            })
        }
    });


}

/***************E  配置角色权限相关操作****************/




