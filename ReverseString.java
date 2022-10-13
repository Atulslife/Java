package javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		String s = "I am atul";
		String str="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i] !=' ') {
				str=str+ch[i];
			}else {
				for(int j=str.length();j>0;j--) {
					System.out.print(str.charAt(j-1));
				}
				System.out.print(" ");
				str="";
			}
			}
		for(int j=str.length();j>0;j--) {
			System.out.print(str.charAt(j-1));
		}
	}
}