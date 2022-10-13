package javaprogram;

public class Primenumber {
	public static void main(String[] args)
	    {
	        int n1=13, n2=10,c=0; 
	            if (n1==0||n1==1)
	            {
	        System.out.println("Number is not Prime");
	            }
	    
	        else {
	            for (int i=2;i<n2;i++)
	            {
	                if (n1%i==0)
	                {
	                    System.out.println("Number is not Prime");
	                    c=1;
	                    break;
	                }
	            }
	        }
	        
	   if  (c==0)
	  {
	    System.out.println("Number is  Prime");
	  }
	    }
	        
	    }