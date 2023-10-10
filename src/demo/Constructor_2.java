package demo;

public class Constructor_2 {
	int num1;
	int num2;
	int num3;
	double x,y;
	public Constructor_2(){
		num1=10;
		num2=20;
		num3=30;
	}
public Constructor_2(int a) 
{
	num1=a;
	}
public Constructor_2(int a,int b) 
{
	num1=a;num2=b;
	}

public Constructor_2(int a,int b,int c)
{
	num1=a;num2=b;num3=c;
	}
public Constructor_2(double n,double m)
{
	x=n;
	y=m;
}

public void display() {
	int sum=num1+num2+num3;
	//double multiplication=x*y;
	System.out.println("addition is "+sum);}
public  void display1() {
	double multiplication=x*y;
	System.out.println("multiplication is "+multiplication);
}
	public static void main(String[] args) {
		Constructor_2 a=new Constructor_2();
				a.display();
	Constructor_2 b=new Constructor_2(20);
				b.display();
		Constructor_2 c=new Constructor_2(45,65);
		c.display();
  Constructor_2 d=new Constructor_2(23,56,78);
  d.display();
  Constructor_2 e=new Constructor_2(8.9,7.8);
  e.display1();
	}

}
