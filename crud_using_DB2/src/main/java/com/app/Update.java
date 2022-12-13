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
		String email = (String) req.getParameter("email_update");

		DB db = new DB();

		if (check && db.update(oldName, newName, company, source, phoneNo, email)) {
			HttpSession session = req.getSession();
			session.setAttribute("findUpdatedName", newName);
			res.sendRedirect("jsp/home.jsp");
		} else if (!check) {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('phone number is wrong');");
			pw.println("location='jsp/home.jsp';");
			pw.println("</script>");
		} else {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Name given is already in Lead try, with different name');");
			pw.println("location='jsp/home.jsp';");
			pw.println("</script>");
		}
	}
}
