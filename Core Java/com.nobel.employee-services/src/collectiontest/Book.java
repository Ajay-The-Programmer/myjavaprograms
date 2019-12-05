package collectiontest;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private int id;
	private String name;
	private String author;

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
//	@Override
//	public int hashCode() {
//		
//		return this.
//		
//	}

	@Override
	public int compareTo(Book b2) {
		
//		System.out.println("Comparing "+this.author +" with "+b2.author);
		return this.getId()-b2.getId();
			}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
//	class SortBYAuthorName implements Comparator<Book>{
//	@Override
//		public int compare(Book b1,Book b2) {
//		return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
//		
//	}}
	


