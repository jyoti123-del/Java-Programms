package demo;

public class Function_practice {
	public static int A(int a, int b)
	{ 
	int c=a+b;
		return c;}
	
	public void M2()
	{
		int b=10;
		int n=10*b;
		System.out.println(n); 
	}
	
	public static int M3(int x,int y)
	{
	int c=x/y; return c;
	}
	
	public static void main(String[] args) {
	int x=2;
	int z=A(10,20)/2;
	System.out.println(z);
	Function_practice n=new Function_practice();
	n.M2();
	Function_practice m=new Function_practice();
	m.M3(10,2);
	int x1=10;
	int d=(M3(10,2))*x1;
	System.out.println(d);
	
	}

}
