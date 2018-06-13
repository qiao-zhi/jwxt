
/*根据学年查询班级校外神人数统计*/
function selectCount(){
    var startYear = $("#start_year").val()-4;
    var endYear = $("#end_year").val()-4;
    var sYear = $("#start_year").val();
    var eYear = $("#end_year").val();
    var userId = $("#userID").val();
    $.ajax({
        url:contextPath+"/count/selectClassCoutn.do",
        type:"post",
        data:{"sYear":startYear,"eYear":endYear,"userID":userId,"pagenum":$("[name='pageNum']").val(),"pagesize":$("[name='pageSize']").val()},
        dataType:"json",
        success:function (pageInfo) {
            var result = pageInfo.list;
            var total = pageInfo.total;
            var pageNum = pageInfo.pageNum;
            var pageSize = pageInfo.pageSize;
            $("#thead_tbody").html("");
            for(var i=0;i<result.length;i++){
                var className = result[i].className;
                var majorName = result[i].majorName;
                var num = result[i].classPeopleNum;
                var students = result[i].students;
                var majorID = result[i].majorID;
                var classID = result[i].classID;
                addOneClassInfo(sYear,eYear,majorName,className,num,students.length,classID);
            }
            //开启分页组建
            OnePageStudentApplyInfo(total,pageNum,pageSize);
        },
        error:function(){

        }

    });
}
function addOneClassInfo(startYear,endYear,major,majorClass,num,oGDnum,classID){
    var str = '';
    str += '<tr>';
    str += '<td>'+startYear+'-'+endYear+'学年</td>';
    str += '<td>'+major+'</td>';
    str += '<td>'+majorClass+'</td>';
    str += '<th>'+num+'</th>';
    str += '<td class="y_files" title="点击查看校外毕设人员详细信息" ';
    str += 'onclick="';
    str += "x_admin_show_big('校外毕设人员详细信息','./outGraduateStaNum.jsp?classID="+classID+"'";
    str += ')">'+oGDnum+'</td>';
    str += '</tr>';
    $tr = $(str);
    $("#thead_tbody").append($tr);
}

//分页组建函数
function OnePageStudentApplyInfo(total,pageNum,pageSize){
    /*分页js*/
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;
        //完整功能
        laypage.render({
            elem: 'demo7'
            ,count: total
            ,limit:pageSize
            ,curr:pageNum
            ,limits:[6,4,2]
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj,first){
                $("[name='pageNum']").val(obj.curr);
                $("[name='pageSize']").val(obj.limit);
                if(!first){
                    selectCount();
                }
            }
        });
    });
}