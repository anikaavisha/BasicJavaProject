package com.IITWorkforce.Programs;

import java.util.Random;

public class RandomNumberTwoDigit {

	public static void main(String[] args) {
		Random number = new Random();
		//for generating two digit number and in this 90 will not be included so it won't go 3 digits
		int n = 10 +number.nextInt(90);
		System.out.println(n);
		
	}

}
