package javaprogram;

public class Pallindrom {
	public static void main(String[] args) {

		String s = "123321", s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println("Pallendrom");
		} else
			System.out.println("not Pallendrom");

	}
}
