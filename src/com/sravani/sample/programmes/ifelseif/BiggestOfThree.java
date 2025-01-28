package com.sravani.sample.programmes.ifelseif;

import java.util.Scanner;

public class BiggestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a >= c) {
			System.out.println("a is bigg");
		} else if (b >= a && b >= c) {
			System.out.println("b is big");
		} else {
			System.out.println("c is bigg");
		}
	}
}
