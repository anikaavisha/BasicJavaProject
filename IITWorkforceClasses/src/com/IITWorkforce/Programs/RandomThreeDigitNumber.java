package com.IITWorkforce.Programs;

import java.util.Random;

public class RandomThreeDigitNumber {

	public static void main(String[] args) {
		Random number = new Random();
		int n = 100+number.nextInt(900);
		System.out.println(n);

	}

}
