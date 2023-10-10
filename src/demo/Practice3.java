package demo;

import java.util.Scanner;

public class Practice3 {
     public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sn.next();
		//int a=s.length();
		
		String reverse="";
		int c=0; 
		char d[]=s.toCharArray();
		int l=d.length;
		for(int i=l-1;i>=0;i--) {
			//char ch=s.charAt(i);
			char sh=d[i];
			reverse=reverse+sh;
			if((sh=='a')||(sh=='e'||(sh=='i')||(sh=='o')||(sh=='u')))
					c++;
		}
		System.out.println(reverse);
		System.out.println("no.of vovels are "+c);
	}
     

}
