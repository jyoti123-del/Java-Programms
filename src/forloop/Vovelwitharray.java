package forloop;

import java.util.Scanner;

public class Vovelwitharray {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a String");
		String s=sn.next();
		char a[]=s.toCharArray();
		int l=a.length;int c=0;
		for(int i=0;i<=l-1;i++) {
			char ch=a[i];
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			c++;
			
		}
		System.out.println(c); 
	}
	

}
