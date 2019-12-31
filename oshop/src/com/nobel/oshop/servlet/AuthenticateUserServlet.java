package com.nobel.oshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class AuthenticateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");

		String pwd = request.getParameter("pwd");

		PrintWriter out = response.getWriter();			

		/*
		 * if (uname.equals("ajay") && pwd.equals("ajay")) {
		 * 
		 * out.println("<h1>Login Success</h1>");
		 * 
		 * } else {
		 * 
		 * out.println("Login Failed."); response.sendRedirect("Index.html");
		 * 
		 * }
		 */

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobelit", "ajay", "ajay1324");

			PreparedStatement ps = conn.prepareStatement("select * from shop where uname= ? and pwd= ?");

			ps.setString(1,uname);
			
			ps.setString(2,pwd);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				response.sendRedirect("categories");

			} else {
			  		
					response.sendRedirect("Index.html");
		
//			  			
			}
			rs.close();
			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
