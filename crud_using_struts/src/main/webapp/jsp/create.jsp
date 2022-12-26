<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="/crud_using_struts/js/home.js">
	
</script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<button class="close_button"
		onclick="document.getElementById('common_place').style.width = '0';">X</button>

	<div style="margin-top: 25%; margin-left: 15%">
		<form action="JavaScript:createLead()">
			<h2 style="color: #dfd1f3; font-family: cursor">CREATE LEAD</h2>
			<table class="form_table">
				<tr>
					<td>Name</td>
					<td><input id="leadName" type="text" maxlength="50" required></td>
				</tr>
				<tr>
					<td>Company</td>
					<td><input id="company" type="text" maxlength="50" required></td>
				</tr>
				<tr>
					<td>Source</td>
					<td><input id="source" type="text" maxlength="50" value=""></td>
				</tr>
				<tr>
					<td>Phone No</td>
					<td><input style="webkit-appearance: none;" id="phoneNo"
						type="number" value="0"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input id="email" type="email" maxlength="50" value=""></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">CREATE</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
