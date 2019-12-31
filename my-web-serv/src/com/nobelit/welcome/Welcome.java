package com.nobelit.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<table style=\"width:100%\" border=\"1\">\n" + 
				"\n" + 
				"  <tr>\n" + 
				"    <th>Firstname</th>\n" + 
				"    <th>Lastname</th>\n" + 
				"    <th>Age</th>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>Ajay</td>\n" + 
				"    <td>devkar</td>\n" + 
				"    <td>23</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>Tribhuwan</td>\n" + 
				"    <td>Panday</td>\n" + 
				"    <td>21</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>Raju</td>\n" + 
				"    <td>Jadhav</td>\n" + 
				"    <td>23</td>\n" + 
				"  </tr>\n" + 
				"</table>");
		out.close();
	}

}
