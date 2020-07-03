package June_27;

public class string_content 
{
	public static void main(String[] args)
	{
		String s1= new String ("karishma"); // memory allocation is going to heap because here new keyword is
		String s2= new String ("karishma"); // memory allocation is going to heap because here new keyword is using
		if(s1.equals(s2))//compare two contents we are using equals
		{
			System.out.println("content is same");
			
		}
		else
		{
			System.out.println("content is not same");
		}
	}
}
