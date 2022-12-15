<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leads</title>
<link rel="stylesheet" href="/crud_using_DB2/css/home.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="/crud_using_DB2/js/home.js">
	
</script>
<style type="text/css">
body {
	margin-top: 3%;
	margin-left: 5%;
	margin-right: 5%;
}
</style>
</head>
<body>
	<h2
		style="text-align: center; font-family: cursor; animation: 4s infinite main_tag_bg_color;">CRUD
		Using DataBase</h2>
	<div id="login">
		<table style="margin: auto;font-family: cursor; margin-top: 50px">
			<tr>
				<td colspan="2" style="color: #d2f7fc;text-align: center"><h3>Log In</h3></td>
			</tr>
			<tr>
				<td><label>User name</label></td>
				<td><input type="text" value="" id="uname" required></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" value="" id="psw" required></td>
			</tr>
			<tr>
				<td></td>
				<td><button onclick="login()" type="button">Login</button></td>
			</tr>
			<tr>
				<td colspan="2">If you are not a user? SignUp here
					<button type="button"
						onclick="document.getElementById('login').style.height = '0px';
					document.getElementById('signup').style.height = '300px';">SignUp</button>
				</td>
			</tr>
		</table>
	</div>
	<div id="signup">
		<button
			style="border-radius: 20%; box-shadow: none; margin-right: 10px;width:30px;height:30px; margin-top: 10px; float: right; color: black"
			onclick="document.getElementById('login').style.height = '300px';
	document.getElementById('signup').style.height = '0px';">X</button>
		<form action="/crud_using_DB2/AddUserRecord">
			<table style="margin: auto;font-family: cursor; margin-top: 30px;text-align: center">
				<tr>
					<td colspan="2" style="color: #d2f7fc"><h3>Sign Up</h3></td>
				</tr>
				<tr>
					<td><label>User name</label></td>
					<td><input type="text" id="uname" name="uname" maxlength="30"
						required></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" value="" id="psw" name="psw"
						maxlength="10" required></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" value="" id="email" name="email"
						max="40" required></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button type="submit">SignUp</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<%
	try {
		session.removeAttribute("username");
		session.removeAttribute("psw");
	} catch (Exception e) {
		System.out.print("no attributes");
	}
	%>
</body>
</html>