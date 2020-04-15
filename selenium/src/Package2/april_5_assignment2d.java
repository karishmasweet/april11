package Package2;

public class april_5_assignment2d 
{
	
	public void classA()
	{
			System.out.println("I am non static method classA ");
			classB();//here is calling static method from non static method
			
		}
	public static void classB()
	{
		System.out.println("I am static method classB");
	}
		
	

}
