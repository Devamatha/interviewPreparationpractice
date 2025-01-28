package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("its a even number");
		} else {
			System.out.println("its a odd number");
		}
	}

}
