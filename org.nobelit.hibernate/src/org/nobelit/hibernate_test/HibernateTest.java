package org.nobelit.hibernate_test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.nobelit.hibernate.util.HibernateUtil;
import org.nobelit.hibernate_model.Book;

public class HibernateTest {

	public static void main(String[] args) {

		// step by step loading of hibernate

		// 3.open new session for any kind of operation with database.

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
		Session session = sessionFactory.openSession();
		// 4.start the transaction.
		Transaction txn = session.beginTransaction();
		Date dateObject = new Date(2017, 01, 02);
		// 4.perform your object.
		Book book = new Book(6, "ORACLE", "Ajay", dateObject,550);

		session.save(book);

		txn.commit();

		System.out.println("Book object is saved:");

		session.clear();

		// most important step
		sessionFactory.close();
	}

}
