package demo;
import java.util.Scanner;
public class Scanner_1 {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
 String a,b,c;

 System.out.println("Enter a first name:+");
 a=sn.next();
System.out.println("enter last name :+");
b=sn.next();
c=a+b;
System.out.println(c);
	}
}
