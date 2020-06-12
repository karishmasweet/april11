package April25doubleloops;

public class april25doubleloopassignmentstar 
{
	public static void main(String[] args) 
	{
		System.out.println("Print star sign");
		System.out.println("****************");
		int line_count=5;
	int i;
	int j;
	int k;
	
		for(i=1;i<=line_count;i++)
		{
			for(j=1;j<=line_count-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)	
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
