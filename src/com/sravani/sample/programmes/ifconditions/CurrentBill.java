package com.sravani.sample.programmes.ifconditions;

import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the current bill");
		double a = sc.nextDouble();
		if (a > 5000) {
			double discount = (15.0/100)*a;
			System.out.println(discount);
			a = a - discount;
			System.out.println("total current bill need to pay" + a);
		}else {
			System.out.println("current bill is not above 5000 ");
		}
	}

}
