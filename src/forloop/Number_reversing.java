package forloop;

import java.util.Scanner;

public class Number_reversing {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
    System.out.println("enter a string");
    String str =sn.next();
    String reverse="";
    int l=str.length();
    for(int i=l-1;i>=0;i--) {
    	char ch=str.charAt(i);
    	reverse= reverse+str.charAt(i);
    	
    }
    System.out.println(reverse);
	}

}
