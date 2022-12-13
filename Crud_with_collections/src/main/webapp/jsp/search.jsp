<%@page import="java.util.Map"%>
<%@page import="com.learn.web.Data"%>
<%@page import="com.learn.web.Lead"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
<link rel="stylesheet"
	href="http://localhost:8080/ZohoVinayWA/css/finish.css">
<style type="text/css">
td {
	border: 1px solid #777;
	font-size: 20px;
	padding: 10px 24px;
}

th {
	background-color: white;
	border: 1px solid black;
	color: black;
	font-size: 20px;
}
</style>
</head>
<body>
	<br>
	<div class="btn-group">
		<a href="create.jsp"><button>CREATE</button></a> <a href="delete.jsp"><button>DELETE</button></a>
		<a href="update.jsp"><button>UPDATE</button></a><a href="display.jsp"><button>HOME</button></a>
	</div>

	<br>
	<br>
	<%
	HashMap<String, Lead> values = Data.defaultContent();
	%>
	<%
	String key = request.getParameter("searchName");
	if (values.containsKey(key)) {
		Lead lead = values.get(key);
	%>
	<h2 class="greenMessage">Lead found :</h2>
	<table>
		<tr>
			<th><%="Lead Name"%></th>
			<th><%="Company"%></th>
			<th><%="Email"%></th>
			<th><%="Address"%></th>
			<th><%="Source"%></th>
		</tr>
		<tr>
			<td><%=key%></td>
			<td><%=lead.company%></td>
			<td><%=lead.email%></td>
			<td><%=lead.address%></td>
			<td><%=lead.source%></td>

		</tr>
	</table>
	<br>

	<%
	} else if (key != null) {
	%>
	<h2 class="redMessage">Lead entered is Not present</h2>
	<%
	}
	%>

	<form action=search.jsp method="post">
		<h3>
			<label>Enter Lead name : </label> <input type="text" name=searchName
				required> <br>
			<button type="submit">Search</button>
		</h3>

	</form>
</body>
</html>