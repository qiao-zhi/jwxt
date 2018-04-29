/**
 * @author: ll
 * @description: 通知书管理JS
 */
//初始化页面加载函数
$(function(){
    findTaskNoticeBaseInfo();

})

//查询任务通知书基本信息
function findTaskNoticeBaseInfo(){
    $.ajax({
        url : contextPath+'/arrangeCourse/findTaskInfoList.action',
        data : $("#selectNoticeInfoForm").serialize(),
        type : 'POST',
        dataType : 'json',
        async:true,
        success : showTaskNoticeBaseInfo
    });
}
function showTaskNoticeBaseInfo(pageInfo){
   // console.log(pageInfo) //测试是否有值
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var baseInfoList = pageInfo.list;
    $("#noticeBaseInfoList").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = baseInfoList.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr ="<tr><td><input type='radio' name='noticeRadio' value='"+baseInfoList[i].noticeBookId+"'/></td><td>"
            +index+"</td><td>"
            +baseInfoList[i].academicName+"</td><td>"
            +baseInfoList[i].academicYear+"</td><td>"
            +(baseInfoList[i].term>1?'第二学期':'第一学期')+"</td><td>"
            +baseInfoList[i].createrName+"</td><td>"
            +baseInfoList[i].createTime+"</td><td>"
            +(baseInfoList[i].isInput>0?'已导入':'未导入')+"</td>"
            +"<td class='td-manage'><a title='点击查看通知书详细信息' onclick='x_admin_show('教学通知书详细信息','adviceBook-view.jsp')' href='javascript:;'><i class='layui-icon'>&#xe63c;</i></a>"
            +"<a title='点击修改通知书信息'  onclick='x_admin_show('修改通知书','adviceBook-edit.jsp')' href='javascript:;'><i class='layui-icon'>&#xe642;</i></a>"
            +" <a title='删除' onclick='member_del(this,'要删除的id')' href='javascript:;'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
        $("#noticeBaseInfoList").append(tr);
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
            elem: 'noticePage', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='currentPage']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    findTaskNoticeBaseInfo();//执行查询分页函数(这个函数必须写在这里)
                }
            }
        });
    });
}