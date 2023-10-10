package forloop;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a number");
	int c=sn.nextInt();
	String s=Integer.toString(c);int reverse=0;
	for(int i=0;i<s.length();i++) {
         char ch=s.charAt(i);
         System.out.println(ch);}
		System.out.println("Total no.of digit is "+s.length());
	}
	}


