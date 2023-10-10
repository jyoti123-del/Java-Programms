package forloop;

public class Hexagon {

	public static void main(String[] args) {
		for(int i=7;i<=12;i++) {
			for(int j=12;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *"); 
			}
			System.out.println();
		}
		for(int i=11;i>=7;i--) {
			for(int j=12;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *"); 
			}
			System.out.println();
		}

	}

}
