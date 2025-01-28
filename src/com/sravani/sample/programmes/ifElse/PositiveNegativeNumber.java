package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("its a positive number");
		} else {
			System.out.println("its a negative number");
		}
	}

}
