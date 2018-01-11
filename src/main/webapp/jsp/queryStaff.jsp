<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工查询</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/icon.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/js/ztree/zTreeStyle.css"
	type="text/css">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all-3.5.js"></script>
</head>
<body>
	<form id="queryForm"
		action="${pageContext.request.contextPath}/staff/searchStaff"
		method="post">
		<table>
			<tr>
				<td><label for="principle">一级机构</label></td>
				<td><input id="principle" class="easyui-combobox"
					name="principleDept"
					data-options="
							valueField:'deptName',
							textField:'deptName',	
							method:'GET',							
							url:'${pageContext.request.contextPath}/dept/principles',
							onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/dept/childDept/'+rec.deptId;
    									    $('#senior').combobox('reload', url);
    									}
								" /></td>
			</tr>
			<tr>
				<td><label for="senior">二级机构</label></td>
				<td><input id="senior" class="easyui-combobox"
					name="seniorDept"
					data-options="			valueField:'deptName',
										  textField:'deptName',
										  method:'GET',										  
										  onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/dept/childDept/'+rec.deptId;
    									    $('#junior').combobox('reload', url);
    									}
										  " />
				</td>
			</tr>
			<tr>
				<td><label for="junior">三级机构</label></td>
				<td><input id="junior" class="easyui-combobox"
					name="juniorDept"
					data-options="valueField:'deptName',
										  textField:'deptName',										  	
										  method:'GET'
										  	" /></td>
			</tr>
			<tr>
				<td><label for="pos_category">职位分类</label></td>
				<td><input id="pos_category" class="easyui-combobox"
					name="posCategory"
					data-options="valueField:'posCategory',
										  textField:'posCategory',	
										  method:'GET',
										  
										  url:'${pageContext.request.contextPath}/pos/categories',
										  onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/pos/'+rec.categoryId+'/position';
    									    $('#pos_name').combobox('reload', url);
    									}
    									" />
				</td>
			</tr>
			<tr>
				<td><label for="pos_name">职位名称</label></td>
				<td><input id="pos_name" class="easyui-combobox" name="posName"
					data-options="valueField:'posName',
										  textField:'posName',	
										  method:'GET'
										 " />
				</td>
			</tr>
			<tr>
				<td><label for="birth">生日</label></td>
				<td><input class="easyui-datebox" name="fromRegisterTime"
					data-options="showSeconds:false,formatter:myformatter,parser:myparser"
					style="width: 150px"> 至</td>
				<td><input class="easyui-datebox" name="toRegisterTime"
					data-options="showSeconds:false,formatter:myformatter,parser:myparser"
					style="width: 150px"></td>

			</tr>
			<tr>
				<td style="text-align: center"><a id="submitBtn" href="#"
					class="easyui-linkbutton">提交</a></td>
			</tr>
		</table>
	</form>
	<!-- ${pageContext.request.contextPath}/staff/searchStaff -->
	${staffs==null}
	<table id="tt" style="width: 1000px;" border="1">
		<tr>
			<td>档案编号</td>
			<td>一级机构</td>
			<td>二级机构</td>
			<td>三级机构</td>
			<td>职位分类</td>
			<td>职位名称</td>
			<td>姓名</td>
			<td>查看明细</td>
		</tr>
	</table>


	<script type="text/javascript">
		$("#submitBtn").click(function() {
			$("#queryForm").form('submit', {
				success : function(data) {
					//var json = eval('(' + data + ')'); //转化为js中的json数据
					//console.log("%o", data);
					alert(data);
					addList(data);
				}
			});

		});

		function addList(data) {
			//alert("添加列表");
			//$("#tt").clear();
			console.log(eval(data));
			data = eval(data);
			$("#tt  tr:not(:first)").empty("");
			for (var i = 0; i < data.length; i++) {
				var s = "<tr><td>" + data[i].num + "</td><td>"
						+ data[i].principleDept + "</td><td>"
						+ data[i].seniorDept + "</td><td>" + data[i].juniorDept
						+ "</td><td>" + data[i].posName + "</td><td>"
						+ data[i].posCategory + "</td><td>" + data[i].name
						+ "</td><td>"
						+ "<a href='javascript:void(0)' onclick='addTab("
						+ data[i].staffId + ")'>查看明细</a> " + "</td></tr>";
				$("#tt").append(s);
			}
		}
		function addTab(staffId) {
			var parent$ = self.parent.$;
			var title = '员工明细'
			alert(staffId);
			if (parent$('#tt').tabs('exists', title)) {

				parent$('#tt').tabs('select', title);
			} else {
				var url = '${pageContext.request.contextPath}/staff/' + staffId
						+ '/staffInfo';
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