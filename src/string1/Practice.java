package string1;

public class Practice {

	public static void main(String[] args) {
	String s="jyoti123";
	String x=new String("viju");
	s=s.substring(5,7);
    System.out.println(s);String reverse=" ";
    for(int i=s.length()-1;i>=0;i--) {
    	char ch=s.charAt(i);
    	reverse=reverse+ch;
    }
		System.out.println(reverse);
}}
