package demo;

public class Pre_increament {
	public static void main(String[]args)
	{
		int a=10;
		int b=++a;/* a=11*/
		int c=a++;/* value of a is assigned to c and then it is increased by 1, so c=11, a=12*/
		int d=++a;/* now here value of a is 12, it increases to 12 and then assigned in d ,so d=13,a=13*/
		int e=a++;/*now a=13 this value will first assigned to e as 13 and then it will increased by 1 s0, e=13, a=14*/
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
        System.out.println(a);
	
	}
	
	
	}


