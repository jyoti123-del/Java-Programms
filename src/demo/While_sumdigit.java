package demo;

import java.util.Scanner;

public class While_sumdigit{

public int M1(int a,int b)
{  
	int c=a+b;
	//System.out.println(c);
		
	
     return c;
}
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a no");
	int x=sn.nextInt();
	While_sumdigit b=new While_sumdigit();
	b.M1(10, 20);
	//M1(10,20); 
	int y=2;
	//int d=(b.M1(100,20))*5;
	int d=(b.M1(10,20))*x;
	System.out.println( d);
	}

	

}
