package April25doubleloops;

public class nuberpattern
{
public static void main(String[] args) 
	
	{
	
    int i=1;
    int j=1;
    int count=0;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
				
			{
				count=count+1;
				System.out.print(count);
			}
			System.out.println();
		}
		
	}

}
