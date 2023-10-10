package demo;

public class String1 {
//String name="JYOTI";//create object of String1 and call
// String name2="Jyoti";
//String b="Lanje";
//String c=new String("Jyoti");
//String d=new String("Londhe");
//String e;
//String f;
//String g;
 //int a=name.length();

public static void main(String[] args) {
		String name="JYOTI";
		 String name2="jyoti";
		String b="Lanje";
		String f="Londhe";
		String c=new String("Jyoti");
		String d=new String("Londhe");
        String e=new String("Londhe");
		
		System.out.println(name);
		System.out.println(c);
		System.out.println(name.length());
		System.out.println(name==name2);//false,case change
		System.out.println(b==f);//will give false
		System.out.println(d.equals(f));//will give true,checking for equal memory location
		System.out.println(name2.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(d.equalsIgnoreCase(c));
		System.out.println(name.charAt(3));//index== 0,1,2,3....and counting start from 1,2,3,4......
		
	}

}
