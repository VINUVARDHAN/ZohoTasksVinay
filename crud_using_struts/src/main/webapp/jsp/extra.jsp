<%@page import="com.app.DbStructure"%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.app.DBManagement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<script src="/crud_using_struts/js/home.js"></script>
<style type="text/css">
body {
	margin-top: 3%;
	margin-left: 5%;
	margin-right: 5%;
}
</style>
</head>
<body>
	<%
	try {
		int start = Integer.parseInt(request.getParameter("start"));
		int range = Integer.parseInt(request.getParameter("range"));
		session.setAttribute("range", range);
		int end = start + range;
		DBManagement db = new DBManagement();
		LinkedList<DbStructure> data = (LinkedList) session.getAttribute("FullLeadData");
		int size = data.size();
	%>
	<table
		style="width: 80%; margin-right: 10%; margin-left: 10%; margin-top: 40px; text-align: center">
		<tr>
			<td colspan="4">Total : <%=db.getDBSize()%> leads
			</td>
			<td><form action="myservlet.do" method="POST">
					<select name="myselect" id="range_selection"
						onchange="setPageRange();">
						<option value="<%=range%>" selected><%=range%></option>
						<option value="3">3</option>
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="20">20</option>
					</select> Leads per page
				</form></td>
			<td style="float: right">
				<%
				if (start >= range) {
				%><button style="width: 40px" type="button"
					onclick="loadData(<%=start - range%>,'next',<%=range%>)"><</button>
				<%
				} else {
				%><button style="width: 40px" title="no leads"><</button> <%
 }
 %> <%=start + 1%> - <%=size + start%> <%
 if (end < db.getDBSize()) {
 %>
				<button style="width: 40px" type="button"
					onclick="loadData(<%=end%>,'prev',<%=range%>)">></button> <%
 } else {
 %>
				<button style="width: 40px" title="no leads">></button> <%}%>
			</td>
		</tr>
	</table>
	<table class="content_display">
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
		%>
		<tr class="data_table">
			<td style="border-style: hidden !important; background-color: white">
				<button class="edit_delete" type="button"
					onclick="getUpdateDiv('<%=j%>')">
					<i class="fa">&#xf044;</i>
				</button>
			</td>
			<td onclick="getUpdateDiv('<%=j%>')" id="<%=j%>a"><%=data.get(j).getName()%></td>
			<td onclick="getUpdateDiv('<%=j%>')" id="<%=j%>b"><%=data.get(j).getCompany()%></td>
			<td onclick="getUpdateDiv('<%=j%>')" id="<%=j%>c"><%=data.get(j).getSource()%></td>
			<td onclick="getUpdateDiv('<%=j%>')" id="<%=j%>d"><%=data.get(j).getPhoneno()%></td>
			<td onclick="getUpdateDiv('<%=j%>')" id="<%=j%>e"><%=data.get(j).getEmail()%></td>
			<td style="border-style: hidden !important; background-color: white">
				<button class="edit_delete" type="button"
					onclick="deleteLead('<%=data.get(j).getName()%>')">
					<i class="fa">&#xf014;</i>
				</button>
			</td>

		</tr>
		<%
		}
		} catch (Exception e) {
		System.out.print(e);
		}
		%>

	</table>
</body>
</html>