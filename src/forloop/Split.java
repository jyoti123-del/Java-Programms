
package forloop;

import java.util.Scanner;
import java.util.Arrays;

public class Split {
	
		public static void main(String[]args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter a String");
			String s=sn.nextLine();
			String []p=s.split(" ");
			System.out.println("Total no.of words in array is " +p.length);
			for(int i=0;i<=p.length-1;i++){
				System.out.println(p[i]);
				System.out.println(p[i].length());
			}
			
		}
	}

 