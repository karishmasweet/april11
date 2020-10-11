package Package;

public class Student 
{ int age;
  int roll_no;
  
  public void deepak()
  {
  System.out.println("Welcome to all of you");
  System.out.println("Welcome guys");
   }
  
  
  public static void main(String[] args) 
  {
	  Student rishu=new Student();
	  rishu.deepak();
	  rishu.age=18;
	  rishu.roll_no=12;
	  System.out.println("age is "+rishu.age);
	  System.out.println("roll_no is "+rishu.roll_no);
	  
	  
  }
	
   }
