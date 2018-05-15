/**
 * @author: qlq
 * @time: 18:29
 * @description:    user的js
 */

/**
 * 页面加载完成后执行一些函数
 */
$(function () {
    queryUserFY();//分页查询用户信息
    getAllRolesIsUse();//查询所有正在使用的角色
});

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



/**********S   layui相关函数******/
layui.use(['layer','form'],function () {
    var layer = layui.layer,form=layui.form;

    //1.监听添加角色事件
    form.on('submit(addUser)', function(data){
        //0.判断两次输入的密码是否相等
        var password_1 = $("#add_password").val();
        var password_2 = $("#sure_password").val();
        if( password_1 !== password_2){
            layer.msg("两次密码不一致，请重新输入")
            return false;
        }
        //1.首先判断userCode是否已经存在
        $.post({
            url:contextPath+"/user/selectUserCountByUserCode.do",
            data:{"userCode":$("#add_usercode").val()},
            async:false,//不允许异步
            success:function (response) {
                if(1 == response){
                    $("#isExisted").val("1");//设置页面隐藏的为1表示已经存在
                } else {
                    $("#isExisted").val("0");//设置页面隐藏的为1表示已经存在
                }
             },
            dataType:'text'});
        if($("#isExisted").val() === "1"){
            layer.msg("账户已经存在，请重新填写!",{time:2*1000,icon:2,shade: [0.8, '#393D49']});
            return false;
        }
        //2.开始提交后台
        $.ajax({
            url:contextPath+'/user/addUser.do',
            type:'post',
            data:data.field,
            success:function (response) {
                layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                    //1.2如果添加成功关闭添加模态框
                    layer.close($("#hidden_add_user_index").val());
                    queryUserFY();
                })
            },
            dataType:'text'
        })
    });

    //2.监听修改角色事件
    form.on('submit(updateUser)', function(data){
        //1.判断两次输入的密码是否相等
        var password_1 = $("#update_password").val();
        var password_2 = $("#sure_update_password").val();
        if( password_1 !== password_2){
            layer.msg("两次密码不一致，请重新输入",{time:2*1000,icon:2,shade: [0.8, '#393D49']})
            return false;
        }
        //2.开始提交后台
        $.ajax({
            url:contextPath+'/user/updateUser.do',
            type:'post',
            data:data.field,
            success:function (response) {
                layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                    //1.2如果添加成功关闭添加模态框
                    layer.close($("#hidden_update_user_index").val());
                    queryUserFY();//重新执行查询
                })
            },
            dataType:'text'
        })
    });



})
/**********E   layui相关函数******/

/***********S  添加用户相关操作********************/
/**
 * 打开添加用户的模态框
 */
function openAddUserModal() {
    $(".clearInput").val("");//清空输入框
    $("#add_userunitname").val("无");
    $("#add_userunitnum").val("无");
    var  width=($(window).width()*0.80);
    var index = layer.open({
        title:'添加用户',
        area: width+'px',//大小
        fixed: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#add_user_modal')
    });
    //向页面隐藏index
    $("#hidden_add_user_index").val(index);
}
/***********E  添加用户相关操作********************/

/*************************S   分页查询用户相关操作*****************/
/**
 * 分页查询用户信息
 */
