package forloop;

public class Duplicate_Inarray {

	public static void main(String[] args) {
		String[] s= {"jyoti","A","Viju","Lanje","jyoti","Viju",};int c=0;
		for(int i=0;i<=s.length-1;i++) {
			for(int j=i+1;j<=s.length-1;j++) {
				if(s[i]==s[j]) {
					System.out.println("Duplicate element is "+" "+ s[j]);
					c++;
				}
				}}
				System.out.println("Total no. of duplicate element is "+c);
			
		}

	}


