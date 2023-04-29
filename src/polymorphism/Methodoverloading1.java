package polymorphism;

public class Methodoverloading1 {
   
	String name;
	char grade;
	public static void M1() {
	System.out.println("i am public static method");
	}
	 public void M1(int a) {
		  a=10;
	System.out.println("value of a is "+10);
	}
	protected static void M1(int a,int b) {
		a=10;b=20;
		int c=a+b;
    System.out.println("Value of c is" +c); 
				}
	protected void M1(String n) {
		n="Jyoti";
		name=n;
		
	System.out.println("My name is "+name );
			}
	void M1(char a) {
		a='A';
		grade=a;
	System.out.println("The grade is "+grade);}
	public void M1(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
		}
	
			 
	public static void main(String[] args) {
				Methodoverloading1 x=new Methodoverloading1();
				M1();// all static method should access in static way(public,static,protected,private)
				x.M1(10);
				M1(10,20);
				x.M1(10,20,30);
				x.M1("Jyoti");
				x.M1('A');
				
				
		       
			}

		}

	
