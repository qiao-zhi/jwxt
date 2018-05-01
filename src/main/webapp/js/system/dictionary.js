/**
 * @author: qlq
 * @time: 17:29
 * @description:    字典的JS
 */
//定义两个layui的全局变量
var form,layer;
//自调函数初始化全局变量
(function () {
    layui.use(['layer','form'],function () {
        form = layui.form;
        layer=layui.layer;
    })
})();




//页面加载完成后执行一些函数
/*$(function () {
    alert("页面加载完成")
})
alert(contextPath)*/


/****S           生成左边的树的相关函数    *************/
/**
 * 查询字典树的函数
 */
function getDictionaryTree(){
    $.ajax({
        url : contextPath + '/dictionary/getDictionaryTree.do',
        async : true,
        dataType : 'json',
        success : geneDepartmentTree,
        error : function() {
            alert("查询内部部门树失败！！！")
        }
    });
}
//生成树函数
//生成树函数

function geneDepartmentTree(departmentTrees) {
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
                idKey : "dictionaryId",
                pIdKey : "updictionaryID",
                rootPId : "1"
            },
            key : {
                name : "dictionaryName",
            }
        },
        callback : {
            onClick : zTreeOnClick
        }
    };
    var treeNodes = departmentTrees;
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
    //1.向隐藏的上级字典编号赋值
    $("[name='updictionaryid']").val(treeNode.dictionaryId);
    $("#add_updictionaryname").val(treeNode.dictionaryName);//向添加模态框赋值

    //2.清空页号重新查询
    $("[name='pageNum']").val("");
    getDictionaryFY();
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
/****E           生成左边的树的相关函数    *************/


/****************S           表格函数************************/

/**
 * 分页查询字典信息
 * 1.post查询字典
 2.填充表格
 3.显示分页插件
 */
function getDictionaryFY() {
    //查询字典
    $.ajax({
        url:contextPath+"/dictionary/getDictionaryFY.do",//url
        data:$("#dictionaryQueryForm").serialize(),//数据
        type:'post',
        dataType:'json',
        success:showDictionaryTable//填充数据到表格
    });

}

/**
 * 填充数据到表格中
 * @param response  ajax异步返回的信息
 */
