package polymorphism;

public class Methodoverriding extends Methodoverloading1  {

	public static void M1() {
			System.out.println("i am public static method of super class ");
			}
	public void M2() {
		System.out.println("i am non-static super class ");
	}
	
		public static void main(String[] args) {
			M1();
			Methodoverriding b=new Methodoverriding();
			Methodoverloading1.M1();
			b.M2();
			
	}

}
