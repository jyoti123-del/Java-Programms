package demo;

public class Function_5 {

	public static int M1(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[]args) {
		System.out.println("hi");
		M1(10,20);
		int d=2;
		int f=M1(20,30)/d;
		int e=M1(20,40)/d;
		System.out.println(f);
		System.out.println(e);
		Function_4 n=new Function_4();// calling static method from another class
		n.addition2();
		Function_4 r=new Function_4();// calling non static method from another class
		r.addition();
		Function_8 l=new Function_8();
		l.J2(5, 10);
		System.out.println((l.J2(5, 10))*2);// calling from Function_8 class
		Function_10 g=new Function_10();// calling from Function_10 class, non static
		g.B2();
	}

}