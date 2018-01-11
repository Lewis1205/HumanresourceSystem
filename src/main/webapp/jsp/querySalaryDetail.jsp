<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪酬登记明细页</title>
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

	<table id="detailTb" border="1" style="text-align: center;">
		<tr>
			<td>档案编号</td>
			<td>名字</td>
			<td>薪酬id</td>
			<td colspan="16" style="text-align: center;">具体薪酬项</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
  var json;
	 window.onload = function() {
		var s=${staffDetails};//json对象
		console.log(s);
		json=s;
		for(x in s){
			var a='<tr><td>'+ s[x].num +'</td>'
			+'<td>'+s[x].name+'</td>'
			+'<td>'+s[x].standardId+'</td>';
			console.log(s[x].details);
			var t='';		 
			 for(var i=0;i<s[x].details.length;i++){
				 t='<td>'+s[x].details[i].item+'</td>'
					+'<td>'+s[x].details[i].salary+'</td>'+t
			 }
			 //t=t+'<td><input readonly="true" class="easyui-validatebox" value="'+s[x].bonus+'" type="text"></td>'
			 //+'<td><input readonly="true" class="easyui-validatebox" value="'+s[x].deduction+'" type="text"></td>'
			$("#detailTb").append(a+t+'</tr>');						
		}	
	} 
	 function postDetails(){
		 console.log(json+'=====');
		 var requestJson=[];
		 for(x in json){
			 var bounusId='bonus'+json[x].num;
			 var bonus=$("#"+bounusId+"").val(); 
			 var reductionId='reduction'+json[x].num;
			 var reduction=$("#"+reductionId+"").val();
			 
			 var num=json[x].num;
			 var name=json[x].name;
			 var standardId=json[x].standardId;
			 var staffId=json[x].staffId;
			 //alert(bonus);
			 //alert(reduction);
			 /* alert(num);
			 alert(name);
			 alert(standardId); */
			 
			 var p={};
			 p.num=num;
			 p.staffId=staffId;
			 p.standardId=standardId;
			 p.bonus=bonus;
			 p.reduction=reduction;
			 requestJson.push(p);
		 }		 
		 console.log(requestJson);
		 var param=JSON.stringify(requestJson);
		 var url='${pageContext.request.contextPath}/record/add';
		 $.ajax({
			 url:url,
			 type:'POST',
			 contentType:'application/json;charset=utf-8',
			data:param,
			success:function(result){
				//alert(result);
				if(result.msg=="success"){
					$.messager.alert("提示信息","提交成功","info");
				}else{
					$.messager.alert("提示信息","提交失败","error");
				}
			}	 
		 })
	 }
	
	
	
</script>
</html>