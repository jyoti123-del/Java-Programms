package demo;

public class Function_2 {
	static int f=70;
	public void demo() {
		int a=1;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void demo2()
	{
	
		int c=10;
		 int d=20;
		System.out.println(c);
		System.out.println("hello all");
		System.out.println(c*d);
	}
	public static void main(String[] args) {
		int f=67;
		System.out.println(f);
		System.out.println(Function_2.f);
		System.out.println("Hello call demo");
		Function_2 a=new Function_2();
		Function_1.demo2();
		a.demo();
		demo2();
	
	}

}
