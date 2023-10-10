package demo;

public class Function_int {
public int M1(int m,int n)
{int o=m-n;
	return o;
	}	
public static void M2() {
	char a='A';
	char b='Z';
	while(a<=b) {
		//a++;
		System.out.println(a);
		a++;}}
	public boolean M3(int a)
	{
		if((a%10)>5)
			{return true;}
		else {return false;}
		
	}

	public static void main(String[] args) {
		M2();
System.out.println("hi everyone"); 
Function_int b=new Function_int();
b.M1(10,20 );
int d=(b.M1(100,20))*5;
System.out.println(d);
Function_int v=new Function_int();
v.M3(100);
if(v.M3(100%10)==true) {;System.out.println("return value");}
else {
System.out.println(" do not return");}

	
}

}