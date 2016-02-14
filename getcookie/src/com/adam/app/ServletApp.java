package com.adam.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletApp extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		  resp.setContentType("text/html");  

		String name=req.getParameter("nm");
		
		
		Cookie cookie=new Cookie("u",name);
		
		cookie.setMaxAge(20*50);
		resp.addCookie(cookie);
	    PrintWriter out = resp.getWriter();  

	    out.print("<form action='s2'>");  
	    out.print("<input type='submit' value='go to next servlet'>");  
	    out.print("</form>");  
	          
	}
}
