package demo;
import java.util.*;
public class Scanner7 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int num,reminder;
		int reverse=0;
	
		System.out.println("Enter 5 digit no.: "); 
		num=sn.nextInt();
		while(num>0) {
			reminder=num%10;
			//System.out.println(reminder); 
			reverse=(reverse*10)+reminder;
			num=num/10;
			//System.out.println(reverse); 
		}
		System.out.println(reverse); 
	}
	}


