package newpackage;

public class Methodcalling {
  public static void M1() { 
	 // final  int c=89;
	 // Methodcalling n=new Methodcalling();
	 // n.M8();M3();
  System.out.println("i am public static method");}
 
  public void M2() {
	  M1();
  System.out.println("I am public non-static method");}
 
  protected static void M3() {
  System.out.println("I am protected static method");} 
		
  protected void M4() {
  System.out.println("I am protected non-static method");}
	
   void M5() {
   System.out.println("I am default non-static method");}
	 
   static void M6() {
   System.out.println("I am default static method");} 
	 
	private static void M7() {
	System.out.println("I am private static method");}
	 
    private void M8() {
    System.out.println("I am private non-static method");}
	 
	public static void main(String[] args) {
		M1();// all static method should access in static way(public,static,protected,private)
		M3();
		M6();
		M7();
		Methodcalling n=new Methodcalling(); //all non-static method should be accessible in non-static way/by object
		n.M2();
        n.M4();
        n.M5();
        n.M8();
	}

}
