package demo;

public class Whilesum {

	public static void main(String[] args) {
		int n=10;
		int a,b;
		int result=0;
		while(n<100)
		{
		 a=n%10;
		  b=n/10;
	      result=a+b;
		  System.out.println(result);
	      n++;

	}
		// System.out.println(result);
}
}