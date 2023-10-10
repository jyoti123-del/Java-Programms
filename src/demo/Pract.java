package demo;
//import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
		for(int i=1;i<=12;i++) {
			for(int j=12;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *"); 
			}
			System.out.println();
		}
		for(int i=11;i>=1;i--) {
			for(int j=12;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *"); 
			}
			System.out.println();
		
		}
	}
}