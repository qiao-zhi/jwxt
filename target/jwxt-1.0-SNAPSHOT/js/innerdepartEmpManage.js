

/***********************请求树信息**********************/

function searchDepartmentTree_1() {
		$.ajax({
			type : "post",
			dataType : "json",
			url : "/Exam/department_getDepartmentTree.action",
			success : getTree_1,
			error : function() {
				alert("请求树失败！");
			}
		});
	}
	
/***********************生成树信息**********************/
function getTree_1(result) {
		var treeList = result.treeList;
		var setting = {
				data : {
					simpleData : {
						enable : true,
						idKey: "departmentid",
						pIdKey: "updepartmentid",
						rootPId : null,
					},
					key : {
						name : "departmentname",
					}
				},
				callback : {
					onClick : function(event, treeId, treeNode){
						$("#queryDepartmentId").val(treeNode.departmentid);//给页面隐藏的queryUpUnitId赋值为点击的ID
						
						$("#Myadddepartmentid").val(treeNode.departmentid);
						
						InnerEmpQuery();
						
						
					}
				}
		};
		var zNodes = treeList;
		//添加 树节点的 点击事件；
		var log, className = "dark";
		function onClick(event, treeId, treeNode, clickFlag) {
			clickOnTree(event, treeId, treeNode, clickFlag);
		}
		$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		var treeObj = $.fn.zTree.getZTreeObj("treeDemo");  
		treeObj.expandAll(false);

}

