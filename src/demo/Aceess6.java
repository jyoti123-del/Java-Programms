package demo;

import newpackage.Access3;
import newpackage.Access_publicclass;

public class Aceess6 extends Access_publicclass{

	public static void main(String[] args) {
		Access_publicclass s=new Access_publicclass();
		//System.out.println(s.a);//default variable
		System.out.println(s.d);// public variable,accessible
		System.out.println(Access_publicclass.e);// protected static can be called by using class name, static can not be called 
		//System.out.println(Access_publicclass.b);// static can not be called by creating object 
		Access_publicclass.display();//  static protected method
		//System.out.println(s.c); private can't be access
		System.out.println();
		//s.addition(10,20); private method
		s.substraction(20,10); // public method
		//s.multiplication(10, 5); default method
		Aceess6 v=new Aceess6();
		System.out.println(v.x);// object should be created with child class for accessing protected non-static variable of parent class
		
      
	}

}
