<%@page import="com.app.DbStructure"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.app.DB"%>
<%@page import="java.sql.*"%>
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
<!-- <% %> <%  %> -->
<body>
	<h2
		style="text-align: center; font-family: cursor; animation: 4s infinite main_tag_bg_color;">CRUD
		Using DataBase</h2>
	<%
	String username = (String) request.getParameter("username");
	String password = (String) request.getParameter("psw");
	if (username == null && password == null) {
		username = (String) session.getAttribute("username");
		password = (String) session.getAttribute("psw");
	} else {
		session.setAttribute("username", username);
		session.setAttribute("psw", password);
	}
	String sql = "select * from SignUpRecords where username = '" + username + "' AND " + " password= '" + password + "'";
	DB db = new DB();
	boolean checkUserInDB = db.checkForUserInDB(sql);
	if (checkUserInDB) {
	%>
	<div>
		<div class="Menu">
			<table>
				<tr>
					<td><button type="button" onclick="searchRequest();">SEARCH</button></td>
					<td><input type="text" id="search_value" name="search_value"
						placeholder="-----" required></td>
					<td><button style="margin-right: 0" type="button"
							onclick="openCreate()">CREATE</button></td>
				</tr>
			</table>
		</div>
		<div id="search_results"></div>
	</div>

	<div id="common_place"></div>
	<%
	int range = 0;
	try {
		range = (int) session.getAttribute("range");
	} catch (Exception e) {
		session.setAttribute("range", 5);
		range = (int) session.getAttribute("range");
	}
	%>
	<div id="data_next_before">
		<script type="text/javascript">
			loadData(0, 'next',
		<%=range%>
			);
		</script>
	</div>
	<%
	} else {
	%>
	<div
		style="color: red; text-align: center; width: 100%; margin-top: 50px; animation: 2s infinite bgcolorchange;">
		<h5>User Not Found</h5>
		<a style="text-decoration: none"
			href="/crud_using_DB2/jsp/loginPage.jsp"><button>try
				again</button></a>
	</div>
	<%
	try {
		session.removeAttribute("username");
		session.removeAttribute("psw");
	} catch (Exception e) {
		System.out.print("no attributes");
	}
	} %>
</body>
</html>
