package com.solution.model;

import java.sql.Date;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private Date published;
	private float price;
	
	public Book(int id, String name, String author, Date published, float price) {
		super();
		this.id = id;
		this.name = name;
		this.author=author;
		this.published = published;
		this.price = price;
	}
	

	public Book() {

	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", published=" + published + ", price="
				+ price + "]";
	}





	

}
