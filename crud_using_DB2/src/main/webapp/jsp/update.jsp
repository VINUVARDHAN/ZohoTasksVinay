<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/crud_using_DB2/css/home.css">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
	
<style type="text/css">
body {
	margin-top: 3%;
	margin-left: 5%;
	margin-right: 5%;
}
</style>
<script src="/crud_using_DB2/js/home.js">
	
</script>
</head>
<body>
	<div class="common_div">
		<button class="close_button"
			onclick="$('#common_place').fadeOut(1000);">X</button>
		<form class="forms" method="post">
			<h2 style="color: #dfd1f3;font-family: cursor">UPADTE LEAD</h2>
			<table class="form_table">
				<tr>
					<td>Name</td>
					<td><input id="lead_name_update" name="lead_name_update"
						type="text" value="<%=request.getParameter("lead_new_nameU")%>"></td>
				</tr>
				<tr>
					<td>Company</td>
					<td><input id="company_update" name="company_update"
						type="text" value="<%=request.getParameter("companyU")%>"></td>
				</tr>
				<tr>
					<td>source</td>
					<td><input id="source_update" name="source_update" type="text"
						value="<%=request.getParameter("sourceU")%>"></td>
				</tr>
				<tr>
					<td>phone_no</td>
					<td><input style="webkit-appearance: none;"
						id="phone_no_update" name="phone_no_update" autocomplete="false"
						type="tel" value="<%=request.getParameter("phoneU")%>"
						maxlength="10"></td>
				</tr>
				<tr>
					<td>email</td>
					<td><input id="email_update" name="email_update" type="email"
						value="<%=request.getParameter("emailU")%>"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="button"
							onclick="updateLeadByName('<%=request.getParameter("oldnameU")%>')">UPDATE</button></td>
				</tr>


			</table>
		</form>
	</div>
</body>
</html>