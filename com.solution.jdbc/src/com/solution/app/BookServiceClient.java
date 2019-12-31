package com.solution.app;

import java.util.List;

import com.solution.database.BookService;
import com.solution.database.DataBaseConnection;
import com.solution.model.Book;

public class BookServiceClient {

	public static void main(String[] args) {

		// Singleton pattern

		BookService bkClient = new BookService();

		// Book by author name...... Book
		Book bs = bkClient.getBookByAuthorName("'Kathy Sierra'");
		System.out.println(bs);
		System.out.println("\n\n");

		
		
		// Book between price 300 and 500 List<Book>
		List<Book> list = bkClient.getBookByGivenRange(300, 500);
		for (Book book : list) {
			System.out.println(book);
		}
		System.out.println("\n\n");

		
		
		// Book by max price
		list = bkClient.getBookOfMaxPrice();
		for (Book book : list) {
			System.out.println(book);
		}
		System.out.println("\n\n");

		
		
		// Book by published date
		list = bkClient.getBookBeforePublisheDate("2019-01-01");
		for (Book book : list) {
			System.out.println(book);
		}

		
		// Close Database connection
		DataBaseConnection.close();

	}

}
//PreparedStatement ps = conn.prepareStatement("SELECT MAX(price) FROM Book");
