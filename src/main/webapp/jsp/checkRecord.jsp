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
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/easyui/themes/demo.css">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	var resultJson;
		window.onload = function() {
			var url = '${pageContext.request.contextPath}/record/unchecked/records';
			$.ajax({
				url : url,
				type : 'POST',
				dataType : 'json',
				success : function(result) {
					resultJson=result;
					console.log(result);
					if(result.length==0){
						$.messager.alert("提示信息","没有要复核的名单！！","info");
					}
					for(x in result){
						var a='<tr><td>'+ result[x].staffNum +'</td>'
						+'<td>'+result[x].staffName+'</td>'
						+'<td><input id="bonus'+ result[x].recordId +'" value="'+ result[x].bonus+'">'+'</td>'
						+'<td><input id="deduction'+ result[x].recordId +'" value="'+ result[x].deduction+'">'+'</td>';
						//console.log(result[x].details);
						var t='';
						for(var i=0;i<result[x].details.length;i++){
							t='<td>'+result[x].details[i].item+'</td>'
							+'<td>'+result[x].details[i].salary+'</td>'+t
						}
						
						
						$("#checkTb").append(a+t+'</tr>');
					}
				}
			})
		}
		
		var requestJson=[];
		function checkRecord(){
			for(x in resultJson){
				 var bounusId='bonus'+resultJson[x].recordId;
				 var bonus=$("#"+bounusId+"").val(); 
				 var deductionId='deduction'+resultJson[x].recordId;
				 var deduction=$("#"+deductionId+"").val();
				 var recordId=resultJson[x].recordId;
				 
				 var p={};
				 p.recordId=recordId;
				 p.bonus=bonus;
				 p.deduction=deduction;
				 requestJson.push(p);
			}
			console.log(requestJson);
			var param=JSON.stringify(requestJson);
			var url='${pageContext.request.contextPath}/record/checkRecord';
			
			$.ajax({
				type:'POST',
				url:url,
				data:param,
				contentType:'application/json;charset=UTF-8',
				success:function(result){
					console.log(result);
					if(result.msg=="success"){
						$.messager.alert("提示信息","复核通过！","info");
						requestJson=[];
					}else{
						$.messager.alert("提示信息","失败！","warning");
						requestJson=[];
					}
				}
			})
			
		}
		
	</script>



	<table id="checkTb" cellpadding="1" border="1" style="font-size:16px;text-align: center;">
		<tr>
			<td>档案编号</td>
			<td>名字</td>
			<td>奖励金额</td>
			<td>应扣金额</td>
			<td colspan="14">薪酬具体项</td>
		</tr>

	</table>
	<a href="javascipt:void(0)" onclick="checkRecord()" class="easyui-linkbutton">复核通过</a>
</body>
</html>