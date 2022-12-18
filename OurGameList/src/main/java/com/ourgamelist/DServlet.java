package com.ourgamelist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/d")
public class DServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("game1"));
		int j = Integer.parseInt(req.getParameter("game2"));
		int k = i+j;
		
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("d");
		
	}
}
