package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Search extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String pattern = (String) req.getParameter("search_value");
		DB dB = new DB();
		LinkedList<DbStructure> rs = dB.search(pattern);
		HttpSession session = req.getSession();
		session.setAttribute("rs", rs);
		res.sendRedirect("home");
	}
}
