package demo;

import java.util.Scanner;

public class Vovelwitharray {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter a string");
	String s=x.next();
	String reverse="";
	char a[]=s.toCharArray();
	int l=a.length;
	//String reverse="";
	for(int i=l-1;i>=0;i--) {
		reverse=reverse+a[i];
	}
 System.out.println("Revesre of the string is "+reverse);
	}

}
