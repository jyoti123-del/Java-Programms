package forloop;

public class Hexagone2 {

	public static void main(String[] args) {
		for(int i=5;i<=8;i++) {
			for(int k=8;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	
		for(int i=0;i<=4;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=9;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
