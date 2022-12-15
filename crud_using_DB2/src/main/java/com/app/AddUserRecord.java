//$Id$
package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUserRecord extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = (String) req.getParameter("uname");
		String psw = (String) req.getParameter("psw");
		String email = (String) req.getParameter("email");
		DB dB = new DB();
		String sql = "INSERT INTO SignUpRecords VALUES ('" + name + "','" + psw + "','" + email + "')";
		if (dB.checkByQuery(sql)) {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Sign up was Successful');");

		} else {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Sign up was Unsuccessful');");
		}
		pw.println("location='jsp/loginPage.jsp';");
		pw.println("</script>");
	}
}
