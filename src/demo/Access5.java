package demo;
import newpackage.Access4;
import newpackage.Access_publicclass;

public class Access5 {

	public static void main(String[] args) {
		System.out.println("we are in new package and same project");
		//Access_publicclass n=new Access_publicclass();
		Access_publicclass n=new Access_publicclass();
		//System.out.println(n.a); //default values can not be called in different package // protected nonstatic cannot called
		Access4 m=new Access4();
     System.out.println(n.d); // public variable is accessed by creating object in another package/class
     //System.out.println(n.e);// protected static integer,static integer,default integer cannot be called.
     // needs to extend class if wants to call protected values,methods
    // System.out.println(n.b); //static value, can't called
     n.substraction(20,10);//public method
    // n.multiplication(10,2); defaults non-static method ,cannot be called, if it was protected static ,it was accessible through inheritance
     //Access_publicclass.display();
	}

}
