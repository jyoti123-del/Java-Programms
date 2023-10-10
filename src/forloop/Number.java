package forloop;

public class Number {

	public static void main(String[] args) {
		int a=1234;
		int reverse=0;
		int reminder=0;
               while(a>0) {
            	   reminder=a%10;
            	   reverse=(reverse*10)+reminder;
            	   a=a/10;
               }
     System.out.println(reverse);
	}

}
