package com.sravani.sample.programmes.formatting;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter a single word");
			String number = sc.next();
			System.out.println("Entered text value is " + number.charAt(0));
		} catch (Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

}
