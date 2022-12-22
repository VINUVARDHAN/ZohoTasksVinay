//$Id$
package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import com.opensymphony.xwork2.ActionSupport;

public class SignIn {
	private String userName;
	private String psw;
	private String email;
	private String messageLogin;
	private String messageSignUp;

	public String getUserName() {
		return userName;
	}

	public String getPsw() {
		return psw;
	}

	public String getEmail() {
		return email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String login() {
		DBManagement db = new DBManagement();
		try {
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("select * from SignUpRecords where username = ? AND password= ?");
			myStmt.setString(1, getUserName());
			myStmt.setString(2, getPsw());
			ResultSet myRs = myStmt.executeQuery();
			if (myRs.next())
				return "success";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "error";
	}

	public String signup() {
		DBManagement db = new DBManagement();
		try {
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("INSERT INTO SignUpRecords VALUES (?,?,?)");
			myStmt.setString(1, getUserName());
			myStmt.setString(2, getPsw());
			myStmt.setString(3, getEmail());
			myStmt.executeUpdate();
			return "success";

		} catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}
	public String logOut()
	{
		return "success";
	}
	public String getMessageLogin() {
		return messageLogin;
	}

	public void setMessageLogin(String messageLogin) {
		this.messageLogin = messageLogin;
	}

	public String getMessageSignUp() {
		return messageSignUp;
	}

	public void setMessageSignUp(String messageSignUp) {
		this.messageSignUp = messageSignUp;
	}
}
