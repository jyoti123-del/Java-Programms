package demo;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		int n1,r,r1,r2,reverse;
		System.out.println("enter 3 digit number=num:");//123
		int num=sn.nextInt();
		r= num%10;//123%10=3
		//System.out.println(r);//3
		 n1=num/10;//123/10=12
		 r1=n1%10;//12%10=2
		// System.out.println(r1);
		 r2=n1/10;//12/10=1
		// System.out.println(r2);
		 reverse=(r*100)+(r1*10)+(r2*1);
		 System.out.println(reverse );
	}

}
 