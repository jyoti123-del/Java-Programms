package demo;

public class Ef_Else {

	public static void main(String[] args) {
		int a=100;
		int b=20;
		if(a>b) {
			System.out.println("a is greter no");}
			else {
				System.out.println("b is greter");
			}
		
	       if(a>b) {
	    	   System.out.println(a-b);
	       }
	
	       else {
	    	   System.out.println(b-a);
	       }
	
	int age=30;
	if(age<20) {
		System.out.println("person is teenager");
	}
	else if(age==20) {
		System.out.println("person age is 20");
	}
	else {
		System.out.println("person age is more than 20");
	}
	
	if(age>20 && age<40) {
		System.out.println("person is adult");
		
	}
	else {
		System.out.println("person is upper middle age");
	}
	
}

}