function showDictionaryTable(pageInfo) {
    // alert(JSON.stringify(pageInfo))//打印返回的数据，将JSON转为字符串
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var dictionarys = pageInfo.list;
    $("#dictionaryTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = dictionarys.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var status = dictionarys[i].isUse=="1"?"启用":"禁用";
        var tr = "<tr><td>"+'<input type="checkbox" name="dictionaryCheckbox" class="dictionaryIDClass" value="'+dictionarys[i].dictionaryID+'"><input type="hidden" value="'+dictionarys[i].dictionaryID+'"/></td>'
            +'<td>'+index+'</td>'
            +'<td>'+dictionarys[i].dictionaryName+'</td>'
            +'<td>'+dictionarys[i].upDictName+'</td>'
            +'<td>'+dictionarys[i].description+'</td>'
            +'<td>'+status+'<input type="hidden" value="'+dictionarys[i].isUse+'">'+'</td>'
            +'<td>'
            +'<a href=javascript:void(0) title="点击修改字典基本信息" onclick="openUpdateDict(this)"><i class="layui-icon">&#xe642;</i></a>'
            +'</td></tr>'
        $("#dictionaryTbody").append(tr);
    }

    //开启分页组件
     dictionarysPage(total,pageNum,pageSize);
}
/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function dictionarysPage(total,pageNum,pageSize){
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
                    getDictionaryFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

/**
 * 查询放大镜的查询方法
 */
function queryDictionaryBtn(){
    $("[name='pageNum']").val("");//清空页号重新查询
    getDictionaryFY();//执行查询分页函数(这个函数必须写在这里)
}


/**
 * 清空查询条件的按钮
 * 1.清空所有的条件，包括隐藏域的条件，2.重新查询一次
 * @param obj   将清空条件按钮自己传下来
 */
function clearQueryCondition(obj) {
    //1.清空条件.并且将树选中的背景色去掉
    var form = $(obj).parents("form");
    form.find("input").val("");
    form.find("select").val("");
    $(".curSelectedNode").removeClass("curSelectedNode");//去掉树选中的class，取消树的背景色
    //2.重新查询一次

    getDictionaryFY();
}
/****************E           表格函数************************/

/*********S         添加字典相关方法************/
function openAddModal(){
    layui.use(['layer','form'],function () {
        /*如果没有选择上级字典就提示先选择上级字典*/
        var layer = layui.layer,form = layui.form;
        if($("[name='updictionaryid']").val()==''){
            layer.alert("请先选择上级字典")
            return;
        }
        //如果选择了上级字典就可以添加
        var  width=($(window).width()*0.80);
        var height=($(window).height()*0.70);
        var index = layer.open({
            title:'添加字典',
            area: [width+'px', height +'px'],//大小
            fix: true, //不固定
            maxmin: true,
            zIndex:500,
            shadeClose: false,
            shade:0.4,
            type:1,
            content:$('#addModal')
        });
        //向页面隐藏index
        $("#hidden_add_index").val(index);
    })
}
//监听提交事件
layui.use(['layer','form'],function () {
    var layer = layui.layer,form = layui.form;
    form.on('submit(addDictionary)', function(data){
        $.ajax({
            url:contextPath+"/dictionary/addDictionary.do",
            data:data.field,
            type:'post',
            datatype:'text',
            success:function (response) {
                layer.msg(response,{time:1500},function () {
                    if("添加成功"==response){
                        layer.close($("#hidden_add_index").val()); //关闭当前窗口
                        window.location.reload();//刷新页面
                    }
                });
             }
        });
    });
})

/*********E         添加字典相关方法************/
/****S         批量删除字典相关操作*********/
/**
 * 全选和反选的操作
 * @param obj   将按钮自己传下来
 */
function selectAllAndDisselect(obj){
    var value = $(obj).prop("checked");
    $("[name='dictionaryCheckbox']").prop('checked',value);
}
/**
 * 批量删除字典
 */
function deleteDictBatch(){
    //获取选中的元素的个数
    var length_1 = $("[name='dictionaryCheckbox']:checked").length;
    //1.如果选中的个数为0，直接退出函数，提示选择字典删除
    if(length_1 ==0 ){
        layer.alert("请选中需要删除的字典")
        return ;
    }
    //如果有元素需要被删除
    else {
        if (layer.confirm("您确认要删除下列字典?", function (index) {
                //第二种方式，以数组的方式去提交。后台用string接收
                var values = [];
                $("[name='dictionaryCheckbox']:checked").each(function (i) {//i代表索引
                    values[i] = $(this).val();
                })
                $.post(contextPath + '/dictionary/deleteDictBatch.do', {dictionaryIds: values.toString()}, function (response) {
                    if (response == "删除成功") {
                        layer.close(index);
                        getDictionaryTree();//查询字典树
                        getDictionaryFY();//分页查询字典信息
                        layer.msg("删除成功");
                    }
                }, 'text')
                //删除的业务逻辑

            })) ;
    }
}
/****E         批量删除字典相关操作*********/
/*************S         修改字典相关操作************/
/**
 * 打开修改字典信息模态框
 * @param obj   将修改按钮自己传下来
 */
function openUpdateDict(obj){
    var tr= $(obj).parent().parent();//获取到tr元素
    var update_dictionaryid = tr.children("td:eq(0)").children("input:hidden").val();//字典变
    var update_dictionaryname = tr.children("td:eq(2)").text();//字典名称
    var update_updictionaryname = tr.children("td:eq(3)").text();//上级字典名称
    var update_description = tr.children("td:eq(4)").text();//字典描述
    var update_isuse = tr.children("td:eq(5)").children("input:hidden").val();//字典状态
    $("#update_dictionaryid").val(update_dictionaryid);
    $("#update_dictionaryname").val(update_dictionaryname);
    $("#update_updictionaryname").val(update_updictionaryname);
    $("#update_description").val(update_description);
/*    $(".update_isuse").each(function () {
       if($(this).val()==update_isuse){
           alert($(this).val())
           $(this).prop("chcked","checked");
       }
    });*/
    $(".update_isuse:radio").removeAttr("checked");//删除checked属性
    $(".update_isuse:radio[value='"+update_isuse+"']").attr("checked", true);
    form.render('radio'); //重新渲染radio单选框
    var  width=($(window).width()*0.80);
    var height=($(window).height()*0.70);
    var index = layer.open({
        title:'修改字典信息',
        area: [width+'px', height +'px'],//大小
        fix: true, //不固定
        maxmin: true,
        zIndex:500,
        shadeClose: false,
        shade:0.4,
        type:1,
        content:$('#updateModal')
    });
    //向页面隐藏index
    $("#hidden_update_index").val(index);
}

//监听修改表单的提交事件
layui.use(['layer','form'],function () {
    var layer = layui.layer,form = layui.form;
    form.on('submit(updateDictionary)', function(data){
        $.ajax({
            url:contextPath+"/dictionary/updateDict.do",
            data:data.field,
            type:'post',
            datatype:'text',
            success:function (response) {
                layer.msg(response,{time:1500},function () {
                    if("修改成功"==response){
                        layer.close($("#hidden_update_index").val()); //关闭当前窗口
                        window.location.reload();//刷新页面
                    }
                });
            }
        });
    });
})
/*************E         修改字典相关操作************/








