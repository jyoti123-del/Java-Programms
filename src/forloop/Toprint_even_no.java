package forloop;

public class Toprint_even_no {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=10;) {
			System.out.println(i);
			sum=sum+i;
			 i+=2;
			 //System.out.println(sum);
		}
		System.out.println(sum);
	}

}
