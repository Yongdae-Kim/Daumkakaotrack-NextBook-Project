package com.daumkakaotrack.nextbook.service;

import java.util.ArrayList;
import java.util.List;

import com.daumkakaotrack.nextbook.model.TodayBook;

public class TodayBooksService {
	private List<TodayBook> todayBooks;

	public TodayBooksService() {

		todayBooks = new ArrayList<TodayBook>();

		todayBooks.add(new TodayBook("개발자가 반드시 배워야할 객체지향과 디자인패턴", "최범균 저",
				"resources/img/samplebook/1.jpg"));
		todayBooks.add(new TodayBook("Clean Code 클린코드",
				"로버트 C. 마틴 저/박재호,이해영 공역", "resources/img/samplebook/2.jpg"));
		todayBooks.add(new TodayBook("리팩토링", "마틴 파울러/김지원 역",
				"resources/img/samplebook/3.jpg"));
		todayBooks.add(new TodayBook("토비의 스프링 3.1세트", "이일민 저",
				"resources/img/samplebook/4.jpg"));
	}

	public List<TodayBook> getTodayBooks() {
		return todayBooks;
	}

}
