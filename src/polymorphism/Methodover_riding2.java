package polymorphism;

public class Methodover_riding2 {
    public  static void M1() {
    	System.out.println("I am Overriding 2 class");
    }
    public void M2() {System.out.println(" I am oveeriding 2class non static method");}
	
    public static void main(String[] args) {
		Methodover_riding2 x=new Methodover_riding2();
		Methodoverriding v=new Methodoverriding();
		M1();
		x.M2();
	}

}
