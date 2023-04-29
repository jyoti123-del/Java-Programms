package polymorphism;

public class Concreteclass2 extends Abstractclass {
	
	public  void Test4() {System.out.println("i am abstract method of abstract class,completed in concrete class");}// do not need to use abstract keyword as of parent class
	public  void Test3() {System.out.println("from abstract class,completed in concrete");}
	public static void Test5() {System.out.println("hi");}
	public  int Test6(int a) {
		a=10;
		int b=a*5;
		return b;
	}
	public static void main(String[] args) {
		Concreteclass2 n=new Concreteclass2();
		n.Test1();
		n.Test2();
		n.Test4();
		n.Test3();
		Test5();
		int d=n.Test6(10)+5;
		System.out.println(d); 
	}

}
