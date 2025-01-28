package com.sravani.sample.programmes.ifconditions;

import java.util.Scanner;

public class CreditCardBills {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter total credit card amount");
		double bill = sc.nextDouble();
		System.out.println("Enter paid amount");
		double paid = sc.nextDouble();
		double fifty = (50.0 / 100) * bill;
		if (fifty == paid ) {
			System.out.println("200 cash back");
		} else {
			System.out.println("you are not paid 50 of bill");
		}
	}
}
