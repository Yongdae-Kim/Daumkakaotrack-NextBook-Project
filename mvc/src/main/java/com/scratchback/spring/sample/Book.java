package com.scratchback.spring.sample;

public class Book {

	private String title;
	private String author;
	private String src;

	public Book(String title, String author, String src) {
		this.title = title;
		this.author = author;
		this.src = src;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getSrc() {
		return src;
	}
}
