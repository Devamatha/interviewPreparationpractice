package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("a is big");
		} else if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("b is big");
		}
	}

}
