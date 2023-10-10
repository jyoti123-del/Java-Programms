package demo;

public class Function_10 {
	
//1// need not to create object for static methods, void do not need return,  print value for static method(Sopln)
	public static void B1() {System.out.println("its all good"); 
		
	}
//2// need to create object,value will display in console
	public void B2()
{
	System.out.println("i am doing good");
}
	//3// will return value only, needs to create object
	public int B3(int a1) {
		
		int b= a1*a1; return b;
	}
	//4// will return value only, no need of object
	public static int B4(int a, int b) {
		if(a>b)return a;
		else return b;
	}
	
	public static void main(String[] args) {
		B1();
B4(10,20); int d=2; int e=B4(10,20)/d;System.out.println(e);
	Function_10 b=new Function_10();
	b.B2();
	Function_10 c=new Function_10();
	c.B3(1);
	int g= (5)*5;
	System.out.println(g); 
	}

}
