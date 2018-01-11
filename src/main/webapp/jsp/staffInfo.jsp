<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>复核明细</title>
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

<style type="text/css">
.title {
	background: #aed581;
}
</style>

</head>
<body>

	<form id="checkForm" method="post"
		action="${pageContext.request.contextPath}/staff/${staff.staffId}/update"
		style="font-size: 16px; text-align: center">
		<input type="text" value="${staff.staffId }" name="staffId"
			style="display: none;" />
		<table border="1" width=100% style="font-size: 16px;">

			<tr>
				<td class="title"><label for="num">档案编号</label></td>
				<td style="text-align: left" colspan="5"><input name="num"
					type="text" value="${staff.num}" data-options="required:true"
					readonly="true" /></td>
			</tr>
			<tr>
				<td class="title"><label for="principleDept">一级机构</label></td>
				<td style="text-align: left"><input name="principleDept"
					type="text" value="${staff.principleDept}"
					data-options="required:true" readonly="true" /></td>
				<td class="title"><label for="seniorDept">二级机构</label></td>
				<td style="text-align: left"><input name="seniorDept"
					type="text" value="${staff.seniorDept}"
					data-options="required:true" readonly="true" /></td>
				<td class="title"><label for="junior">三级机构</label></td>
				<td style="text-align: left"><input name="juniorDept"
					type="text" value="${staff.juniorDept}"
					data-options="required:true" readonly="true" /></td>
			</tr>
			<tr>
				<td class="title"><label for="posCategory">职位分类</label></td>
				<td style="text-align: left"><input name="posCategory"
					type="text" value="${staff.posCategory}"
					data-options="required:true" readonly="true" /></td>
				<td class="title"><label for="posName">职位名称</label></td>
				<td style="text-align: left"><input name="posName" type="text"
					value="${staff.posName}" data-options="required:true"
					readonly="true" /></td>
			</tr>

			<tr>

				<td class="title"><label for="principle">姓名</label></td>
				<td style="text-align: left"><input name="name" type="text"
					value="${staff.name}" data-options="required:true" /></td>


				<td class="title"><label for="principle">性别</label></td>
				<td style="text-align: left"><input id="gender"
					class="easyui-combobox" name="gender" value="${staff.gender}"
					data-options="
							required:true,
							valueField:'gender',
							textField:'gender',
							data: [{gender:'男'},{gender:'女'}]" /></td>

				<td class="title"><label for="telephone">电话</label></td>
				<td style="text-align: left"><input type="text"
					name="telephone" value="${staff.telephone}"
					data-options="required:true;" /></td>
				</td>
			</tr>
			<tr>
				<td class="title"><label for="email">邮件</label></td>>
				<td colspan="2" style="text-align: left"><input type="text"
					name="email" value="${staff.email}" /></td>
				</td>
				<td class="title"><label for="qq">QQ</label></td>>
				<td colspan="2" style="text-align: left"><input type="text"
					name="qq" value="${staff.qq}" /></td>
				</td>
			</tr>
			<tr>
				<td class="title"><label for="address">住址</label></td>>
				<td colspan="2" style="text-align: left;"><input type="text"
					name="address" style="width: 100%" value="${staff.address}" /></td>
				</td>
				<td class="title"><label for="citizenship">国籍</label></td>
				<td style="text-align: left;"><input id="citizenship"
					class="easyui-combobox" name="citizenship"
					value="${staff.citizenship }"
					data-options="
							valueField:'nation',
							textField:'nation',
							required:'true',
							data: [{nation:'中国'},{nation:'美国'},{nation:'其他国家'}]" />
				</td>
			</tr>
			<tr>
				<td class="title"><label for="born">出生地(省市)</label></td>
				<td style="text-align: left"><input class="easyui-validatebox"
					value="${staff.born}" type="text" name="born"
					data-options="require:true" /></td>
				<td class="title"><label for="birth">生日</label></td>
				<td style="text-align: left"><input class="easyui-datebox"
					value="${staff.birth}" name="birth"
					data-options="required:true,showSeconds:false" style="width: 150px"></td>
				<td class="title"><label for="nationality">民族</label></td>
				<td style="text-align: left"><input class="easyui-combobox"
					type="text" name="nationality" value="${ staff.nationality}"
					data-options="valueField:'nationality',
							textField:'nationality',
							required:'true',
							data: [{nationality:'汉族'},{nationality:'少数民族'}]" />
				</td>
			</tr>
			<tr>
				<td class="title"><label for="religion">宗教信仰</label></td>
				<td style="text-align: left"><input class="easyui-validatebox"
					type="text" name="religion" style="width: 100%"
					value="${staff.religion}" data-options="require:true" /></td>
				<td class="title"><label for="politicsStatus">政治面貌</label></td>
				<td><input class="easyui-validatebox" name="politicsStatus"
					value="${staff.politicsStatus}" data-options="required:true"
					style="width: 100%"></td>
				<td class="title"><label for="age">年龄</label></td>
				<td><input style="width: 100%" class="easyui-validatebox"
					value="${staff.age}" type="text" name="age" /></td>
			</tr>
			<tr>
				<td class="title"><label for="identification">身份证号</label></td>
				<td colspan="2"><input class="easyui-validatebox" type="text"
					name="identification" data-options="required:true"
					value="${staff.identification}" style="width: 100%" /></td>
				<td class="title"><label for="socialInsurance">社保账号</label></td>
				<td colspan="2" f><input class="easyui-validatebox"
					value="${staff.socialInsurance}" name="socialInsurance"
					style="width: 100%"></td>
			</tr>
			<tr>
				<td class="title"><label for="education">学历</label></td>
				<td style="text-align: left"><input style="width: 100%"
					class="easyui-combobox" type="text" name="education"
					value="${staff.education}"
					data-options="
					valueField:'education',
							textField:'education',
							required:'true',
							data: [{education:'本科'},{education:'硕士'},{education:'博士'},{education:'本科以下'}]
					" />
				</td>
				<td class="title"><label for="profession">专业</label></td>
				<td><input class="easyui-validatebox" name="profession"
					value="${staff.profession}" style="width: 100%"></td>

				<td class="title"><label for="standardId">薪酬标准</label></td>
				<td style="text-align: left"><input id="standardId"
					class="easyui-combobox" name="standardId"
					value="${staff.standardId}"
					data-options="valueField:'standardId',
										  textField:'name',
										  required:'true',
										  url:'${pageContext.request.contextPath}/salary/standards'" />

				</td>
			</tr>
			<tr>
				<td class="title"><label for="bank">银行</label></td>
				<td><input style="width: 100%" class="easyui-validatebox"
					value="${staff.bank}" style="width: 100%" type="text" name="bank" /></td>

				<td class="title"><label for="bankAccount">银行账号</label></td>
				<td><input style="width: 100%" class="easyui-validatebox"
					value="${staff.bankAccount}" name="bankAccount"></td>

				<td class="title"><label for="register">登记人</label></td>
				<td><input style="width: 100%" class="easyui-validatebox"
					value="${staff.register}" name="register"
					data-options="required:true"></td>
			</tr>
			<tr>
				<td class="title"><label for="registerTime">登记时间</label></td>
				<td style="text-align: left"><input class="easyui-datebox"
					value="${staff.birth}" name="registerTime"
					data-options="required:true,showSeconds:false" style="width: 150px"></td>

				<td class="title"><label for="characters">特长</label></td>
				<td><input class="easyui-validatebox" type="text"
					value="${staff.characters}" name="characters" style="width: 100%" /></td>

				<td class="title"><label for="hobby">爱好</label></td>
				<td><input class="easyui-textbox" name="hobby"
					value="${staff.hobby}" style="width: 100%"></td>
			</tr>
			<tr>
				<td class="title"><label for="experience">个人履历</label></td>
				<td colspan="5"><input class="easyui-validatebox"
					value="${staff.experience}" data-options="multiline:true"
					style="height: 50px; width: 100%" name="experience"></td>
			</tr>
			<tr>
				<td class="title"><label for="relationship">家庭关系</label></td>
				<td colspan="5"><input class="easyui-validatebox"
					data-options="multiline:true" style="height: 50px; width: 100%"
					value="${staff.relationship}" name="relationship"></td>
			</tr>
			<tr>
				<td class="title"><label for="notes">备注</label></td>
				<td colspan="5"><input class="easyui-validatebox" name="notes"
					value="${staff.notes}" data-options="multiline:true"
					style="height: 50px; width: 100%;"></td>
			</tr>
			<tr>
			<shiro:hasPermission name="StManager">
				<td colspan="3" style="text-align: center"><a id="submitBtn"
					href="#" class="easyui-linkbutton">复核</a></td>
			</shiro:hasPermission>
				<td colspan="3" style="text-align: center"><a id="clearBtn"
					href="#" class="easyui-linkbutton">清空</a></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		/* $("#clearBtn").click(function() {
			$("#registerForm").form('clear');
		}); */
		$("#submitBtn").click(function() {
			alert("submitBtn");
			$("#checkForm").form('submit', {
				dataType : 'json',
				success : function(data) {
					var json = eval('(' + data + ')'); //转化为js中的json数据
					//$alert(json.msg);
					if (json.msg == "success") {
						$.messager.alert('消息', '员工复核成功!');
						//$("#checkForm").form('clear');
					} else {
						$.messager.alert('消息', '员工复核失败!', 'error');
					}

				}
			});
		});
	</script>
</body>
</html>