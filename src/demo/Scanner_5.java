package demo;

import java.util.Scanner;

public class Scanner_5 {

	public static void M1()
	{
		int x=10;
		int y=20;
		int z= x+y;
	}
	public static int M2(int a1,int b1) {
		int c= a1* b1;
		return c;
	}
	public static boolean M3(float x1,float y1)
	{
		if(x1>10.0)
			return true;
		else {
			return false;
		}
	}
public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
M1();
M2(10,20);
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


