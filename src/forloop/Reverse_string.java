package forloop;

import java.util.Scanner;

public class Reverse_string {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sn.next();
	String Reverse="";
	int l=str.length();
	for(int i=l-1;i>=0;i--) {
		//char a=str.charAt(i);
		Reverse=(Reverse)+str.charAt(i);
		
		}
	
	System.out.println("Reverse of the string is "+Reverse);

	}

}
