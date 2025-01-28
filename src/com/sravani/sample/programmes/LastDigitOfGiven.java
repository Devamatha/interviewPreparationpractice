package com.sravani.sample.programmes;

import java.util.Scanner;

public class LastDigitOfGiven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter  numbers");
		int a=sc.nextInt();
		int b=a%10;
		System.out.println(b);
	}

	
}
