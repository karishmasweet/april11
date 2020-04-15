package April11;

public class childfour extends parentfour
{
 public void method3()
 {
	 System.out.println("I am the body of parent four of method 3");
 }
 
 public void method2()
 
 {
	 System.out.println("I am the body of parent four of method 2");
 }
 
 public void method4()
 {
	 System.out.println("I am childfour method");
 }

   public static void main(String[] args) 
   {
	   
	   System.out.println("Abtract class with using inhertance");
	   System.out.println("*************************************");
	   childfour obj=new childfour();
	   obj.method();
	   obj.method2();
	   obj.method3();
	   obj.method4();
	
}
}
