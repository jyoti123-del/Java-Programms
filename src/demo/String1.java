package demo;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="my name is jyoti ";
    //String []p=s.split(" ");
   // String p
    String p=(s.replace("my", ""));
    System.out.println(p);
    String r=(p.replace("jyoti", ""));
    System.out.println(r);
   String reverse="";
  for(int i=r.length()-1;i>=0;i--) 

       {
   	reverse=reverse+r.charAt(i);
   }
   System.out.println("reverse of the string is :"+reverse);
	}

}
