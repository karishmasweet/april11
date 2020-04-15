package Package2;

public class april_5_assignment2c 
{

	
 public void method1()
 {
	 System.out.println("I am non static method1");
	 method2();//1st way calling the static method from non static method(method name)
	 april_5_assignment2c.method2();//2nd way to call static method from non static method(class name+method name of static)
	 april_5_assignment2c obj=new april_5_assignment2c ();
	 obj.method2();// 3rd way to call static method from non static 
 }
 public static void method2()
 {
	
	 System.out.println("I am static method2");
	 
 }
 
public static void main(String[] args) 

{
	
	System.out.println("Call the non static method from static method(within same class)");
	System.out.println("****************************************************************");
	april_5_assignment2c obj1=new april_5_assignment2c();
	obj1.method1();//creating the object and calling from static to non static method
	//method2();//direct method calling from static to static method
	//april_5_assignment2c.method2();//2nd way calling from static to static method
	//obj1.method2();//3rd way method calling from static to static methods(object+method name)
	
}
}


