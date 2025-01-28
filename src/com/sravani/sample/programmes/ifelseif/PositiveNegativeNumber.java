package com.sravani.sample.programmes.ifelseif;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("its a positive number");
		} else if (a == 0) {
			System.out.println("its a zero");
		} else {
			System.out.println("its a negative number");
		}
	}

}
