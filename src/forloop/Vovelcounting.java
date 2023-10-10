package forloop;

import java.util.Scanner;

public class Vovelcounting {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sn.next();
		int c=0;
		int l=s.length();
		for(int i=0;i<=l-1;i++) {
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				c++;}}
				System.out.println("total no.of vovel are"+c);
				
			
		}
	}


