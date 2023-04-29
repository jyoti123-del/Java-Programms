package polymorphism;

public abstract class Abstractclass {

	
		public void Test1() {
			System.out.println("I am method test1 from abstract class");
		}
		public  void Test2() {
			System.out.println("I am test2  method from abstract class");
		}
		public abstract void Test3();// {}
			public void display() {}// it is complete method
		
		public abstract void Test4(); {}
			//public abstract static void Test5(); cannot use semicolon for abstract method
		public  static  void Test5() {;}
		public abstract int Test6(int a);// {return a;}
		public static void main(String[] args) {
			System.out.println("hellow, this is abstract class"); 
			
			//Abstractclass n=new Abstractclass(); cannot create abstract class object
		}
}
	


