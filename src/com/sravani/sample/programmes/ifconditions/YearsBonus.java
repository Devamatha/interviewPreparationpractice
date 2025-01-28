package com.sravani.sample.programmes.ifconditions;

import java.util.Scanner;

public class YearsBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please a years experince");
		int a=sc.nextInt();
		if(a>5) {
			System.out.println("please enter a salary");
			double b=sc.nextInt();
			double c=(20.0/100)*b;
			b=c+b;
			System.out.println(b);
		}else {
			System.out.println("5 years need ex");
		}
	}
}
