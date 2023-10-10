package demo;

public class Function_4 {
	
	public static void addition(int a, int b)
	{
	int c=a*b;
	System.out.println(c);
	}
	public static void addition2()
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	
	}
	public void addition() {
		System.out.println("hello");
	}
public static void main(String[]args) 
{
	System.out.println("hello everyone");
addition(10,20);
	addition(20,30);
	addition2();
	addition2();
	Function_4 a= new Function_4();	
	a.addition();

}
}