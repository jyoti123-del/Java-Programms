package demo;

public class Function_7 {

	public void M1() {
	int i=1;
	while(i<=10) 
	{System.out.println(i);
	i++;}
	}
	{System.out.println();}
	public static void M2() {
		int age =30;
		if(age==18) {System.out.println("person is eligible for voting");}
		else if(age>18&&age<40) {System.out.println("middle age man");}
		else {System.out.println("person is ttenager");
		
	}}
	
	public static int M3(int a,int b) 
	{if (a>b) { return a;}
		else {return b;}}
	
	public static boolean M4(int timet1,int timet2)
	{if(timet1==16) { return true; }else{return false;}}
	public static void main(String[] args) {
		Function_7 a=new Function_7();
		a.M1();
		Baba j= new Baba();
		j.Screenshot();
		M2();
		int c=10;
		int d=M3(10,55)*c;System.out.println(d);
		M4(12,16);if(M4(12,16)==true) {System.out.println("its afternoon");}else {System.out.println("its an evening");}
		System.out.println("its good");	
		}

	

}
