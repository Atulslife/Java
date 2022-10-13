package javaprogram;

public class ASort {
	public static void main(String[] args) {
		int temp, i;
		int b[] = { 10, 2, 30, 6 };
		for (i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
			// System.out.println(b[i]);
		}
		System.out.println(b[i - 1]);
	}

}
