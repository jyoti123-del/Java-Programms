package newpackage;

public class Access6 {
//extends Access4 {

	public static void main(String[] args) {
		Access_publicclass s=new Access_publicclass();
		System.out.println(s.a);//default variable
		System.out.println(s.d);// public variable
		System.out.println(Access_publicclass.e);// protected static can be called by creating object 
		System.out.println(Access_publicclass.b);// static can be called by creating object 
		Access_publicclass.display();//  static protected method
		//System.out.println(s.c); private can't be access
		System.out.println();
		//s.addition(10,20); private method
		s.substraction(20,10); // public method
		s.multiplication(10, 5);
		Access3 m=new Access3();
        m.M1();		

	}

}
