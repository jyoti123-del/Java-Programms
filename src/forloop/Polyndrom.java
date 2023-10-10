package forloop;

import java.util.Scanner;

public class Polyndrom {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sn.nextInt();
		int num=x;
		int reverse=0;
		for(; x>0;) {
			
			int reminder=x%10;
			reverse=(reverse*10)+reminder;
		    x=x/10;}
           System.out.println("Reverse is "+reverse);
           if (num==reverse) 
				{System.out.println("it is polyndrom");}
			else
				System.out.println("It is not polyndrom");
			}
			
		}

	


