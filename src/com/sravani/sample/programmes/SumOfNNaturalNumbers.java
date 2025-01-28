package com.sravani.sample.programmes;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a=sc.nextInt();
		int n=(a*(a+1))/2;
		System.out.println(n);
	}

}
