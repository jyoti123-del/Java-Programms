package forloop;

public class Toprint_odd_no {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;) {
			System.out.println(i); 
	        sum=sum+i;
			i+=2;
		}
     System.out.println(sum);
	}

}
