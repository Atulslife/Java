package javaprogram;

public class ExampleClass {
	int x = 10,y;

	  public static void main(String[] args) {
		  ExampleClass myObj = new ExampleClass();
	    myObj.x = 25; 
	    myObj.x = 250;
	   myObj.y = myObj.x; 
	    System.out.println(myObj.x);
	    //System.out.println(myObj.y);
	}

}
