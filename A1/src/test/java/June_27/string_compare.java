package June_27;

public class string_compare 
{
public static void main(String[] args)
{
	String s1="karishma"; // memory allocation is going to SCP(String Constant Pool)
	String s2="karishma"; // memory allocation is going to SCP(String Constant Pool)
	
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
