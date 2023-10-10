package demo;

public class Staticvariable2 extends Staticvariable1{
       static int a=10;
       static int b=20;
      static int c=30;
      double x=1.1;
      double y=2.2;
      double z=3.3;
	 public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		System.out.println("local variable a :"+a);
		System.out.println("localvarible b: "+b);
		System.out.println("local variable c: "+c);
		Staticvariable1 s=new Staticvariable1();
		Staticvariable2 u=new Staticvariable2();
		System.out.println();
		System.out.println("non static varibale from parent class: "+s.x);
		System.out.println("non static variable from same/child class: "+u.x);
		System.out.println();
		System.out.println("we are in method M1");
		M1();System.out.println();
		u.M2();
		
	 }
		public void X1() {System.out.println("in a child class");
			
		}
		
	
		public static void M1() {
			
		 int d=1;
		Staticvariable1 n=new Staticvariable1();
		Staticvariable2 m=new Staticvariable2();
		System.out.println(a);// same class/child class
		System.out.println(Staticvariable1.a);// parent class,static variable
		System.out.println(n.x);// parent class non-static variable
		System.out.println(m.x);// child class non-static
		System.out.println(d);
		}
		public void M2() {
			Staticvariable1 g=new Staticvariable1();
			Staticvariable2 h=new Staticvariable2();
			System.out.println(this.a); // global static variable,child class
			System.out.println(super.a); // global static variable ,parent class
			System.out.println(this.x);// global non-static variable,child class
			System.out.println(super.x);// global non-static variable,parent class
			System.out.println("protected  nonstatic varible of parent class: "+g.z);// calling non-static variable by creating object// protected variable
			System.out.println(h.x);//calling non-static variable by creating object
			super.X1();
			this.X1();// 
		}	
		
}


	


