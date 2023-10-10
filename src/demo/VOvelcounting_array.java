package demo;
import java.util.Scanner;
public class VOvelcounting_array {

	public static void main(String[] args) {
		String ntr;
		char ch;
		int c=0;
		Scanner sn=new Scanner(System.in);
		
	System.out.println("enter a string");
	ntr=sn.next();
	//String STR=ntr.toLowerCase();
	char a[]=ntr.toCharArray();
	int l=a.length;
	for(int i=0;i<l;i++) {
		ch=a[i];
		//if((ch=='a')||(ch=='e')||(ch=='o')||(ch=='u')||(ch=='i'))
			c++;
		
	}
	
	System.out.println("vovel in a given string is "+c);
	}

}
