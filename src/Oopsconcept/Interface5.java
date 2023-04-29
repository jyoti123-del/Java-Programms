package Oopsconcept;

public class Interface5 implements Interface1,Interface3 {
public void M1() {
	System.out.println("hi");
}
public void M2() {System.out.println("hello");}
public int M3(int a) {return a;}
public void M3() {System.out.println("fine");}
public void M4() {System.out.println("ok");}
	public static void main(String[] args) {
		Interface5 n=new Interface5();
		n.M1();
		n.M2();
		int x=n.M3(10);System.out.println(x);
		n.M4();
		n.M3();

	}

}
