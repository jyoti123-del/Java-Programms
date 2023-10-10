package demo;

public class Function_6 {
	
	public static int M1(int a,int b)
	{
		int c=a*b;
		//System.out.println(c); this will not be the part of output ,only performing operation and returning operation
		return c;
	}
	public static void M2(int a1,int b1) {
		if(a1>b1) {
			System.out.println(a1);
		}
		else {System.out.println(b1);}  // value will be printed in output
	}
	public static boolean M3(int a2,int b2) {
		if(a2>b2) {return true;} // value will not be printed
		else {return false;}
	}
	public static void main(String[] args) {
		System.out.println("hello");
		M1(20,30);  // will not show output of c
		int j=2;
		int k=M1(15,25)/j;System.out.println(k); // c value will be recall and then operation is perform
		M2(10,12);  // void type- will give value in output
		if(M3(20,10)==true) {System.out.println("its good");}else {System.out.println("its not good");}
		M3(20,30);
	}

}
