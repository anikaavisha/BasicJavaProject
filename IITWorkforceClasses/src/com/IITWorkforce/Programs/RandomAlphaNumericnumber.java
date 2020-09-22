package com.IITWorkforce.Programs;

import java.util.Calendar;
import java.util.Random;

public class RandomAlphaNumericnumber {

	public static void main(String[] args) {
		int c = 65;
		//each charcter has a decimal value and it starts from 65 i.e decimal value of A is 65
		char p = (char)c;
		//printing charcter value of 65
		System.out.println(p);
		//since this will generate time in Millisecond which will change in each run
		System.out.println(Calendar.getInstance().getTimeInMillis());
		//inorder to generate random numberic value
		Random n = new Random();
		//decimal value of AtoZ is 65 to 90
		int num = 65 + n.nextInt(26);
		System.out.println(num);
		//converting number to charcter
		char alpha = (char)num;
		System.out.println(alpha);
		//Random time in mill sec with modulus of 10000 will give 4 digit number and then alph by using concatination
		System.out.println(Calendar.getInstance().getTimeInMillis()%10000+""+alpha);

	}

}
