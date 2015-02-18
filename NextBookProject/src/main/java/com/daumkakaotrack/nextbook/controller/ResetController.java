package com.daumkakaotrack.nextbook.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daumkakaotrack.nextbook.service.MailingService;

@Controller
public class ResetController {

	@RequestMapping(value = "/resetSubmit", method = RequestMethod.POST)
	public String send(Locale locale, Model model) {
		MailingService.sendResetPasswordMessage();
		return "login";
	}

	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String reset(Locale locale, Model model) {
		return "reset";
	}
}
