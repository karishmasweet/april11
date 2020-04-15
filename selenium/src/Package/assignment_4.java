package Package;

public class assignment_4 
{
public void method()
{
	System.out.println("Default method");

	}

public void method1()
{
	System.out.println("1 parameterized method");
}

public void method2()
{
	System.out.println("2 parameterized method");
}
 public void method3()
{
	System.out.println("3 parameterized method");
}

 public void method4()
{
System.out.println("4 parameterized method");
this.method();
this.method1();
this.method3();
this.method2();
}
 
 public static void main(String[] args) 
 {
	 assignment_4 obj=new assignment_4();
	obj.method4();
	
}

}
