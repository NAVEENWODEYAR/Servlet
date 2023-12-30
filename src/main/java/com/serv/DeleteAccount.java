package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteAccount extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4920995325265453807L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
		PrintWriter pw = resp.getWriter();
					pw.write("Delete your account here,");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		PrintWriter pw = resp.getWriter();
					pw.write("Delete your account here,");
		System.out.println("Inside doGet(),");
	}
}
