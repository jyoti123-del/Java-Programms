package Oopsconcept;

public class Inheritance2 extends Inheritance1 {
	int a=100;
	 int b=200;
	public static void main(String[] args) {
		int a=34;
		 int b=44;
		
		Inheritance2 x=new Inheritance2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x.d);
		System.out.println(e);
		System.out.println(x.f);
		//System.out.println(a);
		//System.out.println(b);
		x.X1();
		}
	
	public void X1() {
	System.out.println(super.a);
	System.out.println(Inheritance1.b);
	System.out.println(this.a);
	System.out.println(this.b);
	
	
	}

}
