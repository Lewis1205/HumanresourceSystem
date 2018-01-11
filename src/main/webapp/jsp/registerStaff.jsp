<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
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
<style type="text/css">
td {
	text-align: left;
	padding: 5px;
}
</style>
<body>
	<form id="registerForm" method="post"
		action="${pageContext.request.contextPath}/staff/add"
		style="font-size: 16px; text-align: center">
		<table>
			<tr>
				<td>
					<div>
						<!--onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/childDept/'+rec.dept_id;
    									    $('#senior').combobox('reload', url);
    									} -->
						<label for="principle">一级机构</label> <input id="principle"
							class="easyui-combobox" name="principleDept"
							data-options="
							valueField:'deptName',
							textField:'deptName',	
							method:'GET',
							required:'true',
							url:'${pageContext.request.contextPath}/dept/principles',
							onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/dept/childDept/'+rec.deptId;
    									    $('#senior').combobox('reload', url);
    									}
								" />
					</div>
				</td>
				<td><div>
						<label for="senior">二级机构</label> <input id="senior"
							class="easyui-combobox" name="seniorDept"
							data-options="valueField:'deptName',
										  textField:'deptName',
										  method:'GET',
										  required:'true',
										  onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/dept/childDept/'+rec.deptId;
    									    $('#junior').combobox('reload', url);
    									}
										  " />
					</div></td>
				<td><div>

						<label for="junior">三级机构</label> <input id="junior"
							class="easyui-combobox" name="juniorDept"
							data-options="valueField:'deptName',
										  textField:'deptName',
										  required:'true',	
										  method:'GET'
										  	" />
					</div></td>
			</tr>

			<tr>
				<td>
					<div>

						<label for="pos_category">职位分类</label> <input id="pos_category"
							class="easyui-combobox" name="posCategory"
							data-options="valueField:'posCategory',
										  textField:'posCategory',	
										  method:'GET',
										  required:'true',
										  url:'${pageContext.request.contextPath}/pos/categories',
										  onSelect: function(rec){
    										var url = '${pageContext.request.contextPath}/pos/'+rec.categoryId+'/position';
    									    $('#pos_name').combobox('reload', url);
    									}
    									" />
					</div>
				</td>
				<td>
					<div>

						<label for="pos_name">职位名称</label> <input id="pos_name"
							class="easyui-combobox" name="posName"
							data-options="valueField:'posName',
										  textField:'posName',	
										  required:'true',
										  method:'GET'
										 " />
					</div>
				</td>

			</tr>

			<tr>
				<td><div>
						<label for="name">姓名</label> <input class="easyui-validatebox"
							name="name" data-options="required:true" style="width: 70%">
					</div></td>
				<td>
					<div>
						<label for="gender">性别</label> <input id="gender"
							class="easyui-combobox" name="gender"
							data-options="
							required:true,
							valueField:'gender',
							textField:'gender',
							data: [{gender:'男',selected:'true'},{gender:'女'}]" />
					</div>

				</td>
				<td><div>
						<label for="telephone">电话</label> <input
							class="easyui-validatebox" type="text" name="telephone"
							data-options="required:true" style="width: 70%" />
					</div></td>
			</tr>
			<tr>
				<td><div>
						<label for="email">邮件</label> <input class="easyui-validatebox"
							type="text" name="email"
							data-options="require:true,validType:'email'" style="width: 70%" />
					</div></td>
				<td><div>
						<label for="qq">QQ</label> <input class="easyui-validatebox"
							type="text" name="qq" data-options="require:true"
							style="width: 70%" />
					</div></td>
			</tr>
			<tr>
				<td colspan="2"><div>
						<label for="address">住址</label> <input class="easyui-validatebox"
							type="text" name="address" data-options="require:true"
							style="width: 85%" />
					</div></td>
				<td>
					<div>
						<label for="citizenship">国籍</label> <input id="citizenship"
							class="easyui-combobox" name="citizenship"
							data-options="
							valueField:'nation',
							textField:'nation',
							required:'true',
							data: [{nation:'中国',selected:'true'},{nation:'美国'},{nation:'其他国家'}]" />
					</div>

				</td>
			</tr>
			<tr>
				<td><div>
						<label for="born">出生地(省市)</label> <input
							class="easyui-validatebox" type="text" name="born"
							data-options="require:true" />
					</div></td>
				<td><div>
						<label for="birth">生日</label> <input class="easyui-datebox"
							name="birth" data-options="required:true,showSeconds:false"
							value="2017/11/24" style="width: 150px">
					</div></td>
				<td><div>
						<label for="nationality">民族</label> <input class="easyui-combobox"
							type="text" name="nationality"
							data-options="valueField:'nationality',
							textField:'nationality',
							required:'true',
							data: [{nationality:'汉族',selected:'true'},{nationality:'少数民族'}]" />
					</div></td>
			</tr>
			<tr>
				<td><div>
						<label for="religion">宗教信仰</label> <input
							class="easyui-validatebox" type="text" name="religion"
							style="width: 70%" data-options="require:true" />
					</div></td>
				<td><div>
						<label for="politicsStatus">政治面貌</label> <input
							class="easyui-validatebox" name="politicsStatus"
							data-options="required:true" style="width: 150px">
					</div></td>
				<td><div>
						<label for="age">年龄</label> <input class="easyui-validatebox"
							type="text" name="age" />
					</div></td>
			</tr>
			<tr>
				<td colspan="2"><div>
						<label for="identification">身份证号</label> <input
							class="easyui-validatebox" type="text" name="identification"
							data-options="required:true" style="width: 350px" />
					</div></td>
				<td><div>
						<label for="socialInsurance">社保账号</label> <input
							class="easyui-validatebox" name="socialInsurance"
							style="width: 200px" />
					</div></td>
			</tr>
			<tr>
				<td><div>
						<label for="education">学历</label> <input class="easyui-combobox"
							type="text" name="education"
							data-options="
					valueField:'education',
							textField:'education',
							required:'true',
							data: [{education:'本科',selected:'true'},{education:'硕士'},{education:'博士'},{education:'本科以下'}]
					" />
					</div></td>
				<td><div>
						<label for="profession">专业</label> <input
							class="easyui-validatebox" name="profession" style="width: 80%">
					</div></td>

				<td>
					<div>

						<label for="standardId">薪酬标准</label> <input id="standardId"
							class="easyui-combobox" name="standardId"
							data-options="valueField:'standardId',
										  textField:'name',	
										  required:true,
										  url:'${pageContext.request.contextPath}/salary/standards'" />
					</div>
				</td>
			</tr>
			<tr>
				<td><div>
						<label for="bank">银行</label> <input class="easyui-validatebox"
							style="width: 70%" type="text" name="bank" />
					</div></td>
				<td><div>
						<label for="bankAccount">银行账号</label> <input
							class="easyui-validatebox" name="bankAccount">
					</div></td>
				<td><div>
						<label for="register">登记人</label> <input
							class="easyui-validatebox" name="register"
							data-options="required:true">
					</div></td>
			</tr>
			<tr>
				<td><div>
						<label for="registerTime">登记时间</label> <input
							class="easyui-datetimebox" name="registerTime"
							data-options="required:true,showSeconds:false" value="2017/11/24"
							style="width: 150px">
					</div></td>
				<td><div>
						<label for="characters">特长</label> <input
							class="easyui-validatebox" type="text" name="characters"
							style="width: 80%" />
					</div></td>
				<td colspan="2"><div>
						<label for="hobby">爱好</label> <input class="easyui-textbox"
							name="hobby">
					</div></td>
			</tr>
			<tr>
				<td colspan="2"><div>
						<label for="experience">个人履历</label> <input
							class="easyui-validatebox" data-options="multiline:true"
							style="height: 50px; width: 85%" name="experience">

					</div></td>
			</tr>
			<tr>
				<td colspan="2"><div>
						<label for="relationship">家庭关系</label> <input
							class="easyui-validatebox" data-options="multiline:true"
							style="height: 50px; width: 85%" name="family">

					</div></td>
			</tr>
			<tr>
				<td colspan="2"><div>
						<label for="notes">备注</label> <input class="easyui-validatebox"
							data-options="multiline:true" style="height: 50px; width: 85%;"notes">
					</div></td>
			</tr>
			<tr>
				<td style="text-align: center"><a id="submitBtn" href="#"
					class="easyui-linkbutton">提交</a></td>
				<td style="text-align: center"><a id="clearBtn" href="#"
					class="easyui-linkbutton">清空</a></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		$("#clearBtn").click(function() {
			$("#registerForm").form('clear');
		});
		$("#submitBtn").click(function() {
			$("#registerForm").form('submit', {
				dataType : 'json',
				success : function(data) {
					var json = eval('(' + data + ')'); //转化为js中的json数据
					//$alert(json.msg);
					if (json.msg == "success") {
						$.messager.alert('消息', '员工登记成功!');
						$("#registerForm").form('clear');
					} else {
						$.messager.alert('消息', '员工登记失败!', 'error');
					}
				}
			});
		});

		/* $("#registerForm").form({
			
		}); */
	</script>
</body>
</html>