package demo;
import java.util.Scanner;
public class Reversestringarray {
     
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String ntr;
		String reverse="";
		System.out.println("enter a string ");
		ntr=sn.next();
		char a[]=ntr.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+a[i];
		}
System.out.println("reverse is "+reverse);
	}

}