function queryUserFY(){
    $.ajax({
        url:contextPath+"/user/getUserFY.do",
        data:$("#queryUserForm").serialize(),
        dataType:'json',
        type:'post',
        async:true,
        success:showUserTable
    });
}

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showUserTable(pageInfo){
    $("#userTbody").html("");
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var users = pageInfo.list;
    if(users.length == 0){
       return;
    }
    for(var i = 0,length_1 = users.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var status="",hasRole="";
        //禁用启用
        if(users[i].isUse == "0"){
            status = "<span style='color:red;'>禁用</span>"
        }else{
            status = "启用";
        }
        //未配置和已经配置
        if(users[i].hasRole=="未配置"){
            hasRole = "<span style='color:red;'>未配置</span>"
        }else{
            hasRole = "<a title='点击查看具体的角色信息' href='javascript:void(0)' onclick='queryUserRole(this)'>"+users[i].hasRole+"</a>";
        }
        var tr="<tr>";
        tr += "<td><input type='checkbox' value='"+users[i].userID+"'/><input type='hidden' value='"+users[i].password+"'></td>";
        tr += "<td>"+index+"</td>";
        tr += "<td>"+replaceNull(users[i].userName)+"</td>";
        tr += "<td>"+replaceNull(users[i].userSort)+"</td>";
        tr += "<td>"+replaceNull(users[i].userCode)+"</td>";
        tr += "<td>"+replaceNull(users[i].userUnitName)+"</td>";
        tr += "<td>"+replaceNull(users[i].userUnitNum)+"</td>";
        tr += "<td>"+status+"</td>";
        tr += "<td>"+hasRole+"</td>";
        tr += "<td>"
            +"<a href='javascript:void(0)' title='点击修改用户信息' onclick='openUpdateModal(this)'><i class='layui-icon'>&#xe642;</i></a>"
            +"&nbsp;&nbsp;&nbsp;&nbsp;"
            +"<a href='javascript:void(0)' title='点击配置用户角色' onclick='setUserRole(this)'><i class='layui-icon'>&#xe620;</i></a>"
            +"</td>";
        tr += "</tr>";
        $("#userTbody").append(tr);
    }
    //开启分页组件
    usersPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function usersPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageDiv_user', //注意，这里的 test1 是 ID，不用加 # 号
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
                    queryUserFY();//执行查询分页函数(这个函数必须写在这里)
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
    queryUserFY();//分页查询课程信息
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
    queryUserFY();
}


/*************************E   分页查询用户相关操作*****************/


/**********************S     修改用户相关操作***********/
/**
 * 修改用户
 * @param obj
 */
function openUpdateModal(obj) {
   //1.赋值
    var tr = $(obj).parent().parent();
    $("#update_userid").val(tr.find(":checkbox").val());
    $("#update_usercode").val(tr.children("td:eq(4)").text());//账户
    $("#update_username").val(tr.children("td:eq(2)").text());//姓名
    $("#update_password").val(tr.children("td:eq(0)").children("input:eq(1)").val());//密码
    $("#sure_update_password").val(tr.children("td:eq(0)").children("input:eq(1)").val());//确认密码
    var usersort = tr.children("td:eq(3)").text();
    $("#update_usersort").val(usersort);
   /* if("学生" == usersort){
        $(".update_usersort[value='学生']").prop("selected","selected");
    }else{
        alert("教师")
        $(".update_usersort[value='教师']").prop("selected","true");
    }*/
    $("#update_userunitname").val(tr.children("td:eq(5)").text());//所属机构
    $("#update_userunitnum").val(tr.children("td:eq(6)").text());//机构名称
    //设置状态
    var userStatus = tr.children("td:eq(7)").text();
    $(".update_isuse").removeProp("checked");
    if("启用"==userStatus){
        $(".update_isuse[value='1']").prop("checked","checked");
    }else{
        $(".update_isuse[value='0']").prop("checked","checked");
    }
    //渲染
    layui.use('form',function () {
        layui.form.render();
    })

    //2.打开模态框
    var  width=($(window).width()*0.80);
    var index = layer.open({
        title:'修改用户信息',
        area: width+'px',//大小
        fixed: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#update_user_modal')
    });
    //向页面隐藏index
    $("#hidden_update_user_index").val(index);


}
/**********************E     修改用户相关操作***********/


/**********S   设置单个用户权限相关操作*****/
function setUserRole(obj){
    //0.将角色列表的多选框清空
    $(".role4oneUser").prop("checked",false);//清空多选的选择
    //1.判断是否已经配置角色
    //1.1未配置的直接清空多选框然后打开模态框
    var text = $(obj).parents("tr").children("td:eq(8)").text();
    var userId = $(obj).parents("tr").find(":checkbox").val();
    $("#hidden_one_userId").val(userId);//向模态框隐藏的userId赋值
    if(text === "已配置"){
        $.post(contextPath+'/user/getUserRoleByUserId.do',{"userId":userId},function (response) {
            for(var i=0,length_1 = response.length;i<length_1;i++){
                $(".role4oneUser[value='"+response[i].roleID+"']").prop("checked",true);
            }
        },'json');
    }
    //2.打开模态框
    var  width=($(window).width()*0.60);
    var index = layer.open({
        title:'配置用户角色',
        area: width+'px',//大小
        fixed: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#set_oneUserRole_modal')
    });
    //向页面隐藏index
    $("#hidden_set_oneUserRole_index").val(index);
}

