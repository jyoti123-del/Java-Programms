package sdArrays;

public class SdArray3 {
	public static void main(String[] args) {
		// with  string-type
		String s[]=new String[3];
		s[0]="Welcome";
		s[1]="to";
		s[2]="java";
		int l=s.length;
		System.out.println(s.length);
		for(int i=0;i<=l-1;i++) {
			System.out.print(s[i]+" ");
		}

	}
}
