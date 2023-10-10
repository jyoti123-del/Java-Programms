package forloop;

import java.util.Scanner;

public class Touppercase {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sn.next();
		String S=s.toUpperCase();
		System.out.println("After uppercase "+S);
		
	}

}
