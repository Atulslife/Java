package javaprogram;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 2, 5, 12, 8, 11 };
		int temp = 0;
		/*for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(" " + array[i] + " ");
		}*/
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
		System.out.print(" " + array[i]+ " ");
	}
	}
}
