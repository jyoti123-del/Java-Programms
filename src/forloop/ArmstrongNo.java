package forloop;

public class ArmstrongNo {

	public static void main(String[] args) {
		int a=1634;
		int sum=0;	
		String s=Integer.toString(a);
		int d=s.length();
		System.out.println(d);
		int c=a;
		while(a!=0) {
			int reminder=a%10;
			sum= sum+(int)Math.pow(reminder, d);
			a=a/10;
	         
		}
		System.out.println("sum is "+sum);
		if(sum==c) {
			System.out.println("it is armstrong no");
		}
		else {
			System.out.println("it is not arm.number");
		}
	}

	

}
