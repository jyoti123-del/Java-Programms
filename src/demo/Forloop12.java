package demo;
//import java.util.Scanner;
public class Forloop12 {

	public static int M1(int a,int b)
	{
		int c=a%b;
		return c;
		
	}
	public static boolean M2(int a1,int b1)
	{
		if(a1>b1) {return true;}
		else {
			return false;
		}
	}
	public int M3(int n)
	{
		return n;
	}
	public static void main(String[] args) {
		M1(10,20);
		int d=(M1(10,20))*10;
		System.out.println(d);
		if(M2(100,20)==true)
		{System.out.println("True");}
		else {
			System.out.println("false");}
		}
}
