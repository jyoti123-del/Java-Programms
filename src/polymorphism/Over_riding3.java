package polymorphism;

public class Over_riding3 {//extends Methodoverriding{

	public static void main(String[] args) {
		Methodover_riding2 x=new Methodover_riding2();
		Methodoverriding v=new Methodoverriding();
		Methodoverriding.M1();
		x.M2();
        Methodover_riding2.M1();
        v.M2();
	}

}
