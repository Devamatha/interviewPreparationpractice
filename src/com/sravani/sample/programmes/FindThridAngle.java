package com.sravani.sample.programmes;

import java.util.Scanner;

public class FindThridAngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter angles numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=180-(a+b);
		System.out.println(c);
	}

}
