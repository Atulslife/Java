package javaprogram;

import java.util.Scanner;

public class Business {
	int rno;
	String sname;
	Scanner sc = new Scanner(System.in);
	void accept() {
		System.out.println("enter rno");
		rno = sc.nextInt();
		System.out.println("enter name");
		sname = sc.next();
	}
	void display() {
		System.out.println("rno is " + rno);
		System.out.println("name is " + sname);
	}
}