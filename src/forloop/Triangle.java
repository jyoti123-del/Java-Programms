package forloop;

public class Triangle {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int k=1;k<+i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=9-i;j++) {
			   System.out.print(" *");
		}
		System.out.println();

		

}
}}