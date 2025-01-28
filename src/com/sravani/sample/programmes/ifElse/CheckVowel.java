package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a letter");
		String a = sc.next();
		char name = a.charAt(0);

		if (name == 'a' || name == 'e' || name == 'i' || name == 'o' || name == 'u') {
			System.out.println("its a vowel");
		} else {
			System.out.println("its not a  vowel");
		}
	}

}
