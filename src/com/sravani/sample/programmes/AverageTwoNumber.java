package com.sravani.sample.programmes;

import java.util.Scanner;

public class AverageTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("average of two numbers is "+(b+a)/2);
	}

}
