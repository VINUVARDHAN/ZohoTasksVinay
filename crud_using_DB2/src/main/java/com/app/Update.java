//$Id$
package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Update extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String oldName = (String) req.getParameter("old_name");
		String newName = (String) req.getParameter("lead_name_update");
		String company = (String) req.getParameter("company_update");
		String source = (String) req.getParameter("source_update");
		long phoneNo = 0;
		boolean check = true;
		try {
			phoneNo = Long.parseLong(req.getParameter("phone_no_update"));
		} catch (Exception e) {
			check = false;
		}
		HttpSession session = req.getSession();
		String email = (String) req.getParameter("email_update");
		DB dB = new DB();
		if (newName.equals("") || company.equals("")) {
			session.setAttribute("findUpdatedName", "");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Name and Company cannot be empty');");
			pw.println("location='home';");
			pw.println("</script>");
		} else if (check && dB.update(oldName, newName, company, source, phoneNo, email)) {
			session.setAttribute("findUpdatedName", newName);
			res.sendRedirect("home");
		} else if (!check) {
			session.setAttribute("findUpdatedName", "");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('phone number is wrong');");
			pw.println("location='home';");
			pw.println("</script>");
		} else {
			session.setAttribute("findUpdatedName", "");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Name given is already in Lead try, with different name');");
			pw.println("location='home';");
			pw.println("</script>");
		}
	}
}
