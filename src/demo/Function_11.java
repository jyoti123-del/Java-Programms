package demo;

public class Function_11 {
//1

	public static boolean A1(int a,int b) {
    a=12;
	b=24;
	if(a>b)	{return true;}
	else {return false;}
	}
//2
	public  boolean A2(int c) 
	{ c =45;
		if(c==45) {return true;}
		else {return false;}
	}
	
	public static void main(String[] args) {
		
A1(112,24); 
if(A1(112,24)==false)  
System.out.println("Its gretaer no");
Function_11 a=new Function_11();
a.A2(0);
//if(A2(45)==true) {System.out.println("c is greter than 12");}
	}

}
