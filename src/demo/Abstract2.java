package demo;

public class Abstract2 extends Abstarctclass {
	public void Test3() {
		System.out.println("i am method 3");
	}
	public void Test4() {
		System.out.println("i am method 4");
	}
	
	public void T5() {
	Abstract2 nx=new Abstract2();
	nx.Test1();
	nx.Test2();
	
	
	}
	public static void main(String[] args) {
		Abstract2 nx=new Abstract2();
		nx.Test3();
		nx.Test4();
		nx.T5();
	}

}
