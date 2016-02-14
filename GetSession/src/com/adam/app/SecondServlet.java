package com.adam.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet
extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
 HttpSession httpSession=req.getSession(false);
 
 String name=(String) httpSession.getAttribute("name");
String id=httpSession.getId();
long ctime=httpSession.getCreationTime();
int maxtime=httpSession.getMaxInactiveInterval();	

Date date=new Date(ctime);
PrintWriter ouWriter=resp.getWriter();
	
	
	ouWriter.println("Secind servlet===session name"+name+"id=="+id);
	
	ouWriter.println("ctime===session time"+date.getDate()+"maxtime=="+maxtime);

	
	}
}
