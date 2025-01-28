package com.sravani.sample.programmes;

import java.util.Scanner;

public class YearCaluculations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Days numbers");
		int days = sc.nextInt();
		int year = days / 365;
		int weeks = (days - (year * 365)) / 7;
		int day = days - ((year * 365) + (weeks * 7));
		System.out.println(day+"day"+weeks+"weeks"+year+"years");

	}

}
