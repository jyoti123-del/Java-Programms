package newpackage;

public class Access_modifier2 extends Access_publicclass {

	public static void main(String[] args) {
		Access_publicclass n=new Access_publicclass();
		//n.addition(10,20);// private method can't access by inheritance also 
		System.out.println(n.a);// public variable can be access by creating object
       System.out.println(b);// static integer directly accessed by inheritance
       System.out.println(e);// protected static integer can be called by inheritance
       display();// protected static called directly by inheritance
       n.multiplication(10, 20);// default method,can be inherited in child class only
       n.substraction(20, 10);// public method needs to create object
       System.out.println();
       System.out.println(n.x);// protected non-static variable
		n.display2();
	}

}
