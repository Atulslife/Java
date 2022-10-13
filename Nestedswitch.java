package javaprogram;

import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {
		int id=500;
		int pwd=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID number--");
		id=sc.nextInt();
		switch(id) {
		case 500:
			System.out.println("Enter your Password PIN--");
			pwd=sc.nextInt();
			{
				switch(pwd) {
				case 123:
					System.out.print("Welcome Dear Programmer\n");
					break;
					default:
						System.out.print("incorrect password");
						break;
			}
			}
		break;
		default :
			System.out.println("Invalid ID..");
		break;
	}

}}
