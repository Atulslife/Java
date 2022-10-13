package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodSortEqualCopyOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int b[] = new int[a.length];
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("First Array-"+a[i] + " ");
			b[i]=a[i];
			System.out.println("Second Array-"+b[i] + " ");
		}
		boolean c=Arrays.equals(a,b);
		System.out.println(c);
		int d[]=Arrays.copyOf(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Third Array-"+d[i] + " ");
		}
	}

}
