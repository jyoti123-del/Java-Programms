package demo;

public class Constructor4 {
int a=20;
static int b=10;
String name="";
char grade;
int marks;	
int multiplication;
	public Constructor4() {
		
	 multiplication=5*b;
	 
	}
	public Constructor4(int a) {
		 a=100;
		grade='A';
		marks=a;
	}
	
	public void  M1() {
		System.out.println("the multiplication of values is "+multiplication); 
	}
	public void M2() {
		System.out.println("marks of the student is "+marks);
		System.out.println("grade of the student is "+grade);
	}
	
	public static void main(String[] args) {
		Constructor4 c=new Constructor4();
		c.M1();
		Constructor4 b=new Constructor4(100);
		b.M2();
		Constructor4 e=new Constructor4();
		System.out.println("this all is moh maya");
System.out.println(e.a);
Constructor_1 h=new Constructor_1(20,20);
h.display3();
Constructor_1 n=new Constructor_1();// calling static variable from another class Constructor_1
System.out.println(n.b);
Constructor_1 z=new Constructor_1();
//int s=z.v;
System.out.println(z.v);
System.out.println(Constructor_1.j);
//Constructor_student r=new Constructor_student();
//Constructor_student u=new Constructor_student();
//Constructor_student u=new Constructor_student();
//Constructor_student.d;
//System.out.println(u.g);
Constructor_1 k=new Constructor_1();//calling static method from class constructor_1
k.display1();


}
}