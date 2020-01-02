package com.nobel.oshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.oshop.model.Category;
import com.nobelit.oshop.hibernate_util.HibernateUtil;

@WebServlet("/categories")
public class CaregoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// Desplay categories

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from  Category");

		List<Category> categories = (List<Category>) query.list();
	
		out.println("<html><body><table border=1>");

		for (Category category : categories) {

			out.println("<tr>");
			out.println("<td>" + category.getCatName() + "</td>");
			out.println("<td>" + category.getCatDesc() + "</td>");
			out.println("<td><img src='images/" + category.getCatImgUrl() + "'width='100px' height='100px'/></td>");
			out.println("<tr>");
		}

		out.println("</table></body></html>");

		session.close();
		sessionFactory.close();

		out.close();

	}

}
