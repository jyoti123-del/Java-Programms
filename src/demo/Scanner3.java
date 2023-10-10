package demo;
import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);

	double a,b,c;
	System.out.println("Enter a");
	a=sn.nextDouble();
	System.out.println("Enter b");
	b=sn.nextDouble();
	if(a>b) {
		System.out.println("a is greater nu.");
	}
		
	else {
		System.out.println("b is greater");
	}
	c=a+b;
	System.out.println(c);
	
	}

}
