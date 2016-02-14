package com.adam.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Firstservlet extends HttpServlet{

	
/*
Cookies and session both store 
information about the user 
(to make the HTTP request stateful) 
but the difference is that cookies 
store information on the client-side
(browser) and sessions store information 
on the server-side. A cookie is limited in 
the sense that it stores information about 
limited users and only stores limited content 
for each user. A session is not limit in such a way.
*/
/*
Google JSESSIONID. This will explain how 
the Servlet API initially uses URL 
re-writing and then, if cookies are 
enabled, cookies to manage sessions*/

/*HTTP is stateless so the client 
browser must send the id of its 
session to the server with each request.
The server, through whatever means, uses 
this id to retrieve any data for that 
session making it available for the 
lifetime of the request.*/
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		  resp.setContentType("text/html");  

		String name=req.getParameter("nm");
		 HttpSession session=req.getSession();
		
	
		 session.setAttribute("name", name);
		// session.setMaxInactiveInterval(0);
		session.invalidate(); 
	    PrintWriter out = resp.getWriter();  

	    out.print("<form action='s2'>");  
	    out.print("<input type='submit' value='go to next servlet'>");  
	    out.print("</form>");  
	          
	}
}
