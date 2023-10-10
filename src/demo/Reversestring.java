package demo;
import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String str; 
        String reverse=" ";
		System.out.println("enter string " );
		str=sn.next();
    int len= str.length();
    for(int i=len-1;i>=0;i--)
    {
    	reverse=reverse+str.charAt(i);
    	}
    	
  System.out.println("reverse string is"+reverse);
	}

}
