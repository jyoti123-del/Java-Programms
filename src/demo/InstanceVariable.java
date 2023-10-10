package demo;

public class InstanceVariable {
	static int y=100;
	static int x=90;
public  void demo()
{
	 int y=25;
	int x=35;
		int n=10;//
		 int z=20;//only final is permitted
System.out.println(y);
System.out.println(x);
System.out.println(n);
System.out.println(z);
}
		public static void main(String args[])
		{
		
		int a=10;
		InstanceVariable jyoti=new InstanceVariable();

		System.out.println(InstanceVariable.y);
		System.out.println(InstanceVariable.x);
		jyoti.demo() ;
		System.out.println(a);
		}
		}

	


