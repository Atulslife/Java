package javaprogram;

import java.util.Scanner;

public class MultiArrayMutip {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int sum,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element for First Array-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Element for Second Array-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Start multiply of Array-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{  sum=0;
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[k][j];
					c[i][j]=sum;
				}
				}
			}
		System.out.println("Multiplication Result of Array-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
