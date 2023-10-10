package demo;

public class Staticvariable1 {
   static int a=15;
   static int b=25;
  public static int c=35;
 public  int x=101;
  private int y=201;
    protected int z=301;
	public static void main(String[] args) {
		int a=55;// local variables
		int b=65;
		int c=75;
		Staticvariable1 f=new Staticvariable1();
		System.out.println("these are nonstatic global variable");
		System.out.println(f.x);
		System.out.println(f.y);
		System.out.println(f.z);
		System.out.println(); 
		System.out.println("These are local variables");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println("these are static global variable");
		System.out.println(Staticvariable1.a);
		System.out.println(Staticvariable1.b);
		System.out.println(Staticvariable1.c);
	}
	public void X1() {
		System.out.println("i am a public method of parent class");
	}

	

}
