package javaprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,sum =1;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Number for factorial");
			num=s.nextInt();
		}
		for(int i=1;i<=num;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}

}