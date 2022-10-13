package javaprogram;

import java.util.Scanner;

public class Methods {
	
	static void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r=sc.nextInt();
		double sum=3.14*r*r;
		System.out.println("Area of circle is--"+sum);
	}
	static void areaS()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square");
		int r=sc.nextInt();
		double sum=r*r;
		System.out.println("Area of circle is--"+sum);
	}
public static void main(String arg[])
{
	
	area();
	areaS();
}
}