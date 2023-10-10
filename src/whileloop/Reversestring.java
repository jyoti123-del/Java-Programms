package whileloop;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sn.next();
		String r=s.toUpperCase();
		String n=r.toLowerCase();
		int l=s.length();
		System.out.println(r); 
	    System.out.println(n);
		}
	}


