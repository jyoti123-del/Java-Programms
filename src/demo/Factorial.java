package demo;

public class Factorial {

	public static void main(String[] args) {
		int i=1;
		int j=10;
		int fact=1;
		
		while(i<=j) {
			 fact=i*fact;
			System.out.println(fact);
			i++;
		}

	}

}
