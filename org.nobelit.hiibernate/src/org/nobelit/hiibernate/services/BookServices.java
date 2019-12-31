package org.nobelit.hiibernate.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nobelit.hiibernate.model.Book;
import org.nobelit.hiibernate.util.HibernateUtil;

public class BookServices {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Book getBookById(int id) {
		Session session = sessionFactory.openSession();

		Book book = (Book) session.get(Book.class, id);

		session.close();

		return book;

	}

	public Book getBookByName(String name) {

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("Select id,'author',price,'name','published' from Book where name=:name");
		
		Book book = (Book) query;
		
		session.close();

		return book;

	}

	public List<Book> getAllBooks() {

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Book");

		List<Book> bList = (List<Book>) query.list();
		
		session.close();

		return bList;

	}

	public boolean deleteBookById(int id) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Book book = new Book();

		session.delete(book.getbookId());

		System.out.println("Book deleted");

		session.close();

		return true;

	}

}
