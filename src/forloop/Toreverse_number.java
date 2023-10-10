package forloop;

import java.util.Scanner;

public class Toreverse_number {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
    int reverse=0;int reminder;
	System.out.println("enter a number");
	int num=sn.nextInt();
	for(;num>0;) {
		reminder=num%10;
		
	    reverse=(reverse*10)+reminder;
		num=num/10;
		
	}
	System.out.println(reverse);

	}

}
