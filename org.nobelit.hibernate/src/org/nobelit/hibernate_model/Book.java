package org.nobelit.hibernate_model;

import java.sql.Date;

public class Book {
	private int bookId;
	private String name;
	private String authorName;
	private Date publishedDate;
	private float bookPrice;
	
	
	public Book(int bookId, String name, String authorName, Date published, float bookPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.authorName = authorName;
		this.publishedDate = published;
		this.bookPrice = bookPrice;
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

	public Date getPublished() {
		return publishedDate;
	}

	public void setPublished(Date published) {
		publishedDate = published;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float price) {
		this.bookPrice = price;
	}
	
	
	
	

}
