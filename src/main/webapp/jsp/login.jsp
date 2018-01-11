<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源管理登录页面</title>
<style type="text/css">
.submitform {
	position: absolute;
	left: 50%;
	top: 50%;
	width: 300px;
	height: 100px;
	margin-left: -100px;
	margin-top: -50px;
}
</style>
</head>
<body background="${pageContext.request.contextPath}/images/bg.jpg">
	<form id="loginForm" action="${pageContext.request.contextPath}/login"
		align="center" method="post">
		<table align="center" class="submitform">
			<tr>
				<td><label for="username">用户名</label></td>
				<td><input class="easyui-validatebox"
					data-options="required:true" name="username"></td>
			</tr>
			<tr>
				<td><label for="username">密码</label></td>
				<td><input class="easyui-validatebox" type="password"
					data-options="required:true" name="password"></td>
			</tr>
			<tr>
				<td><font color="red">${error }</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登陆"></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		/* $("#submitBtn").click(function() {
			$("#loginForm").form('submit', {
					dataType:'json',
					success:function(result){
						//alert(result);
						var json=eval('('+result+')');
						if(json.msg=="success"){
							window.location.href ='${pageContext.request.contextPath}/jsp/home.jsp';
						}else{
							$.messager.alert("提示","登录失败！","error");
							//window.location.href ='${pageContext.request.contextPath}/jsp/login.jsp';
						}
					}
			});
		}) */
	</script>
</body>
</html>