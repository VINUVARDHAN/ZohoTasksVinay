<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="/crud_using_DB2/css/home.css">

<script src="/crud_using_DB2/js/home.js">
	
</script>
</head>
<body>
	<button class="close_button"
		onclick="document.getElementById('common_place').style.width = '0';">X</button>

	<div class="common_div">
		<form class="forms" action="/crud_using_DB2/create" method="post">
			<h2 style="color: #dfd1f3; font-family: cursor">CREATE LEAD</h2>
			<table class="form_table">
				<tr>
					<td>Name</td>
					<td><input name="lead_name" type="text" required></td>
				</tr>
				<tr>
					<td>Company</td>
					<td><input name="company" type="text" required></td>
				</tr>
				<tr>
					<td>Source</td>
					<td><input name="source" type="text" value=""></td>
				</tr>
				<tr>
					<td>Phone No</td>
					<td><input style="webkit-appearance: none;" name="phone_no"
						type="number" value="0"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input name="email" type="email" value=""></td>
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