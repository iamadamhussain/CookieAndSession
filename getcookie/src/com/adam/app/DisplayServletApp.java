package com.adam.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServletApp  extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
	Cookie c[]=	req.getCookies();
	PrintWriter ouWriter=resp.getWriter();
	
	
	ouWriter.println("Secind servlet===cookies"+c[0].getValue());
	}
}
