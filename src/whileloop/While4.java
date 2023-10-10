package whileloop;

public class While4 {

	public static void main(String[] args) {
		// to print factorial of a number
		int i=1;
		int fact=1;
		while(i<=5) {
			fact=i*fact;
			System.out.println(fact);
			i++;
		}
		
	}

}
