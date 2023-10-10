package demo;

public class Function_8 {
	public static void J1()
{
	for(int i=1;i<=10;i++)
		System.out.println(i);
}
public static int J2(int a,int b)
{   a=5;
 b=10;
	if(a<b) {return b;}
	else return a;
}
public static boolean J3(int time) {
	time=12;
	if( time==12) {return true;}
	else
		{return false;}}
	public void J4() {
	System.out.println("hi m doing good");
}
public static boolean J5(int j) {
	j=5;
	if(j==5) return false;
	else { return true;}
}
public int J6(int x,int y) {  // a void method can't return a value i.e public int(int a,int b)
	
 
int z=x-y; return z;
//System.out.println(z);//

	
}
	public static void main(String[] args) {
		J1();
		J3(12);{if(J3(12)==false)
		{System.out.println("its 12 no");}else {System.out.println("its not 12");}
		//J2(10,110);
		{System.out.println( "a is a greater no");} 
		Function_8 b=new Function_8();b.J4();
	Function_8 b2=new Function_8();b2.J6(18,20);
	int y=2; int t=(b2.J6(18,20))/y;System.out.println(t);
	if(J5(5)==false)
		System.out.println("its 1");
	int g=3;
	int h=(b2.J6(18,20))*3;	System.out.println(h);
		}

}
}