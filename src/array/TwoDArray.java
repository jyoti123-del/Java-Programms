package array;

public class TwoDArray {

	public static void main(String[] args) {
		// similar data-type
		
		int a[][]=new int[3][4];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		a[1][3]=80;
		a[2][0]=90;
		a[2][1]=100;
		a[2][2]=110;
		a[2][3]=120;
		
		int l=a.length;
		System.out.println(l);
for(int i=0;i<=2;i++) {
	for(int j=0;j<=3;j++) {
		System.out.print(a[i][j]+" ");}
		System.out.println();

	}

}
}