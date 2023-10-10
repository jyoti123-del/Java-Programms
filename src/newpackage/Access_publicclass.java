package newpackage;

public class Access_publicclass {
	
   int a=10;// default type variable.it is accessible directly in same class and same package by creating object of class
	 static int b=20; // can be access trough out class directly
	private int c=30;// accessibility is limited to same class only,can't access in another class
	public static int d=40;//accessible throughout the class,project or package,needs to create object
	protected static  int e=50;//scope remain within the package, and can be called in other class by inheritance only without creating object
   protected int x=10;
	
	private void addition(int c,int b) {
		int a= c+b;
		System.out.println("value of addition is "+a);
	}
	public void substraction(int a,int b) {
		int c=a-b;
		System.out.println("the result of substraction is "+c);
		
	}
	  void multiplication(int a,int b) {
		int c=a*b;
		System.out.println("the value of multiplication is "+c);
		
	}
	protected static void display() {System.out.println("i am protected static display method");
		
	}
	protected void display2() {System.out.println("i m protected non static method");}

	public static void main(String[] args) {
		Access_publicclass u=new Access_publicclass();
		u.addition(10, 20);
		u.substraction(20, 10);
		u.multiplication(10, 20);// default method,needs to create object
		display(); // protected static method,directly called in same class, inheritance to another class
		u.display2();
		System.out.println(u.a);//default variable needs to create object
		System.out.println(b);// static variable, no need of object
		System.out.println(e);// protected static can be called directly in same class needs to create object if wants to call in another class by inheritance only
		System.out.println(u.c);// private,scope is limited for class only needs to create object
		System.out.println(d);// public scope is throughout project,needs to create object for same class also
		System.out.println(u.x);// protected non-static
		
		
		
		

	}

}
