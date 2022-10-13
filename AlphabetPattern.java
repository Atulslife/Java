package javaprogram;

public class AlphabetPattern {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j));
			}
			System.out.println();
		}
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print((char) (alpha + j));
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" "+(char) (alpha + k));
			}
			System.out.println();
		}
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(" "+(char) (alpha + k));
			}
			System.out.println();
		}

	}

}
