package June_27;

public class string 
{
	public static void main(String[] args)
	{
		String s1= new String ("karishma"); // memory allocation is going to heap because here new keyword is
		String s2= new String ("karishma"); // memory allocation is going to heap because here new keyword is using
		if(s1==s2)//compare two address we are using ==
		{
			System.out.println("address is same");
			
		}
		else
		{
			System.out.println("address is not same");
		}
	}

}
