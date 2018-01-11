<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪酬标准明细复核</title>
<style type="text/css">
.title {
	background: #aed581;
}
</style>
</head>
<body>

	<form id="submitForm" action="${pageContext.request.contextPath}/salary/standard/check" method="post">
		<input type="text" value="${standard.standardId}" name="standardId"
			style="display: none;" />
		<table border="1" width=100% style="font-size: 16px;">
			<tr>
				<td class="title"><label for="num">薪酬标准编号</label></td>
				<td style="text-align: left"><input name="num" type="text"
					value="${standard.num}" readonly="true" /></td>
				<td class="title"><label for="name">薪酬标准名称</label></td>
				<td style="text-align: left"><input name="name" type="text"
					value="${standard.name}" readonly="true" /></td>
				<td class="title"><label for="total">薪酬总额</label></td>
				<td style="text-align: left"><input name="total" type="text"
					value="" readonly="true" /></td>
			</tr>
			<tr>
				<td class="title"><label for="compiler">制定人</label></td>
				<td style="text-align: left"><input name="compiler" type="text"
					value="${standard.compiler}" readonly="true" /></td>
				<td class="title"><label for="register">登记人</label></td>
				<td style="text-align: left"><input name="register" type="text"
					value="${standard.register}" readonly="true" /></td>
				<td class="title"><label for="registerTime">登记时间</label></td>
				<td style="text-align: left"><input name="registerTime"
					class="easyui-datebox" value="${standard.registerTime}"
					data-options="formatter:myformatter,parser:myparser" /></td>
			</tr>
			<tr>
				<td class="title"><label for="comment">复核意见</label></td>
				<td style="text-align: left;" colspan="5"><input name="comment"
					type="text"  data-options="multiline:true"
					style="height: 50px; width: 85%;" /></td>
			</tr>
		</table>
		<table border="1" width=100%
			style="font-size: 16px; text-align: center">
			<tr>
				<td class="title">薪酬项目名称</td>
				<td class="title">薪酬金额</td>
			</tr>
			<c:forEach items="${details}" var="detail">
				<tr>
					<td>${ detail.item}</td>
					<td>${ detail.salary}</td>
				</tr>
			</c:forEach>

		</table>
		<a id="submitBtn" href="#" class="easyui-linkbutton" onclick="submitForm()">复核</a>
	</form>
	<script type="text/javascript">
	
		function submitForm(){
			$("#submitForm").form('submit', {
				dataType:'json',
				success:function(data){
					//alert(data);
					var json=JSON.parse(data);
					if(json.msg=="success"){
						$.messager.alert('消息', '复核通过!');
					}else{
						$.messager.alert('消息', '复核失败!', 'error');
					}
				}
				
			})
		}
	
		function myformatter(date) {
			var y = date.getFullYear();
			var m = date.getMonth() + 1;
			var d = date.getDate();
			return y + '-' + (m < 10 ? ('0' + m) : m) + '-'
					+ (d < 10 ? ('0' + d) : d);
		}
		function myparser(s) {
			if (!s)
				return new Date();
			var ss = (s.split('-'));
			var y = parseInt(ss[0], 10);
			var m = parseInt(ss[1], 10);
			var d = parseInt(ss[2], 10);
			if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {
				return new Date(y, m - 1, d);
			} else {
				return new Date();
			}
		}
	</script>
</body>
</html>