package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=resp.getWriter();
	
	resp.setContentType("text/html");
	
	String uname=req.getParameter("uname");
	
	out.println("<form action='dashboard' method='post'>");
	out.println("<input type='hidden' name=uname value='"+uname+"'>");
	out.println("<input type='submit' value='Dashboard'>");
	out.println("</form>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
