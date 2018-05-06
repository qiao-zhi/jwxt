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
/********E   几个全局函数************/


/**
 * 页面加载完成执行的函数
 */
$(function () {
    // alert("页面加载完成")
    alert($("#trainSchemeId").val())//获取页面隐藏的培养方案编号
    getTypeTree();
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
    if(confirm("确认删除?\n将会删除下面的所有课程信息!!!")){
        if(treeNode.isParent){
            layer.msg("该目录下面还有子目录，请从最底层目录开始删除!",{icon:2,shade: [0.8, '#393D49']})
            return false;
        }
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
    layer.msg("开始删除")
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
  // alert(treeNode.typename+"\t"+treeNode.typenum)
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





