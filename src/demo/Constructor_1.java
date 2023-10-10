package demo;

public class Constructor_1 {
	
	String city;
	String name;
	int addition;
	int b=30;
	static int j=40;
	int v=45;
	
	public Constructor_1()
	{
		name="Velocity";
		city="pune";
	}
	
	public Constructor_1(int a,int b)
	{  a=20;b=20;
		 addition=a+b;
		
    }
	public void display() {
		System.out.println("my city name is " +city);
		System.out.println("My name is "+ name);
	}
	public void display3() {
		System.out.println("Addition is"+ addition);
	}
	
	
	public static void display1()
	{
		System.out.println("i am static display method");
	}

	public static void main(String[] args) {
		
display1();
Constructor_1 b=new Constructor_1();
b.display();
Constructor_1 c=new Constructor_1(20,20);
c.display3();

	}

}
