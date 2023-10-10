package whileloop;

public class Print1_10 {
public static void main(String[]args) {
	int i=0;
	int sum=0;
	while(i<=10) {
		System.out.println(i);
		sum=sum+i;
		i++;
	}
	System.out.println(sum);
}
}
