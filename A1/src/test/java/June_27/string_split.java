package June_27;

public class string_split 
{
	public static void main(String[] args)
	{
		String s="my name is karishma";
		 String[] allString=s.split(" ");// String[] array f string      //It is split on the bases of space
		 int l=allString.length;
		 System.out.println("total length is "+l);
		 
		 for(int i=0;i<l;i++)//0 to3
		 {
			 System.out.println(allString[i]);
		 }
		 
	}

}
//out will come as
/* my
name
is
karishma
*/