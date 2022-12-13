<%@page import="com.app.DB"%>
<%@page import="com.app.DbStructure"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<!-- CSS only -->
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
	DB f = new DB();
	%>
	<%
	String sql = null;
	int start = (int) session.getAttribute("start");
	int range = (int) session.getAttribute("range");
	if (request.getParameter("action").equals("next")) {
		sql = "SELECT * FROM LeadTable limit " + request.getParameter("start") + "," + range;
		session.setAttribute("start", start + range);
	} else {
		sql = "SELECT * FROM LeadTable limit " + request.getParameter("start") + "," + range;
		session.setAttribute("start", start - range);
	}
	start = (int) session.getAttribute("start");
	LinkedList<DbStructure> rs = f.getResultByQuery(sql);
	int dataSize = rs.size();
	%>
	<table class="content_display">
		<tr>
			<%
			if (start >= 0 && (start + range) < f.getSizeOfDb() && start >= 0 && (start - range) >= 0) {
			%>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><button type="button"
					onclick="loadData(<%=start - range%>,'prev')" style="width: 40px"><</button>
					<input
					style="width: 50px" type="button"
					value="<%=start+1%> - <%=dataSize+start%>">
				<button style="width: 40px" type="button"
					onclick="loadData(<%=(int) session.getAttribute("start") + (int) session.getAttribute("range")%>,'next')">></button></td>

			<%
			} else if (start >= 0 && start + range < f.getSizeOfDb()) {
			%>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><button type="button" style="width: 40px" title="no records"><</button>
				<input
					style="width: 50px" type="button"
					value="<%=start+1%> - <%=dataSize+start%>">
				<button style="width: 40px" type="button"
					onclick="loadData(<%=(int) session.getAttribute("start") + (int) session.getAttribute("range")%>,'next')">></button></td>

			<%
			} else if (start >= 0 && (start - range) >= 0) {
			%>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><button type="button" style="width: 40px"
					onclick="loadData(<%=start - range%>,'prev')"><</button>
				<input
					style="width: 50px" type="button"
					value="<%=start+1%> - <%=dataSize+start%>">
				<button style="width: 40px" type="button" title="no records">></button></td>
			<%
			}
			%>
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
	</table>
</body>
</html>