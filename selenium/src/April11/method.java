package April11;

public class method 

{
	public int sum(int a,int b)// two
	{
		int c;
		c=b+a;
		return c;
	
	}
 public int sum(int a,int b, int f)
 {
	 int d;
	 d=a+b+f;
	 return d;
	
 }
 
 public void sum(int a,int b, int f, int i)
 {
	 int x;
	 x=a+b+f+i;
	 System.out.println("I am sum method but using void method but using same method name " +x);
 }
 
 public static void main(String[] args)
{
	 System.out.println("Practice of static polymorphism will happen in the single class/same class");
	 System.out.println("**************************************************");
	 method obj=new  method();
	 int sumresultone=obj.sum(6, 6);
	 System.out.println("Sum result with of first with int output by using same method name " +sumresultone);
	 int sumresult= obj.sum(6, 6, 6);
	 System.out.println("Sum result with of second with int output by using same method name " +sumresult);
	 obj.sum(6,6, 6, 6);
	 kwidcar rishu=new kwidcar();
	 int result=rishu.sum(6, 6);
	 System.out.println("Sum result with of another class with same method name, input and out " +result);
	 
	 
	 
	 
	
}
}
