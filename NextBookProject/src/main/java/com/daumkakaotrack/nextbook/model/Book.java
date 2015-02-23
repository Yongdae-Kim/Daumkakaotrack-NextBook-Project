package com.daumkakaotrack.nextbook.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	@XmlElement(name = "title")
	private String title;

	@XmlElement(name = "link")
	private String link;

	@XmlElement(name = "cover_s_url")
	private String cover_s_url;

	@XmlElement(name = "cover_l_url")
	private String cover_l_url;

	@XmlElement(name = "description")
	private String description;

	@XmlElement(name = "author")
	private String author;

	@XmlElement(name = "translator")
	private String translator;

	@XmlElement(name = "pub_nm")
	private String pub_nm;

	@XmlElement(name = "pub_date")
	private String pub_date;

	@XmlElement(name = "category")
	private String category;

	@XmlElement(name = "isbn13")
	private String isbn13;

	public String getTitle() {
		return title.replaceAll("\\<.*?>", "");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getCover_s_url() {
		return cover_s_url;
	}

	public void setCover_s_url(String cover_s_url) {
		this.cover_s_url = cover_s_url;
	}

	public String getCover_l_url() {
		return cover_l_url;
	}

	public void setCover_l_url(String cover_l_url) {
		this.cover_l_url = cover_l_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getPub_nm() {
		return pub_nm;
	}

	public void setPub_nm(String pub_nm) {
		this.pub_nm = pub_nm;
	}

	public String getPub_date() {
		return pub_date;
	}

	public void setPub_date(String pub_date) {
		this.pub_date = pub_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

}
