package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Create extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = (String) req.getParameter("lead_name");
		String company = (String) req.getParameter("company");
		String source = (String) req.getParameter("source");
		long phoneNo = Long.parseLong(req.getParameter("phone_no"));
		String email = (String) req.getParameter("email");
		HttpSession session = req.getSession();
		DB dB = new DB();
		try {
			if (dB.create(name, company, source, phoneNo, email)) {
				session.setAttribute("findCreatedName", name);
				res.sendRedirect("home");
			} else {
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Lead with this name is already present ,Try Again With different Name');");
				pw.println("location='home';");
				pw.println("</script>");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Problem when connecting with DataBase');");
			pw.println("location='home';");
			pw.println("</script>");
		}
	}
}
