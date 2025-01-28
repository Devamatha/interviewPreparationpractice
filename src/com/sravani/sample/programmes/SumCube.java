package com.sravani.sample.programmes;

import java.util.Scanner;

public class SumCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a=sc.nextInt();
		int b=a*a;
		int c=a*a*a;
		System.out.println("sum of square and cube of a given number"+(b+c));
	}

}
