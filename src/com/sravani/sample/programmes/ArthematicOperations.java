package com.sravani.sample.programmes;

import java.util.Scanner;

public class ArthematicOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

}
