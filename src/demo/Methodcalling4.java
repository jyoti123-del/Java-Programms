package demo;

import newpackage.Methodcalling;

public class Methodcalling4 {
	
	void V1() {
		Methodcalling.M1();//public static method
		Methodcalling n=new Methodcalling();
		n.M2();
		//Methodcalling.M3(); protected method cannot used without inheritance
		//n.M5(); default method is not accessible
		//Methodcalling.M6(); default static method cannot be called 
	}
	
	

	public static void main(String[] args) {
		Methodcalling4 b=new Methodcalling4();
		b.V1();
			

	}

}
