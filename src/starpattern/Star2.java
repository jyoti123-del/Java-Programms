package starpattern;

public class Star2 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	
	
	
		for(int i=1;i<=10;i++) {
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=10;k>=i;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	
		
		
		
		
	

}
}