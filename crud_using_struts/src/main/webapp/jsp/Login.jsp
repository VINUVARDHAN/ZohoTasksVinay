<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="/crud_using_struts/css/home.css">
<link rel="stylesheet" href="/crud_using_struts/css/login.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" href="/crud_using_struts/css/message.css" />
<link rel="stylesheet" href="/crud_using_struts/css/home.css" />

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="icon" href="/crud_using_struts/css/LOGIN.png" type="image/gif" sizes="16x16">
</head>

<body>
	<%
	try {
	%>
	<h2 style="text-align: center; font-family: cursor; animation: 4s infinite main_tag_bg_color;">
		CRUD Using Struts
	</h2>
	<div id="login">
		<s:form action="loginDetails">
			<h3 style="margin-top: 2%">LOG IN</h3>
			<s:textfield style="margin:auto" name="userName" label="User Name"
				required="true" maxlength="50" />
			<s:password name="psw" label="Password" required="true" minlength="4" maxlength="10" />
			<s:textfield style="display:none" name="messageLogin" value="none" />
			<s:submit value="SUBMIT" />
		</s:form>
		If you are not a user?
		<button style="border:3px solid white" type="button" id="signup_btn">SignUp</button>
		here
	</div>
	<div id="signup">
		<button id="close_btn"
			style="width:30px;height:30px;border-radius:20%; float:right; margin-right: 20px; margin-top: 20px;border:3px solid white">X</button>
		<s:form action="signupDetails">
			<h3 style="margin-top: 2%">SIGN UP</h3>
			<s:textfield name="userName" type="text" label="User Name"
				required="true" maxlength="50" />
			<s:password name="psw" label="Password" required="true"
				minlength="8" maxlength="10" />
			<s:textfield name="email" type="email" label="Email" required="true"
				maxlength="50" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"/>
			<s:textfield style="display:none" name="messageSignUp" value="none" />
			<s:submit style="background-color:white" value="SUBMIT" />
		</s:form>
	</div>
	<div id="loginError">
		<b> <i class="material-icons">&#xe001;</i> User Name or Password is wrong <i class="material-icons">&#xe001;</i> </b>
	</div>
	<div id="signupError">
		<b> <i class="material-icons">&#xe001;</i> User with this name is already present <i class="material-icons">&#xe001;</i></b>
	</div>
	<script type="text/javascript">
		$("#signup_btn").click(function() {
			document.getElementById("signup").style.height = "250px";
			document.getElementById("login").style.height = "0px";
		});
		$("#close_btn").click(function() {
			document.getElementById("login").style.height = "250px";
			document.getElementById("signup").style.height = "0px";

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
		document.getElementById("signup").style.height = "250px";
	</script>
	<%
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	%>
</body>
</html>