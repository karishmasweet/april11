package June_27;

public class string_ascii
{
	public static void main(String[] args)
	{
		String s1= new String ("karishma"); 
		String s2= new String ("karishmA"); // 
        System.out.println(s1.compareTo(s2));//It will the comapre the ascii value that it gives the difference value 
	//whenver it gets the first difference then it stops MEAN it goes character wise compare and in the last it has some difference captial a and small a
	}
}
