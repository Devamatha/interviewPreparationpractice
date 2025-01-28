package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a age of the person");
		int a = sc.nextInt();
		if(a>=18) {
			System.out.println("eligible for the vote");
		}else {
			System.out.println("not eligible for the vote");
		}
	}

}
