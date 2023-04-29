package elif_programme;

import java.util.Scanner;

public class If2 {

public static void main(String[] args) {
Scanner sn=new Scanner(System.in);
System.out.println("enter a number");
	int a=sn.nextInt();
	if(a<0) {
		System.out.println("it is a -ve no.");
	}
	else if(a==0) {
		System.out.println("it is zero value"); 
	}
	else if(a>0&a<10) {System.out.println("it is in between 1-10 no");}
	else 
		{System.out.println("no.is greater than 10");}
}
}