package demo;

public class Constructor6 {

  String Name;
  int rollnumber;
  int Marks;
  char Grade;
  public  Constructor6(String name,int Roll_number,int marks,char grade)
  {
	 Name=name;
	 rollnumber= Roll_number;
	 Marks=marks;
	 Grade=grade;
  }
  public Constructor6(String name)
  {
	  Name=name;
  }
  public Constructor6(String name,int marks) {
	  Name=name;
	  Marks=marks;
  }
  
  public void display()
	{System.out.println("student name is "+Name);
	System.out.println("student roll number is "+rollnumber);
	System.out.println("student marks is "+Marks);
	System.out.println("Student grade is "+Grade);}//global variable...this.grade=is also global
  
	public static void main(String[] args) {
		
		Constructor6 n=new Constructor6("Shridhar",101,100,'A');
		n.display();
		System.out.println();
		Constructor6 t=new Constructor6("Neha",102,99,'A');
		t.display();
		System.out.println();
		Constructor6 x=new Constructor6("Vaibhav",103,98,'A');
		x.display();
		System.out.println();
		Constructor6 b=new Constructor6("Revyan");
		System.out.println(b.Name);
		Constructor6 m=new Constructor6("Jyoti",100);
		System.out.println(m.Name);
		System.out.println(m.Marks);
		{
		
	}
	}

}