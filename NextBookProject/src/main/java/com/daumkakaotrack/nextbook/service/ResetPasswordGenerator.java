package com.daumkakaotrack.nextbook.service;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ResetPasswordGenerator {
	private SecureRandom random = new SecureRandom();

	public String createResetPassword() {
		return new BigInteger(130, random).toString(32);
	}
}
