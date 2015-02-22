package com.daumkakaotrack.nextbook.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class MailingService {
	public static ClientResponse sendResetPasswordMessage(String email,
			String resetPassword) {
		Client client = Client.create();
		client.addFilter(new HTTPBasicAuthFilter("api",
				"key-aa8c662d787d406903daf435173d544e"));
		WebResource webResource = client
				.resource("https://api.mailgun.net/v2/sandboxc16709d018a843b4a14f8b48a309b757.mailgun.org/messages");
		MultivaluedMapImpl formData = new MultivaluedMapImpl();
		formData.add("from", "nextbook<noreply@nextbook.com>");
		formData.add("to", email);
		formData.add("subject", "Nextbook Password reset");
		formData.add("text", "Your temporary password is \n" + resetPassword);
		return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).post(
				ClientResponse.class, formData);
	}
}
