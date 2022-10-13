package javaprogram;

public class StringCompare {

	public static void main(String[] args) {
		String s="atul";
		//String s2="atul";
		String s3="kumar";
		
		System.out.println(s.concat(s3));
		String s1=new String("atul");
		System.out.print(s.equals(s1));
		if(s==s1) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
	}

}
