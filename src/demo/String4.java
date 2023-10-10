package demo;

public class String4 {

	public static void main(String[] args) {
		String a=" Jyoti";
		String b=" jyoti"; String f=" My name is Jyoti ";
		String c=new String("Viju");
		String d=new String("Viju");
		System.out.println(a);
		System.out.println(a.concat(c));
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println(f.trim());
		System.out.println(f.replace("My","yours"));
		System.out.println(f.replaceAll("\\s", ""));
		System.out.println(f.substring(2));
		System.out.println(f.substring(3, 10));
		System.out.println(f.trim().length());
		System.out.println(f);
		
	}

}
