package javaprogram;

public class InstanceBlock {
	int a, b;
	public static void main(String arg[]) {
		InstanceBlock n=new InstanceBlock();
	}
	static { // static block
		System.out.println("atul");
	}

	InstanceBlock() { // constructor
		a = 30;
		b = 40;
		System.out.println(a + " " + b);
	}

	{ // instance block
		a = 10;
		b = 20;
		System.out.println(a + " " + b);
	}

	
	}