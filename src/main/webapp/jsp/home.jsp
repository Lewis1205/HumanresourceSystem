
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源管理系统</title>
</head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/icon.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/js/ztree/zTreeStyle.css"
	type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all-3.5.js"></script>
<body class="easyui-layout">
	<!-- 使用div指定区域 -->
	<div data-options="region:'north'"
		style="text-align: center; padding: 2px;">
		<span><font size="5px">人力资源管理系统</font></span>
	</div>
	<div title="系统菜单" data-options="region:'west'" style="width: 200px">
		<ul id="leftmenu" class="ztree"></ul>
		<script type="text/javascript">
			$(function() {
				//当页面加载完成后，动态创建ztree菜单
				var setting2 = {
					data : {
						simpleData : {
							enable : true
						//启用简单json数据描述节点数据 
						}
					},
					callback : {//绑定事件 
						onClick : function(a, b, treeNode) {
							//alert("点击tab");
							var page = treeNode.page;
							var name = treeNode.name;
							//alert(name);

							if (treeNode.pId != null) {//需要打开选项卡
								//判断当前选项卡是否已经打开
								var e = $("#tt").tabs("exists", treeNode.name);
								if (e) {
									//已经打开
									$("#tt").tabs("select", treeNode.name);
								} else {
									$("#tt")
											.tabs(
													"add",
													{
														title : treeNode.name,
														content : '<iframe frameborder="0" width="100%" height="100%" src="'
																+ page
																+ '"></iframe>',
														closable : true,
														iconCls : 'icon-edit'
													});
								}
							}

						}
					}

				};//设置ztree相关的属性
				//构造json数据
				var zNodes2 = [
						{
							id : '1',
							pId : '0',
							name : '系统设置'
						},//每个json对象对应一个节点数据
						{
							id : '11',
							pId : '1',
							name : '机构设置',
							page : '${pageContext.request.contextPath}/jsp/test.jsp'
						},
						{
							id : '12',
							pId : '1',
							name : '职位设置',
							page : '${pageContext.request.contextPath}/jsp/test.jsp'
						},
						<shiro:hasPermission name="staff">
						{
							id : '2',
							pId : '0',
							name : '人力资源管理'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="staff">
						{
							id : '21',
							pId : '2',
							name : '员工登记',
							page : '${pageContext.request.contextPath}/jsp/registerStaff.jsp'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="StManager">
						{
							id : '22',
							pId : '2',
							name : '员工复核',
							page : '${pageContext.request.contextPath}/jsp/checkList.jsp'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="staff">
						{
							id : '23',
							pId : '2',
							name : '员工查询',
							page : '${pageContext.request.contextPath}/jsp/queryStaff.jsp'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="StManager">
						{
							id : '24',
							pId : '2',
							name : '档案删除',
							page : '${pageContext.request.contextPath}/jsp/deleteList.jsp'
						},
						</shiro:hasPermission>						
						
						<shiro:hasPermission name="salary">
						{
							id : '3',
							pId : '0',
							name : '薪酬管理'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="salary">
						{
							id : '31',
							pId : '3',
							name : '薪酬标准登记',
							page : '${pageContext.request.contextPath}/jsp/registerSalary.jsp'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="SaManager">
						{
							id : '32',
							pId : '3',
							name : '薪酬标准复核',
							page : '${pageContext.request.contextPath}/jsp/checkSalary.jsp'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="salary">
						{
							id : '33',
							pId : '3',
							name : '薪酬发放登记',
							page : '${pageContext.request.contextPath}/jsp/orderRegister.jsp'
						},
						</shiro:hasPermission>
						<shiro:hasPermission name="SaManager">
						{
							id : '34',
							pId : '3',
							name : '薪酬发放复核',
							page : '${pageContext.request.contextPath}/jsp/checkRecord.jsp'
						} ,
						</shiro:hasPermission>
						<shiro:hasPermission name="salary">
						{
							id : '35',
							pId : '3',
							name : '薪酬发放查询',
							page : '${pageContext.request.contextPath}/jsp/querySalary.jsp'
						} 
						</shiro:hasPermission>
						
						];
				//创建ztree
				$.fn.zTree.init($("#leftmenu"), setting2, zNodes2);
			});
		</script>
	</div>

	<div data-options="region:'center'">
		<div id="tt" class="easyui-tabs" data-options="fit:true"></div>

	</div>

</body>
</html>