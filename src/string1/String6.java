package string1;

public class String6 {

	public static void main(String[] args) {
		String s="abc123";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(chisint(ch)){
				sum=sum+i;
			}
			System.out.println(sum);
		}
	}

	private static boolean chisint(char ch) {
		
		return false;
	}

	
}


