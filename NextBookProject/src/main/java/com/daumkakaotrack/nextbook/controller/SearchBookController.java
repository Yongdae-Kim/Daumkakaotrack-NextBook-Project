package com.daumkakaotrack.nextbook.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.model.BookChannel;
import com.daumkakaotrack.nextbook.model.Book;
import com.daumkakaotrack.nextbook.service.AuthenticationService;
import com.daumkakaotrack.nextbook.service.RestTemplateService;

@Controller
public class SearchBookController {
	@Autowired
	BookDAO bookDAO;

	@Resource(name = "restTemplateService")
	protected RestTemplateService restTemplateService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchBook(
			@RequestParam(value = "keyword", required = false, defaultValue = "KOREA") String keyword,
			@RequestParam(value = "pageno", required = false, defaultValue = "1") String pageno,
			@RequestParam(value = "index", required = false) String index)
			throws IOException, JAXBException {

		ModelAndView model = new ModelAndView();

		Source searchResult = getDaumSearchResult(keyword, pageno);
		BookChannel bookChannel = createBookChannel(searchResult);

		String msg = "";

		if (index != null) {

			int idx = Integer.parseInt(index);
			Book book = bookChannel.getItemList().get(idx);
			String isbn = book.getIsbn13();

			String username = new AuthenticationService().getSessionId();

			if (!bookDAO.alreadyHasBook(isbn)) {
				bookDAO.insertBook(book);
			}

			if (!bookDAO.alreadyHasReadBook(username, isbn)) {
				bookDAO.insertReadBook(
						new AuthenticationService().getSessionId(),
						book.getIsbn13());
				msg = "complete add to " + book.getTitle();
			} else {
				msg = "The book has already been registered.";
			}
		}

		model.addObject("msg", msg);
		model.addObject("key", "28c5d2b249131043710ea8bcb4776563");
		model.addObject("query", keyword);
		model.addObject("pageno", pageno);
		model.addObject("totalCount", bookChannel.getTotalCount());
		model.addObject("bookList", bookChannel.getItemList());
		model.setViewName("search");

		return model;
	}

	private Source getDaumSearchResult(String keyword, String pageno) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("key", "28c5d2b249131043710ea8bcb4776563");
		params.put("query", keyword);
		params.put("pageno", pageno);

		String url = "http://apis.daum.net/search/book?apikey={key}&q={query}&pageno={pageno}";
		Source searchResult = restTemplateService.getRestDataXml(url,
				StreamSource.class, params);
		return searchResult;
	}

	private BookChannel createBookChannel(Source searchResult)
			throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(BookChannel.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		BookChannel bookChannel = (BookChannel) unmarshaller
				.unmarshal(searchResult);
		return bookChannel;
	}

}
