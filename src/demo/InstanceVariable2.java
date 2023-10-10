package demo;

public class InstanceVariable2 {
public static void demo(int a,int b)
{
	int c=a+b;
	
		System.out.println(c);
		
}
public static void demo1()
{  
	int a=10;
	int b=70;

	int d=a+b;
	
		System.out.println(d);
}
		public static void main(String args[])
		{
		int a=10;
		
        demo(20,30);
		demo(10,60);
		demo1();
		System.out.println(a);
		}
		}
