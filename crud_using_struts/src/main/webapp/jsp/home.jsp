<%@page import="com.app.DBManagement"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leads</title>
<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<link rel="stylesheet" href="/crud_using_struts/css/message.css">
<link rel="icon" href="/crud_using_struts/css/icons8-briefcase-32.png"
	type="image/gif" sizes="16x16">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="/crud_using_struts/js/home.js">
	
</script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
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
		style="text-align: center; font-family: cursor; animation: 4s infinite main_tag_bg_color; color: black">CRUD
		Using Struts</h2>
	<button onclick="window.location = '/crud_using_struts/loginDetails'"
		style="float: right; background-color: white; border: none; border-radius: 100%"
		title="Logout">
		<i style="font-size: 24px" class="fa">&#xf011;</i>
	</button>
	<h3 style="right: 20%">
		<s:property value="userName" />
	</h3>


	<%
	try {
	%>
	<div>
		<div class="Menu">
			<form action="JavaScript:searchRequest()">
				<table>
					<tr>
						<td><button type="submit">SEARCH</button></td>
						<td><input type="text" id="searchValue"
							placeholder="----- -----" required></td>
						<td><button style="margin-right: 0" type="button"
								onclick="getCreateDiv()">CREATE</button></td>
					</tr>
				</table>
			</form>
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
	<div id="data_next_before"></div>
	<script type="text/javascript">
		loadData(0, 'next',
	<%=range%>
		);
	</script>

	<%
	} catch (Exception e) {
	System.out.println(e);
	%>
	<%
	}
	%>
	<div id="duplicateError">
		Lead with this name is already present <i style="font-size: 24px"
			class="fa">&#xf165;</i>
	</div>
	<div id="insertedMessage">
		New Lead Inserted <i style="font-size: 24px" class="fa">&#xf087;</i>
	</div>
	<div id="updatedMessage">
		Updated the Lead <i style="font-size: 24px" class="fa">&#xf087;</i>
	</div>
</body>
</html>
