package forloop;

import java.util.Scanner;

public class Nuber {

	
		public static void main(String[]args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=sn.nextInt();
			int c=0;int i=0;
			int reverse=0;
			for(;a>0;){
				int reminder=a%10;
				a=a/10;
				 reverse=(reverse*10)+reminder;
				c++;
			}
			System.out.println("reverse of the numner is "+reverse);
			System.out.println("total no.of digit is "+c);
		}
		}

