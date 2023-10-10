package string1;

import java.util.Scanner;

public class StringReverse {
	public static void main(String []args)
	{
	Scanner sn=new Scanner(System.in);
	String name;
	String reverse="";
	System.out.println("Enter a string");
	 name=sn.next();
	char a[]=name.toCharArray();
	int len=a.length;
	for(int i=len-1;i>=0;i--)
	{

	reverse=reverse+a[i];
	}
	System.out.println("Revesre of the string is "+reverse);
	}
}
