package Oopsconcept;

public class Inheritance3 {

public static void V1() {System.out.println("I am public static method");}
public void V2() {System.out.println("I am nonstatic public method");}
protected static void V3(){System.out.println("I am protected static method");}
protected void V4() {System.out.println("I am protected nonstatic method");}
void V5() {System.out.println("I am default nonstatic method");}
static void V6() {System.out.println("I am default static method");}
private void V7() {System.out.println("private nons taic");}
private static void V8() {System.out.println("private staic");}	
	
	public static void main(String[] args) {
		Inheritance3 x=new Inheritance3();
		V1();
		x.V2();
		V3();
		x.V4();
		x.V5();
		V6();
		x.V7();
		V8();
	}

}
