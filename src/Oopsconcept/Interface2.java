package Oopsconcept;

public class Interface2 implements Interface1 {
	public void M1() {System.out.println("hii");}
	public void M2() {System.out.println("hello");}
	public int  M3(int a) {a=10;return a;}
	public static void main(String[] args) {
		Interface2 n=new Interface2();
		n.M1();
		n.M2();
		int x=n.M3(10)+5;
		System.out.println(x);
    
	}

}
