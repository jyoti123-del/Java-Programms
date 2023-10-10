package demo;

public class Function_1 {

	public static void demo2()
	{

	int i=10;
		if(i>=20) {
			System.out.println("i is greater than 20");}
			else {
				System.out.println("i is smaller no");
			}
		}
	
	
	public static void demo()
	{
	int i=15;
	int j=2;
	for(i=1;i<=15;i++) {
	System.out.println(i*j);
	}
}


public static void main(String[] args) {
	Function_2 n=new Function_2();
	n.demo();
	demo();
	demo2();
	System.out.println("hi i am main method");
}
}