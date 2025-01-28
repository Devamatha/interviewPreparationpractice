package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class CheckGivenN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		char a = sc.next().charAt(0);
		if ((a >= 'A' && a <= 'Z') || (a <= 'z' && a >= 'a')) {
			System.out.println("its a alaphabet");
		} else {
			System.out.println("its a number");
		}
	}

}
