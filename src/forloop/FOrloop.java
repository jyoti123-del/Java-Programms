package forloop;

import java.util.Scanner;

public class FOrloop {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter anumber");
		int a=sn.nextInt();
		int c=0;int i=0;
		for(;a>0;) 
		{
			a=a/10;
			c++;
		}
		System.out.println("number of digit is"+c);
	}

}
