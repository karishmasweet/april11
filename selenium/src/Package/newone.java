package Package;

public class newone
{
	public newone(int a,int b, int c,int d) 
	{
		System.out.println("four parameterized constructor");
	}
    public newone()
    
    {
    	this(33,22,44,88);
	  System.out.println("Default parameter");
}
    public newone(int a, int b)
    
    {
    	this();
    	System.out.println("Two parameterized constructor");
    	
    }
    public newone(int a)
    
    {
    	this(67,78);
    	System.out.println("One parameterized constructor");
    	
    }
    
    public newone(int a, int b, int c)
    {
    	this(45);
    	System.out.println("three parameterized constructor");
    	
    }
    public static void main(String[] args) 
    {
		newone deepak=new newone(34,24,26);
	}
}
