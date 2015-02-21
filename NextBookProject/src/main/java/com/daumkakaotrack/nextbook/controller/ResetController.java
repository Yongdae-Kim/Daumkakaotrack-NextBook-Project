package com.daumkakaotrack.nextbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.repository.UserDAOImpl;
import com.daumkakaotrack.nextbook.service.MailingService;
import com.daumkakaotrack.nextbook.service.ResetPasswordGenerator;

@Controller
public class ResetController {

	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public ModelAndView reset() {
		ModelAndView model = new ModelAndView();
		model.setViewName("reset");
		return model;
	}

	@RequestMapping(value = "/resetSubmit", method = RequestMethod.POST)
	public ModelAndView send(@RequestParam("username") String username) {

		ModelAndView model = new ModelAndView();

		String msg = "";

		UserDAOImpl userDAOImpl = new UserDAOImpl();

		if (!userDAOImpl.isExistedUsername(username)) {
			msg = "there wasn't an account for that email";
		} else {
			String resetPassword = new ResetPasswordGenerator()
					.createResetPassword();
			MailingService.sendResetPasswordMessage(username, resetPassword);

			userDAOImpl.updateUserPassword(username, resetPassword);

			msg = "temporary password was sent to email";
		}

		model.addObject("msg", msg);
		model.setViewName("reset");

		return model;
	}
}
