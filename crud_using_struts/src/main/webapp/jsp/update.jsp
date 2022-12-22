<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
body {
	margin-top: 3%;
	margin-left: 5%;
	margin-right: 5%;
}
</style>
<script src="/crud_using_struts/js/home.js">
	
</script>
</head>
<body>
	<button class="close_button"
		onclick="document.getElementById('common_place').style.width = '0';">X</button>
	<div style="margin-top: 25%; margin-left: 15%">
		<form
			action="JavaScript:updateLead('<%=request.getParameter("leadName")%>')">
			<h2 style="color: #dfd1f3; font-family: cursor">EDIT LEAD</h2>
			<table class="form_table">
				<tr>
					<td>Name</td>
					<td><input id="newLeadName" type="text" maxlength="50"
						value="<%=request.getParameter("leadName")%>" required="required"></td>
				</tr>
				<tr>
					<td>Company</td>
					<td><input id="company" type="text"
						value="<%=request.getParameter("company")%>" maxlength="50"
						required="required"></td>
				</tr>
				<tr>
					<td>Source</td>
					<td><input id="source" type="text"
						value="<%=request.getParameter("source")%>" maxlength="50"></td>
				</tr>
				<tr>
					<td>Phone No</td>
					<td><input style="webkit-appearance: none;" id="phoneNo"
						autocomplete="false" type="number"
						value="<%=request.getParameter("phoneNo")%>"
						onKeyDown="if(this.value.length==10 && event.keyCode!=8) return false;"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input id="email" type="email" maxlength="50"
						value="<%=request.getParameter("email")%>"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">UPDATE</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>