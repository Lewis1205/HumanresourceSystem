<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工复核</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/icon.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/js/ztree/zTreeStyle.css"
	type="text/css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/demo.css">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all-3.5.js"></script>
</head>
<body>
	<p>已复核列表</p>
	<table id="tt" class="easyui-datagrid" style="width: 1000px"
		url="${pageContext.request.contextPath}/staff/checked"
		singleSelect="true" roownumbers="true" title="已复核列表" pagination="true">
	</table>
	<script type="text/javascript">
		$("#tt")
				.datagrid(
						{
							columns : [ [
									{
										field : 'num',
										width : '120',
										align : 'center',
										title : '档案编号'
									},
									{
										field : 'name',
										width : '120',
										align : 'center',
										title : '姓名'
									},
									{
										field : 'gender',
										width : '120',
										align : 'center',
										title : '性别'
									},
									{
										field : 'principleDept',
										width : '120',
										align : 'center',
										title : '一级机构'
									},
									{
										field : 'seniorDept',
										width : '120',
										align : 'center',
										title : '二级机构'
									},
									{
										field : 'juniorDept',
										width : '120',
										align : 'center',
										title : '三级机构'
									},
									{
										field : 'staffId',
										width : '120',
										align : 'center',
										title : '复核',
										formatter : function(value, row, index) {
											//alert(value);
											//alert(row)
											//addTab('复核明细' ,'${pageContext.request.contextPath}/jsp/staffInfo.jsp'
												
											if(value!=undefined){
												var s =`<a id="check" href="javascript:void(0)" onclick="getSelected()"
													 class="easyui-linkbutton">删除</a>`;
												
												return s;												
											}			
										}
								} ] ]
						});

					function getSelected(){						
							var row = $('#tt').datagrid('getSelected');
							if (row){
								var staffId=row.staffId;
								//addTab('复核明细' ,'${pageContext.request.contextPath}',staffId);
								//alert("deleteStaff: "+staffId);
								deleteStaff(staffId);
							}
	}
					
					function deleteStaff(staffId){
						var url='${pageContext.request.contextPath}/staff/'+staffId+'/delete';
						$.post(url,{},function(data){
							alert(data);
							// eval('(' + data + ')')
							var json =eval(data);
							console.log(json);
							if(json.msg=="success"){
								$.messager.alert('消息', '删除成功!');
								$("#tt").datagrid('reload');
							}else{
								$.messager.alert('消息', '删除失败!');
							}
						},'json')
					}
												
																
																
												

	</script>
</body>
</html>