package demo;

public class Else {
	public static void main(String[]args)
	{
		int a=40;
		int b=57;
		int c= 26;
		if(a>b) {
			System.out.println("a is greater no.");/* first condition is right then executing next if statement,if first if is wrong going to else statement*/
		}else {
			if(b>c) {
		
				System.out.println("b is greater no");
			}
		

           else {
			System.out.println("c is greater no.");
		    }
	}
	}

}
