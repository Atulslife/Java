package javaprogram;

import java.util.Scanner;

public class IndexPrint {

	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row");
		r=sc.nextInt();
		System.out.println("Enter size of Coloumn");
		c=sc.nextInt();

		int arr[][]=new int[r][c];

		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{
		System.out.println("Enter Element for"+i+j+"index");
		arr[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{
		System.out.print(" "+arr[i][j]+" ");

		}
		System.out.println();
		}
	}

}
