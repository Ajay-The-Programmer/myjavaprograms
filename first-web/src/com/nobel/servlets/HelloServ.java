package com.nobel.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html><body><h2>Hello, welcome to Servlet </h2></body></html>");
		out.close();

	}

}
