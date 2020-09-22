package com.IITWorkforce.Programs;

import java.util.Calendar;
import java.util.Random;

public class RandomSixDigitAlphaNumeric {

	public static void main(String[] args) {
		//generating random number 
		long time = Calendar.getInstance().getTimeInMillis();
		System.out.println(time);
		//generating six digit number
		long number = time%1000000;
		System.out.println(number);
		Random n = new Random();
		 int num= 97 + n.nextInt(26);
		 char c = (char)num;
		 String alphanumeric = number +"" + c;
		 System.out.println(alphanumeric);
		
		

	}

}
