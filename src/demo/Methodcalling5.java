package demo;

import newpackage.Methodcalling;

public class Methodcalling5 extends Methodcalling {

	public static void main(String[] args) {
		M1();// all static method should access in static way(public,static,protected,private)
		M3();
		//M6();default static method
		//M7();private method
		Methodcalling n=new Methodcalling(); //all non-static method should be accessible in non-static way/by object
		n.M2();
		Methodcalling5 v=new Methodcalling5();
        v.M4();// protected non_static method....object should be created with child class name
       // n.M5();default non-static method
       // n.M8();private method

	}

}
