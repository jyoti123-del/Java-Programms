package newpackage;

public class Methodcalling2 {

	public static void main(String[] args) {
		
		Methodcalling.M1();//public static method
		Methodcalling.M3();//protected static method
		Methodcalling.M6();//static method(default)
		Methodcalling2 x=new Methodcalling2();
		Methodcalling n=new Methodcalling();
		n.M2();//public non-static
		n.M4();//protected non-static
		n.M5();//default non-static
		//n.M8();private method
		S1();
       x.S6();
	}
	public static void J() {System.out.println("J");}
	public  void M1() {System.out.println("M1");}	
	
   public static void S1() {
	Methodcalling.M1();
	Methodcalling.M3();
	Methodcalling.M6();
	Methodcalling c=new Methodcalling();
	c.M4();
}
	public  void S6() {
		System.out.println("hello everyone");
		this.M1();
		//S1();
		J();
	}
	
	
	
	
}
