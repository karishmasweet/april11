package April18loopsandConditions;

public class swappingwithoutthirdvariable 
{
public static void main(String[] args)
{
	int a=20;
	int b=30;
	
	System.out.println("a value before swapping " +a);
	System.out.println("b value before swapping " +b);
	System.out.println("*****************************");
	
	a=a+b; // a=50
	b=a-b; // b=50-30=20
	a=a-b; // a=50-20=30
	
	System.out.println("a value after swapping " +a);
	System.out.println("b value after swapping " +b);
	
}
}