/**
 * 分配单个用户角色
 */
function sureSetRoleOne(){
    var layer = getLayuiLayer();
    //1.验证是否可以分配
    var checkedRole = $(".role4oneUser:checked");//选择的角色多选框
    if(checkedRole.length === 0){
        layer.msg("请选择需要分配的角色!",{time:2*1000,icon:2,shade: [0.8, '#393D49']});
        return;
    }
    //2.进行分配
    var roleIds=[];//两个数组用于接收选择的userid和roleid
    //2.1取出角色ID
    checkedRole.each(function (index) {
        roleIds[index] = $(this).val();
    })
    //2.获取userId
    var userId = $("#hidden_one_userId").val();

    //2.3提交后台
    $.ajax({
        url:contextPath+"/user/setUserRoleBatch.do",
        type:"post",
        data:{
            "userIds":userId,
            "roleIds":roleIds.toString()
        },
        success:function (response) {
            layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                if("分配成功" === response){
                    layer.close($("#hidden_set_oneUserRole_index").val());
                    queryUserFY();//重新执行分页查询
                }
            });
        },
        dataType:'text'
    });
}

/**********E   设置单个用户权限相关操作*****/

/**********S  查询所有正在使用的角色********/
/**
 * 查询所有正在使用的角色
 */
function getAllRolesIsUse() {
    $.post(contextPath+"/role/getAllRolesIsUse.do",{},function (response) {
        // alert(JSON.stringify(response))
        if(response == null || response.length == 0){
            return;
        }
        //1.填充到单个用户分配角色的模态框中
        $("#roleOneUserTbody").html("");
        for(var i=0,length_1 = response.length;i<length_1;i++){
            var tr = "<tr>";
            tr += "<td><input type='checkbox' class='role4oneUser' value='"+response[i].roleid+"'/></td>"
            tr += "<td>"+response[i].rolename+"</td>"
            tr += "<td>"+response[i].description+"</td>"
            tr += "</tr>";
            $("#roleOneUserTbody").append(tr);
        }

        //2.填充到批量分配角色的模态框中
        $("#roleBatchUserTbody").html("");
        for(var j=0,length_2 = response.length;j<length_2;j++){
            var tr = "<tr>";
            tr += "<td><input type='checkbox' class='role4BatchUser' value='"+response[j].roleid+"'/></td>"
            tr += "<td>"+response[j].rolename+"</td>"
            tr += "<td>"+response[j].description+"</td>"
            tr += "</tr>";
            $("#roleBatchUserTbody").append(tr);
        }

       },'json')
}
/**********E  查询所有正在使用的角色********/

/*********S   查询单个用户已经分配的角色信息*******/
/**
 * 查询单个用户的角色信息
 * @param obj
 */
function queryUserRole(obj) {
    var userId = $(obj).parents("tr").find(":checkbox").val();
    //1.查询数据
    $.post(contextPath+'/user/getUserRoleByUserId.do',{"userId":userId},function (response) {
        $("#viewRoleOneUserTbody").html("");
        for(var i=0,length_1 = response.length;i<length_1;i++){
            var tr = "<tr>";
            tr += "<td>"+(i+1)+"</td>"
            tr += "<td>"+response[i].roleName+"</td>"
            tr += "<td>"+response[i].description+"</td>"
            tr += "</tr>";
            $("#viewRoleOneUserTbody").append(tr);
        }
    },'json');
    //2.填充表格
    //2.打开模态框
    var  width=($(window).width()*0.60);
    var index = layer.open({
        title:'用户角色信息',
        area: width+'px',//大小
        fixed: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#view_oneUserRole_modal')
    });
    //向页面隐藏index
    $("#hidden_view_oneUserRole_index").val(index);

}
/*********E   查询单个用户已经分配的角色信息*******/


