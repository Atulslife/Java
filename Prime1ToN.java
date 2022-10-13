package javaprogram;

import java.util.Scanner;

public class Prime1ToN {

	public static void main(String[] args) {
		int i,n,counter,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number from 1 to  ");
		n=sc.nextInt();
		System.out.println("Prime Number between 1 to "+n+" are");
		for(j=2;j<=n;j++) {
			counter=0;
			for(i=1;i<=j;i++) {
				if(j%i==0) {
					counter++;
				}
			}
			if(counter==2)
				System.out.print(j+" ");
		}
	}

}
