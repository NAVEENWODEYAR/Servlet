package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	/**
	 * @author Naveen Wodeyar
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		PrintWriter pw = resp.getWriter();
					pw.write("Please register here,");
					
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String search = req.getParameter("search");
		
		if(name.equals("Test") || password.equals("Test@1"))
			resp.sendRedirect("https://www.google.com/search?q="+search);
		else
			resp.sendRedirect("https://www.google.com");		
	}
}
