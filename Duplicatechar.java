package javaprogram;

public class Duplicatechar {
	public static void main(String[] args) {
		String str = "maheshbabu";

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			boolean f = true;
			for (int k = 0; k < i; k++) {
				if (str.charAt(i) == str.charAt(k)) {
					f = false;
					break;
				}
			}
			if (f) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				System.out.println(str.charAt(i) + "  " + count);
			}

		}
	}

}
