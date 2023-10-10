package demo;

public class For_sum {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		//while(i<=20)
		//{
			//System.out.println(i);
			for(int j=0;j<=20;) {
				System.out.println(j);
				sum=sum+j;
		       j=j+2;
		}
		System.out.println("The sum of even no is: "+sum);
	
	}
}
