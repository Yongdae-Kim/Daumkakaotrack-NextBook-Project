package com.daumkakaotrack.nextbook.model;

import javax.validation.constraints.Size;

public class User {

	String username;
	@Size(min = 5, max = 50)
	String password;
	@Size(min = 5, max = 50)
	String confirmPassword;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public boolean isMatchedPassword() {
		return this.password.equals(this.confirmPassword);
	}
}
