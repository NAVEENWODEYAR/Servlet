package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getDetails")
public class KnowYourDetails extends HttpServlet {
	/**
	 * @author Naveen Wodeyar
	 */
	private static final long serialVersionUID = 4920995325265453807L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
					pw.write("Name:"+name);
					pw.write("\n Password:"+password);
		System.out.println("\nName:"+name+" \nPassword:"+password);
	}
}
