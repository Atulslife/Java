package javaprogram;

public class Fibonacci {
	public static void main(String[] args)
	    {
			int first=0,second=1,sum=0,f=10;
			System.out.print(first+" "+second);
			for(int i=2;i<f;i++) {
				sum=first+second;
				System.out.print(" "+sum+" ");
				first=second;
				second=sum;
			}
		
			
	       /* int n1=0, n2=1,n3=0,c=15; 
	        System.out.print(n1+" "+n2+" ");
	        for (int i=2;i<c;i++)
	        {
	            n3=n2+n1;
	            System.out.print(" "+n3+" ");
	        
	            n1=n2;
	            n2=n3;
	        }*/
	    }
	}