package com.sravani.sample.programmes.ifElse;

import java.util.Scanner;

public class LoginCredentials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a userName");
		String userName = sc.next();
		System.out.println("please enter a password");
		String Password=sc.next();
		String username = "sravani";
		String password = "1234";
		if(userName.equals(username)&& Password.equals(password) ) {
			System.out.println("Login Credentials are correct");
		}else {
			System.out.println("invalid credentials");
		}
	}

}
