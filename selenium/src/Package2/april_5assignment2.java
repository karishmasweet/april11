package Package2;

public class april_5assignment2 

{
	static int a=1;
	static int b=2;
 public static void Sum()
 {
	 a=a+1;
	 System.out.println("I am static sum method");

	 
 }
 
 public static void sub()
 {
	 b=b-1;
	 System.out.println("I am static sub method ");
	 
 }
 
public static void main(String[] args) 

{
	System.out.println("Print the Call the static method from another static method within same class ");
	april_5assignment2 obj1=new april_5assignment2();
	obj1.Sum();// by creating the object of the class
	System.out.println("Print the sum value "+obj1.a);
	
	april_5assignment2.sub();//by creating class name+method name
	System.out.println("Print the sum value by calling classname_methodname "+obj1.b);
	
	Sum();//by direct method name
	System.out.println("Print the sum value by calling direct method name "+obj1.a);
}
}
