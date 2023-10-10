package forloop;

public class Doubletriangle {

	public static void main(String[] args) {
		for(int i=5;i<=10;i++) {
			for(int k=10;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		for(int k=9;k>=5;k--) {
			for(int j=10;j>=k;j--) {
				System.out.print(" "); 
			}
			for(int l=1;l<=k;l++) {
			System.out.print(" *");
			}
			System.out.println();
		}	
		

	}

}
