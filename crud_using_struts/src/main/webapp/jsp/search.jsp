<%@page import="com.app.DBManagement"%>
<%@page import="com.app.DbStructure"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.app.DBManagement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<script src="/crud_using_struts/js/home.js">
	
</script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

</head>
<body>
	<button class="close_button"
		onclick="document.getElementById('search_results').style.height = '0px';">X</button>

	<%
	try {
		if (session.getAttribute("sessionLogged") != null) {
	%>
	<div id="search_div_id">
		<table class="content_display">
			<%
			DBManagement db = new DBManagement();
			LinkedList<DbStructure> data = db.search(request.getParameter("pattern"));
			int size = data.size();
			if (size > 0) {
			%>
			<tbody>
				<%
				for (int j = 0; j < size; j++) {
				%>

				<tr>
					<td class="search_content"><%=data.get(j).getName()%></td>
					<td class="search_content"><%=data.get(j).getCompany()%></td>
					<td class="search_content"><%=data.get(j).getSource()%></td>
					<td class="search_content"><%=data.get(j).getPhoneno()%></td>
					<td class="search_content"><%=data.get(j).getEmail()%></td>
				</tr>
			</tbody>
			<%
			}
			%>
			<%
			} else {
			%>
			<tr>
				<td>got no results</td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		} else {
		%>
		<h4 style="animation: 4s infinite userNotFound; text-align: center; margin-top: 50px">Login
			To access</h4>
		<%
		}
		} catch (Exception e) {
		System.out.println(e);
		}
		%>
	</div>
</body>
</html>