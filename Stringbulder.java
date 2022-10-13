package javaprogram;

public class Stringbulder {
	public static void main(String arg[]) {
		String s="atul kumar";
		StringBuilder str=new StringBuilder(s);
		System.out.println(str.reverse());
		System.out.println(str.capacity());
		System.out.println(s.concat(" mishra"));
	}

}
