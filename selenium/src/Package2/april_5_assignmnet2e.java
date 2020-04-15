package Package2;

public class april_5_assignmnet2e 
{
	public static void main(String[] args) 
	
	{
		System.out.println("Call the non static method from static method(in different class)");
		System.out.println("*****************************************************************");
		april_5_assignment2d obj=new april_5_assignment2d();
		obj.classA();//By calling static to non static method using object creation
		
		april_5_assignment2d.classB();//By calling static to static method
		
		
	}

}
