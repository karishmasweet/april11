package Package2;

public class parent 

{
	public parent()
	
	{
	this(1,2,3);
	
		System.out.println("Parent default constructor");
	
	}
	
public parent(int a)
	
	{
	this();
	
		System.out.println("Parent 1 parameterized constructor");
	
	}
	
public parent(int a, int b)

{
	this(1);
	
	System.out.println("Parent 2 parameterized constructor");

}

public parent(int a, int b,int c)

{

	System.out.println("Parent 3 parameterized constructor");

}
 
  public parent(int a, int b, int c, int d)
	
	{
	  
		System.out.println("Parent 3 parameterized constructor");
		
	
	}
	


}
