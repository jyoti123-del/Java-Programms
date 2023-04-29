package Oopsconcept;

public class Inheritance4 extends Inheritance3{
  static void T1() {System.out.println("i m in static child class");}
	void T4(){System.out.println("i am nonstatic child class");}
	
	
	public static void main(String[] args) {
		Inheritance4 x=new Inheritance4();
		V1();
		x.V2();
		V3();
		x.V4();
		x.V5();
		V6();
		T1();
		x.T4();

	}

}
