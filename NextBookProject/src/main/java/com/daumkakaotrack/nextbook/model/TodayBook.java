package com.daumkakaotrack.nextbook.model;

public class TodayBook {

	private String title;
	private String author;
	private String src;

	public TodayBook(String title, String author, String src) {
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
