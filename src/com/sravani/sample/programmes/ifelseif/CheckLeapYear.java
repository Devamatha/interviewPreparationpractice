package com.sravani.sample.programmes.ifelseif;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a year");
		int a = sc.nextInt();

		if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
			System.out.println("its a leap year");
		} else {
			System.out.println("its a not a leap year");
		}
	}

}
