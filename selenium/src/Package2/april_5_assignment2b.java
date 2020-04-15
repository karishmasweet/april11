package Package2;

public class april_5_assignment2b 
{
	public static void main(String[] args) 
	
	{
		System.out.println("Call the static method from another static method(in different class)");
		System.out.println("******************************************************************");
	april_5_assignment2a obj=new april_5_assignment2a();
	obj.class1();//calling from one static class to another static class by object creation
	
	april_5_assignment2a.class2();//second way calling by calling the another class name
	
			
	
	
	}
	
}