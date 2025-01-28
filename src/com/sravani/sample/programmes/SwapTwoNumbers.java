package com.sravani.sample.programmes;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		b = a;
		a = b + 10;
		System.out.println("value of a is" + a);
		System.out.println("value of b is" + b);
	}

}
