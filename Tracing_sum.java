package simplesum;

public class Tracing_sum {
	static int i=12;
	static int j=test();
	static {
		System.out.println("static block 1"+i+"   "+j);
		i=test();
		int j=14;
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		System.out.println("this is main"+(i+j));
		int p=test();
		i=50;
		System.out.println(i+j+p);
		
	}
   public static int test() {
	 i=24;
	 System.out.println("from test method"+(i+j));
	 return i+j;
 }
   static {
	   System.out.println("this is static block 2"+(i+j));
	   int i=40;
	   System.out.println(i+j);
   }
}

