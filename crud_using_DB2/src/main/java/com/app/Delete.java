package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = (String) req.getParameter("name");
		DB db = new DB();
		if (db.remove(name)) {
			res.sendRedirect("jsp/home.jsp");
		} else {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Problem in deleting Lead');");
			pw.println("location='jsp/home.jsp';");
			pw.println("</script>");
		}
	}
}
