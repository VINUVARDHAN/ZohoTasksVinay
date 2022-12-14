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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/crud_using_DB2/css/home.css">
<script src="/crud_using_DB2/js/home.js">
	
</script>
</head>
<body>
	<%
	int start = Integer.parseInt(request.getParameter("start"));
	int range = Integer.parseInt(request.getParameter("range"));
	session.setAttribute("range", range);
	int end = start + range;
	DB db = new DB();
	String sql = null;
	if (request.getParameter("action").equals("next")) {
		sql = "SELECT * FROM LeadTable limit " + start + "," + range;
	} else {
		sql = "SELECT * FROM LeadTable limit " + start + "," + range;
	}
	LinkedList<DbStructure> data = db.getResultByQuery(sql);
	int size = data.size();
	%>
	<table class="content_display">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><form action="myservlet.do" method="POST">
					<select name="myselect" id="range_selection" onchange="setPageRange();">
					<option value="<%=range%>" selected><%=range%></option>
						<option value="3">3</option>
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="20">20</option>
					</select> rows per page
				</form></td>
			<td>
				<%
				if (start >= range) {
				%><button type="button"
					onclick="loadData(<%=start - range%>,'next',<%=range%>)">prev</button> <%
 } else {
 %><button title="no leads">prev</button> <%
 }
 %> <input style="width: 60px" type="button"
				value="<%=start + 1%> - <%=size+start%>"> <%
 if (end < db.getSizeOfDb()) {
 %><button type="button" onclick="loadData(<%=end%>,'prev',<%=range%>)">next</button>
				<%
				} else {
				%>
				<button title="no leads">next</button> <%}%>
			</td>
		</tr>
		<tr>
			<th></th>
			<th class="table_head">Name</th>
			<th class="table_head">Company</th>
			<th class="table_head">Source</th>
			<th class="table_head">Phone NO</th>
			<th class="table_head">Email</th>
		</tr>
		<%
		for (int j = 0; j < size; j++) {
			
			if(data.get(j).getName().equals(session.getAttribute("findUpdatedName")))
			{
				%><tr class="content_hover" style="background-color: yellow"><%
			}
			else{
				%><tr class="content_hover"><%
			}
		%>
		
			<td style="border-style: hidden !important;background-color: white">
				<button class="edit_delete" type="button"
					onclick="openUpdatePage('<%=j%>')">
					<i class="fa">&#xf044;</i>
				</button>
			</td>
			<td id="<%=j%>a"><%=data.get(j).getName()%></td>
			<td id="<%=j%>b"><%=data.get(j).getCompany()%></td>
			<td id="<%=j%>c"><%=data.get(j).getSource()%></td>
			<td id="<%=j%>d"><%=data.get(j).getPhoneno()%></td>
			<td id="<%=j%>e"><%=data.get(j).getEmail()%></td>
			<td style="border-style: hidden !important;background-color: white">
				<button class="edit_delete" type="button"
					onclick="deleteLeadByName('<%=data.get(j).getName()%>')">
					<i class="fa">&#xf014;</i>
				</button>
			</td>

		</tr>
		<%
		}
		%>

	</table>
</body>
</html>