/***************S   全选和全不选操作*********/
/**
 * 全选和全部选的操作
 * @param obj   表头的按钮自己传下来
 */
function toggleSelectAll(obj) {
    var checked = $(obj).prop("checked");
    $("#userTbody").find(":checkbox").prop("checked",checked);
}



/**
 * 全选和全部选的操作
 * @param obj   表头的按钮自己传下来
 */
function toggleSelectAllRole4Oneuser(obj) {
    var checked = $(obj).prop("checked");
    $("#roleOneUserTbody").find(":checkbox").prop("checked",checked);
}


/**
 * 全选和全部选的操作
 * @param obj   表头的按钮自己传下来
 */
function toggleSelectAllRole4Batchuser(obj) {
    var checked = $(obj).prop("checked");
    $("#roleBatchUserTbody").find(":checkbox").prop("checked",checked);
}
/***************E  全选和全不选操作*********/


/********************S  批量删除相关操作******************/
/**
 * 批量删除用户
 */
function deleteUserBatch() {
    //1.验证是否选择用户
    var layer = getLayuiLayer();
    var id_checked = $("#userTbody").find(":checkbox:checked");
    if(id_checked.length == 0){
        layer.msg("请先选择用户再删除!",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
        return;
    }
    //2.提交后台进行删除
    layer.confirm("确认删除用户?删除之后不可以恢复!",{icon:3},function (index) {
        var ids=[];
        id_checked.each(function (i) {
            ids[i] = $(this).val();
        })
        $.post({
            url: contextPath + "/user/deleteUserBatch.do",
            data: {"userIds": ids.toString()},
            dataType: 'text',
            type: 'post',
            success: function (response) {
                layer.close(index);//关闭当前的层
                layer.msg(response, {time: 2 * 1000, shade: [0.8, '#393D49']}, function () {
                    queryUserFY();//重新查一遍
                });
            }
        });
    });
}
/********************E  批量删除相关操作******************/

/***************S 批量分配角色相关操作***********/
function openBatchModal() {
    //1.验证并且清空多选框的选中状态
    //1.验证是否选择用户
    var layer = getLayuiLayer();
    var id_checked = $("#userTbody").find(":checkbox:checked");
    if(id_checked.length == 0){
        layer.msg("请先选择用户!",{icon:2,time:2*1000,shade: [0.8, '#393D49']});
        return;
    }
    $(".role4BatchUser").prop("checked",false);//清空选择框
    //2.打开模态框
    var  width=($(window).width()*0.60);
    var index = layer.open({
        title:'批量配置用户角色',
        area: width+'px',//大小
        fixed: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#set_batchUserRole_modal')
    });
    //向页面隐藏index
    $("#hidden_set_batchUserRole_index").val(index);

}

/**
 * 确认批量分配角色
 */
function sureSetRoleBatch() {
    var layer = getLayuiLayer();
    //1.验证是否可以分配
    var checkedRole = $(".role4BatchUser:checked");//选择的角色多选框
    var id_checked = $("#userTbody").find(":checkbox:checked");//选择的userid多选框
    if(checkedRole.length === 0){
        layer.msg("请选择需要分配的角色!",{time:2*1000,icon:2,shade: [0.8, '#393D49']});
        return;
    }
    //2.进行分配
    var userIds = [],roleIds=[];//两个数组用于接收选择的userid和roleid
    //2.1取出角色ID
    checkedRole.each(function (index) {
        roleIds[index] = $(this).val();
    })

    //2.2取出userId
    id_checked.each(function (index) {
        userIds[index] = $(this).val();
    })
    //2.3提交后台
    $.ajax({
        url:contextPath+"/user/setUserRoleBatch.do",
        type:"post",
        data:{
            "userIds":userIds.toString(),
            "roleIds":roleIds.toString()
        },
        success:function (response) {
            layer.msg(response,{time:2*1000,shade: [0.8, '#393D49']},function () {
                if("分配成功" === response){
                    layer.close($("#hidden_set_batchUserRole_index").val());
                    queryUserFY();//重新执行分页查询
                }
            });
        },
        dataType:'text'
    });

}

/***************E 批量分配角色相关操作***********/





