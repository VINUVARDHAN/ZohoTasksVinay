<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div class="sign_login">
		<form action="/crud_using_DB2/addUserRecord">
			<table>
				<tr>
					<td colspan="2" style="color: Black"><h3>SignUp</h3></td>
				</tr>
				<tr>
					<td><label >User name</label></td>
					<td><input type="text" id="uname" name="uname" maxlength="30" required></td>
				</tr>
				<tr>
					<td><label >Password</label></td>
					<td><input type="password" value="" id="psw" name="psw" maxlength="10" required></td>
				</tr>
				<tr>
					<td><label >Email</label></td>
					<td><input type="email" value="" id="email" name="email" max="40" required></td>
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
</body>
</html>