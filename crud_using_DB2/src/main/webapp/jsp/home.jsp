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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
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
<body>
	<h2
		style="text-align: center; font-family: cursor; background-color: #73a881">CRUD
		Using DataBase</h2>

	<div id="search_results">
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
	</div>


	<div id="common_place"></div>



	<div id="data_next_before">
		<%
		DB f = new DB();
		session.setAttribute("range", 4);
		session.setAttribute("start", 0);
		String sql = "SELECT * FROM LeadTable limit 0," + session.getAttribute("range");
		LinkedList<DbStructure> rs = f.getResultByQuery(sql);
		session.setAttribute("end", 5);
		int dataSize = rs.size();
		int start = (int) session.getAttribute("start") + 1;
		%>
		<table class="content_display">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><button style="width: 40px"><</button>
				 <input
					style="width: 50px" type="button"
					value="<%=start%> - <%=dataSize%>">
					<button style="width: 40px" type="button"
						onclick="loadData(<%=(int) session.getAttribute("start") + (int) session.getAttribute("range")%>,'next')">></button></td>
			</tr>
			<tr>
				<th></th>
				<th class="table_head">Name</th>
				<th class="table_head">Company</th>
				<th class="table_head">Source</th>
				<th class="table_head">Phone NO</th>
				<th class="table_head">Email</th>
			</tr>
			<tbody>
				<%
				for (int j = 0; j < dataSize; j++) {
				%>
				<tr class="content_hover">
					<td style="border-style: hidden !important;">
						<button class="edit_delete" type="button"
							onclick="openUpdatePage('<%=j%>')">
							<i class="fa">&#xf044;</i>
						</button>
					</td>
					<td id="<%=j%>a"><%=rs.get(j).getName()%></td>
					<td id="<%=j%>b"><%=rs.get(j).getCompany()%></td>
					<td id="<%=j%>c"><%=rs.get(j).getSource()%></td>
					<td id="<%=j%>d"><%=rs.get(j).getPhoneno()%></td>
					<td id="<%=j%>e"><%=rs.get(j).getEmail()%></td>
					<td style="border-style: hidden !important;">
						<button class="edit_delete" type="button"
							onclick="deleteLeadByName('<%=rs.get(j).getName()%>')">
							<i class="fa">&#xf014;</i>
						</button>
					</td>

				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>

</body>
</html>
