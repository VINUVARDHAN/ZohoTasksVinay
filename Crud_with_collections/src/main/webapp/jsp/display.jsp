<%@page import="com.learn.web.Lead"%>
<%@page import="com.learn.web.Data"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
<link rel="stylesheet"
	href="http://localhost:8080/ZohoVinayWA/css/finish.css">
<style type="text/css">
td {
	border: 1px solid rgb(15, 15, 15);
	padding: 10px 24px;
	background-color: white;
	color :rgb(40, 35, 35);
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
	<%
	HashMap<String, Lead> values = Data.defaultContent();
	%>
	<br>
	<div class="btn-group">
		<a href="create.jsp"><button>CREATE</button></a> <a href="delete.jsp"><button>DELETE</button></a>
		<a href="update.jsp"><button>UPDATE</button></a> <a href="search.jsp"><button>SEARCH</button></a>
	</div>

	<br>
	<h2>Leads</h2>

	<br>
	<%
	String key = request.getParameter("nam");
	if (key != null && !values.containsKey(key)) {
	%>
	<h2 style="color: rgb(141, 222, 106);">Data Added to Table</h2>
	<%
	Lead val = new Lead(request.getParameter("company"), request.getParameter("email"), request.getParameter("address"), request.getParameter("source"));
	HashMap<String, Lead> newValue = Data.updatedContent(key, val);
	values = newValue;
	} else if (values.containsKey(key)) {
	%>
	<h2 style="color: rgb(189, 92, 92);">Data is already present</h2>
	<%
	}
	%>
	<div>
		<table>
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
</body>
</html>