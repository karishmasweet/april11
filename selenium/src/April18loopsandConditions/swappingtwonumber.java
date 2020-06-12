package April18loopsandConditions;

public class swappingtwonumber 
{
	public static void main(String[] args) 
	{
		
		int first=123;
		int second=140;
		
		System.out.println("First value before swapping " +first);
		System.out.println("Second value before swapping " +second);
		System.out.println("*********************************");
		
		int temp=first;
		first=second;
		second=temp;
		
		System.out.println("First value after swapping " +first);
		System.out.println("Second value after swapping " +second);
		
	}

}
