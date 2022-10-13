package javaprogram;

public class ShortAddress {

	public static void main(String[] args) {
		String add="H.No.-709 , Professor Colony Suhagi Adhartal , Jabalpur (M.P.)";
		String num="",cap="",smol="",special="",spac="";
		int c=0,s=0,spl=0,n=0,sp=0;
		for(int i=0;i<add.length();i++) {
			if(add.charAt(i)>='A' && add.charAt(i)<='Z') {
				cap=cap+add.charAt(i);
				c++;
			}else if(add.charAt(i)>='a' && add.charAt(i)<='z') {
				smol=smol+add.charAt(i);
				s++;
			}else if(add.charAt(i)>='0' && add.charAt(i)<='9') {
				num=num+add.charAt(i);
				n++;
			}else if(add.charAt(i)>=' ') {
				spac=spac+add.charAt(i);
				sp++;
			}else {
				special=special+add.charAt(i);
				spl++;
			}
			
		}
		System.out.println("Capital Words are-->"+cap+"Total Num--> "+c);
		System.out.println("Small Words are-->"+smol+"Total Num--> "+s);
		System.out.println("Numbers are-->"+num+"Total Num--> "+n);
		System.out.println("Space are-->"+spac+"Total Num--> "+sp);
		System.out.println("Special Characters are-->"+special+"Total Num--> "+spl);
	}

}
