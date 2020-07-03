package June_27;

public class assignmnet_reverse 
{
	static void reverse(String str)
    {
		{

			String[] words = str.split(" ");
			String reversedString = "";
			for (int i = words.length-1; i >=0; i--)
		     {
		           String word = words[i]; 
		           reversedString=reversedString+word+" ";
		     }
			System.out.println(reversedString);
		}
 }
		   public static void main(String[] args) 
		   {
			   assignmnet_reverse obj = new assignmnet_reverse  ();  
			obj.reverse("my name is deepak");
			
		   }
	
}
