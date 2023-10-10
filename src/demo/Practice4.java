package demo;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
    System.out.println("enter a no");
        int a=sn.nextInt();
        int reverse=0;
        
        for(; a>0;) {
        	int reminder=a%10;
        	a=a/10;
        	reverse=(reverse*0)+reminder;
        	
        	
        
System.out.print(reverse);
	}

	
	}
}

