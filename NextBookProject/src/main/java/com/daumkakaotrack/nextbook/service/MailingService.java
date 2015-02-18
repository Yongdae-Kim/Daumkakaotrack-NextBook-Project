package com.daumkakaotrack.nextbook.service;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

@Service
public class MailingService {
	public static ClientResponse sendResetPasswordMessage() {
		Client client = Client.create();
		client.addFilter(new HTTPBasicAuthFilter("api",
				"key-aa8c662d787d406903daf435173d544e"));
		WebResource webResource = client
				.resource("https://api.mailgun.net/v2/sandboxc16709d018a843b4a14f8b48a309b757.mailgun.org/messages");
		MultivaluedMapImpl formData = new MultivaluedMapImpl();
		formData.add(
				"from",
				"Mailgun Sandbox <postmaster@sandboxc16709d018a843b4a14f8b48a309b757.mailgun.org>");
		formData.add("to", "Scatchback <yongdae91@hanmail.net>");
		formData.add("subject", "Hello Scatchback");
		formData.add(
				"text",
				"Congratulations Scatchback, you just sent an email with Mailgun!  You are truly awesome!  You can see a record of this email in your logs: https://mailgun.com/cp/log .  You can send up to 300 emails/day from this sandbox server.  Next, you should add your own domain so you can send 10,000 emails/month for free.");
		return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).post(
				ClientResponse.class, formData);
	}
}
