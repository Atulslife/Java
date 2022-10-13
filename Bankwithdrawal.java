package javaprogram;

import java.util.Scanner;

public class Bankwithdrawal {
	Scanner sc = new Scanner(System.in);
	int bal = 50000, deposit, with;
	char ch;

	/*
	 * void choice() { System.out.
	 * println("Enter 'D' for deposit,'W' for withdraw and 'B' for Balance--");
	 * ch=sc.next().charAt(0);
	 */

	void deposit() {
		System.out.println("Enter deposit amount --");
		deposit = sc.nextInt();
		bal = bal + deposit;
		System.out.println("Your Balance after deposite --" + bal);
	}

	void withdrawal() {
		System.out.println("Enter amount for withdrawal--");
		with = sc.nextInt();
		if (with > bal) {
			System.out.println("You don't have sufficient amount to withdraw--");
		} else {
			bal = bal - with;
			System.out.println("You have withdraw --" + with);
			System.out.println("Your balance is --" + bal);
		}
	}

	void checkbalance() {
		System.out.println("Balance --" + bal);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bankwithdrawal obj = new Bankwithdrawal();
		System.out.println("Enter 'D' for deposit,'W' for withdraw and 'B' for Balance--");
		char ch = sc.next().charAt(0);

		// obj.choice();
		if (ch == 'd')
			obj.deposit();
		else if (ch == 'w')
			obj.withdrawal();
		else
			obj.checkbalance();

	}
}