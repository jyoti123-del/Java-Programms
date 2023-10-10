package whileloop;

import java.util.Scanner;

public class While2 {

	
public static void main(String[] args) {
  Scanner x=new Scanner(System.in);
	System.out.println("enter number "); 
	int i=x.nextInt();
	while(i<10) {
		if((i%2)==0) {
			System.out.println("it is a even no");
		}
		else {System.out.println("it is a odd no");}
		i++;
	}
	
	}
	}


