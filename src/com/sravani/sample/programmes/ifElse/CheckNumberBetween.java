package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class CheckNumberBetween {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int a = sc.nextInt();
		if (a >= 30 && a <= 50) {
			System.out.println("given number is inbetween 30 and 50");
		} else {
			System.out.println("its not a in between");
		}
	}

}
