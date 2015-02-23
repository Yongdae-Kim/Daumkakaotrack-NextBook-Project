package com.daumkakaotrack.nextbook.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "channel")
public class BookChannel {
	@XmlElement(name = "lastBuildDate")
	private int lastBuildDate;

	@XmlElement(name = "totalCount")
	private String totalCount;

	@XmlElement(name = "result")
	private int result;

	@XmlElement(name = "item")
	private List<Book> itemList;

	public List<Book> getItemList() {
		return itemList;
	}

	public void setItemList(List<Book> itemList) {
		this.itemList = itemList;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public int getResult() {
		return result;
	}

	public int getLastBuildDate() {
		return lastBuildDate;
	}

}
