package simplesum;

public class SimpleStatic {
	static 
	{
	System.out.println("this is static block");	
	}
	public static void main(String[] args) {
	System.out.println("this is main method");
	}
	static {
		System.out.println("this is static block 2");
	}
	static {
		System.out.println("this is final method for static");
	}
}
