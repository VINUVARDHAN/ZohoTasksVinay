<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" href="/crud_using_struts/css/message.css"/>
<link rel="stylesheet" href="/crud_using_struts/css/home.css"/>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<style type="text/css">
body {
	margin-top: 3%;
	margin-left: 5%;
	margin-right: 5%;
}

#login {
	text-align: center;
	display: block;
	width: 500px;
	height: 300px;
	background-color: #111;
	border-radius: 5%;
	color: white;
	margin: auto;
	overflow-x: hidden;
	opacity: 75%;
	transition: 1s;
}

#signup {
	display: block;
	text-align: center;
	width: 500px;
	height: 0px;
	background-color: #111;
	border-radius: 5%;
	color: white;
	margin: auto;
	overflow-x: hidden;
	transition: 1s;
	opacity: 75%;
}

#signup_btn {
	width: 70px;
	height: 30px;
	background-color: white
}

#close_btn {
	background-color: white;
	float: right;
	margin-top: 10px;
	width: 40px;
	height: 40px;
	border-radius: 100%;
	margin-right: 10px;
}
#close_btn:hover{
	color:white;
	background-color: red
}
</style>
</head>

<body>
<%try{
	%>
	<h2
		style="text-align: center; font-family: cursor; animation: 4s infinite main_tag_bg_color;">CRUD
		Using DataBase</h2>
	<div id="login">
		<h3 style="margin-top: 30px; color: #d2f7fc">Login</h3>
		<s:form action="loginDetails"
			style="margin: auto;font-family: cursor; margin-top: 30px">
			<s:textfield name="userName" label="User Name" required="true"
				maxlength="50" />
			<s:password name="psw" label="Password" required="true"
				maxlength="10" />
			<s:textfield style="display:none" name="messageLogin" value="none" />
			<s:submit style="float:right" value="submit" />
		</s:form>
		<div style="margin-top: 10px">
			If you are not a user?
			<button type="button" id="signup_btn">SignUp</button>
			here
		</div>
	</div>
	<div id="signup">
		<button id="close_btn">X</button>
		<h3 style="margin-top: 30px; color: #d2f7fc">SignUp</h3>
		<s:form action="signupDetails"
			style="margin: auto;font-family: cursor; margin-top: 30px">
			<s:textfield name="userName" type="text" label="User Name"
				required="true" maxlength="50" />
			<s:password name="psw" label="Password" required="true" 
				maxlength="10" />
			<s:textfield name="email" type="email" label="Email" required="true"
				maxlength="50" />
							<s:textfield style="display:none" name="messageSignUp" value="none" />
				
			<s:submit style="float:right" value="submit" />
		</s:form>
	</div>
	<div id="loginError"><i class="material-icons">&#xe001;</i> <b> You are not a user </b> <i class="material-icons">&#xe001;</i></div>
	<div id="signupError"><i class="material-icons">&#xe001;</i>  User with this name is already present  <i class="material-icons">&#xe001;</i></div>
	<script type="text/javascript">
		$("#signup_btn").click(function() {
			document.getElementById("login").style.height = "0";
			document.getElementById("signup").style.height = "300px";
		});
		$("#close_btn").click(function() {
			document.getElementById("signup").style.height = "0px";
			document.getElementById("login").style.height = "300px";

		});
	</script>
	<%
	if (request.getParameter("messageLogin") != null) {
	%>
	<script type="text/javascript">
			var x = document.getElementById("loginError");
			x.className = "show";
			setTimeout(function() {
				x.className = x.className.replace("show", "");
			}, 3000);
	</script>
	<%
	}
	%>
	<%
	if (request.getParameter("messageSignUp") != null) {
	%>
	<script type="text/javascript">
			var x = document.getElementById("signupError");
			x.className = "show";
			setTimeout(function() {
				x.className = x.className.replace("show", "");
			}, 3000);
			document.getElementById("login").style.height = "0";
			document.getElementById("signup").style.height = "300px";
	</script>
	<%
	}}
catch(Exception e)
{
	System.out.println(e);
}
	%>
</body>
</html>