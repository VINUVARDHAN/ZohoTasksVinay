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
<link rel="icon" href="/crud_using_struts/css/icons8-contacts-94.png"
	type="image/gif" sizes="20x20">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="/crud_using_struts/js/home.js">
	
</script>
<style type="text/css">
body {
	margin-top: 4%;
	margin-left: 5%;
	margin-right: 5%;
}
</style>
</head>
<body>
	<h2
		style="text-align: center; font-family: cursor;animation: 4s infinite main_tag_bg_color; color: black; box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.4), 0 12px 40px 0 rgba(0, 0, 0, 0.38);">
		CRUD Using Struts</h2>
	<%
	try {
		if (session.getAttribute("sessionLogged") != null) {
	%>
	<button onclick="window.location = '/crud_using_struts/logOut'"
		style="color: black; float: right; border: none; background-color: transparent;"
		title="Logout">
		<%=session.getAttribute("sessionLoggedTime")%>
		<i style="font-size:30px" class="fa">&#xf08b;</i>
	</button>
	
	<div style="right: 20%; font-size: 30px">
		<i class="fa">&#xf2be;</i>
		<%=session.getAttribute("sessionLogged")%>
	</div>
	
	<!-- This div tag contains 2 buttons and one field (create and search button and search field) -->
	<div>
		<form action="JavaScript:searchRequest()">
			<table style="width: 100%; text-align: center; font-size: 19px">
				<tr>
					<td><button
							style="border-radius: 20%; width: 40px; height: 40px"
							type="button" onclick="getCreateDiv()" title="create new Lead">
							<i class="fa">&#xf234;</i>
						</button> <input type="text" id="searchValue" placeholder="----- -----"
						required>
						<button style="border-radius: 20%; width: 40px; height: 40px"
							type="submit">
							<i class="fa">&#xf002;</i>
						</button></td>
				</tr>
			</table>
		</form>
		<!-- This div tag is used to store the result for search -->
		<div id="search_results"
			style="width: 80%; margin: auto; text-align: center"></div>
	</div>

<!-- This is a common place to load the create and update page of leads -->
	<div id="common_place"></div>

<!-- Display the Lead data -->
	<div id="data_next_before"></div>
	<script type="text/javascript">
		loadData(0, 'next', 5);
	</script>
	
<!-- They are used to make toast effects on update of lead data set -->
	<h3 id="errorM"></h3>
	<h3 id="successM"></h3>
	<%
	} else {
	%>
	<h2
		style="animation: 4s infinite userNotFound; text-align: center; margin-top: 50px">Login
		To access</h2>
	<%
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	%>
</body>
</html>
