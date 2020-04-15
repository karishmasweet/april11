package Package2;

public class newchild extends newparent
{
	public void method()
	{
		System.out.println("Child default method");
	
	}
	public void method1()
	{
		System.out.println("Child 1 parameterized method");
	
	}
	public void method2()
	{
		
		System.out.println("Child 2 parameterized method");
	
	}
	public void method3()
	{
		
		System.out.println("Child 3 parameterized method");
	
	}
	public void method4()
	{
		super.method3();
		super.method();
		super.method1();
		super.method2();
		System.out.println("Child 4 parameterized method");
		this.method();
		this.method1();
		this.method2();
	}
	
	public static void main(String[] args)
{
		newchild rishu=new newchild();
		rishu.method4();
		
		
	}
}
