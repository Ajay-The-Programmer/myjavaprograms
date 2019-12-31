package org.nobelit.hiibernate.Test;

import org.nobelit.hiibernate.model.Book;
import org.nobelit.hiibernate.services.BookServices;

public class HibernateTest {

	public static void main(String[] args) {

		// step by step loading of hibernate

		// 3.open new session for any kind of operation with database.

//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//
//		Session session = sessionFactory.openSession();
//
//		// 4.start the transaction.
//		
//		Transaction txt = session.beginTransaction();
//		
		BookServices service= new BookServices();
		Book serv=service.getBookById(2);
		System.out.println(serv);
		
		
		for(Book book : service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		Book book=service.getBookByName("SSJP");
			System.out.println(book);
		
		
		
		// Select * from Book;
		
			
//		  Query query = session.createQuery("select OBJECT(b) from Book b");
//		  List<Book> book= (List<Book>) query.list();
//		  
//		  for(Book bk : book ) {
//		  
//		  System.out.println(bk);
//		  
//		  }
//		
//		  Date dateObject = new Date(2017,01, 02);//we are take Date object
//		  
//		  Date obj = new Date(2019 - 12 - 17);
//		  
//		  // 4.perform your object.
//		  
//		  Book book = new Book("ORACLE", "sunil", obj, 750);
//		  
//		  Locale loc = new Locale("In");
//		  
//		  session.save(book);
//		  
//		  Book bk = (Book) session.get(Book.class, 3);
//		  
//		  System.out.println(bk);
//		  
//		  bk.setBookPrice(850);
//		  
//		  // updating existing object or save new object
//		  
////		  session.saveOrUpdate(bk);
//		  
//		  session.delete(bk);
//		  
//		  txn.commit();
////		
//		  System.out.println("Book object is saved:");
//
//		session.clear();
//
//		// most important step
//
//		sessionFactory.close();
//		
	}
}

