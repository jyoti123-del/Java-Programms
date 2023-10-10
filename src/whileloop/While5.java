package whileloop;

import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		try (//to print sum of digits in a number i.e number=12;sum=1+2;
		Scanner sn = new Scanner(System.in)) {
			System.out.println("enter a number");
			int x=sn.nextInt();
			while (x<20) {
				int a=x%10;
				int b=x/10;
				int c=a+b;
				System.out.println(c);
				x++;
			}
		}

	}

}
