package com.scratchback.spring.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scratchback.spring.sample.Book;
import com.scratchback.spring.sample.SampleBookProvider;
import com.scratchback.spring.service.Sample;
import com.scratchback.spring.test.Dummy;

@Controller
public class HomeController {

	@Autowired
	private Sample sample;

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		// autowired var
		String test = sample.getSampleString("fighting");

		// sample dummy setter
		Dummy dummy = new Dummy();
		dummy.setA("zzzzzzzzzzzzzzzzz");

		SampleBookProvider provider = new SampleBookProvider();
		List<Book> sampleBooks = provider.getBooks();

		model.addAttribute("sampleBooks", sampleBooks);
		model.addAttribute("test", test);
		model.addAttribute("dummy", dummy);

		return "index";
	}

}
