<%@page import="java.util.Map"%>
<%@page import="com.learn.web.Data"%>
<%@page import="com.learn.web.Lead"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE</title>
<link rel="stylesheet"
	href="http://localhost:8080/ZohoVinayWA/css/finish.css">
<style type="text/css">
th {
	background-color: black;
	border: 1px solid Black;
	color: white;
	padding: 10px 24px;
}
</style>
</head>
<body>
	<br>
	<div class="btn-group">
		<a href="create.jsp"><button>CREATE</button></a> <a href="delete.jsp"><button>DELETE</button></a>
		<a href="search.jsp"><button>SEARCH</button></a><a href="display.jsp"><button>HOME</button></a>
	</div>

	<br>

	<div>
		<h2>Enter Changes here</h2>
		<form action="update.jsp" method="post">
			<table>
				<tr>
					<td><label>Enter name of Lead to Update </label></td>
					<td><input type="text" name="presentName" required
						value="<%=""%>"></td>
				</tr>
			</table>
			<h2>Enter Changes :</h2>
			<table>
				<tr>
					<td><label>Name</label></td>
					<td><input type="text" name="nameChange" value="<%=""%>"></td>
				</tr>
				<tr>
					<td><label>Company</label></td>
					<td><input type="text" name="companyChange" value="<%=""%>"></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="text" name="emailChange" value="<%=""%>"></td>
				</tr>
				<tr>
					<td><label>Address</label></td>
					<td><input type="text" name="addressChange" value="<%=""%>"></td>
				</tr>
				<tr>
					<td><label>Source</label></td>
					<td><input type="text" name="sourceChange" value="<%=""%>"></td>
				</tr>
				<tr>
					<td></td>
					<td><button class="btn-group" type="submit">Update</button></td>
				</tr>
			</table>
		</form>
	</div>

	<%
	boolean color = false;

	HashMap<String, Lead> values = Data.defaultContent();
	String oldName = request.getParameter("presentName");
	String newName = request.getParameter("nameChange");
	String newCompany = request.getParameter("companyChange");
	String newEmail = request.getParameter("emailChange");
	String newAddress = request.getParameter("addressChange");
	String newSource = request.getParameter("sourceChange");
	if (values.containsKey(oldName)) {
		String oldCompany = values.get(oldName).company;
		String oldEmail = values.get(oldName).email;
		String oldAddress = values.get(oldName).address;
		String oldSource = values.get(oldName).source;
		if (newName.length() == 0 && newCompany.length() == 0 && newEmail.length() == 0 && newAddress.length() == 0 && newSource.length() == 0) {
	%>
	<h2 class="redMessage">No Changes Specified</h2>
	<%
	} else {
	color = true;
	if (newName.length() == 0) {
		newName = oldName;
	}
	if (newCompany.length() == 0) {
		newCompany = oldCompany;
	}
	if (newEmail.length() == 0) {
		newEmail = oldEmail;
	}
	if (newAddress.length() == 0) {
		newAddress = oldAddress;
	}
	if (newSource.length() == 0) {
		newSource = oldSource;
	}
	%>
	<h2 class="greenMessage">Changes updated</h2>
	<%
	values.remove(oldName);
	values.put(newName, new Lead(newCompany, newEmail, newAddress, newSource));
	values = Data.defaultContent();
	}
	} else if (oldName != null) {
	%>
	<h2 class="redMessage">Lead name not present in table</h2>
	<%
	}
	%>

	<h2>LEADS</h2>
	<div>
		<table>
			<tr>
				<th class="tth"><%="Name"%></th>
				<th class="tth"><%="Company"%></th>
				<th class="tth"><%="Email"%></th>
				<th class="tth"><%="Address"%></th>
				<th class="tth"><%="Source"%></th>
			</tr>
			<%
			for (Map.Entry<String, Lead> v : values.entrySet()) {
				if (color && v.getKey() == newName) {
			%>

			<tr style="background-color: rgb(201, 238, 238); color: black;">
				<td class="ttd"><%=v.getKey()%></td>
				<td class="ttd"><%=v.getValue().company%></td>
				<td class="ttd"><%=v.getValue().email%></td>
				<td class="ttd"><%=v.getValue().address%></td>
				<td class="ttd"><%=v.getValue().source%></td>
				<td style="background-color: rgb(180, 233, 200); color: black;"
					class="ttd">updated lead</td>
			</tr>
			<%
			} else {
			%>

			<tr>
				<td class="ttd"><%=v.getKey()%></td>
				<td class="ttd"><%=v.getValue().company%></td>
				<td class="ttd"><%=v.getValue().email%></td>
				<td class="ttd"><%=v.getValue().address%></td>
				<td class="ttd"><%=v.getValue().source%></td>
			</tr>
			<%
			}
			}
			%>
		</table>
	</div>

</body>
</html>