package string1;

import java.util.Scanner;

public class Vovelcounting {
	public static void main(String[] args) {
		String ntr;
		char ch;
		int c=0;
	//String NTR=ntr.toLowerCase();
		Scanner x=new Scanner(System.in);
	    System.out.println("enter a string");
        ntr=x.next();
       // String STR=ntr.toLowerCase();
       
        int l=ntr.length();
        for(int i=0;i<l;i++) 
        {
        	ch=ntr.charAt(i);//STR.charAt(i)
        	if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        		c++;
        }
        System.out.println("total no.of vovels are "+c);
	}

}
