<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
</head>
<body>
	<form action="${pageContext.request.contextPath }/order/query"
		id="queryForm" method="post">
		<table>
			<tr>
				<td><label for="orderNum">薪酬单号</label></td>
				<td><input class="easyui-validatebox" name="orderNum" /></td>
			</tr>
			<tr>
				<td><label for="keyword">关键字</label></td>
				<td><input class="easyui-validatebox" name="keyword" /></td>
			</tr>
			<tr>
				<td><a id="queryBtn" class="easyui-linkbutton"
					href="javascript:void(0)">查询</a></td>
			</tr>
		</table>
	</form>

	<table id="orderForm" border="1" style="text-align: center;"
		cellpadding="5">
		<tr>
			<td>薪酬发放单号</td>
			<td>一级机构</td>
			<td>二级机构</td>
			<td>三级机构</td>
			<td>人数</td>
			<td>操作</td>
		</tr>

	</table>
</body>
<script type="text/javascript">
	$("#queryBtn").click(function() {
		$("#queryForm").form('submit', {
			dataType : 'json',
			success : function(result) {
				console.log(result);
				$("#orderForm  tr:not(:first)").empty("");
				//alert(result);
				var json = JSON.parse(result);
				for (var i = 0; i < json.length; i++){
				var s = '<tr><td>'
					+ json[i].orderNum
					+ '</td>'
					+ '<td>'
					+ json[i].principleDept
					+ '</td>'
					+ '<td>'
					+ json[i].seniorDept
					+ '</td>'
					+ '<td>'
					+ json[i].juniorDept
					+ '</td>'
					+ '<td>'
					+ json[i].people
					+ '</td>'
					+ '<td>'
					+ '<a href="javascript:void(0)"  onclick="toDetail(\''
					+ json[i].orderId + '\')">查看明细</a>';
			$("#orderForm").append(s);}
			}
		})
	})
	
	function toDetail(orderId){
		//alert(orderId);
		//console.log(orderId);
		var parent$ = self.parent.$;
		var title='薪酬发放登记明细';
		
			var url = '${pageContext.request.contextPath}/order/'+orderId+'/querystaffAndDetail';
			console.log(url);
			var content = '<iframe frameborder="0" width="100%" height="100%" src="'
					+ url + '"></iframe>';
			parent$('#tt').tabs('add', {
				title : title,
				content : content,
				closable : true
			});
	}
</script>
</html>