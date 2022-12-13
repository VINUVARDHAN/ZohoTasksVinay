<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create</title>
<link rel="stylesheet"
	href="http://localhost:8080/ZohoVinayWA/css/finish.css">
</head>
<body>
	<br>
	<div class="btn-group">
		<a href="search.jsp"><button>SEARCH</button></a> <a href="delete.jsp"><button>DELETE</button></a>
		<a href="update.jsp"><button>UPDATE</button></a> <a href="display.jsp"><button>HOME</button></a>
	</div>

	<br>
	<form action="display.jsp" method="post">
		<h3>Enter details to create Lead</h3>
		<table>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="nam" required></td>
			</tr>
			<tr>
				<td><label>Company</label></td>
				<td><input type="text" name="company" required></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="email" required></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><input type="text" name="address" required></td>
			</tr>
			<tr>
				<td><label>Source</label></td>
				<td><input type="text" name="source" required></td>
			</tr>
			<tr>
				<td></td>
				<td><button class="btn-group" type="submit">Submit</button></td>
			</tr>
		</table>
	</form>
</body>
</html>