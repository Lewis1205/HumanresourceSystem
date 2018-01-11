<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<title>Insert title here</title>
</head>
<body>
	<form id="queryForm"
		action="${pageContext.request.contextPath}/salary/query" method="post">
		<table>
			<tr>
				<td><lable for="salaryNum">薪酬标准编号</td>
				<td><input tyoe="text" name="salaryNum" /></td>
			</tr>
			<tr>
				<td><lable for="keyword">关键字</td>
				<td><input tyoe="text" name="keyword" /></td>
			</tr>
			<tr>
				<td><lable for="fromRegisterTime">登记时间</td>
				<td><input class="easyui-datebox" name="fromRegisterTime"
					data-options="showSeconds:false,formatter:myformatter,parser:myparser"
					style="width: 150px"> 至</td>
				<td><input class="easyui-datebox" name="toRegisterTime"
					data-options="showSeconds:false,formatter:myformatter,parser:myparser"
					style="width: 150px"></td>
			</tr>
			<tr>
				<td><a id="submitBtn" href="javascript:void(0)"
					class="easyui-linkbutton">查询</a></td>
			</tr>
		</table>
	</form>
	<table id="standardList" border="1" style="font-size: 16px;" cellpadding="10">
		<tr>
			<td>薪酬标准编号</td>
			<td>薪酬标准名称</td>
			<td>制定人</td>
			<td>登记人</td>
			<td>操作</td>
		</tr>

	</table>
	<script type="text/javascript">
		$("#submitBtn").click(function() {
			$("#queryForm").form('submit', {
				dataType : 'json',
				success : function(data) {
					//alert(data);
					var jsonObject = JSON.parse(data);
					console.log(jsonObject);
					$("#standardList  tr:not(:first)").empty("");
					for(var i=0;i<jsonObject.length;i++){
							var s='<tr><td>'+jsonObject[i].num +'</td>'
							      +'<td>'+jsonObject[i].name+'</td>'
							      +'<td>'+jsonObject[i].compiler+'</td>'
							      +'<td>'+jsonObject[i].register+'</td>'
							      +'<td><a href="javascript:void(0)" onclick="toDetail('+jsonObject[i].standardId +')">查看明细</a>'
							      +'</td></tr>';
							   $("#standardList").append(s);
					}
				}
			});
		})

		
		function toDetail(standardId){
			alert(standardId);
			var parent$ = self.parent.$;
			var title = '薪酬明细复核'
			if (parent$('#tt').tabs('exists', title)) {
				parent$('#tt').tabs('select', title);
			} else {
				var url = '${pageContext.request.contextPath}/salary/' + standardId
						+ '/salaryInfo';
				alert(url);
				var content = '<iframe frameborder="0" width="100%" height="100%" src="'
						+ url + '"></iframe>';
				parent$('#tt').tabs('add', {
					title : title,
					content : content,
					closable : true
				});
			}
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