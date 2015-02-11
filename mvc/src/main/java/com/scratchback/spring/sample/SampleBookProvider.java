package com.scratchback.spring.sample;

import java.util.ArrayList;
import java.util.List;

public class SampleBookProvider {
	private List<Book> books;

	public SampleBookProvider() {

		books = new ArrayList<Book>();

		books.add(new Book("개발자가 반드시 배워야할 객체지향과 디자인패턴", "최범균 저",
				"resources/img/samplebook/1.jpg"));
		books.add(new Book("Clean Code 클린코드", "로버트 C. 마틴 저/박재호,이해영 공역",
				"resources/img/samplebook/2.jpg"));
		books.add(new Book("리팩토링", "마틴 파울러/김지원 역",
				"resources/img/samplebook/3.jpg"));
		books.add(new Book("토비의 스프링 3.1세트", "이일민 저",
				"resources/img/samplebook/4.jpg"));

	}

	public List<Book> getBooks() {
		return books;
	}

}
