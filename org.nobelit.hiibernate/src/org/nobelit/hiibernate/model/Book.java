package org.nobelit.hiibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Book")

@NamedQueries(value = { @NamedQuery(name = "getAllBooks", query = "from Book"),
		@NamedQuery(name = "getBookInfo", query = "Select name , phone from Book"), })

@NamedNativeQueries(value = { @NamedNativeQuery(name = " fetchAllBook", query = "select name,id from Book")

})

public class Book {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;

	@Column(name = "name")
	private String name;

	@Column(name = "author")
	private String authorName;

	@Column(name = "published")
	private Date publishedDate;

	@Column(name = "price")
	private float bookPrice;

	public Book(String name, String authorName, Date publishedDate, float bookPrice) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.publishedDate = publishedDate;
		this.bookPrice = bookPrice;
	}

	public Book() {
		super();
	}

	public int getbookId() {
		return bookId;
	}

	public void setbookId(int id) {
		this.bookId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	
	public Date getPublishedDate() {
		return publishedDate;
	}

	
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float price) {
		this.bookPrice = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", authorName=" + authorName + ", publishedDate="
				+ publishedDate + ", bookPrice=" + bookPrice + "]";
	}

}
