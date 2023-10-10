package string1;

public class String3 {
	public static void main(String[] args) {
		String m="Velocity";
		String m2="VELOCITY";
		String m3="Pune";
        System.out.println(m.toCharArray());
        System.out.println(m.contains("ocity"));
        System.out.println(m.isEmpty());//true or false
        System.out.println(m2.endsWith("VEL"));//true or false
        System.out.println(m2.startsWith("VEL"));//true or false
        System.out.println(m2.substring(3));//give output onwards index 3
        System.out.println(m2.substring(3,5));
        System.out.println(m2.concat(m3));
        System.out.println(m + "Software testing,Pune");//Concatenation
        System.out.println(m.indexOf("V"));
        System.out.println(m3.indexOf("n"));
        String m4= "Java,Pune";
        System.out.println(m4.replace("Pune","Nagpur"));
        System.out.println(m3.replace("Pune","Nagpur"));
        String m5=m4.replace("Pune","Nagpur");
        System.out.println(m5);
        System.out.println(m3);
        //System.out.println(m4.split(""));
        char a='A';
        int x=(a);
        System.out.println(x);
        
        
	}

}
