package com.daumkakaotrack.nextbook.model;

public class Book {

	private String isbn;
	private String title;
	private String src;
	private String author;
	private String publisher;
	private String genreNum;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenreNum() {
		return genreNum;
	}

	public void setGenreNum(String genreNum) {
		this.genreNum = genreNum;
	}
}
