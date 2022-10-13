package javaprogram;

public class Reversestr {
	public static void main(String[] arg) {
		String s = "i am atul";
		String str = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				str = str + ch[i];
			} else {
				for (int j = str.length(); j > 0; j--) {
					System.out.print(str.charAt(j - 1));
				}
				System.out.print(" ");
				str = " ";
			        }

		}
		for (int j = str.length(); j > 0; j--) {
			System.out.print(str.charAt(j - 1));
		}
	}
}
/*
 * 1) Read the string using scanner object scan.nextLine() and store it in the
 * variable str. We are converting the string into the char array using the
 * string class method toChatArray(), and initialized to char[] ch.
 * 
 * 2) The 1st for loop iterates from i=0 to i< length of the array.
 * 
 * a) If ch[i]!=’ ‘ then adding ch[0] to the string word. If block adds the
 * characters to the string word until we will get space i.e. word contains the
 * 1st word.
 * 
 * b) If we get space then the else block to reverse the word which is read
 * using else block.
 * 
 * 3) 2nd for loop reverse the last word which is read by else block.
 */