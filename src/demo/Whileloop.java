package demo;

public class Whileloop {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while(num<=10) {
			
			System.out.println(num); 
			sum=sum+num;
			num++;
			//sum=sum+num;
		}
		System.out.println(sum);
	}

}
