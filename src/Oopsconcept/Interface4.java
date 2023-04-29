package Oopsconcept;

public class Interface4 implements Interface3{
	public static void main(String[] args) {
		Interface4 n=new Interface4();
		n.M1();
		n.M2();
		n.M3();
		n.M4();
		int c=n.M3(10)+10;
		System.out.println(c);}
	public  void M1() {System.out.println("interface1");}
	public  void M2() {System.out.println("interface1");}
	public  void M3() {System.out.println("implements 3");}
	public  void M4() {System.out.println("implements 3");}
	public  int M3(int a) {
		a=10;
		int d=a*a;
		return d;}
	

}
