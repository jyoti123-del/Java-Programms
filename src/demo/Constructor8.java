package demo;

public class Constructor8 extends Constructor7{
	String name;
	int marks;
	public Constructor8(String Name,int marks)// constructor in parent class is not 
	                                   //applicable for inheritance but we can complete abstract class
	         //in concrete class constructor/one default constructor or no-argument should be in parent constructor 
	{
		name=Name;
		marks=100;
		
	}
	public Constructor8() {
		this.name="Jyoti";
	}
	public void M1() {
		System.out.println("Hellow everyone");
	}
	public static void main(String[] args) {
	  Constructor8 n=new Constructor8();
      n.M2();
      System.out.println(n.name);
    System.out.println(n.marks);
      Constructor8 f=new Constructor8();
      f.M1();// from parent class completed in child class
      Constructor8 v=new Constructor8();
      System.out.println(v.name);
	}

}
