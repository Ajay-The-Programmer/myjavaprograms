package collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
//		Set<Book> oldBook=new TreeSet<>();
//		oldBook.add(new Book(1,"Godfather","mClerren"));
//		

//		Set<Book> oldBooks = new TreeSet<>();
//		oldBooks.add(new Book(1, "Godfather", "mClerren"));

		List<Book> books = new ArrayList<>();
		books.add(new Book(10, "SCJP", "Kathy"));
		books.add(new Book(13, "Core Java", "Aathy"));
		books.add(new Book(11, "Adv Java", "Herbert"));
		SortBYAuthorName obj=new SortBYAuthorName();
		
		Collections.sort(books, obj);

		for (Book book : books)
			System.out.println(book);

//		Set<String> names = new TreeSet<>();
//		names.add("sunil"); 
//		names.add("anil");
//		names.add("ganesh");
//		
//		System.out.println(names);
//		

	}

}