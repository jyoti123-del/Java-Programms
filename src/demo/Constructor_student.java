package demo;

public class Constructor_student {
	int g=10;// non static
	static int d=45;
  String name;
  int roll_number;
  int marks;
  char grade;
  public Constructor_student(){
	  
  }
  
  public Constructor_student(char Grade)
  {
	  name="Shridhar";
	  roll_number=01;
	  marks=100;
	  grade=Grade;
	  
  }
  public Constructor_student(String an)
	{
	  an="neha";
	  roll_number=02;
	  marks=80;
	  grade='B';
	  name=an;
	  }
	
	public Constructor_student(int rollno)
	{
		name="vaibhav";
		rollno=03;
		marks=90;
		grade='b';
		roll_number=rollno;
	}
	
	public void display()
	{System.out.println("student name is "+name);
	System.out.println("student roll number is "+roll_number);
	System.out.println("student marks is "+marks);
	System.out.println("Student grade is "+grade);
	}
	
		
	
	public static void main(String[] args) {
		
		
		System.out.println();
		Constructor_student x=new Constructor_student();
		x.display();
		System.out.println();
       Constructor_student y=new Constructor_student("Neha");
       y.display();
       System.out.println();
       Constructor_student z=new Constructor_student(03);
       z.display();
    
	}

}
