<%@page import="com.app.DbStructure"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.app.DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">

<link rel="stylesheet" href="/crud_using_DB2/css/home.css">
<script src="/crud_using_DB2/js/home.js">
	
</script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

</head>
<body>
	<div id="search_div_id">
		<%
		DB f = new DB();
		LinkedList<DbStructure> list = f.search(request.getParameter("pattern"));
		if (!request.getParameter("pattern").equals("") && list.size() > 0) {
		%>

		<table class="content_display">
			<tbody>
				<%
				int size1 = list.size();
				for (int j = 0; j < size1; j++) {
				%>

				<tr>
					<td class="search_content"><%=list.get(j).getName()%></td>
					<td class="search_content"><%=list.get(j).getCompany()%></td>
					<td class="search_content"><%=list.get(j).getSource()%></td>
					<td class="search_content"><%=list.get(j).getPhoneno()%></td>
					<td class="search_content"><%=list.get(j).getEmail()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
			<tr>
				<td><button type="button"
						onclick="document.getElementById('search_results').style.height = '0px';">CLOSE</button></td>
			</tr>
			<%
			} else if (request.getParameter("pattern").equals("")) {
			} else {
			%>
			<tr>
				<td>got no results</td>
				<td><button type="button"
						onclick="document.getElementById('search_results').style.height = '0px';">CLOSE</button></td>

			</tr>
			<%
			}
			session.setAttribute("rs", null);
			%>
		</table>
	</div>
</body>
</html>