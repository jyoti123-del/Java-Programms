package demo;
import java.util.Scanner;
public class ScannerReverse {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int num ,reminder;
		int reverse=0;
		System.out.println("enter 5 digit number");
		num=x.nextInt();
		while(num>0) {
			reminder=num%10;//12345%10=5,1234%10=4, 123%10=3, 12%10=2, 1%10=1;(5,4,3,2,1)
			num=num/10;// 12345/10=1234, 1234/10=123, 123/10=12, 12/10=1
			
			reverse=(reverse*10)+reminder; //0+5
				
			}
		
	System.out.println(reverse);	
	

}
}