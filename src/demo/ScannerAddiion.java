package demo;
import java.util.Scanner;
public class ScannerAddiion {

	public  int M1(int a,int b)
		{  
			 int c=a+b;
			return c;
		}

		
		public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter a number");
			int a=x.nextInt();
			ScannerAddiion b=new ScannerAddiion();
			b.M1(10,20);
			//M1(10,20);
			int d=(b.M1(10, 20))*a;
			int s=(b.M1(10,200))*a;
			System.out.println(d);
			System.out.println(s);
	}

}
