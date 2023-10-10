package sdArrays;

public class SdArray5 {
	public static void main(String[] args) {
		// multiple data type 
		Object a[]=new Object[5];
		a[0]="Jyoti";
		a[1]="03";
		a[2]='A';
		a[3]="100";
		a[4]="10.5";
		int l=a.length;
		System.out.println(l);
		for(Object i:a) {
			System.out.println(i);
		}
		
	}
}
