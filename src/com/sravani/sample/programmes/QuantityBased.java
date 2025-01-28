package com.sravani.sample.programmes;

import java.util.Scanner;

public class QuantityBased {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter Dazen banana cost ");
		double a = sc.nextDouble();
		System.out.println("Enter How many bananas You want to buy and total cost of banana");
		int b = sc.nextInt();
		Double c = (a / 12)*b;
		
		System.out.println(c);
	}

}
