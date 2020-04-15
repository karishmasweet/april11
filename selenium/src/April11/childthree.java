package April11;

public class childthree extends parent
{
	

	public static void main(String[] args) 
	{
		System.out.println("Child method is not exist but parent method is exit,result will be parent method come Dynamic polymorphism");
		System.out.println("**********************************");
		childthree obj=new childthree();
		obj.sum(6, 6);
		
	}
}
