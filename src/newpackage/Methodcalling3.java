package newpackage;

public class Methodcalling3 extends Methodcalling2 {
	public void X1() {
		Methodcalling.M1();// Static method from Methodcalling1
		Methodcalling2 n=new Methodcalling2();
		n.M1();
		J();// static method from Methodcalling2 class
		Methodcalling c=new Methodcalling();
		c.M4();
		
	}
	
	

	public static void main(String[] args) {
		J();
		Methodcalling2 c=new Methodcalling2();
		c.M1();
		Methodcalling3 b=new Methodcalling3();
		b.X1();
		X2();
	}


 protected static void X2() {
	//this. X1(); this key-word is not applicable for static method
System.out.println("Hellow everyone");
}
}