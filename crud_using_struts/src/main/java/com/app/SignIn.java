//$Id$
package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

//import com.opensymphony.xwork2.ActionSupport;

public class SignIn implements ServletRequestAware {
	private HttpServletRequest req;
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
		try {
			DBManagement db = new DBManagement();
			DateFormat dateFormatOne = new SimpleDateFormat("HH:mm:ss");
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("select * from SignUpRecords where username = ? AND password= ?");
			myStmt.setString(1, getUserName());
			myStmt.setString(2, getPsw());
			ResultSet myRs = myStmt.executeQuery();
			if (myRs.next()) {
				this.req.getSession(false).setAttribute("sessionLogged", userName);
				this.req.getSession(false).setAttribute("sessionLoggedTime", dateFormatOne.format(new Date()));
				return "success";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "error";
	}

	public String signup() {
		try {
			DBManagement db = new DBManagement();
			DateFormat dateFormatOne = new SimpleDateFormat("HH:mm:ss");
			Connection myCon = db.getConnection();
			PreparedStatement myStmt = myCon.prepareStatement("INSERT INTO SignUpRecords VALUES (?,?,?)");
			myStmt.setString(1, getUserName());
			myStmt.setString(2, getPsw());
			myStmt.setString(3, getEmail());
			myStmt.executeUpdate();
			this.req.getSession(false).setAttribute("sessionLogged", userName);
			this.req.getSession(false).setAttribute("sessionLoggedTime", dateFormatOne.format(new Date()));
			return "success";

		} catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}

	public String logOut() {
		req.getSession(false).removeAttribute("sessionLogged");
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

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.req = req;
	}
}
