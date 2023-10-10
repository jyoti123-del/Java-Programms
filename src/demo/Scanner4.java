package demo;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		double a,b,c,d;
		double x1,x2;
	Scanner read=new Scanner(System.in);
	System.out.println("Enter value of a:");

	a=read.nextDouble();
	System.out.println("Enter a value of b :");
	b=read.nextDouble();
	System.out.println("Enter a value of c");
	c=read.nextDouble();
	
	 d =b*b-4*a*c;
	 System.out.println(d);
	 
		 System.out.println("roots of quadratic equation are:");
	 
	
	}

}

