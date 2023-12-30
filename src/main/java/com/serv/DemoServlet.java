package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8775019552842459616L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		PrintWriter pw = resp.getWriter();
					pw.append("Inside doGet()");
		System.out.println("Inside the doGet(),");
		System.out.println(Thread.getDefaultUncaughtExceptionHandler());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		System.out.println("Inside the doPost()");
		PrintWriter pw = resp.getWriter();
					pw.append("Welcome to the Servlet programming in Java,");
					
	}
}
