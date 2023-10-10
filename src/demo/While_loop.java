package demo;

public class While_loop {

	public static void main(String[] args) {
		System.out.println("this is outside while loop");
		int i=0;
		while(i<15) {
			System.out.println(i);
			i++;
			System.out.println("inside while loop");
			//i++;
		}
System.out.println("outside while loop");
	}

}
