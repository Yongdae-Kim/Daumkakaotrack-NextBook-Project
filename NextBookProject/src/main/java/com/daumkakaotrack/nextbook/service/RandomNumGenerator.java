package com.daumkakaotrack.nextbook.service;

import java.util.Random;

public class RandomNumGenerator {

	private int range;

	public RandomNumGenerator(int range) {
		this.range = range;
	}

	public int createNum() {
		Random random = new Random();
		return random.nextInt(range);
	}
}
