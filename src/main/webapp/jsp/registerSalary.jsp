<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪酬标准登记</title>
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
<script type="text/javascript">
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
</head>
<body>
	<h3>薪酬标准管理</h3>
	<form id="" action="">
		<table>
			<tr>
				<td><label for="standardNum">薪酬标准编号</label> <input type="text"
					name="standardNum" readonly="true" /></td>
				<td><label for="standardName">薪酬标准名称</label> <input
					id="standardName" type="text" name="standardName" /></td>
				<td><label for="standardTotal">薪酬标准总额</label> <input
					type="text" name="standardTotal" id="standardTotal" /></td>
			</tr>
			<tr>
				<td><label for="compiler">制定人</label> <input id="compiler"
					type="text" name="compiler" style="width: 80%" /></td>
				<td><label for="register">登记人</label> <input id="register"
					type="text" name="register" style="width: 80%" /></td>
				<td><label for="registerTime">登记时间</label> <input
					id="registerTime" class="easyui-datebox" type="text"
					name="registerTime" style="width: 90%"
					data-options="formatter:myformatter,parser:myparser" /></td>
			</tr>

		</table>
		<table id="dg" class="easyui-datagrid" title="薪酬具体项"
			style="width: 700px; height: auto"
			data-options="
				toolbar: '#tb',
				iconCls: 'icon-edit',
				singleSelect: true,
				onClickRow: onClickRow
				">
			<thead>
				<tr>
					<th
						data-options="field:'item',width:200,align:'center',editor:'text'">薪酬项目名称</th>
					<th
						data-options="field:'salary',width:200,align:'center',editor:{type:'numberbox',options:{precision:2}}">金额</th>
				</tr>
			</thead>
		</table>
		<div id="tb" style="height: auto">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-add',plain:true" onclick="append()">添加项</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-remove',plain:true" onclick="remove()">删除项</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-save',plain:true" onclick="accept()">确认</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-edit',plain:true" onclick="post()">提交</a>
		</div>
	</form>

	<script type="text/javascript">
		var editIndex = undefined;
		function endEditing() {
			return true;
		}
		function onClickRow(index) {
			if (editIndex != index) {
				if (endEditing()) {
					$('#dg').datagrid('selectRow', index).datagrid('beginEdit',
							index);
					editIndex = index;
				} else {
					$('#dg').datagrid('selectRow', editIndex);
				}
			}
		}
		function append() {
			if (endEditing()) {
				$('#dg').datagrid('appendRow', {
					//status : 'P'
				});
				editIndex = $('#dg').datagrid('getRows').length - 1;
				$('#dg').datagrid('selectRow', editIndex).datagrid('beginEdit',
						editIndex);
			}
						
		}
		function remove() {
			if (editIndex == undefined) {
				return
			}
			$('#dg').datagrid('cancelEdit', editIndex).datagrid('deleteRow',
					editIndex);
			editIndex = undefined;
		}
		function accept() {
			if (endEditing()) {
				$('#dg').datagrid('acceptChanges');
			}
			/* var s=$("#dg").datagrid('getRows');
			console.log(s); */
			
			console.log(total);
		}
		function post(){	
			var s=$("#dg").datagrid('getRows');
			console.log(s);	
			var base=s[0].salary;
			/* for(var i=0;i<s.length;i++){
				total=eval(s[i].salary)+eval(total);
			} */
			var json=JSON.stringify(s);
			var standardName=$("#standardName").val();
			var standardTotal=$("#standardTotal").val();
			var compiler=$("#compiler").val();
			var register=$("#register").val();
			var registerTime=$("#registerTime").datebox('getValue');
			console.log(standardName+" "+standardTotal+" "+compiler+" "+register+" "+registerTime);
			
			var data='{"standardName":"' + standardName+ '","standardTotal":"' + standardTotal + 
					 '","compiler":"'+compiler+'","register":"'+register+'","registerTime":"'+registerTime+'","totalsalary":'+base+',"items":'+json +'}';
					 console.log(data);
			var url='${pageContext.request.contextPath}/salary/standard/add';
			$.ajax({
			type:'POST',
			url:url,
			contentType:'application/json;charset=utf-8',
			data:data,
			success:function(result){
				console.log(result);
				//var json=JSON.parse(result);
				if(result.msg=="success"){
					$.messager.alert("提示信息", "薪酬登记成功!");
				}else{
					$.messager.alert("提示信息", "薪酬登记失败!");
				}
				//console.log(data);
			},
			dataType:'json'
			}
			);
		}
	</script>
</body>
</html>