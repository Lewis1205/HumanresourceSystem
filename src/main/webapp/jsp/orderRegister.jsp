<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪酬发放登记</title>
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
	薪酬发放登记
	<table id="orderTb" border="1" style="text-align: center;"
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

	<script type="text/javascript">
		window.onload = function() {
			var url = '${pageContext.request.contextPath}/order/orders';
			$
					.ajax({
						type : 'GET',
						url : url,
						success : function(result) {
							console.log(result);
							for (var i = 0; i < result.length; i++) {
								//var dept=result[i].juniorDept;
								var s = '<tr><td>'
										+ result[i].orderNum
										+ '</td>'
										+ '<td>'
										+ result[i].principleDept
										+ '</td>'
										+ '<td>'
										+ result[i].seniorDept
										+ '</td>'
										+ '<td>'
										+ result[i].juniorDept
										+ '</td>'
										+ '<td>'
										+ result[i].people
										+ '</td>'
										+ '<td>'
										+ '<a href="javascript:void(0)"  onclick="register(\''
										+ result[i].orderId + '\')">登记</a>';
								$("#orderTb").append(s);
							}
						},
						dataType : 'json'
					})
		}
		function register(orderId) {
			console.log(orderId);
			var parent$ = self.parent.$;
			var title='薪酬发放登记明细';
			
				var url = '${pageContext.request.contextPath}/order/'+orderId+'/staffAndDetail';
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
</body>
</html>