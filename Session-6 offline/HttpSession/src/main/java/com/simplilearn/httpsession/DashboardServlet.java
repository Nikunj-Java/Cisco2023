package com.simplilearn.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=resp.getWriter(); 
		resp.setContentType("text/html");
		
		HttpSession session=req.getSession(false);
		
		if(session!=null) {
			
			String usernameFromSession=(String) session.getAttribute("key");
			
			//out.println("Welcome .....!! "+usernameFromSession);
			if(usernameFromSession!=null) {
				out.println("Welcome .....!! "+usernameFromSession);
				out.println("<br><a href='logout'>Logout</a>");
			}else {
				out.println("UnAuthorised User,Kindly do the login First");
			}
			
		}
		
		
		
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
