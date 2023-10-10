package demo;

public class Function_3 {
	
	static int  a=10;
	public static void demo() {
		for(int i=10;i>=0;i--){
			System.out.println(i);
		}
			}
public void demo2() {
	int i=10;
	int j=20;
	if( i>j) {
		System.out.println(i);
	}
	else {
		System.out.println(j);}
}
	public static void demo3()
	{
		System.out.println("hii");
	}
	public void demo4() {
		System.out.println("good night");
	}
	
	public static void main(String[] args) {
		Function_3 a=new Function_3();
		a.demo4();
 System.out.println("sleepwell");
		demo();
		Function_3 b=new Function_3();
		b.demo2();
		
demo3();
	}

}
