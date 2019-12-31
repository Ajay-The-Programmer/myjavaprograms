package com.nobelit.;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		PrintWriter out = response.getWriter();
		
		
		out.println("<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"<head>\n" + 
				"<meta charset=\"UTF-8\">\n" + 
				"<title>Insert title here</title>\n" + 
				"</head>\n" + 
				"<body  bgcolor=red>\n" + 
				"	<form>\n" + 
				"\n" + 
				"		<h1>Student Login Form</h1>\n" + 
				"\n" + 
				"		<table>\n" + 
				"			<tr>\n" + 
				"				<td>First Name :</td>\n" + 
				"				<td><input type=\"text\" placeholder=\"First name\" name=\"\">\n" + 
				"				</td>\n" + 
				"			</tr>\n" + 
				"			<tr>\n" + 
				"				<td>Middle Name :</td>\n" + 
				"				<td><input type=\"text\" placeholder=\" Middel name\" name=\"\">\n" + 
				"\n" + 
				"				</td>\n" + 
				"			</tr>\n" + 
				"			<tr>\n" + 
				"				<td>Email :</td>\n" + 
				"				<td><input type=\"email\" placeholder=\"Email\" name=\"\"></td>\n" + 
				"			</tr>\n" + 
				"			<tr>\n" + 
				"				<td>Mobile No :</td>\n" + 
				"				<td><input type=\"text\" placeholder=\"10 Digit\" value=\"\"></td>\n" + 
				"			</tr>\n" + 
				"			<tr>\n" + 
				"				<td>Gender :</td>\n" + 
				"				<td><input type=\"radio\" name=\"Gender\">Male <input\n" + 
				"					type=\"radio\" name=\"Gender\">Female</td>\n" + 
				"			</tr>\n" + 
				"			<!-- <tr>\n" + 
				"				<td><input type=\"submit\" value=\"Submit\" name=\"\"></td>\n" + 
				"			</tr> -->\n" + 
				"		</table>\n" + 
				"\n" + 
				"	</form>\n" + 
				"\n" + 
				"	    <button onclick=\"window.location.href = 'http://localhost:8181/student-form/finalstudent';\">Submit</button>\n" + 
				"\n"+
				"</body>\n" + 
				"</html>"); 

		

		
	}

}
