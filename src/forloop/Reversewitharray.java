package forloop;

import java.util.Scanner;

public class Reversewitharray {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sn.next();
		char a[]=s.toCharArray();
		String reverse="";
		int l=a.length;
		for(int i=l-1;i>=0;i--) {
			reverse=reverse+a[i];
		}
		System.out.println(reverse);
		
	}
	
}
