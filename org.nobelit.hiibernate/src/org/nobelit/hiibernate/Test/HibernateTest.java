package org.nobelit.hiibernate.Test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.nobelit.hiibernate.model.Book;
import org.nobelit.hiibernate.util.HibernateUtil;

public class HibernateTest {


	public static void main(String[] args) {

		// step by step loading of hibernate

		// 3.open new session for any kind of operation with database.

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
		Session session = sessionFactory.openSession();
		
		// 4.start the transaction.
		Transaction txn = session.beginTransaction();
		
		Date dateObject = new Date(2017, 01, 02);//we are take Date object
		
		// 4.perform your object.
		Book book = new Book("ORACLE", "Ajay", dateObject,550);

		session.save(book);

		txn.commit();

		System.out.println("Book object is saved:");

		session.clear();

		// most important step
		sessionFactory.close();
	}

}
