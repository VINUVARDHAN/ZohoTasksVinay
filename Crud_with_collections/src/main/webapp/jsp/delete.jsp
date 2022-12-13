<%@page import="com.learn.web.Data"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.learn.web.Lead"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
<link rel="stylesheet"
	href="http://localhost:8080/ZohoVinayWA/css/finish.css">
<style type="text/css">
td {
	border: 1px solid black;
	padding: 10px 24px;
}

th {
	background-color: black;
	border: 1px solid Black;
	color: white;
	padding: 10px 24px;
}
</style>
</head>
<body>
	<br>
	<div class="btn-group">
		<a href="create.jsp"><button>CREATE</button></a> <a href="search.jsp"><button>SEARCH</button></a>
		<a href="update.jsp"><button>UPDATE</button></a><a href="display.jsp"><button>HOME</button></a>
	</div>

	<br>
	<div >
		<%
		HashMap<String, Lead> values = Data.defaultContent();
		String deleteKey = request.getParameter("nameDelete");
		if (values.containsKey(deleteKey)) {
			values.remove(deleteKey);
		%>
		<h2 class="greenMessage">Lead entered is deleted</h2>
		<%
		} else if (deleteKey != null) {
		%>
		<h2 class="redMessage">Lead entered is Not present</h2>
		<%
		}
		%>
		<br>
		<h2>Leads</h2>
		<div>
			<table >
				<tr>
					<th><%="Lead Name"%></th>
					<th><%="Company"%></th>
					<th><%="Email"%></th>
					<th><%="Address"%></th>
					<th><%="Source"%></th>
				</tr>
				<%
				for (Map.Entry<String, Lead> v : values.entrySet()) {
				%>
				<tr>
					<td><%=v.getKey()%></td>
					<td><%=v.getValue().company%></td>
					<td><%=v.getValue().email%></td>
					<td><%=v.getValue().address%></td>
					<td><%=v.getValue().source%></td>
				</tr>
				<%
				}
				%>
			</table>
		</div>

		<br>

	</div>

	<form method="post" action=delete.jsp>
		<h2>
			<label>Enter name of Lead to delete: </label> <input type="text"
				name=nameDelete required="required"> <br>
			<button class="btn-group" type="submit">Delete</button>
		</h2>
	</form>
</body>
</html>