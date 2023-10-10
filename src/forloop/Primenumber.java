package forloop;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		int temp=0;
		for(int i=2;i<=a-1;i++) {
			if((a%i)==0){
			
		    temp=temp+1;
			}}
				if(temp>0) {
					System.out.println("It is  not a prime no.");
				}
				else {System.out.println("it is a prime no");}
		}
          
	}


